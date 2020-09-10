package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Login_Locator;

public class Login extends MyEsopsLogin {
	public void LoginPage(String UserId, String Password,String NewPassword, String CompanyId1, String Productwithoutspace,String Ans1,String Ans2) throws Exception {
		Boolean MYESOPUserId = driver.findElements(By.id("txtUserId")).size() != 0;
		System.out.println("MYESOPUserId" + MYESOPUserId);
	if(MYESOPUserId==true)
	{
		Login_Locator.MYESOPUserId(driver).clear();
		Thread.sleep(2000);
		Login_Locator.MYESOPUserId(driver).sendKeys(UserId);
		Thread.sleep(2000);
		System.out.println(UserId);
		test.log(LogStatus.PASS, "UserId "+UserId+" Clicked");
	}
	else
	{
		test.log(LogStatus.FAIL, "UserId "+UserId+" Not Clicked"+ test.addScreenCapture(Screenshot.captureImage(driver)));

	}
	Boolean MYESOPPassword = driver.findElements(By.xpath(".//*[@id='txtPassword1'] |.//*[@id='txtPassword']")).size() != 0;
	System.out.println("MYESOPPassword" + MYESOPPassword);
if(MYESOPPassword==true)
{
			Actions actions = new Actions(driver);
		actions.moveToElement(Login_Locator.MYESOPPassword(driver));
		actions.click();
		actions.sendKeys(Password);
		actions.build().perform();

		System.out.println(Password);
		test.log(LogStatus.PASS, "Password "+Password+" Clicked");
}
else
{
	test.log(LogStatus.FAIL, "Password "+Password+" Not Clicked"+ test.addScreenCapture(Screenshot.captureImage(driver)));

}
Boolean MYESOPCompanyID = driver.findElements(By.id("txtCompanyId")).size() != 0;
System.out.println("MYESOPCompanyID" + MYESOPCompanyID);
if(MYESOPCompanyID==true)
{
		Login_Locator.MYESOPCompanyID(driver).clear();
		Thread.sleep(4000);
		Login_Locator.MYESOPCompanyID(driver).sendKeys(CompanyId1);
		Thread.sleep(2000);
		System.out.println(CompanyId1);
		test.log(LogStatus.PASS, "CompanyId1 "+CompanyId1+" Clicked");
}
else
{
	test.log(LogStatus.FAIL, "CompanyId1 "+CompanyId1+" Not Clicked"+ test.addScreenCapture(Screenshot.captureImage(driver)));

}
Boolean MYESOPLogin = driver.findElements(By.xpath(".//*[@id='btnOk'] |.//*[@id='login_btn']")).size() != 0;
System.out.println("MYESOPLogin" + MYESOPLogin);
if(MYESOPLogin==true)
{

		Login_Locator.MYESOPLogin(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Login button Clicked");
}
else
{
	test.log(LogStatus.FAIL, "Login button Not Clicked"+ test.addScreenCapture(Screenshot.captureImage(driver)));

}
SequrityQueLogic SQLogic=new SequrityQueLogic();
SQLogic.SequrityQ(UserId, Password, NewPassword, CompanyId1, Productwithoutspace, Ans1, Ans2);

EmployeeConcent EmployeeConcentAvailable=new EmployeeConcent();
EmployeeConcentAvailable.EmployeeConcentPresent();

	}

}
