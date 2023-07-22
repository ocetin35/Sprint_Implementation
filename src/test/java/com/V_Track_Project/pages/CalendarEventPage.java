package com.V_Track_Project.pages;

import com.V_Track_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventPage {

    public CalendarEventPage() {

        PageFactory.initElements(Driver.getDriver(), this
        );
    }


    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/a/span")
    public WebElement ActivitiesMenu;
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span")
    public WebElement CalendarEventsLink;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement CreateCalenderEventLink;

    @FindBy(xpath = "//input[starts-with(@id,'recurrence-repeat-view')]")
    public WebElement RepeatBox;

    @FindBy(xpath = "//input[starts-with(@id,'oro_calendar_event_form_title-uid-')]")
    public WebElement TitleBox;

    @FindBy(xpath = "//iframe[starts-with(@id,'oro_calendar_event_form_description-uid-')]")
    public WebElement DescriptionFrame;

    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    public WebElement DescriptionBox;

    @FindBy(xpath = "//button[@class='btn favorite-button']")
    public WebElement SaveAndClose;



}