package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.R_VytrackLoginPage;
import com.V_Track_Project.pages.VehicleModulePage_RM;
import com.V_Track_Project.utilities.BrowserUtils;
import com.V_Track_Project.utilities.ConfigurationReader;
import com.V_Track_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class US05_StepDefs {

    R_VytrackLoginPage r_vytrackLoginPage = new R_VytrackLoginPage();
    VehicleModulePage_RM vehicleModulePage_rm = new VehicleModulePage_RM();


    @Given("Store manager is on the Fleet management home page")
    public void store_manager_is_on_the_fleet_management_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        r_vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));

    }
    @When("Store manager clicks on Fleet Module")
    public void store_manager_clicks_on_fleet_module() {

        vehicleModulePage_rm.fleetModule.click();

    }
    @When("Store manager clicks on Vehicles Model Module")
    public void store_manager_clicks_on_vehicles_model_module() {

        BrowserUtils.waitFor(3);
        vehicleModulePage_rm.vehiclesModel.click();


    }
    @Then("Store manager should see expectedColumnNames")
    public void store_manager_should_see_expected_column_names(List<String> expectedColumns) {

        List<String> actualColumns_as_STRING = new ArrayList<>();

        for (WebElement eachCell : vehicleModulePage_rm.vehiclesModelColumns) {
            actualColumns_as_STRING.add(eachCell.getText());
        }

        if(!actualColumns_as_STRING.isEmpty()){
            actualColumns_as_STRING.remove(actualColumns_as_STRING.size()-1);
        }

        BrowserUtils.waitFor(2);

        Assert.assertEquals(expectedColumns,actualColumns_as_STRING);

    }


    @Given("Sales manager is on the Fleet management home page")
    public void sales_manager_is_on_the_fleet_management_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        r_vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("sales_manager_password"));

    }
    @When("Sales manager clicks on Fleet Module")
    public void sales_manager_clicks_on_fleet_module() {

        vehicleModulePage_rm.fleetModule.click();

    }
    @When("Sales manager clicks on Vehicles Model")
    public void sales_manager_clicks_on_vehicles_model() {

        BrowserUtils.waitFor(3);
        vehicleModulePage_rm.vehiclesModel.click();

    }
    @Then("Sales manager should see expectedColumnNames")
    public void sales_manager_should_see_expected_column_names(List<String> expectedColumns) {

        List<String> actualColumns_as_STRING = new ArrayList<>();

        for (WebElement eachCell : vehicleModulePage_rm.vehiclesModelColumns) {
            actualColumns_as_STRING.add(eachCell.getText());
        }

        if(!actualColumns_as_STRING.isEmpty()){
            actualColumns_as_STRING.remove(actualColumns_as_STRING.size()-1);
        }

        BrowserUtils.waitFor(2);

        Assert.assertEquals(expectedColumns,actualColumns_as_STRING);



    }

    @Given("Driver is on the Fleet management home page")
    public void driver_is_on_the_fleet_management_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        r_vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));
    }
    @When("Driver clicks Fleet Module")
    public void driver_clicks_fleet_module() {

        vehicleModulePage_rm.fleetModule.click();

    }
    @When("Driver clicks Vehicles Model Module")
    public void driver_clicks_vehicles_model_module() {

        BrowserUtils.waitFor(2);
        vehicleModulePage_rm.vehiclesModel.click();

    }
    @Then("Driver should see error message")
    public void driver_should_see_error_message() {

        vehicleModulePage_rm.driverErrorMessage.isDisplayed();

    }

}
