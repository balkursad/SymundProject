package com.symund.pages;

import com.symund.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    public void login(String username, String passwrd){

    userName.sendKeys(username);
    password.sendKeys(passwrd+ Keys.ENTER);

    }

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement loginButton;

}
