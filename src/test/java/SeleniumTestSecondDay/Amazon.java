package SeleniumTestSecondDay;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
      WebElement search=driver.findElement(By.cssSelector("input[type='text']"));
      WebElement submit=driver.findElement(By.cssSelector("input[type='submit']"));
      search.sendKeys("wooden spoon");
      submit.click();
      String actualTitle=driver.getTitle();
      String expectedTitle="wooden spoon";
      if(actualTitle.contains(expectedTitle)){
          System.out.println("Title verification Passed");
      }else{
          System.out.println("Title verification Failed");
      }


    }
}
