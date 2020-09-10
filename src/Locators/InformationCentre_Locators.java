package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class InformationCentre_Locators {

		private static WebElement element = null;
		    
		/*=================Information Center========================*/
		   
		    public static WebElement InformationCenter(WebDriver driver)
		   {
			element = driver.findElement(By.linkText("Information Center"));
			return element;
		   }
		 /*=================FAQs========================*/
		    public static WebElement IC_Grid(WebDriver driver)
		    {
		 	element = driver.findElement(By.xpath(".//*[@id='aspnetForm']/div[6]/div[1]/div/div"));
		    return element;   
		    }
		    public static WebElement FAQs(WebDriver driver)
		    {
		 	element = driver.findElement(By.xpath(".//*[@id='FAQs']"));
		    return element;   
		    }
		   
		    public static WebElement OKBtn(WebDriver driver)
		    {
		 	element = driver.findElement(By.xpath(".//*[@id='btnok']"));
		    return element;   
		    } 
		    public static WebElement FileNotFoundAlert(WebDriver driver)
		    {
		    	element=driver.findElement(By.xpath("//div[@class='col-sm-12 alert alert-danger']"));
		    	return element;
		    }
		    public static WebElement DownLoadInfoCenter(WebDriver driver)
		    {
		 	element = driver.findElement(By.xpath(".//*[@id='DownloadInfoCenter']"));
		    return element;   
		    }
		    public static WebElement CloseBtn(WebDriver driver)
		    {
		 	element = driver.findElement(By.xpath(".//*[@id='btnclose']"));
		    return element;   
		    }
		    /*=================Scheme Details========================*/
		    public static WebElement SchemeDetails(WebDriver driver)
		    {
		 	element = driver.findElement(By.xpath(".//*[@id='Scheme Details']"));
		    return element;   
		    }
		    public static WebElement SD_Grid(WebDriver driver)
		    {
		 	element = driver.findElement(By.xpath(".//*[@id='aspnetForm']/div[6]/div[1]/div/div"));
		    return element;   
		    }
		    
		  
		    
		}