package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.US04_Page;
import com.V_Track_Project.utilities.BrowserUtils;
import com.V_Track_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US04_StepDefinitions {

    US04_Page us04_page = new US04_Page();

    @Given("user enters the store manager username")
    public void user_enters_the_store_manager_username() {
        us04_page.inputUsername.sendKeys("storemanager51");
    }
    @Given("user enters the store manager password")
    public void user_enters_the_store_manager_password() {
        us04_page.inputPassword.sendKeys("UserUser123");
    }
    @Given("user should see the dashboard")
    public void user_should_see_the_dashboard() {

    }
    @Given("user should see the Vehicle Contracts under Fleet option")
    public void user_should_see_the_vehicle_contracts_under_fleet_option() {
            us04_page.fleetButton.click();
    }
    @Given("user should click the Vehicle Contracts")
    public void user_should_click_the_vehicle_contracts() {
        us04_page.vehicleContracts.click();
    }
    @Given("user should have an access with Vehicle Contracts page")
    public void user_should_have_an_access_with_vehicle_contracts_page() {

    }
    @Given("user sees the expected url")
    public void user_sees_the_expected_url() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedInURL = "";

        Assert.assertTrue(actualURL.contains(expectedInURL));
    }

    @Then("user sees the expected title")
    public void user_sees_the_expected_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }



    @Given("user enters the sales manager username")
    public void user_enters_the_sales_manager_username() {
        us04_page.inputUsername.sendKeys("salesmanager101");
    }
    @Given("user enters the sales manager password")
    public void user_enters_the_sales_manager_password() {
        us04_page.inputPassword.sendKeys("UserUser123");
    }

    @Given("user enters the driver username")
    public void user_enters_the_driver_username() {
        us04_page.inputUsername.sendKeys("user1");
    }
    @Given("user enter the driver password")
    public void user_enter_the_driver_password() {
        us04_page.inputPassword.sendKeys("UserUser123");
    }


    @Then("user should see an error message")
    public void user_should_see_an_error_message() {

    }


    @Given("user should click the login button")
    public void userShouldClickTheLoginButton() {
        us04_page.loginButton.click();
    }
}
