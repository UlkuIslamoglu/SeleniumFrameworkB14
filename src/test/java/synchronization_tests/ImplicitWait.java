package synchronization_tests;

import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.DynamicLoading2Page;

public class ImplicitWait {
    @Test
    public void threadSleepTests() throws Exception {
        //1 -getting the page
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");
        //2-Creating object to be able to reach Page class' webelements
        DynamicLoading2Page dynamicLoading2Page = new DynamicLoading2Page();
        dynamicLoading2Page.startButton.click();
//        Thread.sleep(5000);
        //3 - Assert the webelement is displayed on the page.
        Assert.assertTrue(dynamicLoading2Page.helloWordText.isDisplayed(), "Text is not displayes on the page");
    }
}
