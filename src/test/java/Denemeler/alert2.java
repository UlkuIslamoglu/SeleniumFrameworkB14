package Denemeler;

import Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class alert2 {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement box=(driver.findElement(By.xpath("//div[@id='hot-spot']")));
        Actions actions=new Actions(driver);
        actions.contextClick(box).perform();
        driver.switchTo().alert().accept();
        driver.quit();

    }
}
