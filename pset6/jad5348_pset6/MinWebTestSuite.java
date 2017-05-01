/**
 * Julian Domingo : jad5348
 * 
 * 2.1 - Regression Failure?
 * 
 * Failures : 27
 * All 27 are faulty tests. There are no bugs in 'minandmax.html,'
 * since all other tests have at least one occurrence of a String
 * input. The remaining valid inputs (3 * 3 * 3 = 27) assert for 
 * minimum, but the 'max' radio button is the default selected, and 
 * the 'MinWebTestGenerator.java' file did not account for selection 
 * of different radio buttons.
 */

package pset6;

import java.io.IOException;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTestSuite {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new FirefoxDriver();
    }

    @Test
    public void t0() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t1() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 0, 0) = 0", output);
    }

    @Test
    public void t2() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1504442364");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t3() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1475844303");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 0, 1475844303) = 0", output);
    }

    @Test
    public void t4() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1952130186");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t5() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1903348772");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 0, -1903348772) = -1903348772", output);
    }

    @Test
    public void t6() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t7() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t8() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("677997346");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t9() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1212195312");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 1212195312, 0) = 0", output);
    }

    @Test
    public void t10() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("446719617");
        element = driver.findElement(By.id("z"));
        element.sendKeys("612178686");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t11() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1647061236");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1942250041");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 1647061236, 1942250041) = 0", output);
    }

    @Test
    public void t12() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1762538031");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1325981281");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t13() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("622631143");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1182233365");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 622631143, -1182233365) = -1182233365", output);
    }

    @Test
    public void t14() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("28853938");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t15() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("745988271");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t16() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1275071404");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t17() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1558862554");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, -1558862554, 0) = -1558862554", output);
    }

    @Test
    public void t18() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-215374762");
        element = driver.findElement(By.id("z"));
        element.sendKeys("949573527");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t19() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1688059839");
        element = driver.findElement(By.id("z"));
        element.sendKeys("33532659");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, -1688059839, 33532659) = -1688059839", output);
    }

    @Test
    public void t20() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-421573909");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-877913933");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t21() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-809393437");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1382913711");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, -809393437, -1382913711) = -1382913711", output);
    }

    @Test
    public void t22() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1437520729");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t23() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1499881321");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t24() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t25() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t26() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("2074229266");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t27() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("388261");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t28() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-996794721");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t29() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1383082846");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t30() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t31() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t32() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1274927920");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t33() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("591658177");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(591658177, 0, 0) = 0", output);
    }

    @Test
    public void t34() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("6071006");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("81793173");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t35() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("181485660");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("2110690544");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(181485660, 0, 2110690544) = 0", output);
    }

    @Test
    public void t36() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("180667567");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-870544421");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t37() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1910878466");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-353689188");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(1910878466, 0, -353689188) = -353689188", output);
    }

    @Test
    public void t38() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1625657692");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t39() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("253887025");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t40() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1015470440");
        element = driver.findElement(By.id("y"));
        element.sendKeys("462390660");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t41() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("995765179");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1774596319");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(995765179, 1774596319, 0) = 0", output);
    }

    @Test
    public void t42() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1179069216");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1042036340");
        element = driver.findElement(By.id("z"));
        element.sendKeys("572887477");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t43() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1134606577");
        element = driver.findElement(By.id("y"));
        element.sendKeys("124555927");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1207965756");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(1134606577, 124555927, 1207965756) = 124555927", output);
    }

    @Test
    public void t44() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1931528483");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1589427713");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1117893579");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t45() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("603885719");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1993062610");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-152830045");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(603885719, 1993062610, -152830045) = -152830045", output);
    }

    @Test
    public void t46() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2144927770");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1849440858");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t47() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2097893285");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1076761213");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t48() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1485969205");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-2113575039");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t49() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1579662298");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-797649949");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(1579662298, -797649949, 0) = -797649949", output);
    }

    @Test
    public void t50() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1862731059");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-506965966");
        element = driver.findElement(By.id("z"));
        element.sendKeys("260543589");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t51() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1311429883");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-726536130");
        element = driver.findElement(By.id("z"));
        element.sendKeys("2038780199");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(1311429883, -726536130, 2038780199) = -726536130", output);
    }

    @Test
    public void t52() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("592508536");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1717059887");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1482024056");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t53() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1386118766");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-208124196");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-11131170");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(1386118766, -208124196, -11131170) = -208124196", output);
    }

    @Test
    public void t54() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("971840072");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1425929235");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t55() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("625998105");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1860110124");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t56() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("165877776");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t57() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("362774845");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t58() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1785618057");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1079968974");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t59() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2078249550");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("214333586");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t60() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1125359403");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1220870536");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t61() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1324282355");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-415114149");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t62() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1725357660");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t63() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("353475929");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t64() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1544885840");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t65() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-867025661");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-867025661, 0, 0) = -867025661", output);
    }

    @Test
    public void t66() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1981459807");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1398755537");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t67() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1469908013");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1516782782");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1469908013, 0, 1516782782) = -1469908013", output);
    }

    @Test
    public void t68() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-793939397");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-586611924");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t69() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-779301881");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1614314487");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-779301881, 0, -1614314487) = -1614314487", output);
    }

    @Test
    public void t70() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-987428840");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t71() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-821787629");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t72() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1791054107");
        element = driver.findElement(By.id("y"));
        element.sendKeys("783106695");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t73() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1796474769");
        element = driver.findElement(By.id("y"));
        element.sendKeys("473345868");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1796474769, 473345868, 0) = -1796474769", output);
    }

    @Test
    public void t74() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-777870438");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1559596972");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1578045625");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t75() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-511713630");
        element = driver.findElement(By.id("y"));
        element.sendKeys("2072724396");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1863527721");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-511713630, 2072724396, 1863527721) = -511713630", output);
    }

    @Test
    public void t76() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1671528045");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1801254919");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1278156905");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t77() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-44782868");
        element = driver.findElement(By.id("y"));
        element.sendKeys("573799882");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1803194495");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-44782868, 573799882, -1803194495) = -1803194495", output);
    }

    @Test
    public void t78() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1174368160");
        element = driver.findElement(By.id("y"));
        element.sendKeys("942088761");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t79() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-205985576");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1327546054");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t80() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-178894020");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1338662190");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t81() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1889302356");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1280199365");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1889302356, -1280199365, 0) = -1889302356", output);
    }

    @Test
    public void t82() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-575740364");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1912983541");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1226984181");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t83() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1736566019");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1819655785");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1899162183");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1736566019, -1819655785, 1899162183) = -1819655785", output);
    }

    @Test
    public void t84() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1840066063");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1641770240");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1347192916");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t85() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1807294595");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-484397478");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1340408626");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1807294595, -484397478, -1340408626) = -1807294595", output);
    }

    @Test
    public void t86() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1962567360");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-83496755");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t87() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1339660666");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-126943385");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t88() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-287513327");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t89() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-266865975");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t90() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1315017713");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1366396417");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t91() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-116045793");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1752921744");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t92() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1161547283");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1115698388");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t93() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-2131372839");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-737515979");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t94() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-632300975");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t95() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-2090296217");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t96() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t97() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t98() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1980383445");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t99() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1604637191");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t100() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-61201306");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t101() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-161841165");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t102() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t103() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t104() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("792573077");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t105() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1766586277");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t106() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("295651351");
        element = driver.findElement(By.id("z"));
        element.sendKeys("272679132");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t107() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1892286936");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1409806732");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t108() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1396257618");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-289188092");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t109() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1276626216");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1932579094");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t110() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1573909511");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t111() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("13999783");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t112() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-2038341786");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t113() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1323336347");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t114() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-2074908224");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1217705971");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t115() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-2047718751");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1377811608");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t116() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-448687163");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-819296015");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t117() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-2115036281");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-702183291");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t118() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-2022280042");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t119() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1400426524");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t120() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t121() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t122() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("58992778");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t123() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1212667917");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t124() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2008602515");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t125() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-7107237");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t126() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t127() {
        String currentWorkingDirectory = System.getProperty("user.dir");
        String minPath = "file://"+ currentWorkingDirectory + "/min.html";
        driver.get(minPath);
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @AfterClass
    public static void tearDown() throws IOException {
        driver.quit();
        driver = null;
    }
}
