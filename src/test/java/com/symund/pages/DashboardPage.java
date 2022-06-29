package com.symund.pages;

import com.symund.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement Avatar;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logoutButton;


}
