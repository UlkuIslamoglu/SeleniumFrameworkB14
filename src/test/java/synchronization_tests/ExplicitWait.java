package synchronization_tests;

import Utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.DynamicLoading1Page;

public class ExplicitWait {
    @Test
    public void waitForInputBoxTest(){
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        DynamicLoading1Page dynamicLoading1Page= new DynamicLoading1Page();
        dynamicLoading1Page.startbutton.click();
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10) ;
//        wait.until(ExpectedConditions.visibilityOf(dynamicLoading1Page.usernameInput));
        dynamicLoading1Page.usernameInput.sendKeys("tomsmith");
    }
}
