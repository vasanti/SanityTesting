package TestScripts;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Login_Locator;

public class SecurityQuestion  extends MyEsopsLogin {
	
	 public void SecurityQuestionAns(String Ans1,String Ans2)throws Exception
	{ 
		 	Boolean SeqAns1 = driver.findElements(By.id("ctl00_resetPassword_UCAskAuthenticationQuestion_txtAnswer1")).size() != 0;
			System.out.println("SeqAns1" + SeqAns1);
			if (SeqAns1 == true) {
			Login_Locator.SeqAns1(driver).sendKeys(Ans1);
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "SeqAns1 "+Ans1+" Entered");
			} else {
				test.log(LogStatus.FAIL, "SeqAns1 not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			System.out.println(Ans2);	
			
			Boolean SeqAns2 = driver.findElements(By.id("ctl00_resetPassword_UCAskAuthenticationQuestion_txtAnswer2")).size() != 0;
			System.out.println("SeqAns2" + SeqAns2);
			if (SeqAns2 == true) {
			Login_Locator.SeqAns2(driver).sendKeys(Ans2);
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "SeqAns2 "+Ans2+"Entered");
			} else {
				test.log(LogStatus.FAIL, "SeqAns2 not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			System.out.println(Ans2);
			
			Boolean SubmitAns = driver.findElements(By.id("ctl00_resetPassword_UCAskAuthenticationQuestion_btnCheckAnswers")).size() != 0;
			System.out.println("SubmitAns" + SubmitAns);
			if (SubmitAns == true) {
			Login_Locator.SubmitAns(driver).click();
			Thread.sleep(2000);	
			test.log(LogStatus.PASS, "SubmitAns Clicked");
			} else {
				test.log(LogStatus.FAIL, "SubmitAns not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean iselementpresent2 = driver.findElements(By.id("btn1")).size() != 0;
			if (iselementpresent2 == true)			
			{
				System.out.println("Pop Up  exist");		
			driver.switchTo().activeElement();
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "Pop Up exist");
			}
			else {
			test.log(LogStatus.FAIL, "Pop Up does not exist" + test.addScreenCapture(Screenshot.captureImage(driver)));
	}		
		}
}