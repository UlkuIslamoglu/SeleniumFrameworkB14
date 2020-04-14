package oytun_mentoring;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

    WebDriver driver;

    @Test(dataProvider = "getData")
    public void login(String username,String password){
        System.out.println(username);
        System.out.println(password);
    }

   @DataProvider
   public Object [][] getData(){
        Object [][] data = new Object[2][2];

                data[0][0]="firstsetusername";
                data[0][1]="firstpassword";

                data[1][0]="secondsetusername";
                data[1][1]="secondpassword";

                return data;
            }



}
