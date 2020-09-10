package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.NominationDetails_Locators;

public class GaurdianDetails  extends MyEsopsLogin
{
		
	public void GaurdianClick() throws Exception
		{ 
	
		//==================Gaurdian Details================	
		//	Boolean NameOfGuardian = driver.findElements(By.id("txtGuardianName")).size() != 0;
		boolean NameOfGuardian= NominationDetails_Locators.NameOfGuardian(driver).isDisplayed();
		System.out.println("NameOfGuardian" + NameOfGuardian);
		if (NameOfGuardian == true) {
		NominationDetails_Locators.NameOfGuardian(driver).clear();
		NominationDetails_Locators.NameOfGuardian(driver).sendKeys("Abc");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "NameOfGuardian Entered");
			Boolean AddressOfGuardian = driver.findElements(By.id("txtGuardianAddress")).size() != 0;
		System.out.println("AddressOfGuardian" + AddressOfGuardian);
		if (AddressOfGuardian == true) {
		NominationDetails_Locators.AddressOfGuardian(driver).clear();
		NominationDetails_Locators.AddressOfGuardian(driver).sendKeys("Pune");
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "AddressOfGuardian Entered");
		} else {
		test.log(LogStatus.FAIL, "AddressOfGuardian not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		List<WebElement> DOB_Gaurdian = driver.findElements(By.id("txtDateOfBirth"));

		for (WebElement input : DOB_Gaurdian) {
		    ((JavascriptExecutor) driver).executeScript(
		                "arguments[0].removeAttribute('readonly','readonly')",input);
		}
		Boolean DOB_Guardian = driver.findElements(By.id("txtDateOfBirth")).size() != 0;
		System.out.println("DOB_Guardian" + DOB_Guardian);
		if (DOB_Guardian == true) {	
		NominationDetails_Locators.DOB_Guardian(driver).clear();
		NominationDetails_Locators.DOB_Guardian(driver).sendKeys("23-Dec-2019");
		NominationDetails_Locators.DOB_Guardian(driver).getText();
		NominationDetails_Locators.DOB_Guardian(driver).clear();
		NominationDetails_Locators.DOB_Guardian(driver).sendKeys("15-Oct-1985");
		test.log(LogStatus.PASS, "DOB_Guardian Entered");
		} else {
			test.log(LogStatus.FAIL, "DOB_Guardian not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
	

		} else 
		{
			test.log(LogStatus.FAIL, "NameOfGuardian not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		
		
		}
	
	
	
	
	public void GaurdianClickEdit() throws Exception
	{
	//=====================Gaurdian Details=====================	
	
	
    
	boolean EditNameOfGuardian = NominationDetails_Locators.EditNameOfGuardian(driver).isDisplayed();
	System.out.println("EditNameOfGuardian" + EditNameOfGuardian);
	if (EditNameOfGuardian == true) {
	NominationDetails_Locators.EditNameOfGuardian(driver).clear();
	NominationDetails_Locators.EditNameOfGuardian(driver).sendKeys("Sanjay");
	Thread.sleep(2000);
	test.log(LogStatus.PASS, "EditNameOfGuardian Entered");
	Boolean EditAddressOfGuardian = driver.findElements(By.id("txtAddressofguardian")).size() != 0;
	System.out.println("EditAddressOfGuardian" + EditAddressOfGuardian);
	if (EditAddressOfGuardian == true) {
	NominationDetails_Locators.EditAddressOfGuardian(driver).clear();
	NominationDetails_Locators.EditAddressOfGuardian(driver).sendKeys("Pune");
	Thread.sleep(2000);
	test.log(LogStatus.PASS, "EditAddressOfGuardian Entered");
	} else {
	test.log(LogStatus.FAIL, "EditAddressOfGuardian not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
	}

//========================= Remove the Read Only Property for text box========================		
	List<WebElement> DOB_Gaurdian = driver.findElements(By.id("txtDOBGuardian"));

	for (WebElement input : DOB_Gaurdian) {
		((JavascriptExecutor) driver).executeScript(
        "arguments[0].removeAttribute('readonly','readonly')",input);
}

//=============================================================================================

	Boolean EditDOB_Guardian = driver.findElements(By.id("txtDOBGuardian")).size() != 0;
	System.out.println("EditDOB_Guardian" + EditDOB_Guardian);
	if (EditDOB_Guardian == true) {
	NominationDetails_Locators.EditDOB_Guardian(driver).clear();
	NominationDetails_Locators.EditDOB_Guardian(driver).sendKeys("23-Dec-2019");
	NominationDetails_Locators.EditDOB_Guardian(driver).getText();
	NominationDetails_Locators.EditDOB_Guardian(driver).clear();
	NominationDetails_Locators.EditDOB_Guardian(driver).sendKeys("15-Oct-1985");
	test.log(LogStatus.PASS, "EditDOB_Guardian Entered");
	} else {
	test.log(LogStatus.FAIL, "EditDOB_Guardian not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
	}

	} 
	else {
		test.log(LogStatus.FAIL, "EditNameOfGuardian not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}

}
	
}	