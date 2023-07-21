package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.US02_Page;
import com.V_Track_Project.pages.US12_Page;
import com.V_Track_Project.utilities.BrowserUtils;
import com.V_Track_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.eo.Se;
import io.cucumber.java.zh_cn.而且;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US12_StepDefs {

    US12_Page us12Page = new US12_Page();

    @Given("user click the Accounts dropdown under the Customer link")
    public void user_click_the_accounts_dropdown_under_the_customer_link() {

        BrowserUtils.waitForVisibility(us12Page.customerLink, 15);


        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us12Page.customerLink).perform();


        BrowserUtils.waitForVisibility(us12Page.accountsDropdown, 15);

        actions.moveToElement(us12Page.accountsDropdown).click().perform();


        BrowserUtils.waitForVisibility(us12Page.accountName, 15);



    }


    @Then("user should be able to see below account names as filter options")
    public void user_should_be_able_to_see_below_account_names_as_filter_options(List<String> expectedFilterOptions) {


       List<String> actualFilterOptions = new ArrayList<>();

        for (WebElement eachFilter : us12Page.filterOptions) {

            actualFilterOptions.add(eachFilter.getText());

        }

        if(!actualFilterOptions.isEmpty()){
            actualFilterOptions.remove(actualFilterOptions.size()-1);
        }

        Assert.assertEquals(expectedFilterOptions,actualFilterOptions);


    }
}