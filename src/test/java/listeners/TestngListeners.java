package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListeners implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("***** "+result.getInstanceName()+" "+result.getName()+" onTestStart *******");
    }
    public void onTestFailure(ITestResult result) {
        System.out.println("***** "+result.getInstanceName()+" "+result.getName()+" onTestFailure *******");
    }
    public void onStart(ITestContext context) {
        System.out.println("*****Test onStart "+context.getName()+" *******");
    }
    public void onFinish(ITestContext context) {
        System.out.println("*****Test onFinished "+context.getName()+" *******");
    }
}
