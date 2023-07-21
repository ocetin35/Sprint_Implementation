package com.V_Track_Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FleetPage {


    @FindBy(xpath ="(//div[@class='dropdown']/a)[1]")
    public WebElement dotsInFirstRow;
}
