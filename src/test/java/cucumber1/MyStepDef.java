package cucumber1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef
{
    HomePage homePage = new HomePage();

    @Given("^User is on homepage$")
    public void user_is_on_homepage()
    {


    }

    @When("^User click on Computers button$")
    public void user_click_on_Computers_button()
    {
        homePage.cliclOnCumputer();

    }

    @Then("^User should be navigate to Computers page$")
    public void user_should_be_navigate_to_Computers_page()
    {


    }

    @When("^User click on Electronics button$")
    public void user_click_on_Electronics_button()
    {
        homePage.cliclOnElectronics();

    }

    @Then("^User should be navigate to Electronics page$")
    public void user_should_be_navigate_to_Electronics_page()
    {


    }

    @When("^User click on Apparel button$")
    public void user_click_on_Apparel_button()
    {
        homePage.cliclOnApparel();

    }

    @Then("^User should be navigate to Apparel page$")
    public void user_should_be_navigate_to_Apparel_page()
    {


    }

    @When("^User click on Digital downloads button$")
    public void user_click_on_Digital_downloads_button()
    {
        homePage.cliclOnDigitalDownloads();

    }

    @Then("^User should be navigate to Digital downloads page$")
    public void user_should_be_navigate_to_Digital_downloads_page()
    {


    }

    @When("^User click on Books button$")
    public void user_click_on_Books_button()
    {
        homePage.cliclOnBooks();

    }

    @Then("^User should be navigate to Books page$")
    public void user_should_be_navigate_to_Books_page()
    {


    }

    @When("^User click on Jewelry button$")
    public void user_click_on_Jewelry_button()
    {
        homePage.cliclOnJewelry();

    }

    @Then("^User should be navigate to Jewelry page$")
    public void user_should_be_navigate_to_Jewelry_page()
    {


    }

    @When("^User click on Gift Cards button$")
    public void user_click_on_Gift_Cards_button()
    {
        homePage.cliclOnGiftCards();

    }

    @Then("^User should be navigate to Gift Cards page$")
    public void user_should_be_navigate_to_Gift_Cards_page()
    {


    }


}
