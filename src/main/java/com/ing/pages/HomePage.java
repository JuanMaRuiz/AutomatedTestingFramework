package com.ing.pages;

import com.ing.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver = DriverFactory.getDriver();

    private HomePage() {
        // hide it
    }

    public static HomePage getHomePage() {
        return new HomePage();
    }

    public void search(String value) {
        // search and enter
        WebElement search = driver.findElement(By.xpath("//*[@id=\"search\"]/div/input"));
        search.sendKeys(value);
        search.sendKeys(Keys.RETURN);
    }
}
