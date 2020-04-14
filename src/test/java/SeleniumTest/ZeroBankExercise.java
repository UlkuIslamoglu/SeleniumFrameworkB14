package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankExercise {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.name("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        if(driver.findElement(By.linkText("username")).isDisplayed()){
            System.out.println("Username verification Passed");
            System.out.println("Username is displayed on the page.");
        }else{
            System.out.println("Username verification is Failed");
            System.out.println("username is not displayed on the page.");
        }
        String actualTitle=driver.getTitle();

    }
}
