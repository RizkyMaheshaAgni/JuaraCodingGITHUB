package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator @FindBy
    @FindBy(xpath = "//button[@pull-right noo-topbar-right']")
    WebElement btnMyAccount;

    @FindBy(xpath = "//input[@id='reg_username']")
    WebElement reg_username;
    @FindBy(xpath = "//input[@id='reg_email']")
    WebElement reg_email;

    //input[@id='reg_email']
    @FindBy(xpath = "//input[@id='reg_password']")
    WebElement reg_password;
    @FindBy(xpath = "//button[normalize-space()='Register'])")
    WebElement btnRegister;

    // Custom Method
    public void login(){
        reg_username.sendKeys("Admin");
        reg_email.sendKeys("juaracoding@gmail.com");
        reg_password.sendKeys("Admin123%");
        btnMyAccount.click();
        btnRegister.click();
    }
    // Method return
}
