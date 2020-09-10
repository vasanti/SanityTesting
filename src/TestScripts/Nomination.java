package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.NominationDetails_Locators;

public class Nomination extends MyEsopsLogin {

	public void NominationClick() throws Exception
	{ 
		
		Boolean Logo = driver.findElements(By.id("UserLogo")).size() != 0;
		System.out.println("Logo" + Logo);
		if (Logo == true) 
		{
		NominationDetails_Locators.Logo(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Logo Clicked");
		}
		else {
		test.log(LogStatus.FAIL, "Logo not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean Nomination_menu = driver.findElements(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li[3]/ul/li[2]/a")).size() != 0;
		System.out.println("Nomination_menu" + Nomination_menu);
		if (Nomination_menu == true) 
		{
		NominationDetails_Locators.Nomination_menu(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Nomination_menu Clicked");
		}
		else {
		test.log(LogStatus.FAIL, "Nomination_menu not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		//========================= FLOW 1 ========================
		
		Boolean Close_icon_Notes = driver.findElements(By.xpath(".//*[@id='aspnetForm']/div[6]/div/div/div/div[2]/div/div/button")).size() != 0;
		System.out.println("Close_icon_Notes" + Close_icon_Notes);
		if (Close_icon_Notes == true) 
		{
		NominationDetails_Locators.Close_icon_Notes(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Close_icon_Notes Clicked");
		}
		else {
		test.log(LogStatus.FAIL, "Close_icon_Notes not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean Notes = driver.findElements(By.xpath(".//*[@id='aspnetForm']/div[6]/div/div/div/div[1]/div[2]/div/button")).size() != 0;
		System.out.println("Notes" + Notes);
		if (Notes == true) 
		{
		NominationDetails_Locators.Notes(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Notes Clicked");
		}
		else {
		test.log(LogStatus.FAIL, "Notes not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		//========================= FLOW 2 ========================
		
		Boolean AddNominee = driver.findElements(By.xpath(".//*[@id='add-nominee']/div/div/i")).size() != 0;
		Thread.sleep(2000);
		System.out.println("AddNominee " +AddNominee);
		if(AddNominee==true)
		{
					Thread.sleep(2000);
					NominationDetails_Locators.Plus_icon_AddNominee(driver).click();
					Thread.sleep(2000);
					test.log(LogStatus.PASS, "Plus_icon_AddNominee Clicked");
					List<WebElement> DOB_Nominee = driver.findElements(By.id("txtDOB"));
					
					for (WebElement input : DOB_Nominee) {
					    ((JavascriptExecutor) driver).executeScript(
					                "arguments[0].removeAttribute('readonly','readonly')",input);
					}
		}
		else {
		test.log(LogStatus.FAIL, "Plus_icon_AddNominee not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean AddNominee_Close_icon = driver.findElements(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li[3]/ul/li[2]/a")).size() != 0;
		System.out.println("AddNominee_Close_icon" + AddNominee_Close_icon);
		if (AddNominee_Close_icon == true) 
		{
		NominationDetails_Locators.AddNominee_Close_icon(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "AddNominee_Close_icon Clicked");
		}
		else {
		test.log(LogStatus.FAIL, "AddNominee_Close_icon not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		//========================= FLOW 3 ========================
		NomineeDetails NominationClk=new NomineeDetails();
		NominationClk.NominationClickCur();
		
		GaurdianDetails GaurdianClk=new GaurdianDetails();
		GaurdianClk.GaurdianClick();
		
		Boolean AddNominee_Cancel_btn = driver.findElements(By.xpath(".//*[@id='btnCancelAdd']")).size() != 0;
		System.out.println("AddNominee_Cancel_btn" + AddNominee_Cancel_btn);
		if (AddNominee_Cancel_btn == true) {
		NominationDetails_Locators.AddNominee_Cancel_btn(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "AddNominee_Cancel_btn Clicked");
		} else {
		test.log(LogStatus.FAIL, "AddNominee_Cancel_btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		//========================= FLOW 4 ========================
		NomineeDetails NominationClk1=new NomineeDetails();
		NominationClk1.NominationClickOld();
		
		Boolean AddNominee_Save_btn = driver.findElements(By.id("btnAddNow")).size() != 0;
		System.out.println("AddNominee_Save_btn" + AddNominee_Save_btn);
		if (AddNominee_Save_btn == true) {
		NominationDetails_Locators.AddNominee_Save_btn(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "AddNominee_Save_btn Clicked");
		} else {
		test.log(LogStatus.FAIL, "AddNominee_Save_btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		//========================= FLOW 5 ========================
		NomineeDetails NominationClk2=new NomineeDetails();
		NominationClk2.NominationClickOld();
		
		Boolean EditNominee_Cancel_btn = driver.findElements(By.xpath("//button[@id='BtnCancel']")).size() != 0;
		System.out.println("EditNominee_Cancel_btn" + EditNominee_Cancel_btn);
		if (EditNominee_Cancel_btn == true) {
		NominationDetails_Locators.EditNominee_Cancel_btn(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "EditNominee_Cancel_btn Clicked");
		} else {
		test.log(LogStatus.FAIL, "EditNominee_Cancel_btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		//========================= FLOW 6 ========================
		NomineeDetails NominationClk3=new NomineeDetails();
		NominationClk3.NominationClickOld();
		
		Boolean UpdateNominee = driver.findElements(By.id("EditNow")).size() != 0;
		System.out.println("UpdateNominee" + UpdateNominee);
		if (UpdateNominee == true) 
		{
		NominationDetails_Locators.EditNomineeName(driver).click();
		Thread.sleep(1000);
		NominationDetails_Locators.UpdateNominee(driver).click();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "UpdateNominee Clicked");
		} else {
		test.log(LogStatus.FAIL, "UpdateNominee not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		//========================= FLOW 7 ========================
		NomineeDetails NominationClk4=new NomineeDetails();
		NominationClk4.NominationClickCur();
		
		Boolean UpdateNominee1 = driver.findElements(By.id("EditNow")).size() != 0;
		System.out.println("UpdateNominee1" + UpdateNominee1);
		if (UpdateNominee1 == true) 
		{
		NominationDetails_Locators.EditNomineeName(driver).click();
		Thread.sleep(1000);
		NominationDetails_Locators.UpdateNominee(driver).click();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS, "UpdateNominee Clicked");
		} else {
		test.log(LogStatus.FAIL, "UpdateNominee not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
		//========================= FLOW 8 ========================
	
		
		NomineeDetails NominationClk5=new NomineeDetails();
		NominationClk5.NominationClickNew();
		
		Boolean AddNominee_Save_btn2 = driver.findElements(By.id("btnAddNow")).size() != 0;
		System.out.println("AddNominee_Save_btn2" + AddNominee_Save_btn2);
		if (AddNominee_Save_btn2 == true) {
		NominationDetails_Locators.AddNominee_Save_btn(driver).click();
		Thread.sleep(1000);
		test.log(LogStatus.PASS, "AddNominee_Save_btn Clicked");
		} else {
		test.log(LogStatus.FAIL, "AddNominee_Save_btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean EditNominee1 = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button")).size() != 0;
		System.out.println("EditNominee1" + EditNominee1);
		if (EditNominee1 == true) 
		{
		NominationDetails_Locators.EditNominee2(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "EditNominee Clicked");
		}
		else {
		test.log(LogStatus.FAIL, "EditNominee not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DeleteNominee1 = driver.findElements(By.id("EditNow")).size() != 0;
		System.out.println("DeleteNominee1" + DeleteNominee1);
		if (DeleteNominee1 == true) 
		{
		NominationDetails_Locators.DeleteNominee(driver).click();
		test.log(LogStatus.PASS, "DeleteNominee Clicked");
		Boolean DeleteAccept = driver.findElements(By.id("btn1")).size() != 0;
		Thread.sleep(2000);
		if(DeleteAccept==true)
		{
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(2000);
		System.out.println("Record 2 deleted");
		Thread.sleep(2000);
		}
		} else {
		test.log(LogStatus.FAIL, "DeleteNominee not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		
			//========================= FLOW 9 ========================
		NominationDetails_Locators.Logo(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Logo Clicked");
		NominationDetails_Locators.Nomination_menu(driver).click();
		Thread.sleep(2000);
		
		
		Boolean EditNominee = driver.findElements(By.xpath("/html[1]/body[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")).size() != 0;
		System.out.println("EditNominee" + EditNominee);
		if (EditNominee == true) 
		{
		NominationDetails_Locators.EditNominee(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "EditNominee Clicked");
		}
		else {
		test.log(LogStatus.FAIL, "EditNominee not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		
		Boolean DeleteNominee = driver.findElements(By.id("EditNow")).size() != 0;
		System.out.println("DeleteNominee" + DeleteNominee);
		if (DeleteNominee == true) 
		{
		NominationDetails_Locators.DeleteNominee(driver).click();
		test.log(LogStatus.PASS, "DeleteNominee Clicked");
		Boolean DeleteAccept = driver.findElements(By.id("btn1")).size() != 0;
		Thread.sleep(2000);
		if(DeleteAccept==true)
		{
		driver.findElement(By.id("btn1")).click();
		}
		} else {
		test.log(LogStatus.FAIL, "DeleteNominee not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
			

	}
}