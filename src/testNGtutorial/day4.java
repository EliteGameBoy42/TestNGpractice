package testNGtutorial;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
    @Parameters({"URL","APIKey/Username"})
    @Test
    public void webloginHomeLoan(String urlname,String key){
        //Selenium
        System.out.println("Weblogin Home");
        System.out.println(urlname);
        System.out.println(key);
    }
    @Test(groups = "smoke")
    public void mobileloginHomeLoan(){
        //Appium
        System.out.println("Mobile login Home");
    }
    @BeforeSuite
    public void Bfsuit(){
        System.out.println("Number one Sakib Khan");
    }
    @Test(groups = "smoke")
    public void LoginAPIHomeLoan(){
        //Rest API automation
        System.out.println("Login Api Home loan");
    }
}
