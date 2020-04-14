package TestNg;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNgClass {

    public static void main(String[] args) {

    }
@BeforeClass
public void setUp(){
    System.out.println("Before class is running");
}

        @Test
        public void firstTest () {
            System.out.println("First test is running");

            //        if("q".equals("q")){
//            System.out.println("PASS!");
//        }else{
//            System.out.println("FAIL!");
//        }
            Assert.assertEquals("actualValue","fail","First test is failed.");
            Assert.assertEquals(1,1,"First test is failed.");

        }
        @Test
        public void asecondTest () {
            System.out.println("2nd test is running...");
            String letter="b";
            Assert.assertTrue("sentence".contains(letter),"Sentence does not contain "+ letter);
        }

        @BeforeMethod
    public void beforeMethod(){
            System.out.println("Before method is running");
        }

        @AfterMethod
    public void afterMethod(){

            System.out.println("After method is running");
        }

        @AfterClass
    public void afterClass(){
            System.out.println("After class is running");
        }

    }

