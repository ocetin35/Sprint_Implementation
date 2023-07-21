package com.V_Track_Project.pages;

import com.V_Track_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US04_Page {

    public US04_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[normalize-space()='Vehicle Contracts']")
    public WebElement vehicleContracts;






}
