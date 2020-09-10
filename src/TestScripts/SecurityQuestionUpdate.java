package TestScripts;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Login_Locator;
import Locators.SequrityQue_Locators;

public class SecurityQuestionUpdate extends MyEsopsLogin {
		 public void SecurityQuestionUpdated() throws Exception
		{ 
			 	Boolean Que1 = driver.findElements(By.id("txtSecurity_answer1")).size() != 0;
				System.out.println("Que1" + Que1);
				if (Que1 == true) {
				SequrityQue_Locators.Que1(driver).sendKeys("01");
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Que1 01 Entered");
				System.out.println("01");
				} else {
					test.log(LogStatus.FAIL, "Que1 not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
					
				
				Boolean Que2 = driver.findElements(By.id("txtSecurity_answer2")).size() != 0;
				System.out.println("Que2" + Que2);
				if (Que2 == true) {
				SequrityQue_Locators.Que2(driver).sendKeys("01");
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Que2 01 Entered");
				System.out.println("01");
				} else {
					test.log(LogStatus.FAIL, "Que2 not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				Thread.sleep(2000);
				
				Boolean Que3 = driver.findElements(By.id("txtSecurity_answer3")).size() != 0;
				System.out.println("Que3" + Que3);
				if (Que3 == true) {
				SequrityQue_Locators.Que3(driver).sendKeys("01");
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Que3 01 Entered");
				System.out.println("01");
				} else {
					test.log(LogStatus.FAIL, "Que3 not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Boolean Que4 = driver.findElements(By.id("txtSecurity_answer4")).size() != 0;
				System.out.println("Que4" + Que4);
				if (Que4 == true) {
				SequrityQue_Locators.Que4(driver).sendKeys("01");
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Que4 01 Entered");
				System.out.println("01");
				} else {
					test.log(LogStatus.FAIL, "Que4 not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Thread.sleep(2000);
				
				Boolean Que5 = driver.findElements(By.id("txtSecurity_answer5")).size() != 0;
				System.out.println("Que5" + Que5);
				if (Que5 == true) {
				SequrityQue_Locators.Que5(driver).sendKeys("01");
				Thread.sleep(2000);
				test.log(LogStatus.PASS, "Que5 01 Entered");
				System.out.println("01");
				} else {
					test.log(LogStatus.FAIL, "Que5 not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				Thread.sleep(2000);
				
				Boolean BtnSubmit = driver.findElements(By.id("btnSubmit")).size() != 0;
				System.out.println("BtnSubmit" + BtnSubmit);
				if (BtnSubmit == true) {
				SequrityQue_Locators.BtnSubmit(driver).click();
				Thread.sleep(2000);				
				test.log(LogStatus.PASS, "BtnSubmit Clicked");
				driver.switchTo().activeElement();
				} else {
					test.log(LogStatus.FAIL, "BtnSubmit not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
				
				Boolean PopupBtn = driver.findElements(By.id("btn1")).size() != 0;
				System.out.println("PopupBtn" + PopupBtn);
				if (PopupBtn == true) {
				SequrityQue_Locators.PopupBtn(driver).click();
				driver.close();
				Thread.sleep(6000);
				test.log(LogStatus.PASS, "PopupBtn Clicked");
				} else {
					test.log(LogStatus.FAIL, "PopupBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
							}	
		 public void SecurityQuestion()throws Exception
			{ 
			 		Boolean SeqAns1 = driver.findElements(By.id("ctl00_resetPassword_UCAskAuthenticationQuestion_txtAnswer1")).size() != 0;
			 		System.out.println("SeqAns1" + SeqAns1);
			 		if (SeqAns1 == true) {			
					Login_Locator.SeqAns1(driver).sendKeys("01");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, "SeqAns1 01 Entered");
					System.out.println("01");
			 		} else {
						test.log(LogStatus.FAIL, "SeqAns1 not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
					}	
					
					Boolean SeqAns2 = driver.findElements(By.id("ctl00_resetPassword_UCAskAuthenticationQuestion_txtAnswer2")).size() != 0;
			 		System.out.println("SeqAns2" + SeqAns2);
			 		if (SeqAns2 == true) {
					Login_Locator.SeqAns2(driver).sendKeys("01");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, "SeqAns2 01 Entered");
					System.out.println("01");
			 		} else {
						test.log(LogStatus.FAIL, "SeqAns2 not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
					}
					Thread.sleep(2000);
					
					Boolean SubmitAns = driver.findElements(By.id("ctl00_resetPassword_UCAskAuthenticationQuestion_btnCheckAnswers")).size() != 0;
			 		System.out.println("SubmitAns" + SubmitAns);
			 		if (SubmitAns == true) {
					Login_Locator.SubmitAns(driver).click();
					test.log(LogStatus.PASS, "SubmitAns Clicked");
					} else {
						test.log(LogStatus.FAIL, "SubmitAns not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
					}
					Thread.sleep(2000);	
					
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

