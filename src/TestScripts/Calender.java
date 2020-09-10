package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Calender extends MyEsopsLogin{
	public static void CalenderClick(String dateofpicker)	  
	  {
	  	try
	  	{
	  	WebElement datepiker = driver.findElement(By.cssSelector("datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-top"));
	  	Thread.sleep(500);
		datepiker.click();
	  	String[] split=dateofpicker.split("/");
	  	String dateSplit=split[0].toString();
	  	String month=split[1].toString();
	  	String year=split[2].toString();
	  	
	  	int dateInt=Integer.parseInt(dateSplit);
	  	 String date = Integer.toString(dateInt); 
	  	
	  	WebElement selectYear=driver.findElement(By.className("datepicker-years"));
	  	List<WebElement> yearOptions=selectYear.findElements(By.tagName("option"));
	  	int i=0;
	  	for(i=0;i<=yearOptions.size();i++)
	  	{
	  		if(yearOptions.get(i).getText().equalsIgnoreCase(year))
	  		{
	  			yearOptions.get(i).click();
	  			System.out.println("year select");
	  			break;
	  		}
	  	}
	  	
	  	
	  	
	  	WebElement selectMonth=driver.findElement(By.className("datepicker-months"));
	  	List<WebElement> monthOptions=selectMonth.findElements(By.tagName("option"));
	  	for(i=0;i<=monthOptions.size();i++)
	  	{
	  		if(monthOptions.get(i).getText().equalsIgnoreCase(month))
	  		{
	  			monthOptions.get(i).click();
	  			System.out.println("month select");
	  			break;
	  		}
	  	}
	  	
	  	
	  	List<WebElement> selectDate=driver.findElements(By.className("datepicker-days"));
	  	for(i=0;i<=selectDate.size();i++)
	  	{
	  		if(selectDate.get(i).getText().equalsIgnoreCase(date))
	  		{
	  			selectDate.get(i).click();
	  			System.out.println("date select");
	  			break;
	  		}
	  	}
	  	
	  }
	  	catch(Exception e)
	  	{
	  		e.printStackTrace();
	  	}
			
	  }
	  }
	  