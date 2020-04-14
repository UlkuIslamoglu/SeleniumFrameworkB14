package Denemeler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FridayWindowsHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.xpath("//a[.='Terms']")).click();
        System.out.println(driver.getTitle());

        Set<String> ids=driver.getWindowHandles();
        Iterator<String>it=ids.iterator();

        String first=it.next();
        String second=it.next();

        driver.switchTo().window(first);
        System.out.println(driver.getTitle());

        driver.switchTo().window(second);
        System.out.println(driver.getTitle());

        driver.switchTo().window(first);
        System.out.println(driver.getTitle());

    }
}
