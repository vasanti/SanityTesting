package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class eGrants_Locators {
	private static WebElement element = null;
	//e-Grants Menu
	public static WebElement OnlineGrants(WebDriver driver)
	{
		element = driver.findElement(By.linkText("e-Grants"));
		return element;
	}
	public static WebElement Note(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='OGAContent']/div[1]/div/div[1]/div[2]/button"));
		return element;
		      
		// Previous one: .//*[@id='OGAContent']/div[1]/div/div[1]/div/button
	}

	public static WebElement Notes_CloseButton(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='OGAContent']/div[1]/div/div[2]/div/div/button"));
		return element;
	}
	
	public static WebElement Grid_Check(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"OGAContent\"]/div[1]/div/div[3]/div/div"));
		return element;
	}
	
	public static WebElement Grid_GrantDetails(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"myTable\"]/tbody"));
		return element;
	}
	public static WebElement NoGrid(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"OGAContent\"]/div[1]/div/div[3]/div/div/div"));
		return element;
	}
	
	public static WebElement Grid_View_CloseBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='OGAModel']/div/div/div[1]/h4/button"));
		return element;
	}
	
	public static WebElement ViewAndAccept_chkbox(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@id='terms']"));
		return element;
	}
	
	public static WebElement ViewAndAccept_AcceptBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='btnAccept']"));
		return element;
	}
	
	public static WebElement ViewAndAccept_RejectBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='btnReject']"));
		return element;
	}
	
	public static WebElement ViewAndAccept_CancelBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='OGAModel']/div/div/div[3]/div[2]/div/button[3]"));
		return element;
	}
	
	
	public static WebElement ViewAndAccept_buttons(WebDriver driver, String ButtonStatus_Name)
	{
		element = driver.findElement(By.id(ButtonStatus_Name));
		return element;
	}
	
	public static WebElement AcceptGrantPopup_AcceptBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//button[@id='btnAccept']"));
		return element;
	}
	
	public static WebElement AcceptGrantPopup_GoBackBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//button[contains(text(),'Go Back')]"));
		return element;
	}
	
	public static WebElement Exercise(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Exercise"));
		return element;
	}
	
	public static WebElement ExerciseNow(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"Exercise Now\"]"));
		return element;
	}
	
	public static WebElement ExerciseNowGrid(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div/div/div/div/div[1]"));
		//element = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[6]/div/div/div/div/div/div[4]/div[3]/div"));
		return element; 
	}
	
	public static WebElement ExerciseNowGridDetails(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]"));
		return element;
	}
	public static WebElement ExerciseNowMessage(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"computeId\"]/div"));
		return element;
	}
	
	
	
	public static WebElement Reports(WebDriver driver)
	{
		//element = driver.findElement(By.xpath("//*[@id=\"sitemaps\"]/li[11]/a"));
		element = driver.findElement(By.linkText("Reports"));
		return element;
	}
	
	public static WebElement MySummaryReport(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"My Summary Report\"]"));
		return element;
	}
	
	public static WebElement SummaryReportGrid(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div/div"));
		return element; 
	}
	
	public static WebElement SummaryReportGridDetails(WebDriver driver)
	{
		element = driver.findElement(By.xpath("/html/body/form/div[6]/div/div[2]/div/div/table/tbody"));
		return element;
	}
	public static WebElement SummaryReportMessage(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"computeId\"]/div"));
		return element;
	}
	
	
	
	

	
}
