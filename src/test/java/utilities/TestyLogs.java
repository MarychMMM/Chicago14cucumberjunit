package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestyLogs {
    public static void main(String[] args) {


        ExtentHtmlReporter configs = new ExtentHtmlReporter("./extentReport/report.html");
        configs.config().setTheme(Theme.DARK);
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(configs);
        System.out.println("test starting");
        ExtentTest extentTest = reports.createTest("Google Search");
        extentTest.pass("it is passing");
        extentTest.fail("Test failed");
        reports.flush();


    }
}
