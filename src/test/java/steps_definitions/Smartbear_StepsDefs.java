package steps_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.smartbear_pages.SmartBearPage;
import utilities.Driver;

public class Smartbear_StepsDefs {

    SmartBearPage smartBearPage =new SmartBearPage();

    @Given("Smartbear login home page")
    public void smartbear_login_home_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
       // Log.info("user on"+ url);
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        smartBearPage.smartBearUserInput.sendKeys("Tester");
        smartBearPage.smartBearPasswordInput.sendKeys("test");

    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        smartBearPage.smartBeraLoginButton.click();
    }

    @Then("User should see Weclome, Tester! when he login.")
    public void user_should_see_Weclome_Tester_when_he_login() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Web Orders";
    }

    @When("User enters valid username")
    public void user_enters_valid_username() {
        smartBearPage.smartBearUserInput.sendKeys("Tester");
    }

    @When("User enters not valid password")
    public void user_enters_not_valid_password() {
        smartBearPage.smartBearPasswordInput.sendKeys("incorrect");
    }

    @Then("User should see error message when he login.")
    public void user_should_see_error_message_when_he_login() {
        Assert.assertTrue(smartBearPage.smartBearErrorMessage.isDisplayed());
    }


}
