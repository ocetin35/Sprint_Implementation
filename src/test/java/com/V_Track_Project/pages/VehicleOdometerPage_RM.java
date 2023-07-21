package com.V_Track_Project.pages;

import com.V_Track_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage_RM {

    public VehicleOdometerPage_RM(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Vehicle Odometer']")
    public WebElement vehicleOdometerModule;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement vehicleOdometerErrorMessage;


    @FindBy(xpath = "//input[@value='1']")
    public WebElement defaultPage;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPage;

}
