package TestScripts;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ReportDashboard_Locators;

public class ReportDashboard extends MyEsopsLogin {
	public void ReportDashboardClick() throws Exception {
		
		Boolean Reports = driver.findElements(By.linkText("Reports")).size() != 0;
		System.out.println("Reports" + Reports);

		if (Reports == true) {
			ReportDashboard_Locators.Reports(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Reports Clicked");
		
		Boolean ReportDashboard = driver.findElements(By.xpath(".//*[@id='Report Dashboard']"))
				.size() != 0;
		System.out.println("ReportDashboard" + ReportDashboard);

		if (ReportDashboard == true) {
			ReportDashboard_Locators.ReportDashboard(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "ReportDashboard Clicked");
	
		Boolean MySummaryReports = driver.findElements(By.xpath(".//*[@id='lnkMySummaryDetails']"))
				.size() != 0;
		System.out.println("MySummaryReports" + MySummaryReports);

		if (MySummaryReports == true) {
			ReportDashboard_Locators.MySummaryReports(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "MySummaryReports Clicked");

			Boolean ExportBtnPresent = driver.findElements(By.xpath(".//*[@id='btnExport']"))
					.size() != 0;
			System.out.println("ExportBtnPresent = " + ExportBtnPresent);

		if (ExportBtnPresent == true) {
		ReportDashboard_Locators.ExportBtn(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "ExportBtn Clicked");
			}
			else
			{
				System.out.println("Export button not present");
				test.log(LogStatus.FAIL, "ExportBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				
			}
			
			Boolean Reports1 = driver.findElements(By.linkText("Reports"))
				.size() != 0;
			System.out.println("Reports1 = " + Reports1);
			if (Reports1 == true) {
			ReportDashboard_Locators.Reports(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Reports1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Reports1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean ReportDashboard1 = driver.findElements(By.xpath(".//*[@id='Report Dashboard']"))
					.size() != 0;
			System.out.println("ReportDashboard1 = " + ReportDashboard1);
			if (ReportDashboard1 == true) {
			ReportDashboard_Locators.ReportDashboard(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "ReportDashboard1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "ReportDashboard1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		}
		else
		{
			System.out.println("MySummaryReports not clickable");
			test.log(LogStatus.FAIL, "MySummaryReports not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		Boolean ExerciseReportlnk = driver.findElements(By.xpath(".//*[@id='AllDashboardReports']/table/tbody/tr[2]/td[2]/img"))
				.size() != 0;
		System.out.println("ExerciseReportlnk = " + ExerciseReportlnk);

		if (ExerciseReportlnk == true) {
			ReportDashboard_Locators.ExerciseReportlnk(driver).click();
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "ExerciseReportlnk Clicked");
			
			Boolean Reports1 = driver.findElements(By.linkText("Reports"))
					.size() != 0;
			System.out.println("Reports1 = " + Reports1);
			if (Reports1 == true) {
			ReportDashboard_Locators.Reports(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Reports1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Reports1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean ReportDashboard1 = driver.findElements(By.xpath(".//*[@id='Report Dashboard']"))
					.size() != 0;
			System.out.println("ReportDashboard1 = " + ReportDashboard1);
			if (ReportDashboard1 == true) {
			ReportDashboard_Locators.ReportDashboard(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "ReportDashboard1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "ReportDashboard1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
		}
		else
		{
			
				System.out.println("ExerciseReportlnk not clickable");
				test.log(LogStatus.FAIL, "ExerciseReportlnk not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			
		}
		Boolean MySummaryReportlnk = driver.findElements(By.xpath(".//*[@id='AllDashboardReports']/table/tbody/tr[1]/td[2]/img"))
				.size() != 0;
		System.out.println("MySummaryReportlnk" + MySummaryReportlnk);

		if (MySummaryReportlnk == true) {
			ReportDashboard_Locators.MySummaryReportlnk(driver).click();
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "MySummaryReportlnk Clicked");
			
			Boolean Reports1 = driver.findElements(By.linkText("Reports"))
					.size() != 0;
			System.out.println("Reports1 = " + Reports1);
			if (Reports1 == true) {
			ReportDashboard_Locators.Reports(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Reports1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Reports1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean ReportDashboard1 = driver.findElements(By.xpath(".//*[@id='Report Dashboard']"))
					.size() != 0;
			System.out.println("ReportDashboard1 = " + ReportDashboard1);
			if (ReportDashboard1 == true) {
			ReportDashboard_Locators.ReportDashboard(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "ReportDashboard1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "ReportDashboard1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		}
		else
		{
			System.out.println("MySummaryReportlnk not clickable");
			test.log(LogStatus.FAIL, "MySummaryReportlnk not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			
		}
		}
		else
		{
			System.out.println("ReportDashboard tab not exist");
			test.log(LogStatus.FAIL, "ReportDashboard not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
	}
		else
		{
			System.out.println("Report tab not exist");
			test.log(LogStatus.FAIL, "Reports not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
	
}
	
}

			
			
			
			
			

		

