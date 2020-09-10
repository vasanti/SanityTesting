package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Profile_menu;

public class ProfileOtherDetails extends MyEsopsLogin {
	
	public void OtherDetails() throws Exception
	{ 
		
		//OtherDetails
			
				Boolean OtherDetails = driver.findElements(By.id("OtherDetails")).size() != 0;
				System.out.println("OtherDetails" + OtherDetails);
				if (OtherDetails == true) {
				Profile_menu.OtherDetails(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "OtherDetails Clicked");
				} else {
					test.log(LogStatus.FAIL, "OtherDetails not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Boolean Cancel_btn_Other = driver.findElements(By.id("BtnCancelOtherDetails")).size() != 0;
				System.out.println("Cancel_btn_Other" + Cancel_btn_Other);
				if (Cancel_btn_Other == true) {
				Profile_menu.Cancel_btn_Other(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Cancel_btn_Other Clicked");
				} else {
					test.log(LogStatus.FAIL, "Cancel_btn_Other not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Boolean OtherDetails1 = driver.findElements(By.id("OtherDetails")).size() != 0;
				System.out.println("OtherDetails1" + OtherDetails1);
				if (OtherDetails1 == true) {
				Profile_menu.OtherDetails(driver).click();
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "OtherDetails1 Clicked");
				} else {
				test.log(LogStatus.FAIL, "OtherDetails1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
		
				if(Profile_menu.OtherDetailsPAN(driver).isEnabled())
				{
				Profile_menu.OtherDetailsPAN(driver).clear();
				Profile_menu.OtherDetailsPAN(driver).sendKeys("AMRPA4188N");
				test.log(LogStatus.PASS, "PAN Entered");
				} else {
					test.log(LogStatus.FAIL, "PAN not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				if(Profile_menu.OtherDetailsResidentialStatus(driver).isEnabled())
				{
				WebElement element1=Profile_menu.OtherDetailsResidentialStatus(driver);
				Select option1=new Select(element1);
				option1.selectByVisibleText("Resident");
				test.log(LogStatus.PASS, "ResidentialStatus Selected");
				} else {
					test.log(LogStatus.FAIL, "ResidentialStatus not Selected" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Thread.sleep(100);
				if(Profile_menu.OtherDetailsInsiderEmployee(driver).isEnabled())
				{
				WebElement element2=Profile_menu.OtherDetailsInsiderEmployee(driver);
				Select option2=new Select(element2);
				option2.selectByVisibleText("Yes");
				test.log(LogStatus.PASS, "InsiderEmployee Selected");
				} else {
					test.log(LogStatus.FAIL, "InsiderEmployee not Selected" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Thread.sleep(100);
				if(Profile_menu.OtherDetailsEntity(driver).isEnabled())
				{
				WebElement element3=Profile_menu.OtherDetailsEntity(driver);
				Select option3=new Select(element3);
				option3.selectByVisibleText("");
				test.log(LogStatus.PASS, "Entity Selected");
				} else {
					test.log(LogStatus.FAIL, "Entity not Selected" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Thread.sleep(100);
				if(Profile_menu.OtherDetailsDepartment(driver).isEnabled())
				{
				Profile_menu.OtherDetailsDepartment(driver).clear();
				Profile_menu.OtherDetailsDepartment(driver).sendKeys("IT-QA");
				test.log(LogStatus.PASS, "Department Entered");
				} else {
					test.log(LogStatus.FAIL, "Department not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				if(Profile_menu.OtherDetailsSBU(driver).isEnabled())
				{
				Profile_menu.OtherDetailsSBU(driver).sendKeys("24234");
				test.log(LogStatus.PASS, "SBU Entered");
				} else {
					test.log(LogStatus.FAIL, "SBU not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				if(Profile_menu.OtherDetailsCostCenter(driver).isEnabled())
				{
					Profile_menu.OtherDetailsCostCenter(driver).clear();
				Profile_menu.OtherDetailsCostCenter(driver).sendKeys("56768");
				test.log(LogStatus.PASS, "CostCenter Entered");
				} else {
					test.log(LogStatus.FAIL, "CostCenter not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				if(Profile_menu.OtherDetailsLocation(driver).isEnabled())
				{
				Profile_menu.OtherDetailsLocation(driver).clear();
				Profile_menu.OtherDetailsLocation(driver).sendKeys("Baner");
				test.log(LogStatus.PASS, "Location Entered");
				} else {
					test.log(LogStatus.FAIL, "Location not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				if(Profile_menu.OtherDetailsTaxIdentifierCountry(driver).isEnabled())
				{
				WebElement element5=Profile_menu.OtherDetailsTaxIdentifierCountry(driver);
				Select option5=new Select(element5);
				option5.selectByVisibleText("India");
				test.log(LogStatus.PASS, "TaxIdentifierCountry Selected");
				} else {
					test.log(LogStatus.FAIL, "TaxIdentifierCountry not Selected" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Thread.sleep(100);
				if(Profile_menu.OtherDetailsTaxIdentifierState(driver).isEnabled())
				{
				WebElement element6=Profile_menu.OtherDetailsTaxIdentifierState(driver);
				Select option6=new Select(element6);
				option6.selectByVisibleText("Maharashtra");
				test.log(LogStatus.PASS, "TaxIdentifierState Selected");
				} else {
					test.log(LogStatus.FAIL, "TaxIdentifierState not Selected" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Boolean OtherDetailsSave_btn = driver.findElements(By.id("BtnSaveDetails")).size() != 0;
				System.out.println("OtherDetailsSave_btn" + OtherDetailsSave_btn);
				if (OtherDetailsSave_btn == true) {
				Profile_menu.OtherDetailsSave_btn(driver).click(); 
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "OtherDetailsSave_btn Clicked");
				} else {
				test.log(LogStatus.FAIL, "OtherDetailsSave_btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Boolean iselementpresent = driver.findElements(By.id("btn1")).size() != 0;
				if (iselementpresent == true) 
					{
						System.out.println("Pop Up  exist");
						driver.switchTo().activeElement();
						Profile_menu.Save_btnPopUP(driver).click();
						driver.switchTo().activeElement();
					
						Thread.sleep(5000);
					}
			
		
		
	}

	
}