package pageObjectModelTest;

import com.sun.deploy.config.Config;
import org.testng.annotations.Test;
import pages.vytrack_pages.VytrackLoginPage;

public class LoginTest {


        @Test
        public void positiveLoginScenario () {

            String username = Utilities.Config.getProperty("storemanagerUsername");
             String password = Utilities.Config.getProperty("storemanagerPassword");

            VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
            vytrackLoginPage.usernameInput.sendKeys(username);
            vytrackLoginPage.passwordInput.sendKeys(password);
            vytrackLoginPage.loginButton.click();
        }

    }
