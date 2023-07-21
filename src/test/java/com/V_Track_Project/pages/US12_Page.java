package com.V_Track_Project.pages;

import com.V_Track_Project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US12_Page {

    public US12_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(xpath = "(//div[@id='main-menu']/ul/li)[3]")
    public WebElement customerLink;

    @FindBy(xpath = "(//div[@id='main-menu']/ul/li)[3]//span[.='Accounts']")
    public WebElement accountsDropdown;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement allAccounts;

    @FindBy(xpath = "(//table/thead//th)[1]/following-sibling::th")
    public List<WebElement> filterOptions;
//(//tr[@class='grid-header-row']/th)[1]/following-sibling::th
//table/thead//tr[@class='grid-header-row']//th
    //table//th/following-sibling::th/a
//table/thead//tr
// table/thead//tr[@class='grid-header-row']//th
    @FindBy(xpath = "//table//th[.='Account name']")
    public WebElement accountName;

    @FindBy(xpath = "(//tr[@class='grid-header-row'])[1]")
    public WebElement filterOptionsRow;


    @FindBy(xpath = "(//table//tbody//td)[2]")
    public WebElement customer_test_Text;





    ////span[.='Account name'] == acoount name







}
