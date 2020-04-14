package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class etsyExercise {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon" + Keys.ENTER);
        String expectedTitle= "wooden spoon";
       String ActualTitle=driver.getTitle();

       if(ActualTitle.contains(expectedTitle)){
           System.out.println("Etsy Title verification PASSED");
       }else{
           System.out.println("Etsy Title verification Failed");
       }
    }
}
