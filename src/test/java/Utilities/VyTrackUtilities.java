package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrackUtilities {
   private static String usernameLocator="prependedInput";
    private static String passwordLocator="prependedInput2";

    public static void login(WebDriver driver,String username, String password){

        driver.findElement(By.id(usernameLocator)).sendKeys(username);
        driver.findElement(By.id(passwordLocator)).sendKeys(password+ Keys.ENTER);

    }

    public static void navigateToModule (WebDriver driver,String tab, String module){

        String tabLocatorXpath = "//span[contains(text(),'"+tab+"') and @class = 'title title-level-1']";
        String  moduleLocatorXpath="//span[.='"+module+"']";
        driver.findElement(By.xpath(tabLocatorXpath)).click();
        SeleniumUtilities.pause(2);
        driver.findElement(By.xpath(moduleLocatorXpath)).click();

        SeleniumUtilities.pause(2);


    }
}
