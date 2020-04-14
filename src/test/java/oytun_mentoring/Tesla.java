package oytun_mentoring;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tesla {

    @Test
    public void modelS() {
        System.out.println("Tesla Model S");
    }
    @Test(groups = "Smoke")
    public void modelX() {
        System.out.println("Tesla Model X");
    }
    @Test(groups = "Smoke")
    public void model3(){
        Assert.assertTrue(true);
    }


}
