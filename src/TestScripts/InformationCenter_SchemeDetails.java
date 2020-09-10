package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.InformationCentre_Locators;

public class InformationCenter_SchemeDetails extends MyEsopsLogin {
	public void InformationCenterClick() throws Exception {

		Boolean InformationCenter = driver.findElements(By.linkText("Information Center")).size() != 0;
		System.out.println("InformationCenter" + InformationCenter);

		if (InformationCenter == true) {
			InformationCentre_Locators.InformationCenter(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InformationCenter Clicked");

			Boolean SchemeDetailsClk = driver.findElements(By.xpath(".//*[@id='Scheme Details']")).size() != 0;
			System.out.println("SchemeDetailsClk" + SchemeDetailsClk);
			if (SchemeDetailsClk == true) {
				InformationCentre_Locators.SchemeDetails(driver).click();
				Thread.sleep(1000);
				test.log(LogStatus.PASS, "SchemeDetails Clicked");

				WebElement InformationCentreSD_Table = InformationCentre_Locators.SD_Grid(driver);
				List<WebElement> InformationCentreSD_TotalRows = InformationCentreSD_Table
						.findElements(By.tagName("tr"));
				int InformationCentreSD_rowCount = (InformationCentreSD_TotalRows.size()) - 1;
				System.out.println("Total Number of Rows are: " + InformationCentreSD_rowCount);
				Thread.sleep(1000);

				// Fetch Total Column Count
				List<WebElement> InformationCentreSD_TotalCols = InformationCentreSD_Table
						.findElements(By.tagName("th"));
				int InformationCentreSD_colCount = InformationCentreSD_TotalCols.size();
				System.out.println("Total Number of Columns are: " + InformationCentreSD_colCount + "\n");
				Thread.sleep(1000);
				if (InformationCentreSD_rowCount != 0) {
					test.log(LogStatus.PASS, "Data present");
					for (int i = 1; i <= InformationCentreSD_rowCount; i++) {

						Boolean SchemeDetailsViewClk = driver
								.findElements(By.xpath(".//*[@id='UploadDocList']/tr[" + i + "]/td[3]/a")).size() != 0;
						System.out.println("SchemeDetailsClk" + SchemeDetailsViewClk);
						Thread.sleep(3000);
						if (SchemeDetailsViewClk == true) {

							driver.findElement(By.xpath(".//*[@id='UploadDocList']/tr[" + i + "]/td[3]/a")).click();
							Thread.sleep(3000);
							test.log(LogStatus.PASS, "SchemeDetailsViewClk Clicked");

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
								Thread.sleep(3000);
								test.log(LogStatus.PASS, "UploadBtn Clicked");
								
								InformationCentre_Locators.DownLoadInfoCenter(driver).click();
								Thread.sleep(5000);
								test.log(LogStatus.PASS, "DownloadFile Clicked");
								
								InformationCentre_Locators.OKBtn(driver).click();
								Thread.sleep(6000);
								test.log(LogStatus.PASS, "OKBtn Clicked");

							} else {

								String AlertText = InformationCentre_Locators.FileNotFoundAlert(driver).getText();
								System.out.println("AlertText" + AlertText);
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
							System.out.println("scheme details view click not present");
							test.log(LogStatus.FAIL, "SchemeDetailsViewClk not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
						}

					}
				}

				else {
					System.out.println(":( !!!Data not present");
					test.log(LogStatus.FAIL, "Data not Present" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
			} else {
				System.out.println("Scheme Details click not available");
				test.log(LogStatus.FAIL, "SchemeDetails not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		} else {
			System.out.println("Information centre click not available");
			test.log(LogStatus.FAIL, "InformationCenter not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
	}
}
