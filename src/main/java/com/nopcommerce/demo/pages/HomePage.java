package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.customListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Computers ']")
    WebElement computer;

   // public By computer = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");


    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[text()='Electronics ']")
    WebElement electronics;


   // public By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");

    @CacheLookup
    @FindBy(xpath = "//h2//a[text()=' Desktops ']")
    WebElement desktops;

   // public By desktops = By.xpath("//h2//a[text()=' Desktops ']");

    @CacheLookup
    @FindBy(xpath = "(//ul/li/a[text()='Cell phones '])[1]")
    WebElement cellPhones;

   // public By cellPhones = By.xpath("(//ul/li/a[text()='Cell phones '])[1]");

    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//a[text()='" + menu + "']"));
    }

    public void clickOnComputer() {
        sleep(1000);
        clickOnElement(computer);
        customListeners.test.log(Status.PASS,"clickOnComputer");
    }

    public void clickOnDesktop() {
        sleep(1000);
        clickOnElement(desktops);
        customListeners.test.log(Status.PASS,"clickOnDesktop");
    }


    public void mouseHoverToElectronics() {

        sleep(1000);
        mouseHoverToElement(electronics);
        customListeners.test.log(Status.PASS,"mouseHoverToElectronics");
    }

    public void mouseHoverToCellPhones() {
        sleep(1000);
        mouseHoverToElementAndClick(cellPhones);
        customListeners.test.log(Status.PASS,"mouseHoverToCellPhones");
    }


}

