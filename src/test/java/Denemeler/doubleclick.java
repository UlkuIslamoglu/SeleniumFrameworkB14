package Denemeler;

import Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.swing.*;

public class doubleclick {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index2.
        // Drag	and	drop	the	small	circle	to	bigger	circle.
        // 3.Assert:	-Text	in	big	circle	changedto:	“You	did	great!”

        driver.findElement(By.xpath("//button[@class='optanon-allow-all accept-cookies-button']")).click();
        Actions actions=new Actions(driver);
        Thread.sleep(1000);
        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target= driver.findElement(By.xpath("//div[@id='droptarget']"));
        actions.dragAndDrop(source,target).perform();

        System.out.println(driver.findElement(By.xpath("//div[@id='droptarget']")).getText());

driver.quit();

    }
}
