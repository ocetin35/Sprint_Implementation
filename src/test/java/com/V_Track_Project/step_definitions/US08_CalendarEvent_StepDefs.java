package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.R_VytrackLoginPage;
import com.V_Track_Project.pages.US08_CalendarEventPage;
import com.V_Track_Project.utilities.BrowserUtils;
import com.V_Track_Project.utilities.ConfigurationReader;
import com.V_Track_Project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class US08_CalendarEvent_StepDefs {


    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();
    US08_CalendarEventPage us08CalendarEventPage = new US08_CalendarEventPage();


    @Given("Users are on the homepage")
    public void users_are_on_the_homepage() {

    }
    @And("user enters valid credentials")
    public void userEntersValidCredentials() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));
    }
    @And("user hover-over {string} on main modules")
    public void userHoverOverOnMainModules(String arg0) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us08CalendarEventPage.hoverOverActivities).perform();

    }

    @When("They click {string} under the Activities")
    public void they_click_under_the_activities(String xpath) {
        us08CalendarEventPage.clickCalendarEventsLink();
    }

    @And("They move to the right corner over Create Calendar Event")
    public void theyMoveToTheRightCornerOverCreateCalendarEvent() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(us08CalendarEventPage.clickCreateCalendarEventLink).pause(1000).perform();

    }

    @And("They click the {string} button")
    public void theyClickTheButton(String linkText) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(us08CalendarEventPage.clickCreateCalendarEventLink));
        us08CalendarEventPage.clickCreateCalendarEventLink.click();

    }


    @And("They check the {string} checkbox")
    public void theyCheckTheCheckbox(String arg0) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(us08CalendarEventPage.checkRepeatCheckbox));
        us08CalendarEventPage.checkRepeatCheckbox.click();
    }

    @Then("They should see the number {string} by default in the Repeat Every input.")
    public void theyShouldSeeTheNumberByDefaultInTheRepeatEveryInput(String arg0) {
        String actualValue = us08CalendarEventPage.seeDefaultRepeatEveryDayValueInCheckBox.getAttribute("1");
        try {
            int actualValueInt = Integer.parseInt(actualValue);
            System.out.println("actualValue = " + actualValue);

        } catch (NumberFormatException e) {
            System.out.println("invalid number");
        }

    }

    @And("They clear \\(delete) the number {int}")
    public void theyClearDeleteTheNumber(int arg0) {
        us08CalendarEventPage.seeDefaultRepeatEveryDayValueInCheckBox.clear();
    }

    @Then("They should see an error message {string}")
    public void they_should_see_an_error_message(String expectedErrorMessage) {
        us08CalendarEventPage.errorMessageText.isDisplayed();
        Assert.assertEquals(us08CalendarEventPage.errorMessageText.getText(), expectedErrorMessage);
    }



}
