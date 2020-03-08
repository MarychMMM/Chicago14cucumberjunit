package steps_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.Driver;
import utilities.Log;
import utilities.TempStorage;

public class Dzone_stepDefs {
    @Given("User on the goggle search enter url {string}")
    public void user_on_the_goggle_search_enter_url(String url) {
        Driver.getDriver().get(url);
        Log.info("User on " + url);
    }


    @Given("User gets the title")
    public void user_gets_the_title() {
        String title1 = Driver.getDriver().findElement(By.tagName("h1")).getText();
        TempStorage.getData("test", title1);
        Log.info("header taken " + title1);
    }

    @Given("User on the goggle search enetr url {string}")
    public void user_on_the_goggle_search_enetr_url(String string) {
        String title2 = Driver.getDriver().findElement(By.tagName("h1")).getText();
        TempStorage.getData("test1", title2);
        Log.info("header2 is taken " + title2);
    }

    @Then("User compares {int} header")
    public void user_compares_header(Integer int1) {
        Log.warn("Comparing two data");
        Assert.assertEquals(TempStorage.getData("test"), TempStorage.getData("test1"));
    }


}
