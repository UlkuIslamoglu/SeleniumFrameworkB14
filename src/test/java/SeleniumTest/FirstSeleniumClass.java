package SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sites.northwestern.edu/tislamoglu/");
        driver.navigate().back();
       // Thread.sleep(2000);

        driver.navigate().forward();
       // Thread.sleep(2000);

        driver.navigate().refresh();
       // Thread.sleep(2000);

        driver.navigate().to("https://sites.northwestern.edu/tislamoglu/");

        System.out.println(driver.getTitle());



    }
}
