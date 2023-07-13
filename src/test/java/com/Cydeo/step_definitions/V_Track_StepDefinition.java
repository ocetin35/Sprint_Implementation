package com.Cydeo.step_definitions;

import com.Cydeo.utilities.ConfigurationReader;
import com.Cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class V_Track_StepDefinition {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));

    }
    @When("user enters the driver information")
    public void user_enters_the_driver_information() {

    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

    }
}
