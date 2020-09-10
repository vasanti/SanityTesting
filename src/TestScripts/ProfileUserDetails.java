package TestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Profile_menu;

public class ProfileUserDetails extends MyEsopsLogin {
	
	 public void UserDetails() throws Exception
	{ 
	 
		 	Boolean UserLogo = driver.findElements(By.id("UserLogo")).size() != 0;
	 		System.out.println("UserLogo" + UserLogo);
	 		if (UserLogo == true) {
			Profile_menu.UserLogo(driver).click();
			test.log(LogStatus.PASS, "UserLogo Clicked");
			} else {
				test.log(LogStatus.FAIL, "UserLogo not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
	 		
	 		Boolean Profile = driver.findElements(By.linkText("Profile")).size() != 0;
	 		System.out.println("Profile" + Profile);
	 		if (Profile == true) {
			Profile_menu.Profile(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Profile Clicked");
			} else {
				test.log(LogStatus.FAIL, "Profile not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
	 		
			Boolean UserDetails = driver.findElements(By.id("UserDetails")).size() != 0;
	 		System.out.println("UserDetails" + UserDetails);
	 		if (UserDetails == true) {
			Profile_menu.UserDetails(driver).click();
			Thread.sleep(100);
			test.log(LogStatus.PASS, "UserDetails Clicked");
			} else {
				test.log(LogStatus.FAIL, "UserDetails not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
	 		
			Boolean Cancel_btn = driver.findElements(By.id("BtnCancelUserDetails")).size() != 0;
	 		System.out.println("Cancel_btn" + Cancel_btn);
	 		if (Cancel_btn == true) {
			Profile_menu.Cancel_btn(driver).click();
			Thread.sleep(100);
			test.log(LogStatus.PASS, "Cancel_btn Clicked");
			} else {
				test.log(LogStatus.FAIL, "Cancel_btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
	 		
		/*	if(Profile_menu.DateOfJoining(driver).isEnabled())
			{
				Profile_menu.DateOfJoining(driver).clear();
	Profile_menu.DateOfJoining(driver).sendKeys("01/01/2015");

			}	*/
			
			if(Profile_menu.Grade(driver).isEnabled())
			{
			Profile_menu.Grade(driver).clear();
			Profile_menu.Grade(driver).sendKeys("A");
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Grade Entered");
			}
			else {
			test.log(LogStatus.FAIL, "Grade not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			if(Profile_menu.FathersName(driver).isEnabled())
			{
				
			Profile_menu.FathersName(driver).clear();
			Profile_menu.FathersName(driver).sendKeys("XYZ");
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "FatherName Entered");
			}
			else {
			test.log(LogStatus.FAIL, "FatherName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			if(Profile_menu.CountryName_ddl(driver).isEnabled())
			{
			WebElement element1=Profile_menu.CountryName_ddl(driver);
			Select option1=new Select(element1);
			option1.selectByVisibleText("India");
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "ContryName Selected");
			}
			else {
			test.log(LogStatus.FAIL, "ContryName not Selected" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			if(Profile_menu.ContactNumber(driver).isEnabled())
			{
			Profile_menu.ContactNumber(driver).clear();
			Profile_menu.ContactNumber(driver).sendKeys("324234324234");
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "ContactNumber Entered");
			}
			else {
			test.log(LogStatus.FAIL, "ContactNumber not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			if(Profile_menu.Email(driver).isEnabled())
			{
			Profile_menu.Email(driver).clear();
			Profile_menu.Email(driver).sendKeys("xyz@xyz.com");
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Email Entered");
			}
			else {
			test.log(LogStatus.FAIL, "Email not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			if(Profile_menu.Designation(driver).isEnabled())
			{
			Profile_menu.Designation(driver).clear();
			Profile_menu.Designation(driver).sendKeys("QA");
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Designation Entered");
			}
			else {
			test.log(LogStatus.FAIL, "Designation not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			if(Profile_menu.Address	(driver).isEnabled())
			{
			Profile_menu.Address(driver).clear();
			Profile_menu.Address(driver).sendKeys("Aundh,Pune");
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Address Entered");
			}
			else {
			test.log(LogStatus.FAIL, "Address not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		
			Boolean Save_btn = driver.findElements(By.id("btnSave")).size() != 0;
	 		System.out.println("Save_btn" + Save_btn);
	 		if (Save_btn == true) {
	 		Profile_menu.Save_btn(driver).click();
	 		Thread.sleep(5000);
	 		test.log(LogStatus.PASS, "Save_btn Clicked");
			} else {
				test.log(LogStatus.FAIL, "Save_btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
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
