package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.PinbarPage;
import com.V_Track_Project.pages.R_VytrackLoginPage;
import com.V_Track_Project.utilities.BrowserUtils;
import com.V_Track_Project.utilities.ConfigurationReader;
import com.V_Track_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStepDefs {
    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();
    PinbarPage pinbarPage =new PinbarPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

    }

    @When("user enters the driver information")
    public void user_enters_the_driver_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {



        String expectedTitle = "Dashboard";


        // we need to use explicit wait to handle conditions
        // implicit wait doesn't work for assertion because there is no findelement(s)/FindBy to look for
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title verification failed!",expectedTitle,actualTitle);


    }

    @When("user enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("sales_manager_password"));

    }

    @When("user enters the store manager information")
    public void user_enters_the_store_manager_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
    }


    @When("user enters the {string} information")
    public void user_enters_the_information(String userType) {

        vytrackLoginPage.loginDynamic(userType);

    }

    @When("the user login with {string},{string}")
    public void theUserLoginWith(String username, String password) {

        vytrackLoginPage.login(username,password);

    }

 /*  @Then("the user should not be able to log in")
    public void theUserShouldNotBeAbleToLogIn() {

        BrowserUtils.verifyTitle("Login");

    }
*/

    @Given("User is on the homepage")
    public void userIsOnTheHomepage() {
        user_is_on_the_login_page();
    }

    @And("User clicks on any page on the home page")
    public void userClicksOnAnyPageOnTheHomePage() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(pinbarPage.fleetIcon).pause(1000).perform();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(pinbarPage.vehiclesPage));
        pinbarPage.vehiclesPage.click();
        BrowserUtils.waitFor(10);

    }

    @When("User clicks on the Pinbar icon")
    public void userClicksOnThePinbarIcon() {

        pinbarPage.pinbarIcon.click();
    }

    @Then("User sees desired page highlighted in the header section in yellow")
    public void userSeesDesiredPageHighlightedInTheHeaderSectionInYellow() {

         pinbarPage.highlightedHeaderInYellow.isDisplayed();
    }

    @When("User hovers on that specific page")
    public void userHoversOnThatSpecificPage() {
   // Actions actions = new Actions(Driver.getDriver());
    vytrackLoginPage.login("user1","UserUser123");
     //   vytrackLoginPage.loginBtn.click();
     //   BrowserUtils.waitFor(10);
        pinbarPage.fleetIcon.isEnabled();

    }

    @Then("User sees expected image source")
    public void userSeesExpectedImageSource() {
    String actualImage = Driver.getDriver().getCurrentUrl();
    //BrowserUtils.waitFor(5);
    String expectedImage = "https://qa1.vytrack.com/entity/Extend_Entity_Carreservation?restore=1";
    // Assertion
    Assert.assertTrue(expectedImage.contains(actualImage));
    }
}
