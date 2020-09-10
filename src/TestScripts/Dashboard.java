package TestScripts;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Dashboard_Locators;

public class Dashboard extends MyEsopsLogin{
 
	public void Dashboardclick () throws Exception
	{
		Boolean Dashboard = driver.findElements(By.linkText("Dashboard")).size() != 0;
		System.out.println("Dashboard" + Dashboard);
		if (Dashboard == true) {
			waitfor.until(Dashboard_Locators.Dashboard(driver)).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Dashboard Clicked");
		} else {
		test.log(LogStatus.FAIL, "Dashboard not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}

		Boolean ExportBtn = driver.findElements(By.xpath(".//*[@id='btnExport']")).size() != 0;
		System.out.println("ExportBtn" + ExportBtn);
		if(ExportBtn==true)
		{
			waitfor.until(Dashboard_Locators.ExportBtn(driver)).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "ExportBtn Clicked");
		waitfor.until(Dashboard_Locators.Dashboard(driver)).click();
		Thread.sleep(1000);		
		test.log(LogStatus.PASS, "Dashboard Clicked");
		} else {
		test.log(LogStatus.FAIL, "ExportBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		/*Boolean MoreBtn = driver.findElements(By.xpath(".//*[@id='LnkMoreExcercise']")).size() != 0;
		System.out.println("MoreBtn" + MoreBtn);
		if(MoreBtn==true)
		{
			waitfor.until(Dashboard_Locators.MoreBtn(driver)).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "MoreBtn Clicked");
		waitfor.until(Dashboard_Locators.Dashboard(driver)).click();
		Thread.sleep(1000);		
		test.log(LogStatus.PASS, "Dashboard Clicked");
		} else {
		test.log(LogStatus.FAIL, "MoreBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}*/
		
		Boolean MyExerciseTransactions = driver.findElements(By.xpath(".//*[@id='lnkExcersiceViewDetails']")).size() != 0;
		System.out.println("MyExerciseTransactions" + MyExerciseTransactions);
		if(MyExerciseTransactions==true)
		{
			waitfor.until(Dashboard_Locators.MyExerciseTransactions(driver)).click();
		Thread.sleep(1000);
		waitfor.until(Dashboard_Locators.Dashboard(driver)).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "MyExerciseTransactions Clicked");
		} 
		else
		{
		test.log(LogStatus.FAIL, "MyExerciseTransactions not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		Boolean MySummaryReport = driver.findElements(By.xpath(".//*[@id='grid1']/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/div/a")).size() != 0;
		System.out.println("MySummaryReport" + MySummaryReport);
		if(MySummaryReport==true)
		{
			waitfor.until(Dashboard_Locators.MySummaryReport(driver)).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "MySummaryReport Clicked");
	
		Boolean ExportBtn2 = driver.findElements(By.xpath(".//*[@id='btnExport']")).size() != 0;
		System.out.println("ExportBtn" + ExportBtn2);
		if(ExportBtn2==true)
		{
			waitfor.until(Dashboard_Locators.ExportBtn(driver)).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "ExportBtn Clicked");
		} 
		else 
		{
		test.log(LogStatus.FAIL, "ExportBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		waitfor.until(Dashboard_Locators.Dashboard(driver)).click();
		Thread.sleep(1000);		
		}
		else 
		{
		test.log(LogStatus.FAIL, "MySummaryReport not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean ProfileLnk = driver.findElements(By.xpath(".//*[@id='lnkProfile']")).size() != 0;
		System.out.println("ProfileLink" + ProfileLnk);
		if(ProfileLnk==true)
		{
			waitfor.until(Dashboard_Locators.ProfileLnk(driver)).click();
		Thread.sleep(1000);
		waitfor.until(Dashboard_Locators.Dashboard(driver)).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "ProfileLink Clicked");
		} else {
		test.log(LogStatus.FAIL, "ProfileLink not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		/*Boolean ToggleBtn = driver.findElements(By.xpath(".//*[@id='btnToggle']")).size() != 0;
		System.out.println("ToggleBtn" + ToggleBtn);
		if(ToggleBtn==true)
		{
			waitfor.until(Dashboard_Locators.ToggleBtn(driver)).click();
		Thread.sleep(1000);
		waitfor.until(Dashboard_Locators.Dashboard(driver)).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "ToggleBtn Clicked");
		} else {
		test.log(LogStatus.FAIL, "ToggleBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}*/
		
		
		
	}
}
