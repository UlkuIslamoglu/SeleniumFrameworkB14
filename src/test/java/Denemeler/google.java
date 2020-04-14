package Denemeler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class google {

    public static void main(String[] args) throws  InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select selectoption= new Select(driver.findElement(By.id("dropdown")));
        Select selectyear= new Select(driver.findElement(By.id("year")));
        selectyear.selectByVisibleText("2018");
        List<WebElement> options = selectyear.getOptions();
        for (WebElement years: options){
            System.out.println( years.getText());
            selectyear.selectByVisibleText(years.getText());
        }

        Select selectday= new Select(driver.findElement(By.id("day")));
        selectday.selectByValue("3");
        


        Select selectmonth= new Select(driver.findElement(By.id("month")));
        selectmonth.selectByVisibleText("3");


        selectoption.selectByValue("1");



        Thread.sleep(3000);

        selectmonth.deselectAll();
       String dropdownoption= selectoption.getFirstSelectedOption().getText();
       if(dropdownoption.equals("Option 1")){
           System.out.println(dropdownoption+" Is true");
       }else{
           System.out.println(dropdownoption);
       }



    }
}
