package testNGtutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
    @AfterTest
    public void lastexcecution(){
        System.out.println("I will execute last");
    }
    @Test
    public void Demo() {
        System.out.println("Hello");
    }
    @AfterSuite
    public void aftersuit(){
        System.out.println("I am sakib khan after hero Alom");
    }
    @Test
    public void demo2(){
        System.out.println("Bye");
    }


}
