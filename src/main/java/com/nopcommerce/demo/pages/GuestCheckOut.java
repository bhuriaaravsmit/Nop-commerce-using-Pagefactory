package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.customListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GuestCheckOut extends Utility {

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement  firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement  city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    public void setFirstName(String firstName) {
        sendTextToElement(this.firstName,firstName);
    }

    public void setLastName(String lastName) {
        sendTextToElement(this.lastName , lastName);
    }

    public void setEmail(String email) {
        sendTextToElement(this.email , email);
    }

    public void setCountry(String country) {
        sendTextToElement( this.country , country);
    }

    public void setCity(String city) {
        sendTextToElement( this.city, city);
    }

    public void setAddress1(String address1) {
        sendTextToElement( this.address1 , address1);
    }

    public void setPostalCode(String postalCode) {
        sendTextToElement( this.postalCode , postalCode);
    }

    public void setPhoneNumber(String phoneNumber) {
        sendTextToElement( this.phoneNumber , phoneNumber);
    }

    public void setAddressContinue(String addressContinue) {
        sendTextToElement(  this.addressContinue , addressContinue);
    }

    public void setShippingOption(String shippingOption) {
        sendTextToElement(this.shippingOption , shippingOption);
    }

    public void setShippping(String shippping) {
        sendTextToElement(  this.shippping , shippping);
    }

    public void setPaymentMethod(String paymentMethod) {
        sendTextToElement(this.paymentMethod , paymentMethod);
    }

    public void setPaymentMethodNext(String paymentMethodNext) {
        sendTextToElement( this.paymentMethodNext , paymentMethodNext);
    }

    public void setExpireMonth(String expireMonth) {
        sendTextToElement(this.expireMonth , expireMonth);
    }

    public void setExpireYear(String expireYear) {
        sendTextToElement( this.expireYear , expireYear);
    }

    public void setCardCode(String cardCode) {
        sendTextToElement(  this.cardCode , cardCode);
    }

    public void setCardType(String cardType) {
        sendTextToElement(this.cardType , cardType);
    }

    public void setCardHolderName(String cardHolderName) {
        sendTextToElement(this.cardHolderName , cardHolderName);
    }

    public void setCardNumber(String cardNumber) {
        sendTextToElement( this.cardNumber , cardNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 new-address-next-step-button']")
    WebElement addressContinue ;

    public void clickOnAddressContinue()

    {
               clickOnElement(addressContinue);
    }



   // @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement shippingOption ;

    public void clickOnshippingOption()
    {

        clickOnElement(shippingOption);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippping ;

    public void clickOnShipping()
    {

       clickOnElement(shippping);
    }


    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement paymentMethod ;

    public void clickOnPaymentMethod()
    {

        clickOnElement(paymentMethod);
    }


    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentMethodNext ;

    public void  clickOnPaymentMethodnext()
    {

        clickOnElement( paymentMethodNext);
    }



    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement cardType ;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id ="CardNumber")
    WebElement cardNumber;

   
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoContinue;

    public void  clickOnPaymentInfo()
    {
        customListeners.test.log(Status.PASS,"clickOnPaymentInfo");
        clickOnElement(paymentInfoContinue);

    }



    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[@class='value']")
    WebElement  paymentMethodVerify;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[@class='value']")
    WebElement  shippingMethodVerify;

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement  subTotalVerify;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement confirmOrder;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement pageTitleVerify;
    @CacheLookup
    @FindBy(xpath = "//div[@class='title']/strong")
    WebElement oderVerify;

    public WebElement getPaymentMethodVerify() {

        customListeners.test.log(Status.PASS,"getPaymentMethodVerify");
        return paymentMethodVerify;
    }

    public WebElement getShippingMethodVerify() {
        customListeners.test.log(Status.PASS,"getShippingMethodVerify");
        return shippingMethodVerify;
    }

    public WebElement getSubTotalVerify() {
        customListeners.test.log(Status.PASS,"getSubTotalVerify");
        return subTotalVerify;
    }

    public WebElement getPageTitleVerify() {
        customListeners.test.log(Status.PASS,"getPageTitleVerify");
        return pageTitleVerify;
    }

    public WebElement getOderVerify() {
        customListeners.test.log(Status.PASS,"getOderVerify");
        return oderVerify;
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement orderCompleted;

    public void clickOnOrderCompleted()
    {
        clickOnElement( orderCompleted);
        customListeners.test.log(Status.PASS,"clickOnOrderCompleted");
    }

    public void clickOnConfirmOrder()
    {
        clickOnElement( confirmOrder);
        customListeners.test.log(Status.PASS,"clickOnConfirmOrder");
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='topic-block-title']/h2")
    WebElement title;
    public WebElement getTitle() {
        return title;
    }

    public void selectExpireMonthFromDropDown(String expireMonth) {
        selectByVisibleTextFromDropDown(this.expireMonth,expireMonth);
    }
    public void selectCountryFromDropDown(String country) {
        selectByVisibleTextFromDropDown(this.country,country);
    }


    public void selectExpireYearFromDropDown(String expireYear) {
        selectByVisibleTextFromDropDown(this.expireYear,expireYear);
    }

}
