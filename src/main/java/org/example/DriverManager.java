package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils {
    // Method to start browser....
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        //open chrome driver
        driver = new ChromeDriver();
        //Wait for browser to open
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Maximise window
        driver.manage().window().maximize();
        // open web page
        driver.get("https://demo.nopcommerce.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    // Method to close browser
    public void closeBrowser(){
        driver.quit();
    }
}
