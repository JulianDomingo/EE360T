/**
 * Julian Domingo : jad5348
 */
package com.juliandomingo.pset6;

import java.lang.StringBuilder;

public class MinWebTestGenerator {
	public static final int NUMBER_OF_TESTS = 128;

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

        for (int test = 0; test < NUMBER_OF_TESTS; test += 1) {
            sb.append(fourSpaces() + "@Test\n");
            sb.append(fourSpaces() + "public void t" + Integer.toString(test) + "() {\n");
            // TODO: Add test implementations."
            // sb.append(fourSpaces() + "\t");

            sb.append(fourSpaces() + "}\n\n");
        }
    
        return sb.toString();            
    }

    String openBrowser() {
        StringBuilder sb = new StringBuilder();
        sb.append(fourSpaces() + "WebDriver driver;\n\n");
        sb.append(fourSpaces() + "@Before\n");
        sb.append(fourSpaces() + "public void setUp() {\n");
        sb.append(fourSpaces() + "\tdriver = new FirefoxDriver();\n");
        sb.append(fourSpaces() + "}\n\n");
        return sb.toString();
    }

    String closeBrowser() {
        StringBuilder sb = new StringBuilder();
        sb.append(fourSpaces() + "@After\n");
        sb.append(fourSpaces() + "public void tearDown() {\n");
        sb.append(fourSpaces() + "\tdriver.quit();\n");
        sb.append(fourSpaces() + "}\n");
        return sb.toString();
    }

    String fourSpaces() {
        return "    ";
    }
}
