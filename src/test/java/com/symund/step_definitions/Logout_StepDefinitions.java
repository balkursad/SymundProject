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

public class Logout_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on Symund dashboard page")
    public void user_is_on_symund_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("symund.url"));
        loginPage.login("Employee31", "Employee123");
    }
    @When("User click on the profile button")
    public void user_click_on_the_profile_button() {
       dashboardPage.Avatar.click();
    }
    @When("User click on the Log out button")
    public void user_click_on_the_log_out_button() {
        dashboardPage.logoutButton.click();
    }
    @Then("User should see the login page")
    public void user_should_see_the_login_page() {
        Assert.assertTrue(loginPage.userName.isDisplayed());
    }

    @And("User click the back button")
    public void userClickTheBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("User should stay login page")
    public void user_should_stay_login_page() {
        Assert.assertTrue(loginPage.userName.isDisplayed());
    }
}
