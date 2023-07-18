package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.customListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {




    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement productName ;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram ;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement HDD;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement OS ;
    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement softWare ;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softWare1;

    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement price ;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement AddButton1 ;


    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyProductAdded;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart ;


    public WebElement getPrice() {
        return price;
    }


    public WebElement getVerifyProductAdded() {
        return verifyProductAdded;
    }


    public void mouseHoverToElement()
    {
        sleep(2000);
        mouseHoverToElement(shoppingCart);

    }

    public void selectProductNameFromDropwDown(String name) {
        selectByVisibleTextFromDropDown(productName,name);
    }

    public void selectRamFromDropwDown(String name) {
        selectByVisibleTextFromDropDown(ram,name);
    }
    public void clickOnHDD(){
        clickOnElement(HDD);
        customListeners.test.log(Status.PASS,"clickOnHDD");
    }

    public void clickOnOs(){
        clickOnElement(OS);
        customListeners.test.log(Status.PASS,"clickOnOs");
    }
    public void clickOnSoftware(){
        clickOnElement(softWare);
        customListeners.test.log(Status.PASS,"clickOnSoftware");
    }

    public void clickOnSoftware1(){
        clickOnElement(softWare1);
        customListeners.test.log(Status.PASS,"clickOnSoftware1");
    }

    public void clickOnAddButton1(){
        clickOnElement(AddButton1);
        customListeners.test.log(Status.PASS,"clickOnAddButton1");
    }
    public void clickOnShoppingCard(){
        clickOnElement(shoppingCart);
        customListeners.test.log(Status.PASS,"clickOnShoppingCard");
    }



}
















