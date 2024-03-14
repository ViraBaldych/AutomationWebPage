package com.example.fac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class work {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.facebook.com/");

            driver.getTitle();

            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

            WebElement email = driver.findElement(By.name("email"));
            WebElement password = driver.findElement(By.id ("pass"));

            email.sendKeys("vira.balduch249@gmail.com");
            password.sendKeys("donald2121");
            System.out.println("Text Field Set");

            password.submit();
            email.submit();

            WebElement login = driver.findElement(By.id("u_0_5_5s"));
            login.click();

            driver.quit();


}
    }
