package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.customListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WelComePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement  welcomeText;

 //By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");


    public WebElement getWelcomeText() {
        customListeners.test.log(Status.PASS,"GetWelcomeText");
        return welcomeText;
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement  guestButton;

 //   By guestButton = By.xpath("//button[@class='button-1 checkout-as-guest-button']");




    public void clickOnGuestButton()
    {

        clickOnElement(guestButton);
        customListeners.test.log(Status.PASS,"clickOnGuestButton");
    }



}
