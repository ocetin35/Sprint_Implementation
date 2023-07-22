package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.CalendarEventPage;
import com.V_Track_Project.utilities.BrowserUtils;
import com.V_Track_Project.utilities.Driver;
import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class CalendarEventStepDefs {

    CalendarEventPage calendarEventPage = new CalendarEventPage();

    @And("user should be open enter the Calendar Events page")
    public void userShouldBeOpenEnterTheCalendarEventsPage() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(calendarEventPage.ActivitiesMenu).perform();

        calendarEventPage.CalendarEventsLink.click();
    }
    @Then("Calendar events page title should be {string}")
    public void calendarEventsPageTitleShouldBe(String expectedTitle) {

        BrowserUtils.sleep(10);
        String actualTitle = Driver.getDriver().getTitle();

        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    @And("user should be open the Calender Event page")
    public void userShouldBeOpenTheCalenderEventPage() {

        calendarEventPage.CreateCalenderEventLink.click();

    }

    @Then("user should be enter Title")
    public void userShouldBeEnterTitle() {

        calendarEventPage.RepeatBox.click();
        calendarEventPage.TitleBox.sendKeys("Barbeque Party");

    }

    @And("user should be enter description")
    public void userShouldBeEnterDescription() {
        Driver.getDriver().switchTo().frame(calendarEventPage.DescriptionFrame);

        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());

        calendarEventPage.DescriptionBox.sendKeys("Description");

        Driver.getDriver().switchTo().parentFrame();


    }

    @Then("user should be able to save and close")
    public void userShouldBeAbleToSaveAndClose() {

        calendarEventPage.SaveAndClose.click();
    }
}
