package TestScripts;

import java.util.concurrent.TimeUnit;

import com.relevantcodes.extentreports.LogStatus;



public class URLs extends MyEsopsLogin{
	public void Login(String Productwithoutspace) throws Exception
	{

			driver.get(Productwithoutspace);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String URL=driver.getCurrentUrl();
			
			if(URL.equals(Productwithoutspace))
			{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
			}
			else
			{
			test.log(LogStatus.FAIL, "Not Navigated to the UATGlobalUI URL"+ test.addScreenCapture(Screenshot.captureImage(driver)));

			}
		}
	
	}