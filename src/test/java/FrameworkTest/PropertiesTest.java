package FrameworkTest;

import Utilities.Config;
import Utilities.VyTrackUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    @Test
    public void test1() throws IOException {
        String path="test.properties";

        Properties properties=new Properties();

        FileInputStream file=new FileInputStream(path);

        properties.load(file);

        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));


    }
    @Test
    public void testWithUtil(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Config.getProperty("vytrackUrl"));
        VyTrackUtilities.login(driver,Config.getProperty("storemanagerUsername"),Config.getProperty("storemanagerPassword"));
    }



}
