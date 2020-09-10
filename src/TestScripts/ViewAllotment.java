package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ViewAllotmet_Locators;

public class ViewAllotment extends MyEsopsLogin {
	public void ViewAllotmentClick() throws InterruptedException, IOException {
		
		Boolean ExerciseNow = driver.findElements(By.linkText("Exercise")).size() != 0;
		System.out.println("ExerciseNow" + ExerciseNow);
		if (ExerciseNow == true) {
		ViewAllotmet_Locators.ExerciseNow(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "ExerciseNow Clicked");
		} else {
		test.log(LogStatus.FAIL, "ExerciseNow not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean ViewAllotmentPresent = driver.findElements(By.linkText("View Allotment")).size() != 0;
		System.out.println("ViewAllotmentPresent" + ViewAllotmentPresent);
		if (ViewAllotmentPresent == true) {
			ViewAllotmet_Locators.ViewAllotment(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "ViewAllotmentPresent Clicked");
			WebElement VAGrid_Table = ViewAllotmet_Locators.VA_Grid(driver);

			List<WebElement> VAGrid_TotalRows = VAGrid_Table.findElements(By.tagName("tr"));
			int VAGrid_rowCount = (VAGrid_TotalRows.size()) - 1;
			System.out.println("Total Number of Rows are: " + VAGrid_rowCount);
			Thread.sleep(1000);

			// Fetch Total Column Count
			List<WebElement> VAGrid_TotalCols = VAGrid_Table.findElements(By.tagName("th"));
			int VAGrid_colCount = VAGrid_TotalCols.size();
			System.out.println("Total Number of Columns are: " + VAGrid_colCount + "\n");
			Thread.sleep(1000);
			if (VAGrid_rowCount >= 1) {
				test.log(LogStatus.PASS, "Data present in the grid");

				System.out.println("Data present in the grid");
				for (int i = 1; i <= VAGrid_rowCount; i++) {

					Boolean VAClk = driver
							.findElements(
									By.xpath(".//*[@id='DivViewAllotment']/table/tbody/tr[" + i + "]/td[5]/input"))
							.size() != 0;
					System.out.println("VAClk" + VAClk);

					if (VAClk == true) {

						driver.findElement(
								By.xpath(".//*[@id='DivViewAllotment']/table/tbody/tr[" + i + "]/td[5]/input")).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "VAClk Clicked");
						
						Boolean VAGridExDetails_TableLink = driver.findElements(By.xpath("//table[@id='tblview']"))
								.size() != 0;
						Thread.sleep(2000);
						System.out.println("VAGridExDetails_TableLink" + VAGridExDetails_TableLink);
						Thread.sleep(2000);
						if (VAGridExDetails_TableLink == true) {
							
							WebElement VAGridExDetails_Table = ViewAllotmet_Locators.VAExDetails_Grid(driver);
							Thread.sleep(2000);
							test.log(LogStatus.PASS, "VAGridExDetails_Table Present");
							List<WebElement> VAGridExDetails_Links = VAGridExDetails_Table
									.findElements(By.tagName("a"));
							Thread.sleep(2000);
							int LinkSize = (VAGridExDetails_Links.size());
							Thread.sleep(2000);
							System.out.println("Total Number of Rows are: " + LinkSize);
							Thread.sleep(1000);
							if (LinkSize > 0) {
								for (WebElement LinksPresent : VAGridExDetails_Links) {
									String link = LinksPresent.getText();
									Thread.sleep(2000);
									System.out.println("linkName" + link);
									test.log(LogStatus.PASS, "linkName is Present");
									Thread.sleep(2000);
									if (link != "") {
										LinksPresent.click();
										Thread.sleep(2000);
										Thread.sleep(2000);test.log(LogStatus.PASS, "Link Present");
										} else {
										test.log(LogStatus.FAIL, "Link not Present" + test.addScreenCapture(Screenshot.captureImage(driver)));
										}

										Boolean VA_TaxPayable_CloseIcon = driver.findElements(By.xpath(".//*[@id='modal-tax']/div/div/div[1]/button"))
												.size() != 0;
										System.out.println("VA_TaxPayable_CloseIcon = " + VA_TaxPayable_CloseIcon);
										if (VA_TaxPayable_CloseIcon == true) {

										ViewAllotmet_Locators.VA_TaxPayable_CloseIcon(driver).click();
										Thread.sleep(10000);
										test.log(LogStatus.PASS, "VA_TaxPayable_CloseIcon Clicked");
										} else {
										test.log(LogStatus.FAIL, "VA_TaxPayable_CloseIcon not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
										}
									}
								}else {
								test.log(LogStatus.FAIL, "linkName is not Present" + test.addScreenCapture(Screenshot.captureImage(driver)));
								}
							}else {
								test.log(LogStatus.FAIL, "VAGridExDetails_Table not Present" + test.addScreenCapture(Screenshot.captureImage(driver)));
							}
							Thread.sleep(5000);
							
							Boolean ViewAllotmentCloseBtn = driver.findElements(By.xpath(".//*[@id='viewDetails']/div/div/div[1]/button"))
									.size() != 0;
							System.out.println("ViewAllotmentCloseBtn = " + ViewAllotmentCloseBtn);
							if (ViewAllotmentCloseBtn == true) {
							ViewAllotmet_Locators.ViewAllotmentCloseBtn(driver).click();
							Thread.sleep(5000);
							test.log(LogStatus.PASS, "ViewAllotmentCloseBtn Clicked");
							} else {
							test.log(LogStatus.FAIL, "ViewAllotmentCloseBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
							}

						}else {
							test.log(LogStatus.FAIL, "VAClk not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
						}
					
					} 
				Boolean VA_Export_Btn = driver.findElements(By.id("btnExport"))
						.size() != 0;
				System.out.println("VA_Export_Btn = " + VA_Export_Btn);
				if (VA_Export_Btn == true) {
				ViewAllotmet_Locators.VA_Export_Btn(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "VA_Export_Btn Clicked");
				} else {
				test.log(LogStatus.FAIL, "VA_Export_Btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Boolean ExportBtn = driver.findElements(By.xpath(".//*[@id='AllotTotal']/div[2]/div/ul/li/a"))
						.size() != 0;
				System.out.println("ExportBtn = " + ExportBtn);
				if (ExportBtn == true) {
				ViewAllotmet_Locators.ExportBtn(driver).click();
				Thread.sleep(5000);
				test.log(LogStatus.PASS, "ExportBtn Clicked");
				} else {
				test.log(LogStatus.FAIL, "ExportBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Boolean ExerciseNow1 = driver.findElements(By.linkText("Exercise"))
						.size() != 0;
				System.out.println("ExerciseNow1 = " + ExerciseNow1);
				if (ExerciseNow1 == true) {
				ViewAllotmet_Locators.ExerciseNow(driver).click();
				Thread.sleep(1000);
				test.log(LogStatus.PASS, "ExerciseNow1 Clicked");
				} else {
				test.log(LogStatus.FAIL, "ExerciseNow1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
		
		}else {
			System.out.println("View allotment grid present");
			test.log(LogStatus.FAIL, "Data is not present in the grid" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		} else {
			System.out.println("View allotment tab not exist");
		}
	}
}
