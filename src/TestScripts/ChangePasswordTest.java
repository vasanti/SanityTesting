package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ChangePWD_Locators;
import Locators.Login_Locator;

public class ChangePasswordTest extends MyEsopsLogin {
	public void ChangePasswordClick (String UserId, String Password, String NewPassword) throws InterruptedException, IOException
	 {
		 Boolean UserLogo = driver.findElements(By.xpath("//div[@id='UserLogo']")).size() != 0;
		 System.out.println("UserLogo" + UserLogo);
		 if (UserLogo == true) {
		 Login_Locator.UserLogo(driver).click();
		 Thread.sleep(1000);
		 test.log(LogStatus.PASS, "UserLogo Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "UserLogo not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		 
		 Boolean ChangePWD = driver.findElements(By.xpath(".//*[@id='lichangepassword']/a")).size() != 0;
		 System.out.println("ChangePWD" + ChangePWD);
		 if (ChangePWD == true) {
		 ChangePWD_Locators.ChangePWD(driver).click();
		 Thread.sleep(1000);
		 test.log(LogStatus.PASS, "ChangePWD Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "ChangePWD not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		 
		 Boolean ChangePWDBtn = driver.findElements(By.xpath("//input[@id='btnChnagePassword']")).size() != 0;
		 System.out.println("ChangePWDBtn" + ChangePWDBtn);
		 if (ChangePWDBtn == true) {
		 ChangePWD_Locators.ChangePWDBtn(driver).click();
		 Thread.sleep(1000);
		 test.log(LogStatus.PASS, "ChangePWDBtn Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "ChangePWDBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		 
		 Boolean ChangePWDCancelBtn = driver.findElements(By.xpath("//button[@id='btnCancel']")).size() != 0;
		 System.out.println("ChangePWDCancelBtn" + ChangePWDCancelBtn);
		 if (ChangePWDCancelBtn == true) {
		 ChangePWD_Locators.ChangePWDCancelBtn(driver).click();
		 Thread.sleep(1000);
		 test.log(LogStatus.PASS, "ChangePWDCancelBtn Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "ChangePWDCancelBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		 
		 Boolean UserLogo1= driver.findElements(By.xpath("//div[@id='UserLogo']")).size() != 0;
		 System.out.println("UserLogo1" + UserLogo1);
		 if (UserLogo1 == true) {
		 Login_Locator.UserLogo(driver).click();
		 test.log(LogStatus.PASS, "UserLogo1 Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "UserLogo1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		 
		 Boolean ChangePWD1 = driver.findElements(By.xpath(".//*[@id='lichangepassword']/a")).size() != 0;
		 System.out.println("ChangePWD1" + ChangePWD1);
		 if (ChangePWD1 == true) {
		 ChangePWD_Locators.ChangePWD(driver).click();
		 Thread.sleep(1000);
		 test.log(LogStatus.PASS, "ChangePWD1 Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "ChangePWD1 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		 
		 Boolean ChangePWDCross = driver.findElements(By.xpath(".//*[@id='btnNoteClose']")).size() != 0;
		 System.out.println("ChangePWDCross" + ChangePWDCross);
		 if (ChangePWDCross == true) {
		 ChangePWD_Locators.ChangePWDCross(driver).click();
		 Thread.sleep(1000);
		 test.log(LogStatus.PASS, "ChangePWDCross Clicked");
	 	 } else {
	 	 test.log(LogStatus.FAIL, "ChangePWDCross not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
	 	 }
		 Boolean UserLogo2 = driver.findElements(By.xpath("//div[@id='UserLogo']")).size() != 0;
		 System.out.println("UserLogo1" + UserLogo2);
		 if (UserLogo2 == true) {
		 Login_Locator.UserLogo(driver).click();
		 Thread.sleep(1000);
		 test.log(LogStatus.PASS, "UserLogo Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "UserLogo not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		 
		 Boolean ChangePWD2 = driver.findElements(By.xpath(".//*[@id='lichangepassword']/a")).size() != 0;
		 System.out.println("ChangePWD1" + ChangePWD2);
		 if (ChangePWD2 == true) {
		 ChangePWD_Locators.ChangePWD(driver).click();
		 Thread.sleep(1000);
		 test.log(LogStatus.PASS, "ChangePWD Clicked");
		 } else {
		 test.log(LogStatus.FAIL, "ChangePWD not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		 }
		 DefaultPWDChange ChangePWDdata=new DefaultPWDChange();
		 ChangePWDdata.defaultPEDChangedata(UserId, Password, NewPassword);
	 }
}