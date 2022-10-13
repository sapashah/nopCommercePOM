package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseSuit{
    HomePage homePage = new HomePage();
    @Test
    public void userShouldBeAbleToClickComputerLink(){
        homePage.clickComputerLink();
    }
}
