package dev.selenium.getting_started;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class zzzzzz {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            driver.getTitle();

          //  driver.manage().timeouts().implicitlyWait(Durations.(500));

            WebElement textBox = driver.findElement(By.name("my-text"));
            WebElement submitButton = driver.findElement(By.cssSelector("button"));

            textBox.sendKeys("Selenium");
            submitButton.click();

            WebElement message = driver.findElement(By.id("message"));
            message.getText();





}
    }
