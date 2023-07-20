package com.V_Track_Project.pages;

import com.V_Track_Project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class US08_CalendarEventPage {


    public US08_CalendarEventPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/a/span")
    public WebElement hoverOverActivities;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span")
    public WebElement clickCalendarEvents;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/div/a")
    public WebElement clickCreateCalendarEventLink;

    @FindBy(xpath = "//*[@id=\"date_selector_oro_calendar_event_form_start-uid-64b947018bec1\"]")
    public WebElement clickOnDateSelectorBox;

    @FindBy(xpath = "//input[@data-name= 'recurrence-repeat']")
    public WebElement checkRepeatCheckbox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement seeDefaultRepeatEveryDayValueInCheckBox;


    @FindBy(xpath = "//*[@id=\"temp-validation-name-162-error\"]/span/span")
    public WebElement errorMessageText;


    public void clickCalendarEventsLink() {
        clickCalendarEvents.click();
    }



}
