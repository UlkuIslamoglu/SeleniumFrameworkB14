package TestNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WindowHAndlePractice {

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void  windowsHandle(){
        String mainHandle= driver.getWindowHandle();
        WebElement header= driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(header.isDisplayed());
        System.out.println(header.getText());

        WebElement clickto=driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickto.click();


        for(String handle: driver.getWindowHandles()){
            if(!handle.equals(mainHandle)){
                driver.switchTo().window(handle);
            }
        }
        System.out.println(driver.getTitle());
        String expectedTitleAfterClick = "New Window";
        String actualTitleAfterClick = driver.getTitle();
        Assert.assertEquals(actualTitleAfterClick, expectedTitleAfterClick, "Titles are not matching!!");
    }

}

