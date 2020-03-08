package pages.smartbear_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartBearPage {

    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(id="ctl00_MainContent_login_button")
public WebElement smartBeraLoginButton;



    @FindBy(id="ctl00_MainContent_username")
    public WebElement smartBearUserInput;



    @FindBy(id="ctl00_MainContent_password")
    public WebElement smartBearPasswordInput;



    @FindBy(xpath = "//*[@id='ctl00_MainContent_status']")
    public WebElement smartBearErrorMessage;

}







