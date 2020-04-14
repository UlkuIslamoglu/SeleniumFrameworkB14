package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp {
    public static void main(String[] args) {

     //   TC #3: HerokuApp URL verification
      //  1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

      //  2.Go to https://the-internet.herokuapp.com/forgot_password
        driver.get("https://the-internet.herokuapp.com/forgot_password");
       // 3.Enter any email into input box
        driver.findElement(By.id("email")).sendKeys("12345");
       // 4.Click on Retrieve password
      //  driver.findElement(By.partialLinkText("Retrieve password")).click();
         driver.findElement(By.id("form_submit")).click();
       // 5.Verify URL contains:
        String Expected= "email_sent";
        String Actual= driver.getCurrentUrl();
        if(Actual.contains(Expected)){
            System.out.println("Heroku Url verification is Passed");
        }else{
            System.out.println("Heroku Url verification is Failed");
        }
       // 6.Verify that text box displayed has the text as expected
       String actualTextValue= driver.findElement(By.id("content")).getText();
        String expectedTextValue="Your e-mail's been sent!";
       // Expected: "Your e-mail's been sent!"

        if(actualTextValue.equals(expectedTextValue)){
            System.out.println("Text box value verification Passed");
        }else{
            System.out.println("Text box value verification Failed");
        }










    }
}
