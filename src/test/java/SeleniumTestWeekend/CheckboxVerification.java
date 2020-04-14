package SeleniumTestWeekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement successmessage=driver.findElement(By.xpath("//div[@id='txtAge']"));
        if(!successmessage.isDisplayed()){
            System.out.println("Success message is not displayed by default.Verification Passed");
        }else{
            System.out.println("Success message is displayed by default.Verification Failed");
        }
    }
}
