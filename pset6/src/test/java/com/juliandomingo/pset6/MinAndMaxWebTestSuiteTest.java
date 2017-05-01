package com.juliandomingo.pset6;

import java.io.IOException;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinAndMaxWebTestSuiteTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new FirefoxDriver();
    }

    @Test
    public void t0() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t2() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 0, 0) = 0", output);
    }

    @Test
    public void t3() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
        assertEquals("max(0, 0, 0) = 0", output);
    }

    @Test
    public void t4() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t5() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1475844303");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t6() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1952130186");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 0, 1952130186) = 0", output);
    }

    @Test
    public void t7() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1903348772");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(0, 0, 1903348772) = 1903348772", output);
    }

    @Test
    public void t8() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-677997346");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t9() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1212195312");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t10() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-446719617");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 0, -446719617) = -446719617", output);
    }

    @Test
    public void t11() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-612178686");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(0, 0, -612178686) = 0", output);
    }

    @Test
    public void t12() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t13() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t14() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t15() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t16() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1647061236");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t17() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1942250041");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t18() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1762538031");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 1762538031, 0) = 0", output);
    }

    @Test
    public void t19() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1325981281");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(0, 1325981281, 0) = 1325981281", output);
    }

    @Test
    public void t20() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("622631143");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1182233365");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t21() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("28853938");
        element = driver.findElement(By.id("z"));
        element.sendKeys("745988271");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t22() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1275071404");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1558862554");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 1275071404, 1558862554) = 0", output);
    }

    @Test
    public void t23() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("215374762");
        element = driver.findElement(By.id("z"));
        element.sendKeys("949573527");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(0, 215374762, 949573527) = 949573527", output);
    }

    @Test
    public void t24() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1688059839");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-33532659");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t25() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("421573909");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-877913933");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t26() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("809393437");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1382913711");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, 809393437, -1382913711) = -1382913711", output);
    }

    @Test
    public void t27() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1437520729");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1499881321");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(0, 1437520729, -1499881321) = 1437520729", output);
    }

    @Test
    public void t28() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("2074229266");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t29() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("388261");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t30() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("996794721");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t31() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1383082846");
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
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1274927920");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t33() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-591658177");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t34() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-6071006");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, -6071006, 0) = -6071006", output);
    }

    @Test
    public void t35() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-81793173");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(0, -81793173, 0) = 0", output);
    }

    @Test
    public void t36() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-181485660");
        element = driver.findElement(By.id("z"));
        element.sendKeys("2110690544");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t37() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-180667567");
        element = driver.findElement(By.id("z"));
        element.sendKeys("870544421");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t38() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1910878466");
        element = driver.findElement(By.id("z"));
        element.sendKeys("353689188");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, -1910878466, 353689188) = -1910878466", output);
    }

    @Test
    public void t39() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1625657692");
        element = driver.findElement(By.id("z"));
        element.sendKeys("253887025");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(0, -1625657692, 253887025) = 253887025", output);
    }

    @Test
    public void t40() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1015470440");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-462390660");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t41() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-995765179");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1774596319");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t42() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1179069216");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1042036340");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(0, -1179069216, -1042036340) = -1179069216", output);
    }

    @Test
    public void t43() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-572887477");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1134606577");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(0, -572887477, -1134606577) = 0", output);
    }

    @Test
    public void t44() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-124555927");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t45() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1207965756");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t46() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1931528483");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t47() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1589427713");
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
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t49() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t50() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t51() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t52() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1117893579");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t53() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("603885719");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t54() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1993062610");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t55() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("152830045");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t56() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2144927770");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t57() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1849440858");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t58() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2097893285");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t59() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1076761213");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t60() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t61() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t62() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t63() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t64() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1485969205");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t65() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2113575039");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t66() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1579662298");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(1579662298, 0, 0) = 0", output);
    }

    @Test
    public void t67() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("797649949");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(797649949, 0, 0) = 797649949", output);
    }

    @Test
    public void t68() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1862731059");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("506965966");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t69() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("260543589");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1311429883");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t70() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("726536130");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("2038780199");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(726536130, 0, 2038780199) = 0", output);
    }

    @Test
    public void t71() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("592508536");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1717059887");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(592508536, 0, 1717059887) = 1717059887", output);
    }

    @Test
    public void t72() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1482024056");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1386118766");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t73() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("208124196");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-11131170");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t74() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("971840072");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1425929235");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(971840072, 0, -1425929235) = -1425929235", output);
    }

    @Test
    public void t75() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("625998105");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1860110124");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(625998105, 0, -1860110124) = 625998105", output);
    }

    @Test
    public void t76() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("165877776");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t77() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("362774845");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t78() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1785618057");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t79() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1079968974");
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
    public void t80() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2078249550");
        element = driver.findElement(By.id("y"));
        element.sendKeys("214333586");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t81() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1125359403");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1220870536");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t82() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1324282355");
        element = driver.findElement(By.id("y"));
        element.sendKeys("415114149");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(1324282355, 415114149, 0) = 0", output);
    }

    @Test
    public void t83() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1725357660");
        element = driver.findElement(By.id("y"));
        element.sendKeys("353475929");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(1725357660, 353475929, 0) = 1725357660", output);
    }

    @Test
    public void t84() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1544885840");
        element = driver.findElement(By.id("y"));
        element.sendKeys("867025661");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1981459807");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t85() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1398755537");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1469908013");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1516782782");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t86() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("793939397");
        element = driver.findElement(By.id("y"));
        element.sendKeys("586611924");
        element = driver.findElement(By.id("z"));
        element.sendKeys("779301881");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(793939397, 586611924, 779301881) = 586611924", output);
    }

    @Test
    public void t87() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1614314487");
        element = driver.findElement(By.id("y"));
        element.sendKeys("987428840");
        element = driver.findElement(By.id("z"));
        element.sendKeys("821787629");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(1614314487, 987428840, 821787629) = 1614314487", output);
    }

    @Test
    public void t88() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1791054107");
        element = driver.findElement(By.id("y"));
        element.sendKeys("783106695");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1796474769");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t89() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("473345868");
        element = driver.findElement(By.id("y"));
        element.sendKeys("777870438");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1559596972");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t90() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1578045625");
        element = driver.findElement(By.id("y"));
        element.sendKeys("511713630");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2072724396");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(1578045625, 511713630, -2072724396) = -2072724396", output);
    }

    @Test
    public void t91() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1863527721");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1671528045");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1801254919");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(1863527721, 1671528045, -1801254919) = 1863527721", output);
    }

    @Test
    public void t92() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1278156905");
        element = driver.findElement(By.id("y"));
        element.sendKeys("44782868");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t93() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("573799882");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1803194495");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t94() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1174368160");
        element = driver.findElement(By.id("y"));
        element.sendKeys("942088761");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t95() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("205985576");
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
    public void t96() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("178894020");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1338662190");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t97() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1889302356");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1280199365");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t98() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("575740364");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1912983541");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(575740364, -1912983541, 0) = -1912983541", output);
    }

    @Test
    public void t99() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1226984181");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1736566019");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(1226984181, -1736566019, 0) = 1226984181", output);
    }

    @Test
    public void t100() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1819655785");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1899162183");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1840066063");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t101() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1641770240");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1347192916");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1807294595");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t102() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("484397478");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1340408626");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1962567360");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(484397478, -1340408626, 1962567360) = -1340408626", output);
    }

    @Test
    public void t103() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("83496755");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1339660666");
        element = driver.findElement(By.id("z"));
        element.sendKeys("126943385");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(83496755, -1339660666, 126943385) = 126943385", output);
    }

    @Test
    public void t104() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("287513327");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-266865975");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1315017713");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t105() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1366396417");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-116045793");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1752921744");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t106() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1161547283");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1115698388");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2131372839");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(1161547283, -1115698388, -2131372839) = -2131372839", output);
    }

    @Test
    public void t107() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("737515979");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-632300975");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2090296217");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(737515979, -632300975, -2090296217) = 737515979", output);
    }

    @Test
    public void t108() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1980383445");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1604637191");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t109() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("61201306");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-161841165");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t110() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("792573077");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1766586277");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t111() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("295651351");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-272679132");
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
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1892286936");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t113() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1409806732");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t114() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1396257618");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t115() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("289188092");
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
    public void t116() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1276626216");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1932579094");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t117() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1573909511");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("13999783");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t118() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2038341786");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1323336347");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t119() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2074908224");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1217705971");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t120() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2047718751");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1377811608");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t121() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("448687163");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-819296015");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t122() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2115036281");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-702183291");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t123() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2022280042");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1400426524");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t124() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("58992778");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t125() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("1212667917");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t126() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("2008602515");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t127() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("7107237");
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
    public void t128() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-942242503");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t129() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1057363580");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t130() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-952786456");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-952786456, 0, 0) = -952786456", output);
    }

    @Test
    public void t131() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1977807037");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(-1977807037, 0, 0) = 0", output);
    }

    @Test
    public void t132() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1955255564");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1902742532");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t133() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-280421201");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1091108276");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t134() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1593377546");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("554086714");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1593377546, 0, 554086714) = -1593377546", output);
    }

    @Test
    public void t135() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1919001621");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("709729909");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(-1919001621, 0, 709729909) = 709729909", output);
    }

    @Test
    public void t136() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-11605147");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-317814517");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t137() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-405499224");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1435944319");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t138() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1457349430");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-422118361");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1457349430, 0, -422118361) = -1457349430", output);
    }

    @Test
    public void t139() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-978602990");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1889105022");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(-978602990, 0, -1889105022) = 0", output);
    }

    @Test
    public void t140() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1111768190");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t141() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1741521025");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t142() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1326003822");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t143() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1470373253");
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
    public void t144() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1917150197");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1370373192");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t145() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-506409777");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1293655531");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t146() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-459849165");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1176048821");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-459849165, 1176048821, 0) = -459849165", output);
    }

    @Test
    public void t147() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1800641658");
        element = driver.findElement(By.id("y"));
        element.sendKeys("2102840511");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(-1800641658, 2102840511, 0) = 2102840511", output);
    }

    @Test
    public void t148() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-39032031");
        element = driver.findElement(By.id("y"));
        element.sendKeys("792242560");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1807828144");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t149() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1829385960");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1050611125");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1130202949");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t150() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1605655750");
        element = driver.findElement(By.id("y"));
        element.sendKeys("867517150");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1692498113");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1605655750, 867517150, 1692498113) = -1605655750", output);
    }

    @Test
    public void t151() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1827082948");
        element = driver.findElement(By.id("y"));
        element.sendKeys("673390267");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1998296575");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(-1827082948, 673390267, 1998296575) = 1998296575", output);
    }

    @Test
    public void t152() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-627398065");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1992531667");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1823432253");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t153() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1818834319");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1889794522");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-323729121");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t154() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1865761129");
        element = driver.findElement(By.id("y"));
        element.sendKeys("885882191");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-13036497");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1865761129, 885882191, -13036497) = -1865761129", output);
    }

    @Test
    public void t155() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-657672231");
        element = driver.findElement(By.id("y"));
        element.sendKeys("2116912045");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2109777336");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(-657672231, 2116912045, -2109777336) = 2116912045", output);
    }

    @Test
    public void t156() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-391259673");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1527509869");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t157() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-282969295");
        element = driver.findElement(By.id("y"));
        element.sendKeys("2053714900");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t158() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-2026541814");
        element = driver.findElement(By.id("y"));
        element.sendKeys("368996725");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t159() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-372737542");
        element = driver.findElement(By.id("y"));
        element.sendKeys("659705018");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t160() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1355756384");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-2023068680");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t161() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1097766726");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-24741540");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t162() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1557168915");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-760483228");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1557168915, -760483228, 0) = -1557168915", output);
    }

    @Test
    public void t163() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1742329497");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1430942126");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(-1742329497, -1430942126, 0) = 0", output);
    }

    @Test
    public void t164() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1635306435");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-787925407");
        element = driver.findElement(By.id("z"));
        element.sendKeys("381502377");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t165() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1258795566");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-940652909");
        element = driver.findElement(By.id("z"));
        element.sendKeys("609763171");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t166() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1263176026");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-402990762");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1356505545");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-1263176026, -402990762, 1356505545) = -1263176026", output);
    }

    @Test
    public void t167() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1552271782");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1402290068");
        element = driver.findElement(By.id("z"));
        element.sendKeys("345256826");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(-1552271782, -1402290068, 345256826) = 345256826", output);
    }

    @Test
    public void t168() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-311300316");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-694070460");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1586120478");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t169() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1966796283");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1831357609");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2091193691");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t170() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-793624998");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1952481645");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2145690119");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("min(-793624998, -1952481645, -2145690119) = -2145690119", output);
    }

    @Test
    public void t171() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1432615427");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1943619549");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1000654698");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("max(-1432615427, -1943619549, -1000654698) = -1000654698", output);
    }

    @Test
    public void t172() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-50228366");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1452370184");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t173() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1466703807");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1329507844");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t174() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-2056645547");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-310603069");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t175() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1635341552");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1503438201");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t176() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-792275");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t177() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1103516479");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t178() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1566291266");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t179() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-196865941");
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
    public void t180() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1802650325");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("969259355");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t181() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1549128531");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1658800805");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t182() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-174426695");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("220623901");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t183() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-442782035");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("739971603");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t184() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-570100514");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-2068181366");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t185() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1095423460");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1899269795");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t186() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-761342826");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-783574153");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t187() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1344810266");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1379127369");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t188() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1806382853");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t189() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-642360338");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t190() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-249837474");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t191() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("-1600326564");
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
    public void t192() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t193() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t194() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t195() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t196() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("402639022");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t197() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1850295667");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t198() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1813146110");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t199() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("502011163");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t200() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1698140161");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t201() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-495525469");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t202() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1401798126");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t203() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-91501459");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t204() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t205() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t206() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t207() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t208() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("134293174");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t209() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1045821207");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t210() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1480529899");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t211() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1486890186");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t212() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("301450987");
        element = driver.findElement(By.id("z"));
        element.sendKeys("780457838");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t213() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("2051883724");
        element = driver.findElement(By.id("z"));
        element.sendKeys("418237779");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t214() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1608897689");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1784412218");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t215() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("746963852");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1970187822");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t216() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("986270761");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-560268168");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t217() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("708831011");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-591780355");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t218() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("222251039");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-728427881");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t219() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1584368784");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-402506747");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t220() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("249360372");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t221() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("696274774");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t222() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("1530088696");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t223() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("611705403");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t224() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1338982914");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t225() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-261083198");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t226() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1057080296");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t227() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-284016126");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t228() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-2113948313");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1699136302");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t229() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1406392759");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1865591630");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t230() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-555186735");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1908590236");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t231() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-694555143");
        element = driver.findElement(By.id("z"));
        element.sendKeys("282002015");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t232() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1158933683");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1458425425");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t233() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-2080964714");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-401429640");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t234() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1864012802");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-75538928");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t235() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1033446688");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-940553951");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t236() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-712988531");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t237() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-769292838");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t238() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1211667455");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t239() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("-1868749935");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t240() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t241() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t242() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t243() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t244() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("338647693");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t245() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("702350960");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t246() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("1583933292");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t247() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("603347481");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t248() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1905507544");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t249() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1533461892");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @Test
    public void t250() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-4858245");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t251() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("-1964969476");
        WebElement result = driver.findElement(By.id("result"));
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t252() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t253() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
    public void t254() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("String");
        element = driver.findElement(By.id("y"));
        element.sendKeys("String");
        element = driver.findElement(By.id("z"));
        element.sendKeys("String");
        WebElement result = driver.findElement(By.id("result"));
        WebElement min = driver.findElement(By.id("min"));
        min.click();
        element = driver.findElement(By.id("computeButton"));
        element.click();
        String output = result.getText();
        assertEquals("Please enter integer values only!", output);
    }

    @Test
    public void t255() {
        driver.get("file:///home/julian/Documents/School/EE360T/pset6/minandmax.html");
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
