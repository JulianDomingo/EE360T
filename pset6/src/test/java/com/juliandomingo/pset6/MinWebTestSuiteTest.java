package com.juliandomingo.pset6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTestSuiteTest {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("/home/julian/Documents/School/EE360T/pset6/src/main/java/com/juliandomingo/pset6/min.html");
    }

    @Test
    public void t0() {
        WebElement element = driver.findElement(By.id("x"));
        element.sendKeys("0");
        element = driver.findElement(By.id("y"));
        element.sendKeys("0");
        element = driver.findElement(By.id("z"));
        element.sendKeys("0");
        WebElement result = driver.findElement(By.id("result"));
        String output = result.getText();
    }

    @After
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}
