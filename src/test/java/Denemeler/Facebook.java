package Denemeler;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        Faker faker=new Faker();
        WebElement name=driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password=driver.findElement(By.xpath("//input[@type='password'][1]"));
        name.sendKeys(faker.name().username());
        password.sendKeys(faker.numerify("123456"));
    }
}
