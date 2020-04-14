package Denemeler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class Friday1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("alertbtn")).click();
        driver.switchTo().alert().accept();
        WebElement box=driver.findElement(By.id("id=name"));
        box.sendKeys("Ulku");
        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().dismiss();









        driver.quit();

    }
}
