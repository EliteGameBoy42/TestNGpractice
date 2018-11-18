package testNGtutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
    @Parameters({"URL"})
    @Test(groups = "smoke")
    public void ploan(String urlname){
        System.out.println("personal loan");
        System.out.println(urlname);
    }
    @BeforeTest
    public void Prerequisite(){
        System.out.println("I will execute first");
    }
}
