package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.customListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
@Listeners(customListeners.class)
public class HomePageTest extends BaseTest {

    HomePage homepage;
    ComputerPage computerpage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    ShoppingCartPage shoppingcartpage;
    GuestCheckOut guestCheckOut;

    WelComePage welComePage;


    @BeforeMethod(groups = {"smoke", "Sanity","regression"})
    public void inIT() {
        homepage = new HomePage();
        computerpage = new ComputerPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        shoppingcartpage = new ShoppingCartPage();
        guestCheckOut = new GuestCheckOut();
        welComePage = new WelComePage();

    }


    @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInAlphabeticalOrder() {
        sleep(1000);
        homepage.clickOnComputer();
        sleep(1000);
        homepage.clickOnDesktop();
        computerpage.selectOrderType("Name: Z to A");
        List<String> productList = computerpage.getProductName();
        List<String> productListAfter = computerpage.getProductName();
        Collections.sort(productListAfter, Collections.reverseOrder());
        Assert.assertEquals(productList, productListAfter);

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() {
        sleep(1000);
        homepage.clickOnComputer();
        homepage.clickOnDesktop();
        computerpage.selectOrderType("Name: A to Z");
        computerpage.clickAddToCart();
        sleep(1000);
        verifyText(computerpage.getVerifyBuildYourOwnComputer(), "Build your own computer");
        buildYourOwnComputerPage.selectProductNameFromDropwDown("2.2 GHz Intel Pentium Dual-Core E2200");
        sleep(600);
        buildYourOwnComputerPage.selectRamFromDropwDown("8GB [+$60.00]");

        sleep(600);
        buildYourOwnComputerPage.clickOnHDD();
        sleep(600);
        buildYourOwnComputerPage.clickOnOs();
        sleep(600);
        buildYourOwnComputerPage.clickOnSoftware1();
        sleep(600);
        verifyText(buildYourOwnComputerPage.getPrice(), "$1,475.00");
        buildYourOwnComputerPage.clickOnAddButton1();
        sleep(600);
        verifyText(buildYourOwnComputerPage.getVerifyProductAdded(), "The product has been added to your shopping cart");
        buildYourOwnComputerPage.clickOnShoppingCard();
        verifyText(shoppingcartpage.getVerifyShoppingCart(), "Shopping cart");
        sleep(600);
        shoppingcartpage.updateQty("2");
        shoppingcartpage.clickOnUpdateCart();
        sleep(600);
        verifyText(shoppingcartpage.getTotal(), "$2,950.00");
        shoppingcartpage.clickOnTermsOfService();
        shoppingcartpage.clickOnCheckOut();
        sleep(600);
        verifyText(welComePage.getWelcomeText(), "Welcome, Please Sign In!");
        welComePage.clickOnGuestButton();
        guestCheckOut.setFirstName("Shweta");
        guestCheckOut.setLastName("Shah");
        guestCheckOut.setEmail("shweta1335@gmail.com");

        guestCheckOut.setCity("Baroda");
        guestCheckOut.setAddress1("37 ring road");
        guestCheckOut.selectCountryFromDropDown( "India");


        guestCheckOut.setPostalCode("380023");
        guestCheckOut.setPhoneNumber("0265248968");

        guestCheckOut.clickOnAddressContinue();
        guestCheckOut.clickOnshippingOption();
        guestCheckOut.clickOnShipping();
        sleep(300);

        guestCheckOut.clickOnPaymentMethod();
        sleep(300);
        guestCheckOut.clickOnPaymentMethodnext();
        sleep(300);


        //  selectByVisibleTextFromDropDown(guestCheckOut.cardType, "Master card");


        guestCheckOut.setCardHolderName("Shweta shah");

        guestCheckOut.setCardNumber("5425233430109903");
        guestCheckOut.selectExpireMonthFromDropDown("08");
        guestCheckOut.selectExpireYearFromDropDown("2026");


        guestCheckOut.setCardCode("123");

        guestCheckOut.clickOnPaymentInfo();

        sleep(300);
        verifyText(guestCheckOut.getPaymentMethodVerify(), "Credit Card");
        verifyText(guestCheckOut.getShippingMethodVerify(), "Next Day Air");

        verifyText(guestCheckOut.getSubTotalVerify(), "$2,950.00");

        guestCheckOut.clickOnConfirmOrder();
       sleep(500);

        verifyText(guestCheckOut.getPageTitleVerify(), "Thank you");
        verifyText(guestCheckOut.getOderVerify(), "Your order has been successfully processed!");

        guestCheckOut.clickOnOrderCompleted();
        sleep(300);

        verifyText(guestCheckOut.getTitle(), "Welcome to our store");


        sleep(300);
    }


}
