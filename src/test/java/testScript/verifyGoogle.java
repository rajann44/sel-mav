package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utils.DriverController;

public class verifyGoogle {

    protected WebDriver driver = DriverController.getDriver();

    @Test(groups = "Regression")
    public void verifyGooglePage(){
        driver.get("https://google.com");
    }

    @Test(groups = "Smoke")
    public void verifyGooglePage2() { driver.get("https://google.in"); }

    @AfterTest(alwaysRun = true)
    public void cleanUp() { driver.quit(); }

}
