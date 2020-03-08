package steps_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.google_pages.GoogleLandingPage;
import org.junit.Assert;
import utilities.Driver;
import utilities.Log;

public class Google_StepsDefs {

GoogleLandingPage googleLandingPage = new GoogleLandingPage();


    @When("User is on google homepage")
    public void user_is_on_google_homepage() {
      //1.get the google page
        Driver.getDriver().get("https://google.com");
        Log.info("USER IS ON ");
    }

    @Then("User should see title contains Google")
    public void user_should_see_title_contains_Google() {
      String actualTitle = Driver.getDriver().getTitle();
      String expectedInTitle = "Google";
Log.info("title assertion");
        Assert.assertTrue("Title does not contain expected value!",actualTitle.contains(expectedInTitle));

    }


    @When("User types wooden spoon into the search box")
    public void user_types_wooden_spoon_into_the_search_box() {
        googleLandingPage.googleSearchBox.sendKeys("wooden spoon");
Log.info("user types wooden spoon");
    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {
        googleLandingPage.searchButton.click();

    }

    @Then("User should see wooden spoon in the title")
    public void user_should_see_wooden_spoon_in_the_title() {

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle = "wooden spoon";

        Assert.assertTrue("Title is not displayed",actualTitle.contains(expectedTitle));

    }


}
