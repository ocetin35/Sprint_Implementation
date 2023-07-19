package com.V_Track_Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetTab;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement custumersTab;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement activitiesTab;
    @FindBy(xpath = "(//span[@class='title title-level-1'])[4]")
    public WebElement systemTab;






}
