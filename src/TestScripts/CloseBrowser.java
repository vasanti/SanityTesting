package TestScripts;

import org.junit.Test;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Login_Locator;

public class CloseBrowser extends MyEsopsLogin {
	// public static WebDriver driver;
	@Test
	public void CloseBrowser1() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
		
			Boolean Logo = driver.findElements(By.xpath(".//*[@id='UserLogo']")).size() != 0;
			System.out.println("Logo" + Logo);
			if (Logo == true) {
			Login_Locator.Logo(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Logo Clicked");
			} else {
			test.log(LogStatus.FAIL, "Logo not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean Logout = driver.findElements(By.linkText("Logout")).size() != 0;
			System.out.println("Logout" + Logout);
			if (Logout == true) {
			Login_Locator.Logout(driver).click();
			Thread.sleep(2000);
			driver.close();
			Thread.sleep(6000);	
			test.log(LogStatus.PASS, "Logout Clicked");
			} else {
			test.log(LogStatus.FAIL, "Logout not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
		//	driver.quit();
		}

		catch (Exception e) {

			e.printStackTrace();
		}
	}
}