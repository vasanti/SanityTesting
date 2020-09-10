package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewAllotmet_Locators {
	
	private static WebElement element = null;
	/*=================View Allotment========================*/
	public static WebElement ExerciseNow(WebDriver driver)
	{
		element=driver.findElement(By.linkText("Exercise"));
		return element;
	}
    public static WebElement ViewAllotment(WebDriver driver)
   {
	element = driver.findElement(By.linkText("View Allotment"));
	return element;
   }
   
    public static WebElement ViewAllotmentCloseBtn(WebDriver driver)
    {
 	element = driver.findElement(By.xpath(".//*[@id='viewDetails']/div/div/div[1]/button"));
 	return element;
    }
  
    public static WebElement VA_Grid(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='aspnetForm']/div[6]/div/div[4]/div/div/table"));
		return element;
	}
	
    
    public static WebElement VAExDetails_Grid(WebDriver driver)
	{
	
		element = driver.findElement(By.xpath("//table[@id='tblview']"));
		return element;
	}
	public static WebElement VA_TaxPayable(WebDriver driver)
	{
	
		element = driver.findElement(By.xpath(".//*[@id='tblview']/tbody[2]/tr[6]/td/a"));
		return element;
	}
	
	public static WebElement VA_TaxPayable_CloseIcon(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='modal-tax']/div/div/div[1]/button"));
		return element;
	}
	
	
	public static WebElement VA_Export_Btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnExport"));
		return element;
	}
    public static WebElement ExportBtn(WebDriver driver)
    {
 	element = driver.findElement(By.xpath(".//*[@id='AllotTotal']/div[2]/div/ul/li/a"));
 	return element;
    }
 
}