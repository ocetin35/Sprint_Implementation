package com.V_Track_Project.step_definitions;

import com.V_Track_Project.pages.R_VytrackLoginPage;
import com.V_Track_Project.pages.US02_Page;
import com.V_Track_Project.utilities.BrowserUtils;
import com.V_Track_Project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US02_StepDefs {

    R_VytrackLoginPage rVytrackLoginPage = new R_VytrackLoginPage();
    US02_Page us02_page = new US02_Page();

    @Given("{string} are on the home page")
    public void are_on_the_home_page(String string) {

        rVytrackLoginPage.loginDynamic(string);

    }
    @When("click the question icon on the right top of the homepage")
    public void click_the_question_icon_on_the_right_top_of_the_homepage() {

        us02_page.questionIcon.click();

    }
    @Then("{string} should be able to access to the Oroinc Documentation Page")
    public void should_be_able_to_access_to_the_oroinc_documentation_page(String string) {

        BrowserUtils.switchTitle();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(us02_page.userLink));

        Assert.assertTrue(us02_page.oroDocks.isDisplayed());




    }
}
