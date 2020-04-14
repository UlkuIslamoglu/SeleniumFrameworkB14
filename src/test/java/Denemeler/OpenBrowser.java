package Denemeler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com");
        System.out.println("Opened succesfully");
        driver.findElement(By.id("signin_button")).click();
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password");
        driver.findElement(By.name("submit")).click();
        if(driver.findElement(By.partialLinkText("Account Activity")).isDisplayed()){
            driver.findElement(By.partialLinkText("Account Activity")).click();
            System.out.println("Succesfully opened Account Activity");

        }else{
            System.out.println("Not Displayed");
        }

        if(driver.findElement(By.id("transfer_funds_tab")).isDisplayed()){
            driver.findElement(By.id("transfer_funds_tab")).click();
            System.out.println("Succesfully opened Transfers");

        }else{
            System.out.println("Not Displayed");
        }

        if(driver.findElement(By.id("pay_bills_tab")).isDisplayed()){
            driver.findElement(By.id("pay_bills_tab")).click();
            System.out.println("Succesfully opened Pay Bills");

        }else{
            System.out.println("Not Displayed");
        }

        if(driver.findElement(By.id("money_map_tab")).isDisplayed()){
            driver.findElement(By.id("money_map_tab")).click();
            System.out.println("Succesfully opened Money Map");

        }else{
            System.out.println("Not Displayed");
        }
        //driver.close();
    }
}
