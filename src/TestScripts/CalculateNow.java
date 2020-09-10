package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locators;

public class CalculateNow extends ExerciseNow {
	String Path;
	String AvailableExerciseQuantity = null;
	int AvailableExerciseQuantity0, ExerciseNowQtyInt;
	String newStr, newStr1, newStr2, newStr3, MIT_ID;
	int ActualExerciseQuantity=1;
			int ActualExerciseQuantity1, ActualExerciseQuantity2;
	int MIT_IDInt;
	public void CalculateNowData(String MIT_ID,String InstrumentsValueActual) throws IOException, Exception {
		MIT_IDInt = Integer.parseInt(MIT_ID);
		System.out.println(MIT_ID);
		
		WebElement ExerciseNow_Table = ExerciseNow_Locators.ExerciseNowGrid(driver, MIT_ID);
		System.out.println("ExerciseNow_Table" + ExerciseNow_Table);

		List<WebElement> ExerciseNow_TotalRows = ExerciseNow_Table.findElements(By.tagName("tr"));
		int ExerciseNow_rowCount = (ExerciseNow_TotalRows.size()) - 1;
		System.out.println("Total Number of Rows are: " + ExerciseNow_rowCount);
		Thread.sleep(5000);

		// Fetch Total Column Count
		List<WebElement> ExerciseNow_TotalCols = ExerciseNow_Table.findElements(By.tagName("th"));
		int ExerciseNow_colCount = ExerciseNow_TotalCols.size();
		System.out.println("Total Number of Columns are: " + ExerciseNow_colCount + "\n");
		Thread.sleep(5000);

		if (ExerciseNow_rowCount == -1) {
			System.out.println("ExerciseNow data not available");
			Thread.sleep(5000);
			test.log(LogStatus.PASS, "ExerciseNow data not available");
		} else if (ExerciseNow_rowCount >= -1) {
			
			test.log(LogStatus.PASS, "ExerciseNow data  available");
			//for one row we are checking if need to check for all rows then facing one issue because wrong data on front end.
			//		for (int j = 1; j < ExerciseNow_rowCount; j++) {
				//	for (int j = 1; j < 2; j++) {
			for (int i = 0; i < 1; i++) {

				if (MIT_ID.equals("5") | MIT_ID.equals("7")) {
					AvailableExerciseQuantity = driver
							.findElement(By.xpath(".//*[@id='Instrmnt" + MIT_ID + "id" + i + "']/td[9]/p")).getText();

				} else {
					AvailableExerciseQuantity = driver
							.findElement(By.xpath(".//*[@id='Instrmnt" + MIT_ID + "id" + i + "']/td[7]/p")).getText();
				}
				System.out.println("AvailableExerciseQuantity" + AvailableExerciseQuantity);
				String AvailableExerciseQuantityStr = AvailableExerciseQuantity.replaceAll("[^0-9]", "");

				AvailableExerciseQuantity0 = Integer.parseInt(AvailableExerciseQuantityStr);
				if (AvailableExerciseQuantity0 > 0) {
					System.out.println("AvailableExerciseQuantity=" + AvailableExerciseQuantity0);
					test.log(LogStatus.PASS, "ExerciseQuantity Available");

						WebElement ExerciseQuantity = driver
								.findElement(By.xpath(".//*[@id='Instrmnt" + MIT_ID + "exerciseQuantityID" + i + "']"));
						Thread.sleep(3000);
					
						newStr3 = "1";
						ActualExerciseQuantity=Integer.parseInt(newStr3);
						waitfor.until(ExerciseQuantity).sendKeys(newStr3);
						Thread.sleep(2000);
						
						Boolean BtnCalculate = driver.findElements(By.id("btnCompute")).size()!=0;
				    	System.out.println("BtnCalculate" + BtnCalculate);
						Thread.sleep(2000);
				    	if (BtnCalculate==true) {  
				  
				    	
					/*	waitfor.until(ExerciseNow_Locators.BtnCalculate(driver)).click();
						Thread.sleep(2000);*/
				    		WebElement element = driver.findElement(By.id("btnCompute"));
				    		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
						jsExecutor.executeScript("arguments[0].click();", element);
						
						test.log(LogStatus.PASS, "BtnCalculate Clicked");
						} else {
						test.log(LogStatus.FAIL, "BtnCalculate not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
						}
						
						Boolean BtnCalculatePopUpClose1 = driver.findElements(By.id("btn1")).size() != 0;
						if (BtnCalculatePopUpClose1 == true) {
							MIT_IDInt = Integer.parseInt(MIT_ID);
							System.out.println(MIT_ID);
								String Message = ExerciseNow_Locators.BtnCalculatePopUpCloseMessage(driver).getText();
								System.out.println("message" + Message);

								newStr1 = Message.replaceAll("[^0-9]", "");
								System.out.println("newStr1" + newStr1);

								ActualExerciseQuantity1 = Integer.parseInt(newStr1);
								System.out.println("ActualExerciseQuantity1" + ActualExerciseQuantity1);

								WebElement elementPopUp1 = driver.findElement(By.id("btn1"));
					    		JavascriptExecutor jsExecutorPopUp1 = (JavascriptExecutor)driver;
							jsExecutorPopUp1.executeScript("arguments[0].click();", elementPopUp1);
							
								/*ExerciseNow_Locators.BtnCalculatePopUpCloseBtm2(driver).click();
						*/		Thread.sleep(3000);
								test.log(LogStatus.PASS, "BtnCalculatePopUpCloseBtm2 Clicked");
								

								if (MIT_IDInt >1) {
							WebElement InstrumentClick=driver.findElement(By.linkText(InstrumentsValueActual));
							InstrumentClick.click();
								Thread.sleep(1000);
							
							}
					    	
					    	if (ActualExerciseQuantity1 <= AvailableExerciseQuantity0)
					    	{
					    	WebElement ExerciseQuantity3 = driver.findElement(
									By.xpath(".//*[@id='Instrmnt" + MIT_ID + "exerciseQuantityID" + i + "']"));
							Thread.sleep(3000);

							waitfor.until(ExerciseQuantity3).sendKeys(newStr1);
							Thread.sleep(2000);
							
							/*	waitfor.until(ExerciseNow_Locators.BtnCalculate(driver)).click();
							Thread.sleep(2000);*/
							WebElement element1 = driver.findElement(By.id("btnCompute"));
							JavascriptExecutor jsExecutor1 = (JavascriptExecutor)driver;
							jsExecutor1.executeScript("arguments[0].click();", element1);
					    	
							Boolean BtnCalculatePopUpClose2 = driver.findElements(By.id("btn1")).size() != 0;
							if (BtnCalculatePopUpClose2 == true) {
								
								MIT_IDInt = Integer.parseInt(MIT_ID);
								System.out.println(MIT_ID);
									String Message2 = ExerciseNow_Locators.BtnCalculatePopUpCloseMessage(driver).getText();
									System.out.println("message" + Message2);

									newStr2 = Message2.replaceAll("[^0-9]", "");
									System.out.println("newStr2" + newStr2);

									ActualExerciseQuantity2 = Integer.parseInt(newStr2);
									System.out.println("ActualExerciseQuantity2" + ActualExerciseQuantity2);

									WebElement elementPopUp2 = driver.findElement(By.id("btn1"));
						    		JavascriptExecutor jsExecutorPopUp2 = (JavascriptExecutor)driver;
								jsExecutorPopUp2.executeScript("arguments[0].click();", elementPopUp2);
							
								//	ExerciseNow_Locators.BtnCalculatePopUpCloseBtm2(driver).click();
									Thread.sleep(3000);
									test.log(LogStatus.PASS, "BtnCalculatePopUpCloseBtm2 Clicked");
									

									if (MIT_IDInt >1) {
								WebElement InstrumentClick=driver.findElement(By.linkText(InstrumentsValueActual));
								InstrumentClick.click();
									Thread.sleep(1000);

								
								}
								
									 for(int multiplier=2;multiplier<= ActualExerciseQuantity1;multiplier++)
									 {
										ActualExerciseQuantity=ActualExerciseQuantity2*multiplier;
										 if(ActualExerciseQuantity>=ActualExerciseQuantity1)
										 {
											 System.out.println("ActualExerciseQuantity"+ActualExerciseQuantity);
											 break;
										 }
										 else
										 {
											 System.out.println("continue loop");
										 }
									 }
									 System.out.println("ActualExerciseQuantity"+ActualExerciseQuantity);
								
				
								newStr3 = Integer.toString(ActualExerciseQuantity);
								
								if (ActualExerciseQuantity <= AvailableExerciseQuantity0) {
									WebElement ExerciseQuantity4 = driver.findElement(
											By.xpath(".//*[@id='Instrmnt" + MIT_ID + "exerciseQuantityID" + i + "']"));
									Thread.sleep(3000);
									waitfor.until(ExerciseQuantity4).sendKeys(newStr3);
									Thread.sleep(2000);
									
									/*	waitfor.until(ExerciseNow_Locators.BtnCalculate(driver)).click();
									Thread.sleep(2000);*/
									WebElement element2 = driver.findElement(By.id("btnCompute"));
									JavascriptExecutor jsExecutor2 = (JavascriptExecutor)driver;
									jsExecutor2.executeScript("arguments[0].click();", element2);
									Thread.sleep(2000);
								}
								
								else
						    	{
						    		System.out.println("you dont have enough quantity for excercise options");
						    		ActualExerciseQuantity=0;
						    	}
							}
							else 
							{
								System.out.println("Second Pop up not exist");
								newStr3 = newStr1;
								ActualExerciseQuantity=Integer.parseInt(newStr3);
							
								test.log(LogStatus.FAIL, "BtnCalculatePopUpCloseBtm2 not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
							}
						}
					    	
						} else {
						/*	System.out.println("Pop up not exist");
							newStr3 = "1";
							ActualExerciseQuantity=Integer.parseInt(newStr3);*/
							System.out.println("Pop up not exist");
							ActualExerciseQuantity=1;
										}
						
						/*
						 * waitfor.until(ExerciseNow_Locators.TentativetaxPopup(
						 * driver)).click(); Thread.sleep(2000);
						 * waitfor.until(ExerciseNow_Locators.ClosePopUp(driver)
						 * ).click(); Thread.sleep(2000);
						 */
						if(ActualExerciseQuantity!=0){
						Boolean ProceedToExercise = driver.findElements(By.id("ExWizardID")).size() != 0;
						System.out.println("ProceedToExercise" + ProceedToExercise);

						if (ProceedToExercise == true) {
						waitfor.until(ExerciseNow_Locators.ProceedToExercise(driver)).click();
						test.log(LogStatus.PASS, "ProceedToExercise Clicked");
						} else {
						test.log(LogStatus.FAIL, "ProceedToExercise not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
						}
						
						Boolean ProceedToExerciseClose = driver.findElements(By.id("closeConfirmexerciseID")).size() != 0;
						System.out.println("ProceedToExerciseClose" + ProceedToExerciseClose);

						if (ProceedToExerciseClose == true) {
						waitfor.until(ExerciseNow_Locators.ProceedToExerciseClose(driver)).click();
						Thread.sleep(3000);
						if (MIT_IDInt >1) {
							WebElement InstrumentClick=driver.findElement(By.linkText(InstrumentsValueActual));
							InstrumentClick.click();
								Thread.sleep(1000);

							}
						
						test.log(LogStatus.PASS, "ProceedToExerciseClose Clicked");
						} else {
						test.log(LogStatus.FAIL, "ProceedToExerciseClose not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
						}
						
						WebElement ExerciseQuantity1 = driver
								.findElement(By.xpath(".//*[@id='Instrmnt" + MIT_ID + "exerciseQuantityID" + i + "']"));
						Thread.sleep(3000);
						waitfor.until(ExerciseQuantity1).sendKeys(newStr3);
						Thread.sleep(2000);
						
						/*	waitfor.until(ExerciseNow_Locators.BtnCalculate(driver)).click();
						Thread.sleep(2000);*/
						WebElement element3 = driver.findElement(By.id("btnCompute"));
						JavascriptExecutor jsExecutor3 = (JavascriptExecutor)driver;
						jsExecutor3.executeScript("arguments[0].click();", element3);
						Thread.sleep(2000);
						waitfor.until(ExerciseNow_Locators.ProceedToExercise(driver)).click();
			
						/*
						 * waitfor.until(ExerciseNow_Locators.ExNowTentativeTax(
						 * driver)).click(); Thread.sleep(3000);
						 * waitfor.until(ExerciseNow_Locators.
						 * ExNowTentativeTaxClose(driver)).click();
						 * Thread.sleep(3000);
						 */
						Boolean ExNowPaymentModeBackBtn = driver.findElements(By.xpath("//button[@id='btnBackToForm']")).size() != 0;
						System.out.println("ExNowPaymentModeBackBtn" + ExNowPaymentModeBackBtn);

						if (ExNowPaymentModeBackBtn == true) {
						waitfor.until(ExerciseNow_Locators.ExNowPaymentModeBackBtn(driver)).click();
						Thread.sleep(3000);
						
						test.log(LogStatus.PASS, "ExNowPaymentModeBackBtn Clicked");
						} else {
						test.log(LogStatus.FAIL, "ExNowPaymentModeBackBtn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
						}
						
						/*	waitfor.until(ExerciseNow_Locators.BtnCalculate(driver)).click();
						Thread.sleep(2000);*/
						WebElement element4 = driver.findElement(By.id("btnCompute"));
						JavascriptExecutor jsExecutor4 = (JavascriptExecutor)driver;
						jsExecutor4.executeScript("arguments[0].click();", element4);
						Thread.sleep(2000);
				    	waitfor.until(ExerciseNow_Locators.ProceedToExercise(driver)).click();
						
						Boolean ProceedToExercisePopUpCloseBtm = driver.findElements(By.id("closeConfirmexerciseID"))
								.size() != 0;

						if (ProceedToExercisePopUpCloseBtm == true) {
							waitfor.until(ExerciseNow_Locators.ProceedToExercisePopUpCloseBtm(driver)).click();
							Thread.sleep(3000);
							test.log(LogStatus.PASS, "ProceedToExercisePopUpCloseBtm Clicked");
							if (MIT_IDInt >1) {
								WebElement InstrumentClick=driver.findElement(By.linkText(InstrumentsValueActual));
								InstrumentClick.click();
									Thread.sleep(1000);

								}
							WebElement ExerciseQuantity2 = driver.findElement(
									By.xpath(".//*[@id='Instrmnt" + MIT_ID + "exerciseQuantityID" + i + "']"));
							Thread.sleep(3000);

							waitfor.until(ExerciseQuantity2).sendKeys(newStr3);
							Thread.sleep(2000);
							
							/*	waitfor.until(ExerciseNow_Locators.BtnCalculate(driver)).click();
							Thread.sleep(2000);*/
							WebElement element5 = driver.findElement(By.id("btnCompute"));
							JavascriptExecutor jsExecutor5 = (JavascriptExecutor)driver;
							jsExecutor5.executeScript("arguments[0].click();", element5);
							Thread.sleep(2000);
							waitfor.until(ExerciseNow_Locators.ProceedToExercise(driver)).click();
							test.log(LogStatus.PASS, "ProceedToExercise Clicked");
							
						}else {
							test.log(LogStatus.FAIL, "ProceedToExercisePopUpCloseBtm not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
							}
						
						PaymentModeClick PaymentModeClk = new PaymentModeClick();
						PaymentModeClk.SelectPaymentMode();

					}
						else 
						{
							System.out.println("Quantity is less than present quantity");
							test.log(LogStatus.FAIL, "ExerciseQuantity not Available" + test.addScreenCapture(Screenshot.captureImage(driver)));
						}
				} 
			else 
				{
					System.out.println("Quantity is less than present quantity");
					test.log(LogStatus.FAIL, "ExerciseQuantity not Available" + test.addScreenCapture(Screenshot.captureImage(driver)));
				}
			}

		}
	}
}
