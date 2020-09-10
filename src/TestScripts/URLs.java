package TestScripts;

import java.util.concurrent.TimeUnit;

import com.relevantcodes.extentreports.LogStatus;



public class URLs extends MyEsopsLogin{

	public void Login(String Productwithoutspace) throws Exception
	{
if (Productwithoutspace.equals("BPCL")) {
			
			driver.get("https://demo.esopdirect.com/Development/ESPS1.7/Global_UI/MyESOPs/Login.aspx");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String URL=driver.getCurrentUrl();
			
			if(URL.equals("https://demo.esopdirect.com/Development/ESPS1.7/Global_UI/MyESOPs/Login.aspx"))
			{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
			}
			else
			{
			test.log(LogStatus.FAIL, "Not Navigated to the UATGlobalUI URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));

			}
		}
	if (Productwithoutspace.equals("UATGlobalUI")) {
		
		driver.get("https://203.109.87.220/Global_UI/MyESOPs/Login.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL=driver.getCurrentUrl();
		
		if(URL.equals("https://203.109.87.220/Global_UI/MyESOPs/Login.aspx"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Not Navigated to the UATGlobalUI URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}
	}
	
	else if (Productwithoutspace.equals("UATGlobal")) {
		
		driver.get("https://223.196.87.244:1148/Global_UAT/MyESOPs/Login.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.getCurrentUrl().equals("https://223.196.87.244:1148/Global_UAT/MyESOPs/Login.aspx"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Not Navigated to the UATGlobal URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}
	}
	else if (Productwithoutspace.equals("UATMyEsops")) {
		
		driver.get("https://203.109.87.220:1148/live/MyESOPs/Login.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.getCurrentUrl().equals("https://203.109.87.220:1148/live/MyESOPs/Login.aspx"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Not Navigated to the UATMyEsops URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}
	}
	else if (Productwithoutspace.equals("MyEsops")) {
		
	
		driver.get("https://www.esopdirect.com/MyESOPs/Login.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.getCurrentUrl().equals("https://www.esopdirect.com/MyESOPs/Login.aspx"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Not Navigated to the MyEsops URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}
	} else if (Productwithoutspace.equals("GlobalUI")) {
		
		driver.get("https://www.esopdirect.com/GlobalMyESOPs/Login.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.getCurrentUrl().equals("https://www.esopdirect.com/GlobalMyESOPs/Login.aspx"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Not Navigated to the GlobalUI URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));
		}
	} 
	else if (Productwithoutspace.equals("Global")) {
		
		 
		driver.get("https://www.esopdirect.com/MyESOP/Login.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.getCurrentUrl().equals("https://www.esopdirect.com/MyESOP/Login.aspx"))
		{
		test.log(LogStatus.PASS, "Navigated to the Global URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "Not Navigated to the specified URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}
	}
	else if (Productwithoutspace.equals("UATGlobalUIAccTest")) {
		
		driver.get("https://172.16.11.19/GLOBAL_UI/MYESOPS/Login.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL=driver.getCurrentUrl();
		if(URL.equals("https://172.16.11.19/GLOBAL_UI/MYESOPS/Login.aspx"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Not Navigated to the UATGlobalUI URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));

		}
	}
	
	
}


}