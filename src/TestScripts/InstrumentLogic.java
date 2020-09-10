package TestScripts;

import java.io.IOException;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locators;

public class InstrumentLogic extends ExerciseNow {
	String MIT_ID;
	String InstrumentNameActual1, InstrumentNameActual2, InstrumentNameActual3, InstrumentNameActual4,
			InstrumentNameActual5, InstrumentNameActual6, InstrumentNameActual7, InstrumentNameActual8;

	public void InstumentsClick(String Instruments) throws Exception, IOException {
		Boolean Instrument1 = ExerciseNow_Locators.Instrument1(driver).isDisplayed();
		System.out.println("Instrument1" + Instrument1);

		if (Instrument1 == true) {

			InstrumentNameActual1 = ExerciseNow_Locators.Instrument1(driver).getText();
			System.out.println("InstrumentNameActua1" + InstrumentNameActual1);
			Thread.sleep(1000);

			ExerciseNow_Locators.Instrument1(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument1 Clicked");
			String[] arrSplit = Instruments.split(",");
			System.out.println("Length of ExcelAccess values are " + arrSplit.length);
			Add_Log.info("Length of ExcelAccess values are " + arrSplit.length);
			for (String InstrumentsValue : arrSplit) {

				System.out.println("Excel FinalAccess values are " + InstrumentsValue);
				String InstrumentsValueActual1withoutspace = InstrumentsValue.replaceAll("\\s", "");
				Add_Log.info("Excel FinalAccess values are " + InstrumentsValue);
				System.out.println("InstrumentNameActual1 " + InstrumentNameActual1);
				String InstrumentNameActualwithoutspace = InstrumentNameActual1.replaceAll("\\s", "");
				
				if (InstrumentsValueActual1withoutspace.equals(InstrumentNameActualwithoutspace)) {
					MIT_ID = "1";
					System.out.println(MIT_ID);
					CalculateNow CalculateNowclk = new CalculateNow();
					CalculateNowclk.CalculateNowData(MIT_ID, InstrumentsValueActual1withoutspace);
				}
			}

	

		} else {
			test.log(LogStatus.FAIL, "Instrument1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean Instrument2 = ExerciseNow_Locators.Instrument2(driver).isDisplayed();
		System.out.println("Instrument2" + Instrument2);

		if (Instrument2 == true) {
			InstrumentNameActual2 = ExerciseNow_Locators.Instrument2(driver).getText();
			System.out.println("InstrumentNameActua2" + InstrumentNameActual2);
			Thread.sleep(1000);

			ExerciseNow_Locators.Instrument2(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument2 Clicked");

			String[] arrSplit = Instruments.split(",");
			System.out.println("Length of ExcelAccess values are " + arrSplit.length);
			Add_Log.info("Length of ExcelAccess values are " + arrSplit.length);
			for (String InstrumentsValue : arrSplit) {

				System.out.println("Excel FinalAccess values are " + InstrumentsValue);
				String InstrumentsValueActual1withoutspace = InstrumentsValue.replaceAll("\\s", "");
				Add_Log.info("Excel FinalAccess values are " + InstrumentsValue);
				System.out.println("InstrumentNameActual2 " + InstrumentNameActual2);
				String InstrumentNameActualwithoutspace = InstrumentNameActual2.replaceAll("\\s", "");

				if (InstrumentsValueActual1withoutspace.equals(InstrumentNameActualwithoutspace)) {
					MIT_ID = "2";
					System.out.println(MIT_ID);
					CalculateNow CalculateNowclk = new CalculateNow();
					CalculateNowclk.CalculateNowData(MIT_ID, InstrumentsValueActual1withoutspace);
				}
			}
			
		} else {
			test.log(LogStatus.FAIL, "Instrument2 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean Instrument3 = ExerciseNow_Locators.Instrument3(driver).isDisplayed();
		System.out.println("Instrument3" + Instrument3);

		if (Instrument3 == true) {
			InstrumentNameActual3 = ExerciseNow_Locators.Instrument3(driver).getText();
			System.out.println("InstrumentNameActua3" + InstrumentNameActual3);
			Thread.sleep(1000);

			ExerciseNow_Locators.Instrument3(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument3 Clicked");
			String[] arrSplit = Instruments.split(",");
			System.out.println("Length of ExcelAccess values are " + arrSplit.length);
			Add_Log.info("Length of ExcelAccess values are " + arrSplit.length);
			for (String InstrumentsValue : arrSplit) {

				System.out.println("Excel FinalAccess values are " + InstrumentsValue);
				String InstrumentsValueActual1withoutspace = InstrumentsValue.replaceAll("\\s", "");
				Add_Log.info("Excel FinalAccess values are " + InstrumentsValue);
				System.out.println("InstrumentNameActual3 " + InstrumentNameActual3);
				String InstrumentNameActualwithoutspace = InstrumentNameActual3.replaceAll("\\s", "");

				if (InstrumentsValueActual1withoutspace.equals(InstrumentNameActualwithoutspace)) {
					MIT_ID = "3";
					System.out.println(MIT_ID);
					CalculateNow CalculateNowclk = new CalculateNow();
					CalculateNowclk.CalculateNowData(MIT_ID,InstrumentNameActual3);
				}
			}


		} else {
			test.log(LogStatus.FAIL, "Instrument3 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean Instrument4 = ExerciseNow_Locators.Instrument4(driver).isDisplayed();
		System.out.println("Instrument4" + Instrument4);

		if (Instrument4 == true) {
			InstrumentNameActual4 = ExerciseNow_Locators.Instrument4(driver).getText();
			System.out.println("InstrumentNameActua4" + InstrumentNameActual4);
			Thread.sleep(1000);

			ExerciseNow_Locators.Instrument4(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument4 Clicked");
			String[] arrSplit = Instruments.split(",");
			System.out.println("Length of ExcelAccess values are " + arrSplit.length);
			Add_Log.info("Length of ExcelAccess values are " + arrSplit.length);
			
			
			for (String InstrumentsValue : arrSplit) {

				System.out.println("Excel FinalAccess values are " + InstrumentsValue);
				String InstrumentsValueActual1withoutspace = InstrumentsValue.replaceAll("\\s", "");
				Add_Log.info("Excel FinalAccess values are " + InstrumentsValue);
				System.out.println("InstrumentNameActual4 " + InstrumentNameActual1);
				String InstrumentNameActualwithoutspace = InstrumentNameActual4.replaceAll("\\s", "");

				if (InstrumentsValueActual1withoutspace.equals(InstrumentNameActualwithoutspace)) {
					MIT_ID = "4";
					System.out.println(MIT_ID);
					CalculateNow CalculateNowclk = new CalculateNow();
					CalculateNowclk.CalculateNowData(MIT_ID, InstrumentNameActual4);

				}
			}
			
		} else {
			test.log(LogStatus.FAIL, "Instrument4 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean Instrument5 = ExerciseNow_Locators.Instrument5(driver).isDisplayed();
		System.out.println("Instrument5" + Instrument5);

		if (Instrument5 == true) {
			InstrumentNameActual5 = ExerciseNow_Locators.Instrument5(driver).getText();
			System.out.println("InstrumentNameActua5" + InstrumentNameActual5);
			Thread.sleep(1000);

			ExerciseNow_Locators.Instrument5(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument5 Clicked");
			String[] arrSplit = Instruments.split(",");
			System.out.println("Length of ExcelAccess values are " + arrSplit.length);
			Add_Log.info("Length of ExcelAccess values are " + arrSplit.length);
			for (String InstrumentsValue : arrSplit) {

				System.out.println("Excel FinalAccess values are " + InstrumentsValue);
				String InstrumentsValueActual1withoutspace = InstrumentsValue.replaceAll("\\s", "");
				Add_Log.info("Excel FinalAccess values are " + InstrumentsValue);
				System.out.println("InstrumentNameActual5 " + InstrumentNameActual5);
				String InstrumentNameActualwithoutspace = InstrumentNameActual5.replaceAll("\\s", "");

				if (InstrumentsValueActual1withoutspace.equals(InstrumentNameActualwithoutspace)) {
					MIT_ID = "5";
					System.out.println(MIT_ID);
					CalculateNow CalculateNowclk = new CalculateNow();
					CalculateNowclk.CalculateNowData(MIT_ID, InstrumentNameActual5);
				}
			}
			
		} else {
			test.log(LogStatus.FAIL, "Instrument5 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean Instrument6 = ExerciseNow_Locators.Instrument6(driver).isDisplayed();
		System.out.println("Instrument6" + Instrument6);

		if (Instrument6 == true) {
			InstrumentNameActual6 = ExerciseNow_Locators.Instrument6(driver).getText();
			System.out.println("InstrumentNameActua6" + InstrumentNameActual6);
			Thread.sleep(1000);

			ExerciseNow_Locators.Instrument6(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument6 Clicked");
			String[] arrSplit = Instruments.split(",");
			System.out.println("Length of ExcelAccess values are " + arrSplit.length);
			Add_Log.info("Length of ExcelAccess values are " + arrSplit.length);
			for (String InstrumentsValue : arrSplit) {

				System.out.println("Excel FinalAccess values are " + InstrumentsValue);
				String InstrumentsValueActual1withoutspace = InstrumentsValue.replaceAll("\\s", "");
				Add_Log.info("Excel FinalAccess values are " + InstrumentsValue);
				System.out.println("InstrumentNameActual6 " + InstrumentNameActual6);
				String InstrumentNameActualwithoutspace = InstrumentNameActual6.replaceAll("\\s", "");

				if (InstrumentsValueActual1withoutspace.equals(InstrumentNameActualwithoutspace)) {
					MIT_ID = "6";
					System.out.println(MIT_ID);
					CalculateNow CalculateNowclk = new CalculateNow();
					CalculateNowclk.CalculateNowData(MIT_ID, InstrumentNameActual6);
				}
			}
			
		} else {
			test.log(LogStatus.FAIL, "Instrument6 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean Instrument7 = ExerciseNow_Locators.Instrument7(driver).isDisplayed();
		System.out.println("Instrument7" + Instrument7);
		if (Instrument7 == true) {

			InstrumentNameActual7 = ExerciseNow_Locators.Instrument7(driver).getText();
			System.out.println("InstrumentNameActua7" + InstrumentNameActual7);
			Thread.sleep(1000);

			ExerciseNow_Locators.Instrument7(driver).click();
			test.log(LogStatus.PASS, "Instrument7 Clicked");

			String[] arrSplit = Instruments.split(",");
			System.out.println("Length of ExcelAccess values are " + arrSplit.length);
			Add_Log.info("Length of ExcelAccess values are " + arrSplit.length);
			for (String InstrumentsValue : arrSplit) {

				System.out.println("Excel FinalAccess values are " + InstrumentsValue);
				String InstrumentsValueActual1withoutspace = InstrumentsValue.replaceAll("\\s", "");
				Add_Log.info("Excel FinalAccess values are " + InstrumentsValue);
				System.out.println("InstrumentNameActual7 " + InstrumentNameActual7);
				String InstrumentNameActualwithoutspace = InstrumentNameActual7.replaceAll("\\s", "");

				if (InstrumentsValueActual1withoutspace.equals(InstrumentNameActualwithoutspace)) {
					MIT_ID = "7";
					System.out.println(MIT_ID);
					CalculateNow CalculateNowclk = new CalculateNow();
					CalculateNowclk.CalculateNowData(MIT_ID, InstrumentNameActual7);
				}
			}
		
		} else {
			test.log(LogStatus.FAIL, "Instrument7 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		

		Boolean Instrument8 = ExerciseNow_Locators.Instrument8(driver).isDisplayed();
		System.out.println("Instrument8" + Instrument8);

		if (Instrument8 == true) {
			InstrumentNameActual8 = ExerciseNow_Locators.Instrument8(driver).getText();
			System.out.println("InstrumentNameActua8" + InstrumentNameActual8);
			Thread.sleep(1000);
			ExerciseNow_Locators.Instrument8(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument8 Clicked");
			String[] arrSplit = Instruments.split(",");
			System.out.println("Length of ExcelAccess values are " + arrSplit.length);
			Add_Log.info("Length of ExcelAccess values are " + arrSplit.length);
			for (String InstrumentsValue : arrSplit) {

				System.out.println("Excel FinalAccess values are " + InstrumentsValue);
				String InstrumentsValueActual1withoutspace = InstrumentsValue.replaceAll("\\s", "");
				Add_Log.info("Excel FinalAccess values are " + InstrumentsValue);
				System.out.println("InstrumentNameActual8 " + InstrumentNameActual8);
				String InstrumentNameActualwithoutspace = InstrumentNameActual8.replaceAll("\\s", "");

				if (InstrumentsValueActual1withoutspace.equals(InstrumentNameActualwithoutspace)) {
					MIT_ID = "8";
					System.out.println(MIT_ID);
					CalculateNow CalculateNowclk = new CalculateNow();
					CalculateNowclk.CalculateNowData(MIT_ID, InstrumentNameActual8);
				}
				
			}

		} else {
			test.log(LogStatus.FAIL, "Instrument8 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}

	}

}
