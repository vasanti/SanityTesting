package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;

public class DefaultPWDChange extends MyEsopsLogin {
	public String ChangedPassword;

	public void defaultPEDChangedata(String UserId, String Password, String NewPassword)
			throws InterruptedException, IOException {

		Boolean iselementpresentPasswordContent = driver.findElement(By.xpath("//div[@id='PasswordContent']")).isDisplayed();

		System.out.println("iselementpresentPasswordContent" + iselementpresentPasswordContent);

		if (iselementpresentPasswordContent == true) {
			System.out.println("Pop Up  exist");

			driver.switchTo().activeElement();
			Thread.sleep(5000);
			ChangePassword ChangePwd = new ChangePassword();
			ChangePwd.DefaultChangePWD(UserId, Password, NewPassword);
			ChangedPassword = NewPassword;
			System.out.println("ChangedPassword" + ChangedPassword);

			// =================copy to excel folder=================
			WriteExcel WriteEx = new WriteExcel();
			WriteEx.writeExceldata(UserId, ChangedPassword);
			Thread.sleep(5000);

		}

		else {
			System.out.println("iselementpresentPasswordContent" + iselementpresentPasswordContent);
			ChangedPassword = Password;
			System.out.println("ChangedPassword" + ChangedPassword);
			//========Close Browser===========
			CloseBrowser CloseBr=new CloseBrowser();
			CloseBr.CloseBrowser1();
			// =================copy to excel folder=================
			WriteExcel WriteEx = new WriteExcel();
			WriteEx.writeExceldata(UserId, ChangedPassword);
			Thread.sleep(5000);

		}

	}
}
