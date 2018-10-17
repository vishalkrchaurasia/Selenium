package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import generics1.Utility;                              //package generics1 and listener are related.
public class Result implements ITestListener{

	static int passCount=0,failCount=0,skipCount=0;

	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is Pass ",true);
		passCount++;
	}
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is Fail",true);
		failCount++;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getName();
		Reporter.log("Test:"+name+" is skipped",true);
		skipCount++;
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Pass:"+passCount,true);
		Reporter.log("Fail:"+failCount,true);
		Reporter.log("Skip:"+skipCount,true);
		Utility.writeResultToXL("./result/Summary1.xlsx",passCount,failCount,skipCount);
	}


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub	
	}
}