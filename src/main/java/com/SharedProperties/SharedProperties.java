package com.SharedProperties;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import java.lang.*;


/**
 * Created by saurabh on 27/02/17.
 */
public class SharedProperties {



    public static void sendKeys(String elementXpath, String value, AndroidDriver driver) {
        driver.findElement(By.id(elementXpath)).sendKeys(value);

    }

    public static void clickWithId(String id, AndroidDriver driver){
        driver.findElement(By.id(id)).click();
    }
    public static void sendKeysWithName(String name, String value, AndroidDriver driver) {
        driver.findElement(By.name(name)).sendKeys(value);

    }
    public static void Click(String elementXpath, AndroidDriver driver)  {
        driver.findElement(By.xpath(elementXpath)).click();

    }

    public static void clickWithCss(String elementCss, AndroidDriver driver)  {
        driver.findElement(By.cssSelector(elementCss)).click();

    }

    public static void clickWithTagName(String tagname, AndroidDriver driver)  {
        driver.findElement(By.tagName(tagname)).click();

    }
    public static void clear(String elementXpath,  AndroidDriver driver)  {
        driver.findElement(By.xpath(elementXpath)).clear();

    }

    public static void Class(String className,  AndroidDriver driver)  {
        driver.findElement(By.className(className)).click();

    }

    public static void ClickWithName(String name,  AndroidDriver driver)  {
        driver.findElement(By.name(name)).click();

    }

    }


