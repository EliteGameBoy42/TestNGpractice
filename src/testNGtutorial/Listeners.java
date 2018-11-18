package testNGtutorial;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.xml.transform.Result;

//ItestListener Interface which implements Testng Listener
public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("I've successfully executed Listeners pass code");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println("I've failed to execute" + iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
