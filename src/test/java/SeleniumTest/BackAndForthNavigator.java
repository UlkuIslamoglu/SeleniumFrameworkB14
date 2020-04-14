package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle= "Gmail";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Its correct ");
        }else{
            System.out.println("its not contains Gmail");
        }
        driver.navigate().back();
        String expectedTitle1= "Google";
        String actualTitle1=driver.getTitle();

        if(actualTitle1.contains(expectedTitle1)){
            System.out.println("Its correct you got it ");
        }else{
            System.out.println("its not contains Google");
        }
        driver.navigate().forward();

        String expectedTitle2= "Gmail";
        String actualTitle2=driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Its correct ");
        }else{
            System.out.println("its not contains Gmail");
        }

    }
}
