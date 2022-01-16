package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenersClass implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(iTestResult);
        System.out.println(iTestResult.getStatus());
        System.out.println(iTestResult.isSuccess());
        System.out.println(iTestResult.getMethod());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println(iTestResult);
        System.out.println(iTestResult.getStatus());
        System.out.println(iTestResult.isSuccess());
        System.out.println(iTestResult.getMethod());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println(iTestResult);
        System.out.println(iTestResult.getStatus());
        System.out.println(iTestResult.isSuccess());
        System.out.println(iTestResult.getMethod());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

        System.out.println(iTestResult);
        System.out.println(iTestResult.getStatus());
        System.out.println(iTestResult.isSuccess());
        System.out.println(iTestResult.getMethod());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

        System.out.println(iTestResult);
        System.out.println(iTestResult.getStatus());
        System.out.println(iTestResult.isSuccess());
        System.out.println(iTestResult.getMethod());
    }

    @Override
    public void onStart(ITestContext iTestContext) {

        System.out.println(iTestContext);
        System.out.println(iTestContext.getName());
        System.out.println(iTestContext.getSuite());
        System.out.println(iTestContext.getPassedTests());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

        System.out.println(iTestContext);
        System.out.println(iTestContext.getName());
        System.out.println(iTestContext.getSuite());
        System.out.println(iTestContext.getPassedTests());
    }
}
