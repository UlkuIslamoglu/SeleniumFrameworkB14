package Action_Test;

import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.practice_cybertek_pages.HoverOverPage;

public class CybertekSchool {

@Test
    public void hoverstests() throws  InterruptedException {


    Driver.getDriver().get("http://practice.cybertekschool.com/hovers2");

    HoverOverPage hoverOverPage=new HoverOverPage();

    Actions actions=new Actions(Driver.getDriver());

    actions.moveToElement(hoverOverPage.image1);
    Assert.assertTrue(hoverOverPage.user1Text.isDisplayed());

    actions.moveToElement(hoverOverPage.image2).perform();
    Assert.assertTrue(hoverOverPage.user2Text.isDisplayed());
    Thread.sleep(1000);

    actions.moveToElement(hoverOverPage.image3);
    Assert.assertTrue(hoverOverPage.user3Text.isDisplayed());


}
}
