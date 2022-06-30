package com.symund.step_definitions;

import com.symund.pages.DashboardPage;
import com.symund.pages.LoginPage;
import com.symund.utils.ConfigurationReader;
import com.symund.utils.Driver;
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
        loginPage.userName.sendKeys(string);
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
}
