package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.customListeners;
import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.ElectronicsShoppingCartPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPageElectronics;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(customListeners.class)
public class ElectronicsPageTest extends BaseTest {

    HomePage homepage;
    ElectronicsPage electronicsPage;
    ElectronicsShoppingCartPage electronicsShoppingCartPage;

    RegisterPageElectronics registerPageElectronics;


    @BeforeMethod(groups = {"smoke", "Sanity","regression"})
    public void inIT() {
        homepage = new HomePage();
        electronicsPage = new ElectronicsPage();
        electronicsShoppingCartPage = new ElectronicsShoppingCartPage();
        registerPageElectronics = new RegisterPageElectronics();

    }


    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        sleep(2000);
        homepage.mouseHoverToElectronics();
        homepage.mouseHoverToCellPhones();
        sleep(2000);
        verifyText(electronicsPage.getCellPhones(), "Cell phones");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        sleep(3000);
        homepage.mouseHoverToElectronics();
        sleep(1000);
        homepage.mouseHoverToCellPhones();
        verifyText(electronicsPage.getCellPhones(), "Cell phones");
        electronicsPage.clickOnListTab();
        sleep(2000);
        electronicsPage.clickOnProductName();
        verifyText(electronicsPage.getVerifyNokia(), "Nokia Lumia 1020");
        verifyText(electronicsPage.getPrice(), "$349.00");
        electronicsPage.setChangedQty("2");
        sleep(2000);
        electronicsPage.clickOnaddToCarton();
        verifyText(electronicsPage.getVerifyAddToCart(), "The product has been added to your shopping cart");
        electronicsPage.clickOnShoppingCart();
        verifyText(electronicsShoppingCartPage.getShoppingCart(), "Shopping cart");
        verifyText(electronicsShoppingCartPage.getTotal(), "$698.00");
        electronicsShoppingCartPage.clickOnAgreeTerms();
        electronicsShoppingCartPage.clickOnCheckOuts();
        verifyText(electronicsShoppingCartPage.getWelcomeText(), "Welcome, Please Sign In!");
        electronicsShoppingCartPage.clickOnRegister();
        verifyText(electronicsShoppingCartPage.getVerifyRegister(), "Register");

        registerPageElectronics.setFirstName("Shweta");
        registerPageElectronics.setLastName("Shah");
        registerPageElectronics.setEmail("Shweta1233.shh1@gmail.com");
        registerPageElectronics.setPassword("Shweta123");
        registerPageElectronics.setConfirmPassword("Shweta123");

        electronicsShoppingCartPage.clickOnRegisterNext();
        verifyText(electronicsShoppingCartPage.getRegistration(), "Your registration completed");

       // electronicsShoppingCartPage.clickOnContinue();


        // electronicsShoppingCartPage.clickOnElement(electronicsShoppingCartPage.registerButton);*/
    }


}
