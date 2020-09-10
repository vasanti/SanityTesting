package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.InformationCentre_Locators;

public class InformationCentre_FAQ extends MyEsopsLogin {
	public void InformationCenterClick() throws Exception {
		Boolean InformationCenter = driver.findElements(By.linkText("Information Center")).size() != 0;
		System.out.println("InformationCenter" + InformationCenter);

		if (InformationCenter == true) {
			InformationCentre_Locators.InformationCenter(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InformationCenter Clicked");
			
			Boolean FAQs = driver.findElements(By.xpath(".//*[@id='FAQs']"))
					.size() != 0;
			System.out.println("FAQs" + FAQs);
			Thread.sleep(3000);
			if (FAQs == true) {

			InformationCentre_Locators.FAQs(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "FAQs Clicked");

			WebElement InformationCentre_Table = InformationCentre_Locators.IC_Grid(driver);
			List<WebElement> InformationCentre_TotalRows = InformationCentre_Table.findElements(By.tagName("tr"));
			int InformationCentre_rowCount = (InformationCentre_TotalRows.size()) - 1;
			System.out.println("Total Number of Rows are: " + InformationCentre_rowCount);
			Thread.sleep(1000);

			// Fetch Total Column Count
			List<WebElement> InformationCentre_TotalCols = InformationCentre_Table.findElements(By.tagName("th"));
			int InformationCentre_colCount = InformationCentre_TotalCols.size();
			System.out.println("Total Number of Columns are: " + InformationCentre_colCount + "\n");
			Thread.sleep(1000);
			if (InformationCentre_rowCount != 0) {
				System.out.println("Hurrey!!!Data present");
				test.log(LogStatus.PASS, "Data present");

				for (int i = 1; i <= InformationCentre_rowCount; i++) {

					Boolean ICViewClk = driver.findElements(By.xpath(".//*[@id='UploadDocList']/tr[" + i + "]/td[3]/a"))
							.size() != 0;
					System.out.println("ICClk" + ICViewClk);
					Thread.sleep(3000);
					if (ICViewClk == true) {

						driver.findElement(By.xpath(".//*[@id='UploadDocList']/tr[" + i + "]/td[3]/a")).click();
						Thread.sleep(3000);
						test.log(LogStatus.PASS, "ICViewClk Clicked");

						Boolean DownloadFile = driver.findElements(By.xpath(".//*[@id='DownloadInfoCenter']"))
								.size() != 0;
						System.out.println("DownloadFile" + DownloadFile);
						Thread.sleep(3000);
						if (DownloadFile == true) {

							InformationCentre_Locators.DownLoadInfoCenter(driver).click();
							Thread.sleep(5000);
							test.log(LogStatus.PASS, "DownloadFile Clicked");
							
							InformationCentre_Locators.CloseBtn(driver).click();
							Thread.sleep(3000);
							test.log(LogStatus.PASS, "CloseBtn Clicked");

							driver.findElement(By.xpath(".//*[@id='UploadDocList']/tr[" + i + "]/td[3]/a")).click();
							Thread.sleep(5000);
							test.log(LogStatus.PASS, "UploadBtn Clicked");
							
							InformationCentre_Locators.DownLoadInfoCenter(driver).click();
							Thread.sleep(5000);
							test.log(LogStatus.PASS, "DownloadFile Clicked");
							
							InformationCentre_Locators.OKBtn(driver).click();
							Thread.sleep(5000);
							test.log(LogStatus.PASS, "OKBtn Clicked");

						} else {
							String AlertText=InformationCentre_Locators.FileNotFoundAlert(driver).getText();
							System.out.println("AlertText"+AlertText);
							test.log(LogStatus.FAIL, "File not Founded" + test.addScreenCapture(Screenshot.captureImage(driver)));
							
							InformationCentre_Locators.OKBtn(driver).click();
							Thread.sleep(3000);
							test.log(LogStatus.FAIL, "OKBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
							
							driver.findElement(By.xpath(".//*[@id='UploadDocList']/tr[" + i + "]/td[3]/a")).click();
							Thread.sleep(5000);
							test.log(LogStatus.FAIL, "UploadBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
							
							InformationCentre_Locators.CloseBtn(driver).click();
							Thread.sleep(3000);
							test.log(LogStatus.FAIL, "CloseBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
							
						}

					} else {
						System.out.println("View link is not present");
						test.log(LogStatus.FAIL, "ICViewClk not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
					}
				}
			}

			else {
				System.out.println(":(!!!Data not Present");
				test.log(LogStatus.FAIL, "Data not Present" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		}
			else
			{
				System.out.println("FAQ click not present");
				test.log(LogStatus.FAIL, "FAQs not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		}
		else {

			System.out.println("Information centre click not available");
			test.log(LogStatus.FAIL, "InformationCenter not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));

		}
	}

}
