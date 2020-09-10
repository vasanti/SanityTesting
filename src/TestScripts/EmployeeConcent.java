package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.EmployeeConcent_Locators;

public class EmployeeConcent extends MyEsopsLogin{
public void EmployeeConcentPresent() throws InterruptedException, IOException
{
	Boolean EmployeeConcent = driver.findElements(By.id("ctl00_ContentPlaceHolder1_btnMdlNo1")).size() != 0;
	System.out.println("iselementpresent" + EmployeeConcent);

	Thread.sleep(2000);
	if (EmployeeConcent == true) 

	{
		Boolean UserConsent_Checkbox = driver.findElements(By.id("chkConcent")).size() != 0;
		System.out.println("UserConsent_Checkbox" + UserConsent_Checkbox);

		Thread.sleep(2000);
		if (UserConsent_Checkbox == true) 
		{
		EmployeeConcent_Locators.UserConsent_Checkbox(driver).click();
		Thread.sleep(2000);
		System.out.println("Checkbox  present & Clicked");
		test.log(LogStatus.FAIL, "Checkbox present & Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));

	}
		else
		{
		
			System.out.println("Checkbox not present");
			test.log(LogStatus.FAIL, "Checkbox not present" + test.addScreenCapture(Screenshot.captureImage(driver)));
		
		}
		Boolean UserConsent_AgreeBtn = driver.findElements(By.xpath("//button[@id='btn1']")).size() != 0;
		System.out.println("UserConsent_AgreeBtn" + UserConsent_AgreeBtn);

		Thread.sleep(2000);
		if (UserConsent_AgreeBtn == true) 
		{
		EmployeeConcent_Locators.UserConsent_AgreeBtn(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "EmployeeContent Accepted");
		}
		else
		{
			System.out.println("Employee concent Agree button not Clicked");
			test.log(LogStatus.FAIL, "Employee concent Agree button not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		
		}
		
	}
	else
	{
		test.log(LogStatus.PASS, "content place holder not found Or  Employee Concent not unable to this employee");
		System.out.println("content place holder not found Or  Employee Concent not unable to this employee");
	}
}
}
