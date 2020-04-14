package WebSiteTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
        driver.findElement(By.xpath("html/body/form/div[3]/div[2]/div/div[2]/a")).click();

        driver.findElement(By.cssSelector("input[name='ctl00$MainContent$txtFirstName'][type='text']" ));

        String name="ulku";
        String email="ulku@gmail";
        String number="123456";
        String password="password";
        String ulke="Canada";
        String gender="female";



        WebElement firstName =driver.findElement(By.id("MainContent_txtFirstName"));
        WebElement emailElement=driver.findElement(By.id("MainContent_txtEmail"));
        WebElement phoneNumber= driver.findElement(By.id("MainContent_txtHomePhone"));
        WebElement passwordElement=driver.findElement(By.id("MainContent_txtPassword"));
        WebElement verifypassword= driver.findElement(By.id("MainContent_txtVerifyPassword"));
        WebElement femalegender=driver.findElement(By.id("MainContent_Female"));
        WebElement malegender=driver.findElement(By.id("MainContent_Male"));
        WebElement country=driver.findElement(By.id("MainContent_menuCountry"));
        WebElement weekleyEmail=driver.findElement(By.id("MainContent_checkWeeklyEmail"));
        WebElement submit=driver.findElement(By.id("MainContent_btnSubmit"));

        firstName  .sendKeys(name);
        emailElement .sendKeys(email);
        phoneNumber .sendKeys(number);
        passwordElement.sendKeys(password);
        verifypassword.sendKeys(password);

        if(gender.equalsIgnoreCase("female")){
            femalegender.click();
        }else {
            malegender.click();
        }

        weekleyEmail.click();
        new Select(country).selectByVisibleText(ulke);
        submit .click();

        System.out.println(driver.findElement(By.id("MainContent_lblTransactionResult")).getText());
       // driver.close();

    }
}
