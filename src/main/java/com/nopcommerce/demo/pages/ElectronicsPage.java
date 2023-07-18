package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.customListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement cellPhones ;
   // public By cellPhones = By.xpath("//div[@class='page-title']");


    public WebElement getCellPhones() {
        return cellPhones;
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='viewmode-icon list']")
    WebElement listTab ;

    public void clickOnListTab(){

        clickOnElement(listTab);
    }

    //public By listTab = By.xpath("//a[@class='viewmode-icon list']");

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement productName;

    public void clickOnProductName(){

        clickOnElement(productName);
    }


   // public By productName = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-name']/h1[text()='Nokia Lumia 1020']")
    WebElement verifyNokia;

    //public By verifyNokia = By.xpath("//div[@class='product-name']/h1[text()='Nokia Lumia 1020']");


    public WebElement getVerifyNokia() {
        return verifyNokia;
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$349.00')]")
    WebElement price;
  //  public By price = By.xpath("//span[contains(text(),'$349.00')]");


    public WebElement getPrice() {
        return price;
    }

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement changedQty;
    //public By changedQty = By.id("product_enteredQuantity_20");

    public void setChangedQty(String qty){

        sendTextToElement(changedQty, qty);
    }

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCartButton;

   // public By addToCartButton = By.id("add-to-cart-button-20");

    public void clickOnaddToCarton(){

        clickOnElement(addToCartButton);
        customListeners.test.log(Status.PASS,"clickOnaddToCarton");
    }


    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyAddToCart;

   // public By verifyAddToCart = By.xpath("//p[@class='content']");


    public WebElement getVerifyAddToCart() {
        return verifyAddToCart;
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;

    //public By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    public void clickOnShoppingCart(){

        clickOnElement(shoppingCart);
        customListeners.test.log(Status.PASS,"clickOnShoppingCart");
    }

}













