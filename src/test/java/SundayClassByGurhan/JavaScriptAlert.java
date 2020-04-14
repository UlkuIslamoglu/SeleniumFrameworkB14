package SundayClassByGurhan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptAlert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        final ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        WebElement clickfirst=driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));
        clickfirst.click();
        Alert alert= driver.switchTo().alert();
        alert.accept();

        WebElement resultText=driver.findElement(By.id("result"));
        String expectedText="You succesfully clicked an alert";
        String actualText=resultText.getText();



    }

}
