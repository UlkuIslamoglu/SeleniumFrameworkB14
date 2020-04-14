package SeleniumTuesday;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    public void test1(){
        System.out.println("Test 1 is starting...");
        Assert.assertEquals(4,5);

        System.out.println("Test1 middle...");
        Assert.assertTrue(false);

        System.out.println("Test is ending...");
    }
    @Test
    public void test2(){
        System.out.println("Test2 is starting...");
    }
}
