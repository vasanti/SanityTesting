package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.NominationDetails_Locators;

public class NomineeDetails  extends MyEsopsLogin
{
	
	public void NominationClickCur() throws Exception
	{ 
		//======================calculate age is under 18 or over 18======================
			
					Boolean AddNominee = driver.findElements(By.xpath(".//*[@id='add-nominee']/div/div/i")).size() != 0;
					Thread.sleep(2000);
					Boolean editnominee = driver.findElements(By.xpath("html/body/form/div[6]/div/div/div/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button")).size() != 0;
					Thread.sleep(2000);
					if (editnominee == true)
		{
					Thread.sleep(2000);
					NominationDetails_Locators.EditNominee(driver).click();
					Thread.sleep(2000);
					test.log(LogStatus.PASS, "EditNominee Clicked");
					
		
					List<WebElement> DOB_Nominee = driver.findElements(By.id("txtDOBNominee"));
		
					for (WebElement input : DOB_Nominee) {
				    ((JavascriptExecutor) driver).executeScript(
				                "arguments[0].removeAttribute('readonly','readonly')",input);
			}			
		
					Boolean EditNomineeName = driver.findElements(By.id("txtNameOfNominee")).size() != 0;
					System.out.println("EditNomineeName" + EditNomineeName);
					if (EditNomineeName == true) 
					{
					Thread.sleep(2000);
					NominationDetails_Locators.EditNomineeName(driver).clear();
					NominationDetails_Locators.EditNomineeName(driver).sendKeys("Vasanti");
					test.log(LogStatus.PASS, "EditNomineeName Entered");
					}
					else {
					test.log(LogStatus.FAIL, "EditNomineeName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
					}
					
					Boolean EditNominee_DateOfBirth = driver.findElements(By.id("txtDOBNominee")).size() != 0;
					System.out.println("EditNominee_DateOfBirth" + EditNominee_DateOfBirth);
					if (EditNominee_DateOfBirth == true) 
					{
					Thread.sleep(2000);
					NominationDetails_Locators.EditNominee_DateOfBirth(driver).clear();
					NominationDetails_Locators.EditNominee_DateOfBirth(driver).sendKeys("23-oct-1999");
					test.log(LogStatus.PASS, "EditNominee_DateOfBirth Entered");
					}
					else
					{
					test.log(LogStatus.FAIL, "EditNominee_DateOfBirth not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
					}
					
					Boolean EditPercentOfShare = driver.findElements(By.id("txtPercentShare")).size() != 0;
					System.out.println("EditPercentOfShare" + EditPercentOfShare);
					if (EditPercentOfShare == true) 
					{				
					NominationDetails_Locators.EditPercentOfShare(driver).clear();
					NominationDetails_Locators.EditPercentOfShare(driver).sendKeys("55");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, "EditPercentOfShare Entered");
					} else {
					test.log(LogStatus.FAIL, "EditPercentOfShare not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
					}
					
					Boolean EditNomineeAddress = driver.findElements(By.id("txtNomineeAdreess")).size() != 0;
					System.out.println("EditNomineeAddress" + EditNomineeAddress);
					if (EditNomineeAddress == true) {
					NominationDetails_Locators.EditNomineeAddress(driver).clear();
					NominationDetails_Locators.EditNomineeAddress(driver).sendKeys("Pune");
					Thread.sleep(2000);
					test.log(LogStatus.PASS, "EditNomineeAddress Clicked");
					} else {
					test.log(LogStatus.FAIL, "EditNomineeAddress not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
					}

}

					
					else if(AddNominee==true)
					{
								Thread.sleep(2000);
								NominationDetails_Locators.Plus_icon_AddNominee(driver).click();
								Thread.sleep(2000);
								List<WebElement> DOB_Nominee = driver.findElements(By.id("txtDOB"));
								
								for (WebElement input : DOB_Nominee) {
								    ((JavascriptExecutor) driver).executeScript(
								                "arguments[0].removeAttribute('readonly','readonly')",input);
								}
							Boolean NomineeName = driver.findElements(By.id("txtNomineeName")).size() != 0;
								System.out.println("NomineeName" + NomineeName);
								if (NomineeName == true) {
								NominationDetails_Locators.NomineeName(driver).click();
								NominationDetails_Locators.NomineeName(driver).clear();
								NominationDetails_Locators.NomineeName(driver).sendKeys("Pune");
								Thread.sleep(2000);
								test.log(LogStatus.PASS, "NomineeName Entered");
								} else {
								test.log(LogStatus.FAIL, "NomineeName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
								}
								
								Boolean AddNominee_DateOfBirth = driver.findElements(By.id("txtDOB")).size() != 0;
								System.out.println("AddNominee_DateOfBirth" + AddNominee_DateOfBirth);
								if (AddNominee_DateOfBirth == true) {
									    NominationDetails_Locators.AddNominee_DateOfBirth(driver).clear();
									NominationDetails_Locators.AddNominee_DateOfBirth(driver).sendKeys("15-Dec-2019");
									Thread.sleep(1000);							
								
								test.log(LogStatus.PASS, "AddNominee_DateOfBirth Entered");
								}
								else {
								test.log(LogStatus.FAIL, "AddNominee_DateOfBirth not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
								}
								
								Boolean PercentOfShare = driver.findElements(By.id("txtShare")).size() != 0;
								System.out.println("PercentOfShare" + PercentOfShare);
								if (PercentOfShare == true) {					
								NominationDetails_Locators.PercentOfShare(driver).clear();
								NominationDetails_Locators.PercentOfShare(driver).sendKeys("50");
								test.log(LogStatus.PASS, "PercentOfShare Entered");
								} else {
								test.log(LogStatus.FAIL, "PercentOfShare not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
								}
								
								Boolean NomineeAddress = driver.findElements(By.id("txtNomineeAddress")).size() != 0;
								System.out.println("NomineeAddress" + NomineeAddress);
								if (NomineeAddress == true) {
								Thread.sleep(1000);
								NominationDetails_Locators.NomineeAddress(driver).clear();
								NominationDetails_Locators.NomineeAddress(driver).sendKeys("Pune");
								Thread.sleep(2000);
								test.log(LogStatus.PASS, "NomineeAddress Entered");
								} else {
								test.log(LogStatus.FAIL, "NomineeAddress not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
								}
						}	
					}	
					
					public void NominationClickOld() throws Exception
					{ 
						//======================calculate age is under 18 or over 18======================
									
									Boolean AddNominee = driver.findElements(By.xpath(".//*[@id='add-nominee']/div/div/i")).size() != 0;
									Thread.sleep(2000);
									Boolean editnominee = driver.findElements(By.xpath("html/body/form/div[6]/div/div/div/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button")).size() != 0;
									Thread.sleep(2000);
									if (editnominee == true)
						{
									Thread.sleep(2000);
									NominationDetails_Locators.EditNominee(driver).click();
									Thread.sleep(2000);
									test.log(LogStatus.PASS, "EditNominee Clicked");
									
						
									List<WebElement> DOB_Nominee = driver.findElements(By.id("txtDOBNominee"));
						
									for (WebElement input : DOB_Nominee) {
								    ((JavascriptExecutor) driver).executeScript(
								                "arguments[0].removeAttribute('readonly','readonly')",input);
							}			
						
									Boolean EditNomineeName = driver.findElements(By.id("txtNameOfNominee")).size() != 0;
									System.out.println("EditNomineeName" + EditNomineeName);
									if (EditNomineeName == true) 
									{
									Thread.sleep(2000);
									NominationDetails_Locators.EditNomineeName(driver).clear();
									NominationDetails_Locators.EditNomineeName(driver).sendKeys("Vasanti");
									test.log(LogStatus.PASS, "EditNomineeName Entered");
									}
									else {
									test.log(LogStatus.FAIL, "EditNomineeName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
									}
									
									Boolean EditNominee_DateOfBirth = driver.findElements(By.id("txtDOBNominee")).size() != 0;
									System.out.println("EditNominee_DateOfBirth" + EditNominee_DateOfBirth);
									if (EditNominee_DateOfBirth == true) 
									{
									Thread.sleep(2000);
									NominationDetails_Locators.EditNominee_DateOfBirth(driver).clear();
									NominationDetails_Locators.EditNominee_DateOfBirth(driver).sendKeys("07-Jul-1999");
									test.log(LogStatus.PASS, "EditNominee_DateOfBirth Entered");
									}
									else
									{
									test.log(LogStatus.FAIL, "EditNominee_DateOfBirth not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
									}
									
									Boolean EditPercentOfShare = driver.findElements(By.id("txtPercentShare")).size() != 0;
									System.out.println("EditPercentOfShare" + EditPercentOfShare);
									if (EditPercentOfShare == true) 
									{				
									NominationDetails_Locators.EditPercentOfShare(driver).clear();
									NominationDetails_Locators.EditPercentOfShare(driver).sendKeys("100");
									Thread.sleep(2000);
									test.log(LogStatus.PASS, "EditPercentOfShare Entered");
									} else {
									test.log(LogStatus.FAIL, "EditPercentOfShare not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
									}
									
									Boolean EditNomineeAddress = driver.findElements(By.id("txtNomineeAdreess")).size() != 0;
									System.out.println("EditNomineeAddress" + EditNomineeAddress);
									if (EditNomineeAddress == true) {
									NominationDetails_Locators.EditNomineeAddress(driver).clear();
									NominationDetails_Locators.EditNomineeAddress(driver).sendKeys("Pune");
									Thread.sleep(2000);
									test.log(LogStatus.PASS, "EditNomineeAddress Clicked");
									} else {
									test.log(LogStatus.FAIL, "EditNomineeAddress not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
									}

				}

									
									else if(AddNominee==true)
									{
												Thread.sleep(2000);
												NominationDetails_Locators.Plus_icon_AddNominee(driver).click();
												Thread.sleep(2000);
												List<WebElement> DOB_Nominee = driver.findElements(By.id("txtDOB"));
												
												for (WebElement input : DOB_Nominee) {
												    ((JavascriptExecutor) driver).executeScript(
												                "arguments[0].removeAttribute('readonly','readonly')",input);
												}
											Boolean NomineeName = driver.findElements(By.id("txtNomineeName")).size() != 0;
												System.out.println("NomineeName" + NomineeName);
												if (NomineeName == true) {
												NominationDetails_Locators.NomineeName(driver).click();
												NominationDetails_Locators.NomineeName(driver).clear();
												NominationDetails_Locators.NomineeName(driver).sendKeys("Pune");
												Thread.sleep(2000);
												test.log(LogStatus.PASS, "NomineeName Entered");
												} else {
												test.log(LogStatus.FAIL, "NomineeName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
												}
												
												Boolean AddNominee_DateOfBirth = driver.findElements(By.id("txtDOB")).size() != 0;
												System.out.println("AddNominee_DateOfBirth" + AddNominee_DateOfBirth);
												if (AddNominee_DateOfBirth == true) {
													    NominationDetails_Locators.AddNominee_DateOfBirth(driver).clear();
													NominationDetails_Locators.AddNominee_DateOfBirth(driver).sendKeys("07-07-1999");
													Thread.sleep(1000);							
												
												test.log(LogStatus.PASS, "AddNominee_DateOfBirth Entered");
												}
												else {
												test.log(LogStatus.FAIL, "AddNominee_DateOfBirth not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
												}
												
												Boolean PercentOfShare = driver.findElements(By.id("txtShare")).size() != 0;
												System.out.println("PercentOfShare" + PercentOfShare);
												if (PercentOfShare == true) {					
												NominationDetails_Locators.PercentOfShare(driver).clear();
												NominationDetails_Locators.PercentOfShare(driver).sendKeys("50");
												test.log(LogStatus.PASS, "PercentOfShare Entered");
												} else {
												test.log(LogStatus.FAIL, "PercentOfShare not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
												}
												
												Boolean NomineeAddress = driver.findElements(By.id("txtNomineeAddress")).size() != 0;
												System.out.println("NomineeAddress" + NomineeAddress);
												if (NomineeAddress == true) {
												Thread.sleep(1000);
												NominationDetails_Locators.NomineeAddress(driver).clear();
												NominationDetails_Locators.NomineeAddress(driver).sendKeys("Pune");
												Thread.sleep(2000);
												test.log(LogStatus.PASS, "NomineeAddress Entered");
												} else {
												test.log(LogStatus.FAIL, "NomineeAddress not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
												}
									}	
									}	
									
					public void NominationClickNew() throws Exception
					{ 
						//======================calculate age is under 18 or over 18======================
													
						Boolean AddNominee = driver.findElements(By.xpath(".//*[@id='add-nominee']/div/div/i")).size() != 0;
						Thread.sleep(2000);
						 if(AddNominee==true)
							{
										Thread.sleep(2000);
										NominationDetails_Locators.Plus_icon_AddNominee(driver).click();
										Thread.sleep(2000);
										List<WebElement> DOB_Nominee = driver.findElements(By.id("txtDOB"));
										
										for (WebElement input : DOB_Nominee) {
										    ((JavascriptExecutor) driver).executeScript(
										                "arguments[0].removeAttribute('readonly','readonly')",input);
										}
									Boolean NomineeName = driver.findElements(By.id("txtNomineeName")).size() != 0;
										System.out.println("NomineeName" + NomineeName);
										if (NomineeName == true) {
										NominationDetails_Locators.NomineeName(driver).click();
										NominationDetails_Locators.NomineeName(driver).clear();
										NominationDetails_Locators.NomineeName(driver).sendKeys("Pune");
										Thread.sleep(2000);
										test.log(LogStatus.PASS, "NomineeName Entered");
										} else {
										test.log(LogStatus.FAIL, "NomineeName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
										}
										
										Boolean AddNominee_DateOfBirth = driver.findElements(By.id("txtDOB")).size() != 0;
										System.out.println("AddNominee_DateOfBirth" + AddNominee_DateOfBirth);
										if (AddNominee_DateOfBirth == true) {
											    NominationDetails_Locators.AddNominee_DateOfBirth(driver).clear();
											NominationDetails_Locators.AddNominee_DateOfBirth(driver).sendKeys("07-07-1999");
											Thread.sleep(1000);							
										
										test.log(LogStatus.PASS, "AddNominee_DateOfBirth Entered");
										}
										else {
										test.log(LogStatus.FAIL, "AddNominee_DateOfBirth not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
										}
										
										Boolean PercentOfShare = driver.findElements(By.id("txtShare")).size() != 0;
										System.out.println("PercentOfShare" + PercentOfShare);
										if (PercentOfShare == true) {					
										NominationDetails_Locators.PercentOfShare(driver).clear();
										NominationDetails_Locators.PercentOfShare(driver).sendKeys("65");
										
										NominationDetails_Locators.NomineeAddress(driver).clear();
										
										NominationDetails_Locators.PercentOfShare(driver).getText();
										NominationDetails_Locators.PercentOfShare(driver).clear();
										NominationDetails_Locators.PercentOfShare(driver).sendKeys("45"); 
										test.log(LogStatus.PASS, "PercentOfShare Entered");
										} else {
										test.log(LogStatus.FAIL, "PercentOfShare not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
										}
										
										Boolean NomineeAddress = driver.findElements(By.id("txtNomineeAddress")).size() != 0;
										System.out.println("NomineeAddress" + NomineeAddress);
										if (NomineeAddress == true) {
										Thread.sleep(1000);
										NominationDetails_Locators.NomineeAddress(driver).clear();
										NominationDetails_Locators.NomineeAddress(driver).sendKeys("Pune");
										Thread.sleep(2000);
										test.log(LogStatus.PASS, "NomineeAddress Entered");
										} else {
										test.log(LogStatus.FAIL, "NomineeAddress not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
										}
									
							}
						
		}
}