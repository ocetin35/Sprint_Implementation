package com.V_Track_Project.pages;

import com.V_Track_Project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBox_Page {

    public CheckBox_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleet;


    @FindBy(xpath = "//span[.='Vehicles'] ")
    public WebElement vehicles;


    @FindBy (xpath = "(//input[@type='checkbox'])[20]")
    public WebElement CheckBox1_First;



}
