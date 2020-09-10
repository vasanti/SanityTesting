package TestScripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Locators.InProcess_Locators;

public class InProcessExNoClick extends MyEsopsLogin {
public void ExNumberClick() throws InterruptedException, IOException
{	
	WebElement InProcessGrid_Table = InProcess_Locators.InProcess_Grid(driver);
	List<WebElement> InProcessGrid_TotalRows = InProcessGrid_Table .findElements(By.tagName("tr"));
	int InProcessGrid_rowCount = (InProcessGrid_TotalRows.size()) - 1;
	System.out.println("Total Number of Rows are: " + InProcessGrid_rowCount);
	Thread.sleep(1000);
	
	if(InProcessGrid_rowCount>=1)
	{
		
	System.out.println("Data present in the grid");
	test.log(LogStatus.PASS, "Data present in the grid");
//	we will check for 1 Row.class..
//	for(int i=0;i<=InProcessGrid_rowCount;i++)
	for(int i=0;i<=1;i++)
	{
		
		Boolean exercisedQuantityId = driver.findElements(By.id("exercisedQuantityId "+i)).size() != 0;
		System.out.println("exercisedQuantityId" + exercisedQuantityId);
		Thread.sleep(2000);
if(exercisedQuantityId==true)
{
driver.findElement(By.id("exercisedQuantityId "+i)).click();
	Thread.sleep(2000);
	driver.findElement(By.id("exerciseDatapopup_modal_CloseID")).click();
	Thread.sleep(1000);
	test.log(LogStatus.PASS, "Exercise number field is clickable");
}
else
{
	System.out.println("Exercise number field is not clickable");
	test.log(LogStatus.FAIL, "Exercise number field is not clickable" + test.addScreenCapture(Screenshot.captureImage(driver)));
}	
	}
	
	}
	
	else
	{
		System.out.println("Data not present in the grid");
		test.log(LogStatus.FAIL, "Data not present in the grid" + test.addScreenCapture(Screenshot.captureImage(driver)));
	}	
}
}
