package FrameworkTest;

import Utilities.Driver;
import org.testng.annotations.Test;

public class DriverTest {

    @Test
    public void test(){
        Driver.getDriver().get("http://amazon.com");
    }
}
