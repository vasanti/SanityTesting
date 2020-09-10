package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportDashboard_Locators {

		private static WebElement element = null;
			
		/*=================Reports========================*/
			public static WebElement Reports(WebDriver driver)
			{
				element = driver.findElement(By.linkText("Reports"));
				return element;
			}
			/*=================Report Dashboard========================*/
			public static WebElement ReportDashboard(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='Report Dashboard']"));	    
			    return element;
			}
			public static WebElement MySummaryReports(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='lnkMySummaryDetails']"));	    
			    return element;
			}
			public static WebElement MySummaryReportlnk(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='AllDashboardReports']/table/tbody/tr[1]/td[2]/img"));	    
			    return element;
			}
			public static WebElement ExerciseReportlnk(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='AllDashboardReports']/table/tbody/tr[2]/td[2]/img"));	    
			    return element;
			}
			/*=================My Summary Reports========================*/
			public static WebElement MySummaryReportTab(WebDriver driver)
			{
				element = driver.findElement(By.linkText("My Summary Report"));	    
			    return element;
			}
			public static WebElement SummaryReport_Grid(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='report']"));	    
			    return element;
			}
			public static WebElement MySummaryReportPlanClick_Grid(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='report']"));	    
			    return element;
			}
			
			public static WebElement ExportBtn(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='btnExport']"));	    
			    return element;
			}
			/*=================Cancellation Report========================*/
			public static WebElement CancellationReport(WebDriver driver)
			{
				element = driver.findElement(By.linkText("Cancellation Report"));	    
			    return element;
			}
			public static WebElement CancellationReportGrid(WebDriver driver)
			{
				element=driver.findElement(By.xpath(".//*[@id='report']"));
				return element;
			}
			public static WebElement CancellationReportComment(WebDriver driver)
			{
				element=driver.findElement(By.xpath(".//*[@id='report']"));
				return element;
			}
		}