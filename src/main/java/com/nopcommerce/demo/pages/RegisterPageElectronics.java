package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPageElectronics extends Utility {


    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;



    //public By firstName = By.id("FirstName");
    //public By lastName = By.id("LastName");
    //public By email = By.id("Email");
    //public By password = By.id("Password");
    //public By confirmPassword = By.id("ConfirmPassword");

    public void setFirstName(String firstname)
    {
              sendTextToElement(this.firstName, firstname);
           }


    public void setLastName(String lastname)
    {
        sendTextToElement(this.lastName, lastname);

            }


    public void setEmail(String email)
    {
        sendTextToElement(this.email, email);

    }

    public void setConfirmPassword(String confirmPassword)
    {
        sendTextToElement(this.confirmPassword, confirmPassword);

    }


    public void setPassword(String password)
    {
        sendTextToElement(this.password, password);

    }





}