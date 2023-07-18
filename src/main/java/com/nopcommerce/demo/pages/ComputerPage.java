package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.customListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {


    @CacheLookup
    @FindBy(id = "products-orderby")
    List<WebElement> sortByNames;
    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy ;

    @CacheLookup
    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwnComputer;

    public WebElement getVerifyBuildYourOwnComputer() {
        return verifyBuildYourOwnComputer;
    }



    public List<String> getProductName() {
       // List<WebElement> products = WebElement sortBy;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : sortByNames) {
            originalProductsName.add(e.getText().toLowerCase());
        }
        return originalProductsName;
    }

    public void clickAddToCart(){
        sleep(1000);
        clickOnElement(addToCart);
        customListeners.test.log(Status.PASS,"clickAddToCart");

    }
    public void selectOrderType(String order) {
        selectByVisibleTextFromDropDown(sortBy,order);
    }



}














