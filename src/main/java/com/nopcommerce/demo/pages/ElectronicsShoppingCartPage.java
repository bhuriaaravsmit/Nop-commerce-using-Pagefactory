package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.customListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectronicsShoppingCartPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "(//span[@class='value-summary'])[1]")
    WebElement total;
    public WebElement getTotal() {
        return total;
    }


    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement shoppingCart;


    public WebElement getShoppingCart() {
        return shoppingCart;
    }

    //public By total = By.xpath("(//span[@class='value-summary'])[1]");
   // public By shoppingCart =By.xpath("//h1[text()='Shopping cart']");
   // public By agreeTerms = By.id("termsofservice");
    //public By checkOut = By.id("checkout");
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement agreeTerms;

    public void clickOnAgreeTerms(){
        clickOnElement(agreeTerms);

    }

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOut;

    public void clickOnCheckOuts(){
        clickOnElement(checkOut);

    }

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeText;



    //public By welcomeText = By.xpath("//h1[text()='Welcome, Please Sign In!']");


    public WebElement getWelcomeText() {
        return welcomeText;
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement register;

    public void clickOnRegister(){
        clickOnElement(register);

    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-next-step-button']")
    WebElement registerNext;

    public void clickOnRegisterNext(){
        clickOnElement(registerNext);

    }
    //public By register = By.xpath("//button[@class='button-1 register-button']");

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement verifyRegister;

   // public By verifyRegister = By.xpath("//h1[text()='Register']");


    public WebElement getVerifyRegister() {
        return verifyRegister;
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='result]")
    WebElement registration;


  //  public By registration =By.xpath("//div[@class='result");


    public WebElement getRegistration() {
        return registration;
    }

    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement conti;

    public void clickOnContinue(){
        clickOnElement(conti);
        customListeners.test.log(Status.PASS,"clickOnContinue");

    }


   // public By conti =By.xpath("//a[text()='Continue']");

}
