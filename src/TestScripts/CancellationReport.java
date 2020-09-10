package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ReportDashboard_Locators;

public class CancellationReport extends MyEsopsLogin{
public void cancellationReportClick() throws InterruptedException, IOException
{
	
	Boolean Reports = driver.findElements(By.linkText("Reports")).size() != 0;
	System.out.println("Reports" + Reports);

	if (Reports == true) {
		ReportDashboard_Locators.Reports(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "Reports Clicked");
	
	Boolean CancellationReport = driver.findElements(By.xpath(".//*[@id='Cancellation Report']"))
			.size() != 0;
	System.out.println("CancellationReport" + CancellationReport);

	if (CancellationReport == true) {
		ReportDashboard_Locators.CancellationReport(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "CancellationReport Clicked");
	
		WebElement CancellationReport_Table = ReportDashboard_Locators.CancellationReportGrid(driver);
		List<WebElement> CancellationReport_TotalRows = CancellationReport_Table
				.findElements(By.tagName("tr"));
		int CancellationReport_rowCount = (CancellationReport_TotalRows.size()) - 1;
		System.out.println("Total Number of Rows are: " + CancellationReport_rowCount);
		Thread.sleep(1000);

		// Fetch Total Column Count
		List<WebElement> CancellationReport_TotalCols = CancellationReport_Table
				.findElements(By.tagName("th"));
		int CancellationReport_colCount = CancellationReport_TotalCols.size();
		System.out.println("Total Number of Columns are: " + CancellationReport_colCount + "\n");
		Thread.sleep(1000);
		if (CancellationReport_rowCount >=1) {
			test.log(LogStatus.PASS, "CancellationReport data is present");
			
			Boolean ExportBtnPresent = driver.findElements(By.xpath(".//*[@id='btnExport']"))
					.size() != 0;
			System.out.println("ExportBtnPresent = " + ExportBtnPresent);

			if (ExportBtnPresent == true) {
		ReportDashboard_Locators.ExportBtn(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "ExportBtnPresent Clicked");
			}
			else
			{
				System.out.println("Export button not present");
				test.log(LogStatus.FAIL, "ExportBtnPresent not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		}
		else
		{
			String CancellationReportText=ReportDashboard_Locators.CancellationReportGrid(driver).getText();
			System.out.println("CancellationReportText is "+CancellationReportText);
			test.log(LogStatus.FAIL, "CancellationReport data not Present" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		}
		else
		{
			System.out.println("data not present");
			test.log(LogStatus.FAIL, "CancellationReport not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
	}
	else
	{
		System.out.println("CancellationReport tab not present");
		test.log(LogStatus.FAIL, "Reports not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
	}
	}
	
}

