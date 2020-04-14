package Action_Test;

import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Amazon_Pages.AmazonLandingPage;

public class AmazonTest {

    @Test
    public void signInLinkHoverTest(){
        Driver.getDriver().get("https://amazon.com");

        AmazonLandingPage amazonLandingPage=new AmazonLandingPage();

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(amazonLandingPage.signInLink).perform();
    }
}
