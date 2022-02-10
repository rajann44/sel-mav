package parllelTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class1 {

    WebDriver driver;

    @Test
    public void method1(){
        System.out.println("HELLO1");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void method2(){
        System.out.println("HELLO2");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://bing.com");
    }

    @Test
    public void method3(){
        System.out.println("HELLO3");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void method4(){
        System.out.println("HELLO4");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://bing.com");
    }

    @AfterTest(alwaysRun = true)
    public void cleanUp(){
        System.out.println("CLEANUP");
        driver.quit();
    }

}
