/**
 * Julian Domingo : jad5348
 */
package com.juliandomingo.pset6;

import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class MinWebTestGenerator {
	public static final int NUMBER_OF_TESTS = 128;
    public static final int INPUT_TYPES = 4;
    public static final int ZERO = 0;
    public static final String NOT_AN_INTEGER = "Not an integer.";

    Random random = new Random(12345678);
    ArrayList<Combination> combinations = new ArrayList<Combination>();

    public static void main(String[] a) {
        String suite = new MinWebTestGenerator().createTestSuite();
		System.out.println(suite);
    }
	
	String createTestSuite() {
		StringBuilder sb = new StringBuilder();
		sb.append(packageDecl());
		sb.append("\n");
		sb.append(imports());
		sb.append("\n");
		sb.append(testsuite());
        return sb.toString();
	}

	String packageDecl() {
	return "package pset6;\n";
	}

	String imports() {
	return "import static org.junit.Assert.*;\n\n"
    + "import org.junit.Before;\n"
    + "import org.junit.Test;\n\n"
	+ "import org.openqa.selenium.By;\n"
	+ "import org.openqa.selenium.WebDriver;\n"
	+ "import org.openqa.selenium.WebElement;\n"
	+ "import org.openqa.selenium.firefox.FirefoxDriver;\n";
    }

	String testsuite() {
		StringBuilder sb = new StringBuilder();
		sb.append("public class MinWebTestSuite {\n");
        sb.append(openBrowser());
        sb.append(addTests());
        sb.append(closeBrowser()); 
        sb.append("}\n");
		return sb.toString();
	}

    String addTests() {
        StringBuilder sb = new StringBuilder();
        
        createCombinations(new Object[INPUT_TYPES],
                           new Integer[]{INPUT_TYPES - 1, INPUT_TYPES - 1, INPUT_TYPES - 1, 1},
                           0);                

        for (int test = 0; test < NUMBER_OF_TESTS; test += 1) { 
            Combination possibility = combinations.get(test); 
            
            generateInputValues(possibility);
            
            Object x = possibility.combination[0];
            Object y = possibility.combination[1];
            Object z = possibility.combination[2];            

            sb.append(tab(1) + "@Test\n");
            sb.append(tab(1) + "public void t" + Integer.toString(test) + "() {\n");
            
            sb.append(tab(2) + "WebElement element = driver.findElement(By.id(\"x\"));\n");
            sb.append(tab(2) + "element.sendKeys(\"" 
                             + stringRepresentation(x)
                             + "\");\n");
            
            sb.append(tab(2) + "element = driver.findElement(By.id(\"y\"));\n");
            sb.append(tab(2) + "element.sendKeys(\""
                             + stringRepresentation(y)
                             + "\");\n");

            sb.append(tab(2) + "element = driver.findElement(By.id(\"z\"));\n");
            sb.append(tab(2) + "element.sendKeys(\""
                             + stringRepresentation(z)
                             + "\");\n");
           
            sb.append(tab(2) + "WebElement result = driver.findElement(By.id(\"result\"));\n");

            if ((Integer) possibility.combination[3] == 1) {
                sb.append(tab(2) + "element = driver.findElement(By.id(\"computeButton\"));\n");
                sb.append(tab(2) + "element.click();\n");
            }

            sb.append(tab(2) + "String output = result.getText();\n");

            if ((Integer) possibility.combination[3] == 1) {
                boolean illegalInput = x instanceof String || y instanceof String || z instanceof String;
                String result = "";

                if (illegalInput) {
                    result = "Please enter integer values only!";
                }
                else {
                    int minimum = Math.min(Math.min((Integer) x, (Integer) y), (Integer) z);
                    result = Integer.toString(minimum);
                }

                sb.append(tab(2) + "assertEquals(\"min("
                                 + stringRepresentation(x) + ", "
                                 + stringRepresentation(y) + ", "
                                 + stringRepresentation(z) + ") = " 
                                 + result   
                                 + "\", output);\n");
            }

            sb.append(tab(1) + "}\n\n");
        } 
        
        return sb.toString();            
    }
    
    String openBrowser() {
        StringBuilder sb = new StringBuilder();
        sb.append(tab(1) + "WebDriver driver;\n\n");
        sb.append(tab(1) + "@Before\n");
        sb.append(tab(1) + "public void setUp() {\n");
        sb.append(tab(2) + "driver = new FirefoxDriver();\n");

        String generatorPath = System.getProperty("user.dir") + "MinWebTestGenerator.java"; 
        sb.append(tab(2) + "driver.get(\"" + generatorPath + "\");\n"); 
        sb.append(tab(1) + "}\n\n");
        return sb.toString();
    }

    String closeBrowser() {
        StringBuilder sb = new StringBuilder();
        sb.append(tab(1) + "@After\n");
        sb.append(tab(1) + "public void tearDown() {\n");
        sb.append(tab(2) + "driver.quit();\n");
        sb.append(tab(1) + "}\n");
        return sb.toString();
    }

    String tab(int tabCount) {
        StringBuilder sb = new StringBuilder();
        for (int tab = 0; tab < tabCount; tab += 1) {
            sb.append("    ");
        }

        return sb.toString();        
    }

    void createCombinations(Object[] valueIDs, Integer[] rangesForEachIndex, Integer currentIndex) {
        if (currentIndex == valueIDs.length) {
            Object[] combination = Arrays.copyOf(valueIDs, valueIDs.length);
            combinations.add(new Combination(false, combination));
            return;
        }
       
        for (int index = 0; index <= rangesForEachIndex[currentIndex]; index += 1) {
            valueIDs[currentIndex] = (Object) index;
            createCombinations(valueIDs, rangesForEachIndex, currentIndex + 1);
        } 
    }
   
    void generateInputValues(Combination possibility) {
        for (int value = 0; value < possibility.combination.length - 1; value += 1) {
            possibility.combination[value] = getValueMapping((Integer) possibility.combination[value]);
        }
    }
    
    Object getValueMapping(int ID) {
        switch (ID) {
            case 1:
                return Integer.valueOf(random.nextInt(Integer.MAX_VALUE - 1 + 1) + 1);
            case 2:
                return Integer.valueOf(-1 * (random.nextInt(Integer.MAX_VALUE - 1 + 1) + 1));
            case 3:
                return "String";                    
            default:
                return Integer.valueOf(0);
        }
    }

    String stringRepresentation(Object value) {
        if (value instanceof Integer) {
            return Integer.toString((Integer) value);
        }
        else {
            return (String) value;
        }
    }
    
    public class Combination {
        boolean generated;
        Object[] combination;

        public Combination(boolean generated, Object[] combination) {
            this.generated = generated;
            this.combination = combination;
        }
    }
}
