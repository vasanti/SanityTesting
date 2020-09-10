package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ChangePWD_Locators;

public class ChangePassword extends MyEsopsLogin{
 

 public void DefaultChangePWD(String UserId, String Password, String NewPassword) throws InterruptedException, IOException
 {
	 ChangePWD_Locators.OldPassword(driver).sendKeys(Password);
		Thread.sleep(2000);

		ChangePWD_Locators.NewPassword(driver).sendKeys(NewPassword);
		Thread.sleep(2000);

		waitfor.until(ChangePWD_Locators.ConfirmPassword(driver)).sendKeys(NewPassword);
		Thread.sleep(2000);

		boolean ChangePassword_btnclk = ChangePWD_Locators.ChangePassword_btn(driver).isEnabled();
		if (ChangePassword_btnclk == true) {
			waitfor.until(ChangePWD_Locators.ChangePassword_btn(driver)).click();
			Thread.sleep(2000);

		
			driver.switchTo().activeElement();
			String alerttext=driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div/div/div/div/div[3]/div/div|//div[contains(text(),'Old Password and New Password should not be same !')] ")).getText();
			System.out.println("alerttext : "+alerttext);
			if(alerttext.equals("Unable to change to new password. Password not meet the specifications. Refer to Notes."))
			{
				System.out.println("Unable to change to new password. Password not meet the specifications. Refer to Notes.");
				CloseBrowser CloseBr=new CloseBrowser();
				CloseBr.CloseBrowser1();
			}
			else if(alerttext.equals("Old Password is not valid !"))
			{
				System.out.println("Please check Old Password");
				// popuptext=old n new pwd same then add 1 to pwd
			
			}
			else if(alerttext.equals("Old Password and New Password should not be same !"))
			{
				System.out.println("Old Password and New Password should not be same !");
				ChangePWD_Locators.PopupBtn(driver).click();
				Thread.sleep(6000);
				 Boolean ChangePWDCancelBtn = driver.findElements(By.xpath("//button[@id='btnCancel']")).size() != 0;
				 System.out.println("ChangePWDCancelBtn" + ChangePWDCancelBtn);
				 if (ChangePWDCancelBtn == true) {
				 ChangePWD_Locators.ChangePWDCancelBtn(driver).click();
				 Thread.sleep(1000);
				 test.log(LogStatus.PASS, "ChangePWDCancelBtn Clicked");
				 } else {
				 test.log(LogStatus.FAIL, "ChangePWDCancelBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				 }
				CloseBrowser CloseBr=new CloseBrowser();
				CloseBr.CloseBrowser1();
			}
			else if(alerttext.equals("Password changed successfully. You are required to re-login with the new password.")){
				System.out.println("Password changed successfully. You are required to re-login with the new password.");
			
			}
			else
			{
				System.out.println("Something went wrong");
				CloseBrowser CloseBr=new CloseBrowser();
				CloseBr.CloseBrowser1();
			}
				ChangePWD_Locators.PopupBtn(driver).click();
			Thread.sleep(6000);
 }
 }
		}

