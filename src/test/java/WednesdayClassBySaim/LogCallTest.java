package WednesdayClassBySaim;

import Utilities.SeleniumUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogCallTest {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        String usernameLocator="prependedInput";
        String passwordLocator="prependedInput2";
        String tabLocatorXpath = "//span[contains(text(),'Activities') and @class = 'title title-level-1']";
        String  moduleLocatorXpath="//span[.='Calls']";
        String loginCallBtnLocatorCss ="a[title = 'Log call']";



        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");



        driver.findElement(By.xpath(tabLocatorXpath)).click();
        SeleniumUtilities.pause(5);

        driver.findElement(By.xpath(moduleLocatorXpath)).click();
        SeleniumUtilities.pause(5);

        if(driver.findElement(By.cssSelector(loginCallBtnLocatorCss)).isDisplayed()) {
            System.out.println("Test 1 Passed");
        } else {
            System.err.println("Test 1 Failed");
        }
    }


}
