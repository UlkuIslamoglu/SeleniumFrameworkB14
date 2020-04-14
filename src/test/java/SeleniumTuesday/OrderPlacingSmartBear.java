package SeleniumTuesday;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

public class OrderPlacingSmartBear {
    public static  void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        inputUsername.sendKeys("Tester");
        inputPassword.sendKeys("test");
        loginButton.click();
        WebElement order = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        order.click();

        Select product = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        product.selectByValue("FamilyAlbum");
        WebElement quantity = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("2");
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        WebElement inputName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement inputStreet = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement inputCity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement inputState = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement inputZip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        Faker faker = new Faker();
        inputName.sendKeys(faker.name().fullName());
        inputStreet.sendKeys(faker.address().streetName());
        inputCity.sendKeys(faker.address().city());
        inputState.sendKeys(faker.address().state());
        inputZip.sendKeys(faker.address().zipCode().replaceAll("-", ""));
        //inputZip.sendKeys(faker.address().zipCode().substring(0,5));
        // 10.Click on “visa” radio button
        WebElement visaCheckbox = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaCheckbox.click();
        // 11.Generate card number using JavaFaker
        WebElement creditCardInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        creditCardInput.sendKeys(faker.finance().creditCard().replaceAll("-", ""));
        WebElement inputDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        inputDate.sendKeys("10/25");
        // 12.Click on “Process”
        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();
        // 13.Verify success message “New order has been successfully added.”
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        if(successMessage.isDisplayed()){
            System.out.println("Message displayed. Order placed. PASS!");
        }else{
            System.out.println("Message is not displayed. Order NOT placed. FAIL!!!");
        }
    }



    }


