package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class PaymentModeClick extends PaymentModesLogic {
	
	PaymentModesLogic PaymentmodeClk = new PaymentModesLogic();
	String ColumnName;
	public void SelectPaymentMode() throws InterruptedException, IOException {
		
		WebElement ExerciseNowConfirmEx_Table = driver.findElement(By.id("ExcerciseSummary"));
		System.out.println("ExerciseNow_Table" + ExerciseNowConfirmEx_Table);

		List<WebElement> ExerciseNowConfirmEx_TotalRows = ExerciseNowConfirmEx_Table.findElements(By.tagName("tr"));
		int ExerciseNowConfirmEx_rowCount = (ExerciseNowConfirmEx_TotalRows.size()) - 1;
		System.out.println("Total Number of Rows are: " + ExerciseNowConfirmEx_rowCount);
		Thread.sleep(5000);

		// Fetch Total Column Count
		List<WebElement> ExerciseNowConfirmEx_TotalCols = ExerciseNowConfirmEx_Table.findElements(By.tagName("th"));
		int ExerciseNowConfirmEx_colCount = ExerciseNowConfirmEx_TotalCols.size();
		System.out.println("Total Number of Columns are: " +ExerciseNowConfirmEx_colCount + "\n");
		Thread.sleep(5000);
		
		for(int TotalCols=1;TotalCols<=ExerciseNowConfirmEx_colCount;TotalCols++)
		{
		WebElement colName = ExerciseNowConfirmEx_TotalCols.get(TotalCols);
		System.out.println("Column Name is: " + colName.getText());
		 ColumnName=colName.getText();
		Thread.sleep(5000);

		if (ColumnName.equals("Tentative Tax"))
		{
	
			System.out.println("Tentative Tax Present");
			break;
		}
		else if(ColumnName.equals("Tax"))
		{
			System.out.println("Tentative Tax Present");
			break;
		}
		}
		if (ColumnName.equals("Tentative Tax"))
		{
	
			System.out.println("Tentative Tax Present");
			PaymentmodeClk.TentativeTax();
		}
		
		else if(ColumnName.equals("Tax"))
		{
		Boolean DirectDebit = driver.findElements(By.id("of-direct-debit")).size() != 0;
		System.out.println("DirectDebit" + DirectDebit);

		if (DirectDebit == true) {
		PaymentmodeClk.DirectDebitDetails();
		test.log(LogStatus.PASS, "DirectDebit Clicked");
		} else {
		test.log(LogStatus.FAIL, "DirectDebit not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean RTGS = driver.findElements(By.id("of-rtgs")).size() != 0;
		System.out.println("RTGS" + RTGS);

		if (RTGS == true) {
		PaymentmodeClk.RTGSDetails();
		test.log(LogStatus.PASS, "RTGS Clicked");
		} else {
		test.log(LogStatus.FAIL, "RTGS not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean WireTransfer = driver.findElements(By.id("of-wiretransfer")).size() != 0;
		System.out.println("WireTransfer" + WireTransfer);

		if (WireTransfer == true) {
		PaymentmodeClk.WireTransferDetails();
		test.log(LogStatus.PASS, "WireTransfer Clicked");
		} else {
		test.log(LogStatus.FAIL, "WireTransfer not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DD = driver.findElements(By.id("of-dd")).size() != 0;
		System.out.println("DD" + DD);
		if (DD == true) {
		PaymentmodeClk.DDDetails();
		test.log(LogStatus.PASS, "DD Clicked");
		} else {
		test.log(LogStatus.FAIL, "DD not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean Cheque = driver.findElements(By.id("of-cheque")).size() != 0;
		System.out.println("Cheque" + Cheque);
		if (Cheque == true) {
		PaymentmodeClk.ChequeDetails();
		test.log(LogStatus.PASS, "Cheque Clicked");
		} else {
		test.log(LogStatus.FAIL, "Cheque not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		}

	}
}