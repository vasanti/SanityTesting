package TestScripts;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.InProcess_Locators;

public class InProcess extends MyEsopsLogin {
	public void InProcessClick() throws Exception {
		Boolean Exercise = driver.findElements(By.linkText("Exercise")).size() != 0;
		System.out.println("Exercise" + Exercise);

		if (Exercise == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise Clicked");
		
		Boolean InProcess = driver.findElements(By.linkText("In Process")).size() != 0;
		System.out.println("InProcess" + InProcess);

		if (InProcess == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess Clicked");				
		Boolean Instrument1 =InProcess_Locators.Instrument1(driver).isDisplayed();
		System.out.println("Instrument1" + Instrument1);
		Boolean Instrument2 = InProcess_Locators.Instrument2(driver).isDisplayed();
		System.out.println("Instrument2" + Instrument2);
		Boolean Instrument3 =InProcess_Locators.Instrument3(driver).isDisplayed();
		System.out.println("Instrument3" + Instrument3);
		Boolean Instrument4 = InProcess_Locators.Instrument4(driver).isDisplayed();
		System.out.println("Instrument4" + Instrument4);
		Boolean Instrument5 = InProcess_Locators.Instrument5(driver).isDisplayed();
		System.out.println("Instrument5" + Instrument5);
		Boolean Instrument6 =InProcess_Locators.Instrument6(driver).isDisplayed();
		System.out.println("Instrument6" + Instrument6);
		Boolean Instrument7=InProcess_Locators.Instrument7(driver).isDisplayed();
		System.out.println("Instrument7" + Instrument7);
		Boolean Instrument8 = 	InProcess_Locators.Instrument8(driver).isDisplayed();
		System.out.println("Instrument8" + Instrument8);
		Boolean InProcessAllInstruments =InProcess_Locators.InProcessAllInstruments(driver).isDisplayed();
		System.out.println("InProcessAllInstruments" + InProcessAllInstruments);
		
		if (Instrument1 == true) {
			
			InProcess_Locators.Instrument1(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument1 Clicked");
			
			Boolean Exercise1 = driver.findElements(By.linkText("Exercise")).size() != 0;
			System.out.println("Exercise1" + Exercise1);
			if (Exercise1 == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Exercise1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean InProcess1 = driver.findElements(By.linkText("In Process")).size() != 0;
			System.out.println("InProcess1" + InProcess1);
			if (InProcess1 == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "InProcess1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			
			InProcessExNoClick ExNoClk=new InProcessExNoClick();
			ExNoClk.ExNumberClick();
			

			
		}
		
		else if (Instrument2 == true) {
			InProcess_Locators.Instrument2(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument2 Clicked");
			
			Boolean Exercise1 = driver.findElements(By.linkText("Exercise")).size() != 0;
			System.out.println("Exercise1" + Exercise1);
			if (Exercise1 == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Exercise1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean InProcess1 = driver.findElements(By.linkText("In Process")).size() != 0;
			System.out.println("InProcess1" + InProcess1);
			if (InProcess1 == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "InProcess1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			InProcessExNoClick ExNoClk=new InProcessExNoClick();
			ExNoClk.ExNumberClick();
			
		}
		
		else if (Instrument3 == true) {
			InProcess_Locators.Instrument3(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument3 Clicked");
			
			Boolean Exercise1 = driver.findElements(By.linkText("Exercise")).size() != 0;
			System.out.println("Exercise1" + Exercise1);
			if (Exercise1 == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Exercise1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean InProcess1 = driver.findElements(By.linkText("In Process")).size() != 0;
			System.out.println("InProcess1" + InProcess1);
			if (InProcess1 == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "InProcess1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			InProcessExNoClick ExNoClk=new InProcessExNoClick();
			ExNoClk.ExNumberClick();
			
		}
		
		else if (Instrument4 == true) {
			InProcess_Locators.Instrument4(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument4 Clicked");
			
			Boolean Exercise1 = driver.findElements(By.linkText("Exercise")).size() != 0;
			System.out.println("Exercise1" + Exercise1);
			if (Exercise1 == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Exercise1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean InProcess1 = driver.findElements(By.linkText("In Process")).size() != 0;
			System.out.println("InProcess1" + InProcess1);
			if (InProcess1 == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "InProcess1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			InProcessExNoClick ExNoClk=new InProcessExNoClick();
			ExNoClk.ExNumberClick();
			
		}
		

		else if (Instrument5 == true) {
			InProcess_Locators.Instrument5(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument5 Clicked");
			
			Boolean Exercise1 = driver.findElements(By.linkText("Exercise")).size() != 0;
			System.out.println("Exercise1" + Exercise1);
			if (Exercise1 == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Exercise1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean InProcess1 = driver.findElements(By.linkText("In Process")).size() != 0;
			System.out.println("InProcess1" + InProcess1);
			if (InProcess1 == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "InProcess1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			InProcessExNoClick ExNoClk=new InProcessExNoClick();
			ExNoClk.ExNumberClick();
			
		}
	

		else if (Instrument6 == true) {
			InProcess_Locators.Instrument6(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument6 Clicked");
			
			Boolean Exercise1 = driver.findElements(By.linkText("Exercise")).size() != 0;
			System.out.println("Exercise1" + Exercise1);
			if (Exercise1 == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Exercise1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean InProcess1 = driver.findElements(By.linkText("In Process")).size() != 0;
			System.out.println("InProcess1" + InProcess1);
			if (InProcess1 == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "InProcess1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			InProcessExNoClick ExNoClk=new InProcessExNoClick();
			ExNoClk.ExNumberClick();
			
		}

		else if (Instrument7 == true) {
			InProcess_Locators.Instrument7(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument7 Clicked");
			
			Boolean Exercise1 = driver.findElements(By.linkText("Exercise")).size() != 0;
			System.out.println("Exercise1" + Exercise1);
			if (Exercise1 == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Exercise1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean InProcess1 = driver.findElements(By.linkText("In Process")).size() != 0;
			System.out.println("InProcess1" + InProcess1);
			if (InProcess1 == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "InProcess1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			InProcessExNoClick ExNoClk=new InProcessExNoClick();
			ExNoClk.ExNumberClick();
			
		}
	

		else if (Instrument8 == true) {
			InProcess_Locators.Instrument8(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Instrument8 Clicked");
			
			Boolean Exercise1 = driver.findElements(By.linkText("Exercise")).size() != 0;
			System.out.println("Exercise1" + Exercise1);
			if (Exercise1 == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Exercise1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean InProcess1 = driver.findElements(By.linkText("In Process")).size() != 0;
			System.out.println("InProcess1" + InProcess1);
			if (InProcess1 == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "InProcess1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			InProcessExNoClick ExNoClk=new InProcessExNoClick();
			ExNoClk.ExNumberClick();
			
			
		}
		else if (InProcessAllInstruments == true) {
			InProcess_Locators.InProcessAllInstruments(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcessAllInstruments Clicked");
			
			Boolean Exercise1 = driver.findElements(By.linkText("Exercise")).size() != 0;
			System.out.println("Exercise1" + Exercise1);
			if (Exercise1 == true) {
			InProcess_Locators.Exercise(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "Exercise1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "Exercise1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean InProcess1 = driver.findElements(By.linkText("In Process")).size() != 0;
			System.out.println("InProcess1" + InProcess1);
			if (InProcess1 == true) {
			InProcess_Locators.InProcess(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "InProcess1 Clicked");
			} else {
			test.log(LogStatus.FAIL, "InProcess1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			InProcessExNoClick ExNoClk=new InProcessExNoClick();
			ExNoClk.ExNumberClick();
			
			
			
	        
		}
		else
		{
			System.out.println("All instruments data checked or no instrument present");
			test.log(LogStatus.FAIL, "Instrument not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		}
		else
		{
			System.out.println("InProcess Link not present");
			test.log(LogStatus.FAIL, "InProcess not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		}
		else
		{
			System.out.println("Exercise tab not present");
			test.log(LogStatus.FAIL, "Exercise not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
	}
}