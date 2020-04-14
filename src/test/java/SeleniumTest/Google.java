package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Store")).click();

      //  String expectedTitle="Google";
        //String actualTitle= driver.getTitle();
       // if (actualTitle.equals(expectedTitle)){
         //   System.out.println("Google title verification Passed");
        //}else{
          //  System.out.println("Google title verification Failed!!");
        //}





    }
}
