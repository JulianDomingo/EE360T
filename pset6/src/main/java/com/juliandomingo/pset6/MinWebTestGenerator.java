/**
 * Julian Domingo : jad5348
 */
package com.juliandomingo.pset6;

import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Map;
import java.util.ArrayList;

public class MinWebTestGenerator {
	public static final int NUMBER_OF_TESTS = 128;
    public static final int INPUT_TYPES = 4;
    public static final int ZERO = 0;
    public static final String NOT_AN_INTEGER = "Not an integer.";

    ArrayList<Combination> combinations = new ArrayList<Combination>();; 

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
        
        createCombinations(new Integer[INPUT_TYPES],
                           new Integer[]{INPUT_TYPES - 1, INPUT_TYPES - 1, INPUT_TYPES - 1, 1},
                           0);                

        Random random = new Random(0);
        
        while (!allCombinationsGenerated()) {
            sb.append(tab(1) + "@Test\n");
            sb.append(tab(1) + "public void t" + Integer.toString(test) + "() {\n");
            
            Object[] inputs = new Object[INPUT_TYPES];
            randomizeInput(inputs);
            
            sb.append(tab(2) + "WebElement element = driver.findElement(By.id(\"x\"));\n");
            sb.append(tab(2) + "element.sendKeys(\" 
                             + Integer.toString(inputs[0])
                             + "\");\n");
            
            sb.append(tab(2) + "element = driver.findElement(By.id(\"y\"));\n");
            sb.append(tab(2) + "element.sendKeys(\"
                             + Integer.toString(inputs[1])
                             + "\");\n");

            
            sb.append(tab(2) + "element = driver.findElement(By.id(\"z\"));\n");
            sb.append(tab(2) + "element.sendKeys(\"
                             + Integer.toString(inputs[2])
                             + "\");\n");
                
           
            sb.append(tab(2) + "WebElement result = driver.findElement(By.id(\"result\"));\n");

            sb.append(tab(2) + "String output = result.getText();\n");

            sb.append(tab(2) + "assertEquals(\"min("
                             + Integer.toString(inputs[0]) + ", "
                             + Integer.toString(inputs[1]) + ", "
                             + Integer.toString(inputs[2]) + ", "
                             + ") = " 
                             + Integer.toString(Math.min(inputs[0], inputs[1], inputs[2]))
                             + "\", output);\n");

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
        sb.append(tab(2) + "driver.get(\"~/Documents/School/EE360T/pset6/src/main/java/com/juliandomingo/pset6/min.html\");\n");
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

    void createCombinations(Integer[] valueIDs, Integer[] rangesForEachIndex, Integer currentIndex) {
        if (currentIndex == valueIDs.length) {
            Integer[] combination = Arrays.copyOf(valueIDs, valueIDs.length);
            combinations.add(new Combination(false, combination));
            return;
        }
       
        for (int index = 0; index <= rangesForEachIndex[currentIndex]; index += 1) {
            valueIDs[currentIndex] = index;
            createCombinations(valueIDs, rangesForEachIndex, currentIndex + 1);
        } 
    }
    
    int getIDMapping(Object value) {
        if (value instanceof Integer) {
            int key = (Integer) value;
            
            if (key == 0) {
                return 0;
            }
            else if (key > 0) {
                return 1;
            }
            else {
                return 2;
            }            
        }            
        else {
            // String.
            return 3;
        } 
    } 

    boolean allCombinationsGenerated() {
        for (Combination combination : combinations) {
            if (!combination.generated) {
                return false;
            }
        }
        return true;
    }

    public class Combination {
        boolean generated;
        Integer[] combination;

        public Combination(boolean generated, Integer[] combination) {
            this.generated = generated;
            this.combination = combination;
        }
    }
}
