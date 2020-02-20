package StepDefinitions;

import Pages.HomePage;
import Pages.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class stepdefs {

    HomePage homePage=new HomePage();
    ResultsPage resultsPage=new ResultsPage();

    @Given("^i am on homepage$")
    public void i_am_on_homepage() throws Throwable {
        Assert.assertTrue("Book a hotel ",homePage.isDisplayed());
    }

    @When("^I enter a location$")
    public void select_the_first_product() throws Throwable {
     homePage.searchLocation();
     homePage.clickSearchBtn();
    }

    @Then("^I view results of the selected location$")
    public void add_to_basket() throws Throwable {
        resultsPage.firstHotel();

        Assert.assertTrue("Book now",resultsPage.isDisplayed());

    }

}
