package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.ExerciseNow_Locators;

public class PopUpHandle extends CalculateNow
{
public void PopUpText(String AvailableExerciseQuantity,String InstrumentsValueActual,String MIT_ID) throws InterruptedException
{
	MIT_IDInt = Integer.parseInt(MIT_ID);
	System.out.println(MIT_ID);
		String Message = ExerciseNow_Locators.BtnCalculatePopUpCloseMessage(driver).getText();
		System.out.println("message" + Message);

		newStr = Message.replaceAll("[^0-9]", "");
		System.out.println("newStr" + newStr);

		ActualExerciseQuantity = Integer.parseInt(newStr);
		System.out.println("ActualExerciseQuantity" + ActualExerciseQuantity);

		ExerciseNow_Locators.BtnCalculatePopUpCloseBtm2(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "BtnCalculatePopUpCloseBtm2 Clicked");
		

		if (MIT_IDInt >1) {
	WebElement InstrumentClick=driver.findElement(By.linkText(InstrumentsValueActual));
	InstrumentClick.click();
		Thread.sleep(1000);

	
	}
}
}

