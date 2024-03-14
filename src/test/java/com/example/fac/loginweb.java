package com.example.fac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginweb {
    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        driver.getTitle();

        WebElement Search = driver.findElement(By.name("search_query"));
        WebElement button = driver.findElement(By.id("search-icon-legacy"));
        Search.sendKeys("Appium");
        button.click();



    }
}
