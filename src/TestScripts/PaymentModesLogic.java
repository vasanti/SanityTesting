package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locators;

public class PaymentModesLogic extends MyEsopsLogin{
	Boolean Flag = false;

	public  void DirectDebitDetails() throws InterruptedException, IOException {
		
		Boolean DirectDebit = driver.findElements(By.id("of-direct-debit")).size() != 0;
		System.out.println("DirectDebit" + DirectDebit);

		if (DirectDebit == true) {
			waitfor.until(ExerciseNow_Locators.DirectDebit(driver)).click();
		test.log(LogStatus.PASS, "DirectDebit Clicked");
		} else {
		test.log(LogStatus.FAIL, "DirectDebit not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DirectDebitClose = driver.findElements(By.xpath("//div[@id='OwnfundsPaymentViewId']//button[@class='close']")).size() != 0;
		System.out.println("DirectDebitClose" + DirectDebitClose);

		if (DirectDebitClose == true) {
			waitfor.until(ExerciseNow_Locators.DirectDebitClose(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "DirectDebitClose Clicked");
		} else {
		test.log(LogStatus.FAIL, "DirectDebitClose not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModeAgree = driver.findElements(By.id("remember")).size() != 0;
		System.out.println("PaymentModeAgree" + PaymentModeAgree);

		if (PaymentModeAgree == true) {
		waitfor.until(ExerciseNow_Locators.PaymentModeAgree(driver)).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "PaymentModeAgree Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModeAgree not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModePayNow = driver.findElements(By.id("btnPayNowID")).size() != 0;
		System.out.println("PaymentModePayNow" + PaymentModePayNow);

		if (PaymentModePayNow == true) {
			waitfor.until(ExerciseNow_Locators.PaymentModePayNow(driver)).click();		
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "PaymentModePayNow Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModePayNow not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		

		Boolean ConfirmExercisedBtn_Ok_PopUpBtn = driver.findElements(By.id("btn1")).size() != 0;
		System.out.println("ConfirmExercisedBtn_Ok_PopUpBtn" + ConfirmExercisedBtn_Ok_PopUpBtn);

		if (ConfirmExercisedBtn_Ok_PopUpBtn == true) {
			driver.switchTo().activeElement();
			waitfor.until(ExerciseNow_Locators.ConfirmExercisedBtn_Ok_PopUpBtn(driver)).click();
			Thread.sleep(5000);
		test.log(LogStatus.PASS, "ConfirmExercisedBtn_Ok_PopUpBtn Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmExercisedBtn_Ok_PopUpBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DebitNoExerciseAmount = driver.findElements(By.name("DebitNoAmount")).size() != 0;
		System.out.println("DebitNoExerciseAmount" + DebitNoExerciseAmount);

		if (DebitNoExerciseAmount == true) {
		ExerciseNow_Locators.DebitNoExerciseAmount(driver).sendKeys("456456");
		test.log(LogStatus.PASS, "DebitNoExerciseAmount 456456 Entered");
		} else {
		test.log(LogStatus.FAIL, "DebitNoExerciseAmount not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DebitNoExercisePerquisite = driver.findElements(By.name("DebitNoTax")).size() != 0;
		System.out.println("DebitNoExercisePerquisite" + DebitNoExercisePerquisite);

		if (DebitNoExercisePerquisite == true) {
		ExerciseNow_Locators.DebitNoExercisePerquisite(driver).sendKeys("654645");
		test.log(LogStatus.PASS, "DebitNoExercisePerquisite 654645 Entered");
		} else {
		test.log(LogStatus.FAIL, "DebitNoExercisePerquisite not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean ConfirmUpdateDetails = driver.findElements(By.id("confirmupdatesID")).size() != 0;
		System.out.println("ConfirmUpdateDetails" + ConfirmUpdateDetails);

		if (ConfirmUpdateDetails == true) {
			waitfor.until(ExerciseNow_Locators.ConfirmUpdateDetails(driver)).click();
			Thread.sleep(5000);
		test.log(LogStatus.PASS, "ConfirmUpdateDetails Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmUpdateDetails not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		checkGenerateForm();

	}
	public  void RTGSDetails() throws InterruptedException, IOException {
		Boolean RTGS = driver.findElements(By.id("of-rtgs")).size() != 0;
		System.out.println("RTGS" + RTGS);

		if (RTGS == true) {
			waitfor.until(ExerciseNow_Locators.RTGS(driver)).click();
		test.log(LogStatus.PASS, "RTGS Clicked");
		} else {
		test.log(LogStatus.FAIL, "RTGS not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DirectDebitClose = driver.findElements(By.xpath("//div[@id='OwnfundsPaymentViewId']//button[@class='close']")).size() != 0;
		System.out.println("DirectDebitClose" + DirectDebitClose);

		if (DirectDebitClose == true) {
			waitfor.until(ExerciseNow_Locators.DirectDebitClose(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "DirectDebitClose Clicked");
		} else {
		test.log(LogStatus.FAIL, "DirectDebitClose not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModeAgree = driver.findElements(By.id("remember")).size() != 0;
		System.out.println("PaymentModeAgree" + PaymentModeAgree);

		if (PaymentModeAgree == true) {
		waitfor.until(ExerciseNow_Locators.PaymentModeAgree(driver)).click();
		test.log(LogStatus.PASS, "PaymentModeAgree Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModeAgree not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModePayNow = driver.findElements(By.id("btnPayNowID")).size() != 0;
		System.out.println("PaymentModePayNow" + PaymentModePayNow);

		if (PaymentModePayNow == true) {
			waitfor.until(ExerciseNow_Locators.PaymentModePayNow(driver)).click();		
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "PaymentModePayNow Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModePayNow not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		Boolean ConfirmExercisedBtn_Ok_PopUpBtn = driver.findElements(By.id("btn1")).size() != 0;
		System.out.println("ConfirmExercisedBtn_Ok_PopUpBtn" + ConfirmExercisedBtn_Ok_PopUpBtn);

		if (ConfirmExercisedBtn_Ok_PopUpBtn == true) {
		driver.switchTo().activeElement();
		waitfor.until(ExerciseNow_Locators.ConfirmExercisedBtn_Ok_PopUpBtn(driver)).click();
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "ConfirmExercisedBtn_Ok_PopUpBtn Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmExercisedBtn_Ok_PopUpBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtRTGSNo = driver.findElements(By.name("RTGSNoAmount")).size() != 0;
		System.out.println("AmtRTGSNo" + AmtRTGSNo);

		if (AmtRTGSNo == true) {
		ExerciseNow_Locators.AmtRTGSNo(driver).sendKeys("456456");
		test.log(LogStatus.PASS, "AmtRTGSNo 456456 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtRTGSNo not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtBankName = driver.findElements(By.name("RTGSBankNameAmount")).size() != 0;
		System.out.println("AmtBankName" + AmtBankName);

		if (AmtBankName == true) {
		ExerciseNow_Locators.AmtBankName(driver).sendKeys("abc");
		test.log(LogStatus.PASS, "AmtBankName abc Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtBankName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtBankBranch = driver.findElements(By.name("RTGSBankBranchAmount")).size() != 0;
		System.out.println("AmtBankBranch" + AmtBankBranch);

		if (AmtBankBranch == true) {
		ExerciseNow_Locators.AmtBankBranch(driver).sendKeys("branch");
		test.log(LogStatus.PASS, "AmtBankBranch branch Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtBankBranch not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtBankAccNo = driver.findElements(By.name("RTGSBankAccNoAmount")).size() != 0;
		System.out.println("AmtBankAccNo" + AmtBankAccNo);

		if (AmtBankAccNo == true) {
		ExerciseNow_Locators.AmtBankAccNo(driver).sendKeys("854758");
		test.log(LogStatus.PASS, "AmtBankAccNo 854758 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtBankAccNo not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtPaymentDate = driver.findElements(By.name("RTGSPaymentDateAmount")).size() != 0;
		System.out.println("AmtPaymentDate" + AmtPaymentDate);

		if (AmtPaymentDate == true) {
		dateEnable(ExerciseNow_Locators.AmtPaymentDate(driver),"3-Dec-2019");
		test.log(LogStatus.PASS, "AmtPaymentDate 3-Dec-2019 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtPaymentDate not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxRTGSNo = driver.findElements(By.name("RTGSNoTax")).size() != 0;
		System.out.println("TaxRTGSNo" + TaxRTGSNo);

		if (TaxRTGSNo == true) {
		ExerciseNow_Locators.TaxRTGSNo(driver).sendKeys("456456");
		test.log(LogStatus.PASS, "TaxRTGSNo 456456 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxRTGSNo not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxBankName = driver.findElements(By.name("RTGSBankNameTax")).size() != 0;
		System.out.println("TaxBankName" + TaxBankName);

		if (TaxBankName == true) {
		ExerciseNow_Locators.TaxBankName(driver).sendKeys("abc");
		test.log(LogStatus.PASS, "TaxBankName abc Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxBankName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxBankBranch = driver.findElements(By.name("RTGSBankBranchTax")).size() != 0;
		System.out.println("TaxBankBranch" + TaxBankBranch);

		if (TaxBankBranch == true) {
		ExerciseNow_Locators.TaxBankBranch(driver).sendKeys("branch");
		test.log(LogStatus.PASS, "TaxBankBranch branch Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxBankBranch not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxBankAccNo = driver.findElements(By.name("RTGSBankAccNoTax")).size() != 0;
		System.out.println("TaxBankAccNo" + TaxBankAccNo);

		if (TaxBankAccNo == true) {
		ExerciseNow_Locators.TaxBankAccNo(driver).sendKeys("854758");
		test.log(LogStatus.PASS, "TaxBankAccNo 854758 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxBankAccNo not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxPaymentDate = driver.findElements(By.name("RTGSPaymentDateTax")).size() != 0;
		System.out.println("TaxPaymentDate" + TaxPaymentDate);

		if (TaxPaymentDate == true) {
		dateEnable(ExerciseNow_Locators.TaxPaymentDate(driver),"3-Dec-2019");
		test.log(LogStatus.PASS, "TaxPaymentDate 3-Dec-2019 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxPaymentDate not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean ConfirmUpdateDetails = driver.findElements(By.id("confirmupdatesID")).size() != 0;
		System.out.println("ConfirmUpdateDetails" + ConfirmUpdateDetails);

		if (ConfirmUpdateDetails == true) {
			waitfor.until(ExerciseNow_Locators.ConfirmUpdateDetails(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "ConfirmUpdateDetails Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmUpdateDetails not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		checkGenerateForm();
		
	}
		
	public  void WireTransferDetails() throws InterruptedException, IOException {
		Boolean WireTransfer = driver.findElements(By.id("of-wiretransfer")).size() != 0;
		System.out.println("WireTransfer" + WireTransfer);

		if (WireTransfer == true) {
			waitfor.until(ExerciseNow_Locators.WireTransfer(driver)).click();
		test.log(LogStatus.PASS, "WireTransfer Clicked");
		} else {
		test.log(LogStatus.FAIL, "WireTransfer not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DirectDebitClose = driver.findElements(By.xpath("//div[@id='OwnfundsPaymentViewId']//button[@class='close']")).size() != 0;
		System.out.println("DirectDebitClose" + DirectDebitClose);

		if (DirectDebitClose == true) {
			waitfor.until(ExerciseNow_Locators.DirectDebitClose(driver)).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "DirectDebitClose Clicked");
		} else {
		test.log(LogStatus.FAIL, "DirectDebitClose not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModeAgree = driver.findElements(By.id("remember")).size() != 0;
		System.out.println("PaymentModeAgree" + PaymentModeAgree);

		if (PaymentModeAgree == true) {
		waitfor.until(ExerciseNow_Locators.PaymentModeAgree(driver)).click();
		test.log(LogStatus.PASS, "PaymentModeAgree Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModeAgree not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModePayNow = driver.findElements(By.id("btnPayNowID")).size() != 0;
		System.out.println("PaymentModePayNow" + PaymentModePayNow);

		if (PaymentModePayNow == true) {
			waitfor.until(ExerciseNow_Locators.PaymentModePayNow(driver)).click();		
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "PaymentModePayNow Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModePayNow not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		Boolean ConfirmExercisedBtn_Ok_PopUpBtn = driver.findElements(By.id("btn1")).size() != 0;
		System.out.println("ConfirmExercisedBtn_Ok_PopUpBtn" + ConfirmExercisedBtn_Ok_PopUpBtn);

		if (ConfirmExercisedBtn_Ok_PopUpBtn == true) {
			driver.switchTo().activeElement();
			waitfor.until(ExerciseNow_Locators.ConfirmExercisedBtn_Ok_PopUpBtn(driver)).click();
			Thread.sleep(5000);
		test.log(LogStatus.PASS, "ConfirmExercisedBtn_Ok_PopUpBtn Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmExercisedBtn_Ok_PopUpBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtWRemID = driver.findElements(By.name("WTRefIdAmount")).size() != 0;
		System.out.println("AmtWRemID" + AmtWRemID);

		if (AmtWRemID == true) {
		ExerciseNow_Locators.AmtWRemID(driver).sendKeys("45484845");
		test.log(LogStatus.PASS, "AmtWRemID 45484845 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtWRemID not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtSWIFT = driver.findElements(By.name("WTBANNoAmount")).size() != 0;
		System.out.println("AmtSWIFT" + AmtSWIFT);

		if (AmtSWIFT == true) {
		ExerciseNow_Locators.AmtSWIFT(driver).sendKeys("87549656");
		test.log(LogStatus.PASS, "AmtSWIFT 87549656 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtSWIFT not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtWBankName = driver.findElements(By.name("WTBankNameAmount")).size() != 0;
		System.out.println("AmtWBankName" + AmtWBankName);

		if (AmtWBankName == true) {
		ExerciseNow_Locators.AmtWBankName(driver).sendKeys("abc");
		test.log(LogStatus.PASS, "AmtWBankName abc Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtWBankName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		Boolean AmtWBankBranch = driver.findElements(By.name("WTBankBranchAmount")).size() != 0;
		System.out.println("AmtWBankBranch" + AmtWBankBranch);

		if (AmtWBankBranch == true) {
		ExerciseNow_Locators.AmtWBankBranch(driver).sendKeys("branch");
		test.log(LogStatus.PASS, "AmtWBankBranch branch Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtWBankBranch not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtWBankAccNo = driver.findElements(By.name("WTBankAccNoAmount")).size() != 0;
		System.out.println("AmtWBankAccNo" + AmtWBankAccNo);

		if (AmtWBankAccNo == true) {
		ExerciseNow_Locators.AmtWBankAccNo(driver).sendKeys("7894646");
		test.log(LogStatus.PASS, "AmtWBankAccNo 7894646 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtWBankAccNo not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtWDate = driver.findElements(By.name("WTDateAmount")).size() != 0;
		System.out.println("AmtWDate" + AmtWDate);

		if (AmtWDate == true) {
		dateEnable(ExerciseNow_Locators.AmtWDate(driver),"3-Dec-2019");
		test.log(LogStatus.PASS, "AmtWDate 3-Dec-2019 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtWDate not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxWRemID = driver.findElements(By.name("WTRefIdTax")).size() != 0;
		System.out.println("TaxWRemID" + TaxWRemID);

		if (TaxWRemID == true) {
		ExerciseNow_Locators.TaxWRemID(driver).sendKeys("45484845");
		test.log(LogStatus.PASS, "TaxWRemID 45484845 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxWRemID not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxSWIFT = driver.findElements(By.name("WTBANNoTax")).size() != 0;
		System.out.println("TaxSWIFT" + TaxSWIFT);

		if (TaxSWIFT == true) {
		ExerciseNow_Locators.TaxSWIFT(driver).sendKeys("87549656");
		test.log(LogStatus.PASS, "TaxSWIFT 87549656 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxSWIFT not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxWBankName = driver.findElements(By.name("WTBankNameTax")).size() != 0;
		System.out.println("TaxWBankName" + TaxWBankName);

		if (TaxWBankName == true) {
		ExerciseNow_Locators.TaxWBankName(driver).sendKeys("abc");
		test.log(LogStatus.PASS, "TaxWBankName abc Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxWBankName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxWBankBranch = driver.findElements(By.name("WTBankBranchTax")).size() != 0;
		System.out.println("TaxWBankBranch" + TaxWBankBranch);

		if (TaxWBankBranch == true) {
		ExerciseNow_Locators.TaxWBankBranch(driver).sendKeys("branch");
		test.log(LogStatus.PASS, "TaxWBankBranch branch Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxWBankBranch not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxWBankAccNo = driver.findElements(By.name("WTBankAccNoTax")).size() != 0;
		System.out.println("TaxWBankAccNo" + TaxWBankAccNo);

		if (TaxWBankAccNo == true) {
		ExerciseNow_Locators.TaxWBankAccNo(driver).sendKeys("7894646");
		test.log(LogStatus.PASS, "TaxWBankAccNo 7894646 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxWBankAccNo not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxWDate = driver.findElements(By.name("WTDateTax")).size() != 0;
		System.out.println("TaxWDate" + TaxWDate);

		if (TaxWDate == true) {
		dateEnable(ExerciseNow_Locators.TaxWDate(driver),"3-Dec-2019");
		test.log(LogStatus.PASS, "TaxWDate 3-Dec-2019 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxWDate not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean ConfirmUpdateDetails = driver.findElements(By.id("confirmupdatesID")).size() != 0;
		System.out.println("ConfirmUpdateDetails" + ConfirmUpdateDetails);

		if (ConfirmUpdateDetails == true) {
			waitfor.until(ExerciseNow_Locators.ConfirmUpdateDetails(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "ConfirmUpdateDetails Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmUpdateDetails not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		checkGenerateForm();
		
	}
					
	public  void DDDetails() throws InterruptedException, IOException {
		Boolean DD = driver.findElements(By.id("of-dd")).size() != 0;
		System.out.println("DD" + DD);

		if (DD == true) {
			waitfor.until(ExerciseNow_Locators.DD(driver)).click();
		test.log(LogStatus.PASS, "DD Clicked");
		} else {
		test.log(LogStatus.FAIL, "DD not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DirectDebitClose = driver.findElements(By.xpath("//div[@id='OwnfundsPaymentViewId']//button[@class='close']")).size() != 0;
		System.out.println("DirectDebitClose" + DirectDebitClose);

		if (DirectDebitClose == true) {
			waitfor.until(ExerciseNow_Locators.DirectDebitClose(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "DirectDebitClose Clicked");
		} else {
		test.log(LogStatus.FAIL, "DirectDebitClose not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModeAgree = driver.findElements(By.id("remember")).size() != 0;
		System.out.println("PaymentModeAgree" + PaymentModeAgree);

		if (PaymentModeAgree == true) {
			waitfor.until(ExerciseNow_Locators.PaymentModeAgree(driver)).click();
		test.log(LogStatus.PASS, "PaymentModeAgree Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModeAgree not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModePayNow = driver.findElements(By.id("btnPayNowID")).size() != 0;
		System.out.println("PaymentModePayNow" + PaymentModePayNow);

		if (PaymentModePayNow == true) {
			waitfor.until(ExerciseNow_Locators.PaymentModePayNow(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "PaymentModePayNow Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModePayNow not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
	
		Boolean ConfirmExercisedBtn_Ok_PopUpBtn = driver.findElements(By.id("btn1")).size() != 0;
		System.out.println("ConfirmExercisedBtn_Ok_PopUpBtn" + ConfirmExercisedBtn_Ok_PopUpBtn);

		if (ConfirmExercisedBtn_Ok_PopUpBtn == true) {

			driver.switchTo().activeElement();
			waitfor.until(ExerciseNow_Locators.ConfirmExercisedBtn_Ok_PopUpBtn(driver)).click();
			Thread.sleep(5000);

		test.log(LogStatus.PASS, "ConfirmExercisedBtn_Ok_PopUpBtn Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmExercisedBtn_Ok_PopUpBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}

		
		Boolean AmtDD = driver.findElements(By.name("DDNOAmount")).size() != 0;
		System.out.println("AmtDD" + AmtDD);

		if (AmtDD == true) {
		ExerciseNow_Locators.AmtDD(driver).sendKeys("64654654");
		test.log(LogStatus.PASS, "AmtDD 64654654 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtDD not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtDDDate = driver.findElements(By.name("DDDateAmount")).size() != 0;
		System.out.println("AmtDDDate" + AmtDDDate);

		if (AmtDDDate == true) {
		dateEnable(ExerciseNow_Locators.AmtDDDate(driver),"3-Dec-2019");
		test.log(LogStatus.PASS, "AmtDDDate 3-Dec-2019 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtDDDate not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtDDBankName = driver.findElements(By.name("DDBankNameAmount")).size() != 0;
		System.out.println("AmtDDBankName" + AmtDDBankName);

		if (AmtDDBankName == true) {
		ExerciseNow_Locators.AmtDDBankName(driver).sendKeys("abc");
		test.log(LogStatus.PASS, "AmtDDBankName abc Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtDDBankName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxDD = driver.findElements(By.name("DDNOTax")).size() != 0;
		System.out.println("TaxDD" + TaxDD);

		if (TaxDD == true) {
		ExerciseNow_Locators.TaxDD(driver).sendKeys("64654654");
		test.log(LogStatus.PASS, "TaxDD 64654654 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxDD not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxDDDate = driver.findElements(By.name("DDDateTax")).size() != 0;
		System.out.println("TaxDDDate" + TaxDDDate);

		if (TaxDDDate == true) {
		dateEnable(ExerciseNow_Locators.TaxDDDate(driver),"3-Dec-2019");
		test.log(LogStatus.PASS, "TaxDDDate 3-Dec-2019 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxDDDate not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxDDBankName = driver.findElements(By.name("DDBankNameTax")).size() != 0;
		System.out.println("TaxDDBankName" + TaxDDBankName);

		if (TaxDDBankName == true) {
		ExerciseNow_Locators.TaxDDBankName(driver).sendKeys("abc");
		test.log(LogStatus.PASS, "TaxDDBankName abc Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxDDBankName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean ConfirmUpdateDetails = driver.findElements(By.id("confirmupdatesID")).size() != 0;
		System.out.println("ConfirmUpdateDetails" + ConfirmUpdateDetails);

		if (ConfirmUpdateDetails == true) {
			waitfor.until(ExerciseNow_Locators.ConfirmUpdateDetails(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "ConfirmUpdateDetails Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmUpdateDetails not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		checkGenerateForm();
		
	}
					
	public  void ChequeDetails() throws InterruptedException, IOException {
		Boolean Cheque = driver.findElements(By.id("of-cheque")).size() != 0;
		System.out.println("Cheque" + Cheque);

		if (Cheque == true) {
			waitfor.until(ExerciseNow_Locators.Cheque(driver)).click();
		test.log(LogStatus.PASS, "Cheque Clicked");
		} else {
		test.log(LogStatus.FAIL, "Cheque not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DirectDebitClose = driver.findElements(By.xpath("//div[@id='OwnfundsPaymentViewId']//button[@class='close']")).size() != 0;
		System.out.println("DirectDebitClose" + DirectDebitClose);

		if (DirectDebitClose == true) {
			waitfor.until(ExerciseNow_Locators.DirectDebitClose(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "DirectDebitClose Clicked");
		} else {
		test.log(LogStatus.FAIL, "DirectDebitClose not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModeAgree = driver.findElements(By.id("remember")).size() != 0;
		System.out.println("PaymentModeAgree" + PaymentModeAgree);

		if (PaymentModeAgree == true) {
			waitfor.until(ExerciseNow_Locators.PaymentModeAgree(driver)).click();
		test.log(LogStatus.PASS, "PaymentModeAgree Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModeAgree not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean PaymentModePayNow = driver.findElements(By.id("btnPayNowID")).size() != 0;
		System.out.println("PaymentModePayNow" + PaymentModePayNow);

		if (PaymentModePayNow == true) {
			waitfor.until(ExerciseNow_Locators.PaymentModePayNow(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "PaymentModePayNow Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModePayNow not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
				
		Boolean ConfirmExercisedBtn_Ok_PopUpBtn = driver.findElements(By.id("btn1")).size() != 0;
		System.out.println("ConfirmExercisedBtn_Ok_PopUpBtn" + ConfirmExercisedBtn_Ok_PopUpBtn);

		if (ConfirmExercisedBtn_Ok_PopUpBtn == true) {
			driver.switchTo().activeElement();
			waitfor.until(ExerciseNow_Locators.ConfirmExercisedBtn_Ok_PopUpBtn(driver)).click();
			Thread.sleep(5000);
		test.log(LogStatus.PASS, "ConfirmExercisedBtn_Ok_PopUpBtn Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmExercisedBtn_Ok_PopUpBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}

		
		Boolean AmtChequeNo = driver.findElements(By.name("ChequeNoAmount")).size() != 0;
		System.out.println("AmtChequeNo" + AmtChequeNo);

		if (AmtChequeNo == true) {
		ExerciseNow_Locators.AmtChequeNo(driver).sendKeys("64654654");
		test.log(LogStatus.PASS, "AmtChequeNo 64654654 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtChequeNo not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtChequeDate = driver.findElements(By.name("ChequeDateAmount")).size() != 0;
		System.out.println("AmtChequeDate" + AmtChequeDate);

		if (AmtChequeDate == true) {
		dateEnable(ExerciseNow_Locators.AmtChequeDate(driver),"3-Dec-2019");
		test.log(LogStatus.PASS, "AmtChequeDate 3-Dec-2019 Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtChequeDate not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AmtChequeBankName = driver.findElements(By.name("BankNameAmount")).size() != 0;
		System.out.println("AmtChequeBankName" + AmtChequeBankName);

		if (AmtChequeBankName == true) {
		ExerciseNow_Locators.AmtChequeBankName(driver).sendKeys("abc");
		test.log(LogStatus.PASS, "AmtChequeBankName abc Entered");
		} else {
		test.log(LogStatus.FAIL, "AmtChequeBankName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxChequeNo = driver.findElements(By.name("ChequeNoTax")).size() != 0;
		System.out.println("TaxChequeNo" + TaxChequeNo);

		if (TaxChequeNo == true) {
		ExerciseNow_Locators.TaxChequeNo(driver).sendKeys("64654654");
		test.log(LogStatus.PASS, "TaxChequeNo 64654654 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxChequeNo not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxChequeDate = driver.findElements(By.name("ChequeDateTax")).size() != 0;
		System.out.println("TaxChequeDate" + TaxChequeDate);

		if (TaxChequeDate == true) {
		dateEnable(ExerciseNow_Locators.TaxChequeDate(driver),"3-Dec-2019");
		test.log(LogStatus.PASS, "TaxChequeDate 3-Dec-2019 Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxChequeDate not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean TaxChequeBankName = driver.findElements(By.name("BankNameTax")).size() != 0;
		System.out.println("TaxChequeBankName" + TaxChequeBankName);

		if (TaxChequeBankName == true) {
		ExerciseNow_Locators.TaxChequeBankName(driver).sendKeys("abc");
		test.log(LogStatus.PASS, "TaxChequeBankName abc Entered");
		} else {
		test.log(LogStatus.FAIL, "TaxChequeBankName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean ConfirmUpdateDetails = driver.findElements(By.id("confirmupdatesID")).size() != 0;
		System.out.println("ConfirmUpdateDetails" + ConfirmUpdateDetails);

		if (ConfirmUpdateDetails == true) {
			waitfor.until(ExerciseNow_Locators.ConfirmUpdateDetails(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "ConfirmUpdateDetails Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmUpdateDetails not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		checkGenerateForm();
		
	}
	public  void dateEnable(WebElement date,String dt) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('readonly','readonly');", date);
		Thread.sleep(2000);
		date.sendKeys(dt);
	}
	
	public void checkGenerateForm() throws InterruptedException, IOException {
		
		Boolean fileNotFound = driver.findElements(By.xpath("//*[@id=\"step-3\"]/div[2]/div")).size() != 0;
		System.out.println("fileNotFound" + fileNotFound);

		if (fileNotFound != true) {
			checkFile();
			
		}
		else {
			String msg = driver.findElement(By.xpath("//*[@id=\"step-3\"]/div[2]/div")).getText();
			System.out.println("Form is not generating showing message:"+msg);
		}
		
	}
	
	public Boolean checkDownloadButton() throws InterruptedException {
		Thread.sleep(2000);
		Boolean checkDownloadButton = driver.findElements(By.id("DownloadGeneratedForm")).size() != 0;
		System.out.println("checkDownloadButton" + checkDownloadButton);
		if (checkDownloadButton == true) {

			Flag = true;

		}
		else {
			Flag = false;
		}
		return Flag;

	}
	public void checkFile() throws InterruptedException, IOException {
		while(checkDownloadButton()==false) {
			System.out.println("Form is loading....");
		}
		Boolean DownloadForm = driver.findElements(By.id("DownloadGeneratedForm")).size() != 0;
		System.out.println("DownloadForm" + DownloadForm);

		if (DownloadForm == true) {
		waitfor.until(ExerciseNow_Locators.DownloadForm(driver)).click();
		test.log(LogStatus.PASS, "DownloadForm Clicked");
		} else {
		test.log(LogStatus.FAIL, "DownloadForm not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean ConfirmForm = driver.findElements(By.id("GeneratedFormConfirmId")).size() != 0;
		System.out.println("ConfirmForm" + ConfirmForm);

		if (ConfirmForm == true) {
		waitfor.until(ExerciseNow_Locators.ConfirmForm(driver)).click();
		test.log(LogStatus.PASS, "ConfirmForm Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmForm not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		


	}
	public void TentativeTax () throws InterruptedException, IOException {
	{
		Boolean PaymentModeAgree = driver.findElements(By.id("remember")).size() != 0;
		System.out.println("PaymentModeAgree" + PaymentModeAgree);

		if (PaymentModeAgree == true) {
		waitfor.until(ExerciseNow_Locators.PaymentModeAgree(driver)).click();
		test.log(LogStatus.PASS, "PaymentModeAgree Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModeAgree not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		Boolean PaymentModePayNow = driver.findElements(By.id("btnPayNowID")).size() != 0;
		System.out.println("PaymentModePayNow" + PaymentModePayNow);

		if (PaymentModePayNow == true) {
			waitfor.until(ExerciseNow_Locators.PaymentModePayNow(driver)).click();
			Thread.sleep(3000);
		test.log(LogStatus.PASS, "PaymentModePayNow Clicked");
		} else {
		test.log(LogStatus.FAIL, "PaymentModePayNow not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		

		Boolean ConfirmExercisedBtn_Ok_PopUpBtn = driver.findElements(By.id("btn1")).size() != 0;
		System.out.println("ConfirmExercisedBtn_Ok_PopUpBtn" + ConfirmExercisedBtn_Ok_PopUpBtn);

		if (ConfirmExercisedBtn_Ok_PopUpBtn == true) {
		driver.switchTo().activeElement();
		waitfor.until(ExerciseNow_Locators.ConfirmExercisedBtn_Ok_PopUpBtn(driver)).click();
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "ConfirmExercisedBtn_Ok_PopUpBtn Clicked");
		} else {
		test.log(LogStatus.FAIL, "ConfirmExercisedBtn_Ok_PopUpBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
	}
	}
}
