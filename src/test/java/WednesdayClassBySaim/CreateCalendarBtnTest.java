package WednesdayClassBySaim;

import Utilities.VyTrackUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCalendarBtnTest {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        String createCalendarBtnLocatorCss="a[title= 'Create Calendar event']";

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VyTrackUtilities.login(driver,"storemanager85","UserUser123");
        VyTrackUtilities.navigateToModule(driver,"Activities","Calender Events");

        if(driver.findElement(By.cssSelector(createCalendarBtnLocatorCss)).isDisplayed()){
            System.out.println("Test 2 Passed");
        }else{
            System.out.println("Test 2 Failed");
        }
    }
}
