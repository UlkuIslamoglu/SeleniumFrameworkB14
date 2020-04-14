package TestNg;

import org.testng.annotations.Test;

public class DependenciesTestNG {

    @Test
    public void login(){

        System.out.println("Loggin in...");
    }

    @Test(dependsOnMethods = "login")
     public void makePurchase(){

    }
}
