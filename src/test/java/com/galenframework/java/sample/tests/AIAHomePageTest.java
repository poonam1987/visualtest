package com.galenframework.java.sample.tests;

import com.galenframework.java.sample.components.GalenTestBase;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



import java.io.IOException;


public class AIAHomePageTest extends GalenTestBase {
WebDriver driver;
    @Test(dataProvider = "devices")
    public void AIAHomePage_shouldLookGood_onDevice(TestDevice device) throws IOException {
        load("/");
        //WebDriver driver
//        JavascriptExecutor je = (JavascriptExecutor)driver;
//        WebElement element = driver.findElement(By.cssSelector(".plan-button-container"));
//        je.executeScript("arguments[0].scrollIntoView(true);",element);
        checkLayout("/specs/aiaCommon.spec", device.getTags());
	    JavascriptExecutor je = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.id("prev"));
       je.executeScript("arguments[0].scrollIntoView(true);",element);
	    checkLayout("/specs/nextPrev.spec", device.getTags());

    }



}
