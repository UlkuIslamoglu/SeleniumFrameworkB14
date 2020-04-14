package SeleniumTestWeekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekCheckboxes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if(checkbox1.isSelected()){
            System.out.println("Checkbox1 is selected");
        }else{
            System.out.println("Checkbox1 is not selected");
        }
        if(checkbox2.isSelected()){
            System.out.println("Checkbox2 is selected");
        }else{
            System.out.println("Checkbox2 is not selected");
        }
        checkbox1.click();
        checkbox2.click();

        if(checkbox1.isSelected()){
            System.out.println("Checkbox1 is selected");
        }else{
            System.out.println("Checkbox1 is not selected");
        }
        if(checkbox2.isSelected()){
            System.out.println("Checkbox2 is selected");
        }else{
            System.out.println("Checkbox2 is not selected");
        }


    }
}
