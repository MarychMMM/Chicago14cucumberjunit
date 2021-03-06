package pages.vytrack_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateCalendarEventPage {

    public CreateCalendarEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//a[@title ='Create Calendar event']")
    public WebElement createCalendarEventsBtn;

    @FindBy(css = ".select2-chosen")
    public WebElement ownerField;
    @FindBy (css = "#user-menu")
    public WebElement loginUser;
    @FindBy(css = "[id^= 'oro_calendar_event_form_title']")
    public WebElement titleField;
    @FindBy (css = "[id^= 'date_selector_oro_calendar_event_form_start']")
    public WebElement startDate;
    @FindBy (css = "[id^='time_selector_oro_calendar_event_form_start']")
    public WebElement startTime;

    @FindBy (css = "[id^= 'recurrence-repeat-view']")
    public WebElement repeatCheckBox;
    @FindBy (css = "[id^= 'recurrence-repeats-view']")
    public WebElement repeatSelectField;






}
