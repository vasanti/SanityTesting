package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.HomePage_Locators;

public class HomePage extends MyEsopsLogin {

	WindowHandle WindowHandleBack = new WindowHandle();

	public void HomePageClick() throws InterruptedException, IOException {
		Boolean HomePageLocator1 = driver.findElements(By.xpath(".//*[@id='myCarousel']/div[2]/div/ol/li[1]"))
				.size() != 0;
		System.out.println("HomePageLocator1" + HomePageLocator1);
		Boolean HomePageLocator2 = driver.findElements(By.xpath(".//*[@id='myCarousel']/div[2]/div/ol/li[2]"))
				.size() != 0;
		System.out.println("HomePageLocator2" + HomePageLocator2);
		Boolean HomePageLocator3 = driver.findElements(By.xpath(".//*[@id='myCarousel']/div[2]/div/ol/li[3]"))
				.size() != 0;
		System.out.println("HomePageLocator3" + HomePageLocator3);
		Boolean HomePageLocator4 = driver.findElements(By.xpath(".//*[@id='myCarousel']/div[2]/div/ol/li[4]"))
				.size() != 0;
		System.out.println("HomePageLocator4" + HomePageLocator4);
		Boolean HomePageLocator5 = driver.findElements(By.xpath(".//*[@id='myCarousel']/div[2]/div/ol/li[5]"))
				.size() != 0;
		System.out.println("HomePageLocator5" + HomePageLocator5);
		
		if (HomePageLocator1 == true) {
			HomePage_Locators.HomePageLocator1(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "HomePageLocator1 Present");
		} else {
			test.log(LogStatus.FAIL, "HomePageLocator1 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}

		if (HomePageLocator2 == true) {
			HomePage_Locators.HomePageLocator2(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "HomePageLocator2 Present");
		} else {
			test.log(LogStatus.FAIL, "HomePageLocator2 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}

		if (HomePageLocator3 == true) {
			HomePage_Locators.HomePageLocator3(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "HomePageLocator3 Present");
		} else {
			test.log(LogStatus.FAIL, "HomePageLocator3 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}

		if (HomePageLocator4 == true) {
			HomePage_Locators.HomePageLocator4(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "HomePageLocator4 Present");
		} else {
			test.log(LogStatus.FAIL, "HomePageLocator4 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}

		if (HomePageLocator5 == true) {
			HomePage_Locators.HomePageLocator5(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "HomePageLocator5 Present");
		} else {
			test.log(LogStatus.FAIL, "HomePageLocator5 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}
		/* =================FooterPage======================== */

		Boolean FooterPageLocator1 = driver.findElements(By.xpath(".//*[@id='footer']/div/div/div[2]/div/ul/li[1]/a"))
				.size() != 0;
		System.out.println("FooterPageLocator1" + FooterPageLocator1);
		Boolean FooterPageLocator2 = driver.findElements(By.xpath(".//*[@id='footer']/div/div/div[2]/div/ul/li[2]/a"))
				.size() != 0;
		System.out.println("FooterPageLocator2" + FooterPageLocator2);
		Boolean FooterPageLocator3 = driver.findElements(By.xpath(".//*[@id='footer']/div/div/div[2]/div/ul/li[4]/a"))
				.size() != 0;
		System.out.println("FooterPageLocator3" + FooterPageLocator3);
		Boolean FooterPageLocator4 = driver.findElements(By.xpath(".//*[@id='footer']/div/div/div[2]/div/ul/li[5]/a"))
				.size() != 0;
		System.out.println("FooterPageLocator4" + FooterPageLocator4);
		Boolean FooterPageLocator5 = driver.findElements(By.xpath(".//*[@id='footer']/div/div/div[2]/div/ul/li[6]/a"))
				.size() != 0;
		System.out.println("FooterPageLocator5" + FooterPageLocator5);

		if (FooterPageLocator1 == true) {
			HomePage_Locators.FooterPageLocator1(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "FooterPageLocator1 Present");
		} else {
			test.log(LogStatus.FAIL, "FooterPageLocator1 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}

		if (FooterPageLocator2 == true) {
			WindowHandleBack.WindowHandleClk();
			HomePage_Locators.FooterPageLocator2(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "FooterPageLocator2 Present");
		} else {
			test.log(LogStatus.FAIL, "FooterPageLocator2 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}
		if (FooterPageLocator3 == true) {
			WindowHandleBack.WindowHandleClk();
			Thread.sleep(3000);
			HomePage_Locators.FooterPageLocator3(driver).click();
			test.log(LogStatus.PASS, "FooterPageLocator3 Present");
		} else {
			test.log(LogStatus.FAIL, "FooterPageLocator3 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}
		if (FooterPageLocator4 == true) {
			WindowHandleBack.WindowHandleClk();
			Thread.sleep(3000);
			HomePage_Locators.FooterPageLocator4(driver).click();
			test.log(LogStatus.PASS, "FooterPageLocator4 Present");
		} else {
			test.log(LogStatus.FAIL, "FooterPageLocator4 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}

		if (FooterPageLocator5 == true) {
			WindowHandleBack.WindowHandleClk();
			Thread.sleep(3000);
			HomePage_Locators.FooterPageLocator5(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "FooterPageLocator5 Present");
				
		} else {
			
			test.log(LogStatus.FAIL, "FooterPageLocator5 not Present"+ test.addScreenCapture(Screenshot.captureImage(driver)));
			
		}
		Boolean LoginPage = driver.findElements(By.xpath(".//*[@id='footer']/div/div/div[2]/div/ul/li[2]/a"))
				.size() != 0;
		System.out.println("LoginPage" + LoginPage);
	if(LoginPage==true)
	{
		HomePage_Locators.LoginPage(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "LoginPage Clicked");
	
	}
	else
	{
		test.log(LogStatus.FAIL, "LoginPage not Clicked"+ test.addScreenCapture(Screenshot.captureImage(driver)));
		
	}
	}
}