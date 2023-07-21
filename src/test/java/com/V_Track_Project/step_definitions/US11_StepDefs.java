package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.VehicleModulePage_RM;
import com.V_Track_Project.pages.VehicleOdometerPage_RM;
import com.V_Track_Project.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US11_StepDefs {

    VehicleModulePage_RM vehicleModulePage_rm = new VehicleModulePage_RM();
    VehicleOdometerPage_RM vehicleOdometerPage_rm = new VehicleOdometerPage_RM();

    @When("Store manager clicks on Vehicle Odometer")
    public void store_manager_clicks_on_vehicle_odometer() {

        BrowserUtils.waitFor(3);
      if (vehicleModulePage_rm.fleetModule.isDisplayed()){

          vehicleOdometerPage_rm.vehicleOdometerModule.click();
      }


    }
    @Then("Store manager should see an error message")
    public void store_manager_should_see_an_error_message() {

       BrowserUtils.waitForVisibility(vehicleOdometerPage_rm.vehicleOdometerErrorMessage,3);
        vehicleOdometerPage_rm.vehicleOdometerErrorMessage.isDisplayed();

    }
    @When("Sales manager clicks on Vehicle Odometer")
    public void sales_manager_clicks_on_vehicle_odometer() {

        BrowserUtils.waitFor(3);
        vehicleModulePage_rm.fleetModule.click();
        vehicleOdometerPage_rm.vehicleOdometerModule.click();

    }
    @Then("Sales manager should see an error message")
    public void sales_manager_should_see_an_error_message() {

        BrowserUtils.waitForVisibility(vehicleOdometerPage_rm.vehicleOdometerErrorMessage,3);
        vehicleOdometerPage_rm.vehicleOdometerErrorMessage.isDisplayed();
    }

    @When("Driver clicks clicks on Vehicle Odometer")
    public void driver_clicks_clicks_on_vehicle_odometer() {

        vehicleOdometerPage_rm.vehicleOdometerModule.click();

    }
    @Then("Driver should see default page as {int}")
    public void driver_should_see_default_page_as(Integer int1) {

        BrowserUtils.waitFor(2);
        vehicleOdometerPage_rm.defaultPage.isDisplayed();
    }


    @Then("Driver should see the View Per Page is {int} by default")
    public void driver_should_see_the_view_per_page_is_by_default(Integer int1) {

        BrowserUtils.waitFor(2);
        vehicleOdometerPage_rm.viewPerPage.isDisplayed();
    }


}
