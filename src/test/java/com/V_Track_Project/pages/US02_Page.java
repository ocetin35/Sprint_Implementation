package com.V_Track_Project.pages;

import com.V_Track_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_Page {

    public US02_Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='help no-hash']")
    public WebElement questionIcon;

    @FindBy(xpath = "(//img[@alt='Oro Documentation'])[1]")
    public WebElement oroDocks;

    @FindBy(xpath = "//a[.='USERS']")
    public WebElement userLink;










}
