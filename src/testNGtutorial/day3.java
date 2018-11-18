package testNGtutorial;

import org.testng.Assert;
import org.testng.annotations.*;

public class day3 {


    @Parameters({"URL"})
    @BeforeClass
    public void beforeclass(String urlname) {
        System.out.println("I will run before the class");
        System.out.println(urlname);
    }

    @Test(dataProvider = "getData")
    public void weblogin(String username, String password) {
        //Selenium
        System.out.println("Weblogin car");
        System.out.println(username);
        System.out.println(password);
    }

    @BeforeMethod
    public void beforeevery() {
        System.out.println("I will execute before every test method in 3rd class");
    }

    @AfterMethod
    public void afterevery() {
        System.out.println("I will execute after every test method in 3rd class");
    }

    @Test(enabled = false)
    public void mobilelogincarlogin() {
        //Appium
        System.out.println("Mobile login car");
    }

    @Test(groups = "smoke")
    public void mobilesignincanlogin() {
        //Appium
        System.out.println("Mobile sign in car");
        Assert.assertTrue(false);
    }

    @AfterClass
    public void afterclass() {
        System.out.println("I will run after the class");
    }

    @Test(dependsOnMethods = "weblogin")
    public void mobilesignoutcanlogin() {
        //Appium
        System.out.println("Mobile sign out car");
    }

    @Test(timeOut = 4000)
    public void APIcarLoan() {
        //Rest API automation
        System.out.println("Login Api car loan");
    }

    @DataProvider
    public Object[][] getData() {
        //1st combination=username password-good credit history
        //2nd combination=username password-no credit history
        //3rd combinstion=fraudalent credit history
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0]="firstsetusername";
        data[0][1]="firstpassword";
        //columns in the row are nothing but values for that particular combination (0)
       //2nd set
        data[1][0]="secondusername";
        data[1][1]="secondpassword";
        //3rd set
        data[2][0]="thirdsusername";
        data[2][1]="thirdpassword";
        return data;







    }
}


