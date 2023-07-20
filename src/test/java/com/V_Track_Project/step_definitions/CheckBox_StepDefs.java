package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.CheckBox_Page;
import com.V_Track_Project.pages.R_VytrackLoginPage;
import com.V_Track_Project.utilities.BrowserUtils;
import com.V_Track_Project.utilities.ConfigurationReader;
import com.V_Track_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CheckBox_StepDefs {

    CheckBox_Page checkBoxPage = new CheckBox_Page();
    R_VytrackLoginPage rVytrackLoginPage = new R_VytrackLoginPage();


    //Login as a Sales manager
    @Given("Sales manager are on the homepage")
    public void sales_manager_are_on_the_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        rVytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));

        BrowserUtils.sleep(2);
    }


    //Login as a Store manager
    @Given("Store manager are on the homepage")
    public void storeManagerAreOnTheHomepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        rVytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));

        BrowserUtils.sleep(2);
    }


    @When("Click the Vehicle under Fleet")
    public void click_the_vehicle_under_fleet() {

        checkBoxPage.fleet.click();

        BrowserUtils.sleep(1);

        checkBoxPage.vehicles.click();


        BrowserUtils.sleep(1);
    }

    @Then("Verify all the checkboxes are unchecked")
    public void verify_all_the_checkboxes_are_unchecked() {

        if (checkBoxPage.CheckBox1_First.isSelected()) {
            System.out.println("Test FAILED - FIRST CheckBox is SELECTED ");
        } else {
            System.out.println("Test PASSED - FIRST CheckBox is NOT Selected ");

            List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//input[@tabindex='-1']"));

            for (WebElement each : checkboxes) {
                if (each.isSelected()) {
                    System.out.println("Test FAILED - CheckBox is SELECTED");
                } else {
                    System.out.println("Test PASSED - CheckBox is NOT Selected");
                }
            }
        }
    }

    @Then("Users are click the first checkbox in the web-table")
    public void users_are_click_the_first_checkbox_in_the_web_table() {

        checkBoxPage.fleet.click();

        checkBoxPage.vehicles.click();

        checkBoxPage.CheckBox1_First.click();


        BrowserUtils.sleep(2);
    }

    @Then("Verify all the checkboxes also checked")
    public void verify_all_the_checkboxes_also_checked() {

        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//input[@tabindex='-1']"));

        for (WebElement each : checkboxes) {
            if (each.isSelected()) {
                System.out.println("Test PASSED - ALL CheckBoxes is Selected by hitting on the first checkBox ");
            } else {
                System.out.println("Test FAILED - CheckBoxes is NOT SELECTED ");
            }
        }
    }


    @Then("Check any car`s checkbox Verify the box is checked")
    public void checkAnyCarSCheckboxVerifyTheBoxIsChecked() {
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//input[@tabindex='-1']"));

        for (WebElement each : checkboxes) {
            each.click();

            if (each.isSelected()) {
                System.out.println("Test PASSED - ANY CheckBox is Selected one by one ");
            } else {
                System.out.println("Test FAILED - ANY CheckBox is NOT SELECTED ");
            }
        }

    }

}
