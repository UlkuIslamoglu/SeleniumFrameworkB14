package WednesdayClassBySaim;

import Utilities.SeleniumUtilities;
import Utilities.VyTrackUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCalendarEventDropdownTests {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        String createCalendarBtnLocatorCss="a[title= 'Create Calendar event']";
        String saveAndCloseBtnLocatorXpath = "//div/button[contains(text(), 'Save and Close')]";
        String dropDownBtnLocatorXpath = "//a[@class = 'btn-success btn dropdown-toggle']";
        //                                  //a/span[@class = 'caret']
        String saveAndCloseOptionLocatorXpath = "//li/button[contains(text(), 'Save and Close')]";
        String saveAndNewOptionLocatorXpath = "//li/button[contains(text(), 'Save and New')]";
        String saveOptionLocatorXpath = "(//li/button[contains(text(), 'Save')])[3]";



        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VyTrackUtilities.login(driver,"storemanager85","UserUser123");
        VyTrackUtilities.navigateToModule(driver,"Activities","Calender Events");
        driver.findElement(By.cssSelector(createCalendarBtnLocatorCss)).click();

        SeleniumUtilities.pause(3);
        // Step 5
        if(driver.findElement(By.xpath(saveAndCloseBtnLocatorXpath)).isDisplayed()) {
            System.out.println("Save and Close btn - Pass");
        } else {
            System.out.println("Save and Close btn - Fail");
        }
        // Step 6

        driver.findElement(By.xpath(dropDownBtnLocatorXpath)).click();
        SeleniumUtilities.pause(1);
        if(driver.findElement(By.xpath(saveAndCloseOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save and Close option - Pass");
        } else {
            System.out.println("Save and Close option - Fail");
        }

        // Step-verify all options
        if(driver.findElement(By.xpath(saveAndNewOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save and New option - Pass");
        } else {
            System.out.println("Save and New option - Fail");
        }
        if(driver.findElement(By.xpath(saveOptionLocatorXpath)).isDisplayed()) {
            System.out.println("Save option - Pass");
        } else {
            System.out.println("Save option - Fail");
        }


    }
}
