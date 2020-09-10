package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InProcess_Locators {
	
public static WebElement element=null;

public static WebElement Exercise(WebDriver driver)
{
	element=driver.findElement(By.linkText("Exercise"));
	return element;
}
public static WebElement InProcess(WebDriver driver)
{
	element=driver.findElement(By.linkText("In Process"));
	return element;
}
public static WebElement InProcess_Grid(WebDriver driver)
{//All,Phantom,Esops

	element=driver.findElement(By.xpath("//table[@class='table table-alternate inprocesstable']"));
	return element;
}

public static WebElement Instrument1(WebDriver driver)
{
	element=driver.findElement(By.xpath("//a[@id='TESOPSInstrId']"));
	return element;
}
public static WebElement Instrument2(WebDriver driver)
{
	element=driver.findElement(By.xpath("//a[@id='TRSUsInstrId']"));
	return element;
}
public static WebElement Instrument3(WebDriver driver)
{
	element=driver.findElement(By.xpath("//a[@id='TADRsInstrId']"));
	return element;
}
public static WebElement Instrument4(WebDriver driver)
{
	element=driver.findElement(By.xpath("//a[@id='TADRsRSUInstrId']"));
	return element;
}
public static WebElement Instrument5(WebDriver driver)
{
	element=driver.findElement(By.xpath("//a[@id='TPhantomInstrId']"));
	return element;
}
public static WebElement Instrument6(WebDriver driver)
{
	element=driver.findElement(By.xpath("//a[@id='TEquitySARsInstrId']"));
	return element;
}
public static WebElement Instrument7(WebDriver driver)
{
	element=driver.findElement(By.xpath("//a[@id='TCashSARsInstrId']"));
	return element;
}
public static WebElement Instrument8(WebDriver driver)
{
	element=driver.findElement(By.xpath("//a[@id='TEquityCashSARsInstrId']"));
	return element;
}

public static WebElement InProcessAllInstruments(WebDriver driver)
{
	element=driver.findElement(By.xpath("//li[@class='active']//a[contains(text(),'All')]"));
	return element;
}
public static WebElement CloseBtn(WebDriver driver)
{
	element=driver.findElement(By.xpath(".//*[@id='exerciseDatapopup_modal_CloseID']"));
	return element;
}

}
