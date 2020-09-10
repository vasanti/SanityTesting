package TestScripts;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locators;

public class ExerciseNow extends MyEsopsLogin {



	public void ExerciseNowClick(String Instruments) throws Exception {
		Boolean ExerciseNow = driver.findElements(By.linkText("Exercise")).size() != 0;
		System.out.println("ExerciseNow" + ExerciseNow);

		if (ExerciseNow == true) {
		ExerciseNow_Locators.ExerciseNow(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "ExerciseNow Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "ExerciseNow not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		

		Boolean ExerciseNowLink = driver.findElements(By.linkText("Exercise Now")).size() != 0;
		System.out.println("ExerciseNowLink" + ExerciseNowLink);

		if (ExerciseNowLink == true) {
		ExerciseNow_Locators.ExerciseNowLink(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "ExerciseNowLink Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "ExerciseNowLink not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		
		Boolean WindowClosed = driver.findElements(By.xpath("//div[@class='alert alert-info windowClose']"))
				.size() != 0;
		System.out.println("WindowClosed" + WindowClosed);
		if (WindowClosed == true) {

			System.out.println("Its holiday today!!!WindowClosed" + WindowClosed);
			test.log(LogStatus.PASS, "WindowClosed Displayed");
		} else {
			
			Boolean ExerciseNowResetGrid = driver.findElements(By.xpath("//button[@id='btnResetGrid']")).size() != 0;
			System.out.println("ExerciseNowResetGrid" + ExerciseNowResetGrid);

			if (ExerciseNowResetGrid == true) {
				ExerciseNow_Locators.ExerciseNowResetGrid(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "ExerciseNowResetGrid Clicked");
				} else {
				test.log(LogStatus.FAIL, "ExerciseNowResetGrid not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
			
			Boolean ExerciseNowNotesBtn = driver.findElements(By.xpath("//button[@id='btnExNotes']")).size() != 0;
			System.out.println("ExerciseNowNotesBtn" + ExerciseNowNotesBtn);

			if (ExerciseNowNotesBtn == true) {
				ExerciseNow_Locators.ExerciseNowNotesBtn(driver).click();
				Thread.sleep(1000);
				test.log(LogStatus.PASS, "ExerciseNowNotesBtn Clicked");
				} else {
				test.log(LogStatus.FAIL, "ExerciseNowNotesBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
			
		/*	Boolean ExerciseNowclose = driver.findElements(By.xpath(".//*[@id='btnCloseNotes']")).size() != 0;
			System.out.println("ExerciseNowclose" + ExerciseNowclose);

			if (ExerciseNowclose == true) {
				ExerciseNow_Locators.ExerciseNowclose(driver).click();
				Thread.sleep(1000);
				test.log(LogStatus.PASS, "ExerciseNowclose Clicked");
				} else {
				test.log(LogStatus.FAIL, "ExerciseNowclose not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}	*/
			
			InstrumentLogic InstrumentLogiClk=new InstrumentLogic();			
			InstrumentLogiClk.InstumentsClick(Instruments);
			
		}
	}
}
