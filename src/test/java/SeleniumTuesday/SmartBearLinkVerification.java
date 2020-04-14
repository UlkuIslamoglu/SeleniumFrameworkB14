package SeleniumTuesday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearLinkVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        WebElement password=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));

        username.sendKeys("Tester");
        password.sendKeys("test");
        login.click();

       // driver.findElements(By.xpath("//body//a"));
        List<WebElement> links= driver.findElements(By.xpath("//body//a"));
        System.out.println("Count of all the links on the page: "+links.size());

        for(WebElement link : links) {
            //System.out.println("Reference of the object: "+link);
            System.out.println("Text of the link: " + link.getText());
        }




        }
}
