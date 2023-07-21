package com.V_Track_Project.pages;

import com.V_Track_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleModulePage_RM {

    public VehicleModulePage_RM(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[normalize-space()='Vehicles Model']")
    public WebElement vehiclesModel;

    @FindBy(xpath = " //table[@class='grid table-hover table table-bordered table-condensed']//th[@class='select-all-header-cell renderable grid-cell grid-header-cell grid-header-cell-massAction']/following-sibling::th ")
    public List<WebElement> vehiclesModelColumns;


    @FindBy(xpath = "//div[normalize-space()='You do not have permission to perform this action.']")
    public WebElement driverErrorMessage;





}
