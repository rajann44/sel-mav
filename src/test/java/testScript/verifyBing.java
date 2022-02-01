package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utils.DriverController;

public class verifyBing {

    protected WebDriver driver = DriverController.getDriver();

    @Test(groups = "Regression")
    public void verifyBingPage(){
        driver.get("https://bing.com");
    }

    @Test(groups = "Smoke")
    public void verifyBingPage2(){
        driver.get("https://bing.in");
    }

    @AfterTest(alwaysRun = true)
    public void cleanUp(){
        driver.quit();
    }

}
