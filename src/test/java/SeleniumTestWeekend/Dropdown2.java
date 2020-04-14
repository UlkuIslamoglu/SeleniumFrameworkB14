package SeleniumTestWeekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Dropdown2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        String expectedDay="26";
        String expectedMonth="January";
        String expectedYear="2020";


        WebElement year=driver.findElement(By.id("year"));
        WebElement day=driver.findElement(By.id("day"));
        WebElement month=driver.findElement(By.id("month"));
        Select dayDropDown=new Select(day);
        String actualday=dayDropDown.getFirstSelectedOption().getText();
        Select yearDropDown= new Select(year);
        String actualyear=yearDropDown.getFirstSelectedOption().getText();
        Select monthDropDown= new Select(month);
        String actualmonth=monthDropDown.getFirstSelectedOption().getText();


        if(expectedDay.equals(actualday)&& expectedMonth.equals(actualmonth)&& expectedYear.equals(actualyear)){
            System.out.println("Default option verification passed ");
        }else{
            System.out.println("Default selected option verification Failed");
        }




    }
}
