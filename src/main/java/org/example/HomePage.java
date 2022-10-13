package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    public void clickComputerLink(){
        driver.findElement(By.xpath("//ul[@class = \"top-menu notmobile\"]//a [@href=\"/computers\"]"));
    }
}
