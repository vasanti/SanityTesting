package TestScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class SequrityQueLogic extends MyEsopsLogin{
public void SequrityQ(String UserId, String Password,String NewPassword, String CompanyId1, String Productwithoutspace,String Ans1,String Ans2) throws Exception
{
	Boolean iselementpresent1 = driver.findElements(By.id("ctl00_resetPassword_divRandomQuestion")).size() != 0;
	System.out.println("iselementpresent1" + iselementpresent1);
	Boolean iselementpresent2= driver.findElements(By.id("tblAskAuthQuestion")).size() != 0;
	System.out.println("iselementpresent2" +iselementpresent2);
	Thread.sleep(2000);
	if (iselementpresent1 == true) 
	{
		SecurityQuestion SecurityQuestionPresent=new SecurityQuestion();
		SecurityQuestionPresent.SecurityQuestionAns(Ans1,Ans2);
		System.out.println("SecurityQuestionAns Submited successfuly");
		test.log(LogStatus.PASS, "SecurityQuestionAns Submited successfuly");
	} 
	else if(iselementpresent2==true)
	{
		SecurityQuestionUpdate SecurityQuestionUpdateClick=new SecurityQuestionUpdate();
		SecurityQuestionUpdateClick.SecurityQuestionUpdated();
		
		System.out.println("SecurityQuestionAns Updated successfuly");
		test.log(LogStatus.PASS, "SecurityQuestionAns Updated successfuly");
		
		Login UserLogin2=new Login();
		UserLogin2.LoginPage(UserId, Password, NewPassword, CompanyId1, Productwithoutspace, Ans1, Ans2);
		
		System.out.println("Re-login with Updated SecurityQuestionAns successfuly");
		test.log(LogStatus.PASS, "Re-login with Updated SecurityQuestionAns successfuly");
		
		SecurityQuestionUpdate SecurityQuestionPresent=new SecurityQuestionUpdate();
		SecurityQuestionPresent.SecurityQuestion();
		System.out.println("Updated SecurityQuestionAns Login done successfuly");
		test.log(LogStatus.PASS, "Updated SecurityQuestionAns Login done successfuly");

	}	
	else 
	{
		test.log(LogStatus.FAIL,
				"SecurityQuestionAns Submition failed" + test.addScreenCapture(Screenshot.captureImage(driver)));
		System.out.println("SecurityQuestionAns Submition failed Or Security Questions not present");
	}
	if (isAlertPresents()) 
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	else
	{
		System.out.println("Alert not present"); 
	}
}

private boolean isAlertPresents() {
	// TODO Auto-generated method stub
	return false;
}
}
