package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    public WebElement verifyShoppingCart ;

    public WebElement getVerifyShoppingCart() {
        return verifyShoppingCart;
    }

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement qtyUpdate;

    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath ="(//span[@class='value-summary'])[1]")
    WebElement total ;

    public WebElement getTotal() {
        return total;
    }


    @CacheLookup
    @FindBy(id ="termsofservice")
    WebElement termsOfService;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOut ;

    public void clickOnUpdateCart(){
        clickOnElement(updateCart);

    }

    public void clickOnTermsOfService(){
        clickOnElement(termsOfService);
    }

    public void clickOnCheckOut(){
        clickOnElement(checkOut);
    }

    public void updateQty(String qty){
        sendTextToElement(qtyUpdate, qty);
    }




}
