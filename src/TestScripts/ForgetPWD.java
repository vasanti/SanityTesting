package TestScripts;

import java.io.IOException;
import org.openqa.selenium.By;
import com.relevantcodes.extentreports.LogStatus;
import Locators.Login_Locator;

public class ForgetPWD extends MyEsopsLogin {

	public void ForgetPassWordData() throws InterruptedException, IOException {
		Boolean ForgetPWD = driver.findElements(By.xpath(".//*[@id='forgotpassword']")).size() != 0;
		System.out.println("ForgetPWD" + ForgetPWD);
		if (ForgetPWD == true) {
			Login_Locator.ForgetPWD(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "ForgetPWD Clicked");
		} else {
			test.log(LogStatus.FAIL, "ForgetPWD not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		Boolean ForgetPwdSubmit = driver.findElements(By.id("btnForgotPassword")).size() != 0;
		System.out.println("ForgetPwdSubmit" + ForgetPwdSubmit);
		if (ForgetPwdSubmit == true) {
			Login_Locator.ForgetPwdSubmit(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "ForgetPwdSubmit Clicked");
		} else {
			test.log(LogStatus.FAIL,
					"ForgetPwdSubmit not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		Boolean ForgetPWDbackToLogin = driver.findElements(By.xpath(".//*[@id='backtologin']")).size() != 0;
		System.out.println("ForgetPWDbackToLogin" + ForgetPWDbackToLogin);
		if (ForgetPWDbackToLogin == true) {
			Login_Locator.ForgetPWDbackToLogin(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "ForgetPWDbackToLogin Clicked");
		} else {
			test.log(LogStatus.FAIL,
					"ForgetPWDbackToLogin not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
		}
		// ========close browser=================
				driver.close();
				Thread.sleep(1000);
			//	driver.quit();
	}

}
