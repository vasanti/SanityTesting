package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ReportDashboard_Locators;

public class MySummaryReport extends MyEsopsLogin {
	public void MySummaryReportClick() throws InterruptedException, IOException {
		int MySummaryReport_colCount;
	
		Boolean Reports = driver.findElements(By.linkText("Reports"))
				.size() != 0;
		System.out.println("Reports = " + Reports);
		if (Reports == true) {
		ReportDashboard_Locators.Reports(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Reports Clicked");
		} else {
		test.log(LogStatus.FAIL, "Reports not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}

		Boolean MySummaryReportTab = driver.findElements(By.linkText("My Summary Report")).size() != 0;
		System.out.println("MySummaryReportTab" + MySummaryReportTab);

		if (MySummaryReportTab == true) {

			ReportDashboard_Locators.MySummaryReportTab(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "MySummaryReportTab Clicked");

			WebElement MySummaryReport_Table = ReportDashboard_Locators.SummaryReport_Grid(driver);
			List<WebElement> MySummaryReport_TotalRows = MySummaryReport_Table.findElements(By.tagName("tr"));
			int MySummaryReport_rowCount = (MySummaryReport_TotalRows.size()) - 1;
			System.out.println("Total Number of Rows are: " + MySummaryReport_rowCount);
			Thread.sleep(1000);

			// Fetch Total Column Count
			List<WebElement> MySummaryReport_TotalCols = MySummaryReport_Table.findElements(By.tagName("th"));
			MySummaryReport_colCount = MySummaryReport_TotalCols.size();
			System.out.println("Total Number of Columns are: " + MySummaryReport_colCount + "\n");
			Thread.sleep(1000);

			if (MySummaryReport_rowCount >= 1) {
				test.log(LogStatus.PASS, "Summary report data grid present");
				Boolean ExportBtnPresent = driver.findElements(By.xpath(".//*[@id='btnExport']")).size() != 0;
				System.out.println("ExportBtnPresent = " + ExportBtnPresent);

				if (ExportBtnPresent == true) {
					Thread.sleep(3000);
					ReportDashboard_Locators.ExportBtn(driver).click();
					Thread.sleep(3000);
					test.log(LogStatus.PASS, "ExportBtnPresent Clicked");
				} else {
					System.out.println("Export button not present");
					test.log(LogStatus.FAIL, "ExportBtnPresent not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
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
				
				Boolean MySummaryReportTab1 = driver.findElements(By.linkText("My Summary Report"))
						.size() != 0;
				System.out.println("MySummaryReportTab1 = " + MySummaryReportTab1);
				if (MySummaryReportTab1 == true) {
				ReportDashboard_Locators.MySummaryReportTab(driver).click();
				Thread.sleep(1000);
				test.log(LogStatus.PASS, "MySummaryReportTab1 Clicked");
				} else {
				test.log(LogStatus.FAIL, "MySummaryReportTab1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				WebElement MySummaryReport_Table1 = ReportDashboard_Locators.SummaryReport_Grid(driver);
				java.util.List<WebElement> links = MySummaryReport_Table1.findElements(By.tagName("a"));
				System.out.println("Number of Links in the Page is " + links.size());

				for (WebElement LinksPresent : links) {
					String link = LinksPresent.getText();
					System.out.println("linkName" + link);
					if (link != "") {
					LinksPresent.click();
					Thread.sleep(2000);test.log(LogStatus.PASS, "Link Present"+link);
					} else {
						test.log(LogStatus.FAIL, "Link not Present" + test.addScreenCapture(Screenshot.captureImage(driver)));
					}
				}

			} else {
				String SummaryReportText = ReportDashboard_Locators.SummaryReport_Grid(driver).getText();
				System.out.println("SummaryReportText is " + SummaryReportText);
				test.log(LogStatus.FAIL, "SummaryReportText is" + SummaryReportText + test.addScreenCapture(Screenshot.captureImage(driver)));
				System.out.println("Summary report data grid not present");
				test.log(LogStatus.FAIL, "Summary report data grid not present" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		} else {
			System.out.println("Summary report tab not present");
			test.log(LogStatus.FAIL, "MySummaryReportTab not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
	}
}
