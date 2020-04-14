package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBanklinkVrification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        String actualLink= driver.findElement(By.partialLinkText("Forgot")).getAttribute("href");
        String expectedLink="?forgot-password.html";

        if(actualLink.contains(expectedLink)){
            System.out.println("Link Verification is Passed");
        }else{
            System.out.println("Link Verification is Failed");
        }
    }
}
