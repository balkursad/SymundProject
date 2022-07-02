package com.symund.step_definitions;

import com.symund.pages.DashboardPage;
import com.symund.pages.LoginPage;
import com.symund.utils.ConfigurationReader;
import com.symund.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    @Given("User is on Symund login Page")
    public void user_is_on_symund_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.table.url"));
    }
    @When("User type {string} on the username box")
    public void user_type_on_the_username_box(String string) {
        loginPage.userName.sendKeys("kursad");
    }
    @When("User type {string} on the password box")
    public void user_type_on_the_password_box(String string) {
        loginPage.password.sendKeys(string);
    }
    @When("User click the Login button")
    public void user_click_the_login_button() {
        loginPage.loginButton.click();
    }
    @Then("User should see the dashboard page")
    public void user_should_see_the_dashboard_page() {
        Assert.assertTrue("Login failed", dashboardPage.Avatar.isDisplayed());
    }


    @Then("User should see the Wrong username or password message")
    public void userShouldSeeTheMessage() {
        Assert.assertTrue("Accidently login succeed", loginPage.wrongPasswordWarning.isDisplayed());
    }

    @Then("user should see the password in a form of dots by default")
    public void userShouldSeeThePasswordInAFormOfDotsByDefault() {
        Assert.assertEquals("Password is not seen in a dot form", "password", loginPage.password.getAttribute("type"));
    }

    @And("User click the eye button")
    public void userClickTheEyeButton() {
        loginPage.eyeButton.click();
    }

    @Then("User should see the password explicitly")
    public void userCanSeeThePasswordExplicitly() {
        Assert.assertEquals("Password is not seen explicitly", "text", loginPage.password.getAttribute("type"));
    }

    @Then("User should see the Forget Password? link")
    public void userCanSeeTheForgetPasswordLink() {
        Assert.assertTrue(loginPage.ForgotPassword.isDisplayed());
    }

    @When("User click the Forget Password? link")
    public void userClickTheForgetPasswordLink() {
        loginPage.ForgotPassword.click();
    }

    @Then("User should see the Reset Password button")
    public void userShouldSeeTheResetPasswordButton() {
        Assert.assertTrue(loginPage.ResetPassword.isDisplayed());
    }

    @Then("User should see valid placeholders on Username and Password fields")
    public void userShouldSeeValidPlaceholdersOnUsernameAndPasswordFields() {
        Assert.assertEquals("Kullanıcı adı ya da e-posta",loginPage.userName.getAttribute("placeholder"));
        Assert.assertEquals("Parola", loginPage.password.getAttribute("placeholder"));

    }

    @Then("User should see validation message on the password and username")
    public void userShouldSeeValidationMessageOnThePasswordAndUsername() {
        loginPage.userName.getAttribute("required");
        loginPage.password.getAttribute("required");
    }
}
