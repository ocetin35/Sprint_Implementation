package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.BasePage;
import com.V_Track_Project.pages.DashboardPage;
import com.V_Track_Project.pages.FleetPage;
import com.V_Track_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US06_StepDef extends BasePage {

    DashboardPage dashboardPage = new DashboardPage();
    FleetPage fleetPage = new FleetPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @Given("the Store manager is already on the homepage")
    public void the_store_manager_is_already_on_the_homepage() {

    }
    @When("the Store manager clicks on {string} under the Fleet")
    public void the_store_manager_clicks_on_under_the_fleet(String string) {

    }
    @Then("the Store manager should verify that any car info has {int} dots and there are {string} icons")
    public void the_store_manager_should_verify_that_any_car_info_has_dots_and_there_are_icons(Integer int1, String string) {

    }
    @Given("the Sales manager is already on the homepage")
    public void the_sales_manager_is_already_on_the_homepage() {

    }
    @When("the Sales manager clicks on {string} under the Fleet")
    public void the_sales_manager_clicks_on_under_the_fleet(String string) {

    }
    @Then("the Sales manager should verify that any car info has {int} dots and there are {string} icons")
    public void the_sales_manager_should_verify_that_any_car_info_has_dots_and_there_are_icons(Integer int1, String string) {

    }
   // @Given("the Truck driver is already on the homepage")
   // public void the_truck_driver_is_already_on_the_homepage() {

   // }
    @When("the Truck driver clicks on {string} under the Fleet")
    public void the_truck_driver_clicks_on_under_the_fleet(String valueInDropdown) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.fleetTab));
        dashboardPage.fleetTab.click();
        Thread.sleep(2);

        WebElement element= Driver.getDriver().findElement(By.xpath("//span[.='"+valueInDropdown+"']"));
        element.click();

    }
    @Then("Verify that car info has Icons after hover over three dots")
    public void verify_that_car_info_has_icons_after_hover_over_three_dots() throws InterruptedException {

      // wait.until(ExpectedConditions.elementToBeClickable(fleetPage.dotsInFirstRow));
        Thread.sleep(1);
        fleetPage.dotsInFirstRow.click();

     //   Assert.assertTrue(fleetPage.dotsInFirstRow.isDisplayed()); change dotsInFirstRow with eye element

    }


}
