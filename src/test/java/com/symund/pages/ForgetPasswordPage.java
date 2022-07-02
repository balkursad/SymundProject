package com.symund.pages;

import com.symund.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {
    public ForgetPasswordPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "reset-password-submit")
    public WebElement ResetPassword;
}
