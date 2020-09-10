package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NominationDetails_Locators {
		private static WebElement element = null;
		public static WebElement Logo(WebDriver driver)
		{
			element = driver.findElement(By.id("UserLogo")); 
			return element;
		}

			public static WebElement Nomination_menu(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li[3]/ul/li[2]/a")); 
				return element;
			}
			
			public static WebElement Notes(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='aspnetForm']/div[6]/div/div/div/div[1]/div[2]/div/button")); 
				return element;
			}
			
			public static WebElement Close_icon_Notes(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='aspnetForm']/div[6]/div/div/div/div[2]/div/div/button")); 
				return element;
			}
			
			public static WebElement EditNominee(WebDriver driver)
			{
				element = driver.findElement(By.xpath("html/body/form/div[6]/div/div/div/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button")); 
				return element;
			}
			
			public static WebElement NomineeName(WebDriver driver)
			{
				element = driver.findElement(By.id("txtNomineeName")); 
				return element;
			}
			
			public static WebElement EditNomineeName(WebDriver driver)
			{
				element = driver.findElement(By.id("txtNameOfNominee")); 
				return element;
			}
			
			public static WebElement DOB_Nominee(WebDriver driver)
			{
				element = driver.findElement(By.id("txtDOBNominee")); 
				return element;
			}
			
			public static WebElement PercentOfShare(WebDriver driver)
			{
				element = driver.findElement(By.id("txtShare")); 
				return element;
			}
			
			public static WebElement EditPercentOfShare(WebDriver driver)
			{
				element = driver.findElement(By.id("txtPercentShare")); 
				return element;
			}
			
			
			public static WebElement NomineeAddress(WebDriver driver)
			{
				element = driver.findElement(By.id("txtNomineeAddress")); 
				return element;
			}
			
			public static WebElement EditNomineeAddress(WebDriver driver)
			{
				element = driver.findElement(By.id("txtNomineeAdreess")); 
				return element;
			}
			
			
			
			public static WebElement NameOfGuardian(WebDriver driver)
			{
				element = driver.findElement(By.id("txtGuardianName")); 
				return element;
			}
			
			public static WebElement EditNameOfGuardian(WebDriver driver)
			{
				element = driver.findElement(By.id("txtNameOfGuardian")); 
				return element;
			}
			
			
			public static WebElement AddressOfGuardian(WebDriver driver)
			{
				element = driver.findElement(By.id("txtGuardianAddress")); 
				return element;
			}
			
			public static WebElement EditAddressOfGuardian(WebDriver driver)
			{
				element = driver.findElement(By.id("txtAddressofguardian")); 
				return element;
			}
			
			public static WebElement DOB_Guardian(WebDriver driver)
			{
				element = driver.findElement(By.id("txtDateOfBirth")); 
				return element;
			}	
			
			public static WebElement EditDOB_Guardian(WebDriver driver)
			{
				element = driver.findElement(By.id("txtDOBGuardian")); 
				return element;
			}
			
			public static WebElement Update_btn(WebDriver driver)
			{
				element = driver.findElement(By.id("EditNow")); 
				return element;
			}
			
			public static WebElement Delete_btn(WebDriver driver)
			{
				element = driver.findElement(By.id("btnDelete")); 
				return element;
			}
			
			public static WebElement Cancel_btn(WebDriver driver)
			{
				element = driver.findElement(By.id("btnCancelAdd")); 
				return element;
			}
			
			public static WebElement Close_icon_NomineeDetail(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='edit-nominee-info']/div/div/div[1]/button")); 
				return element;
			}
			
			public static WebElement Plus_icon_AddNominee(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='add-nominee']/div/div/i")); 
				return element;
			}
			
			public static WebElement AddNominee_Text(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='add-nominee']/div/div/p")); 
				return element;
			}
			
			
			
			public static WebElement GenerateNomineeForm(WebDriver driver)
			{
				element = driver.findElement(By.id("generateNomineePDF")); 
				return element;
			}
			
			//Add Nominee - Nominee Detail
			public static WebElement AddNominee_NameOfNominee(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='txtNomineeName']")); 
				return element;
			}
			
			public static WebElement AddNominee_DateOfBirth(WebDriver driver)
			{
				element = driver.findElement(By.id("txtDOB")); 
				return element;
			}
			
			public static WebElement EditNominee_DateOfBirth(WebDriver driver)
			{
				element = driver.findElement(By.id("txtDOBNominee")); 
				return element;
			}
			
			public static WebElement AddNominee_PercentOfShare(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='txtShare']")); 
				return element;
			}
			
			public static WebElement AddNominee_AddressOfNominee(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='txtNomineeAddress']")); 
				return element;
			}
			
			public static WebElement AddNominee_Save_btn(WebDriver driver)
			{
				element = driver.findElement(By.id("btnAddNow")); 
				return element;
			}
			
			
			public static WebElement UpdateNominee(WebDriver driver)
			{
				element = driver.findElement(By.id("EditNow")); 
				return element;
			}
			
			public static WebElement DeleteNominee(WebDriver driver)
			{
				element = driver.findElement(By.id("btnDelete")); 
				return element;
			}
			
			public static WebElement AddNominee_Cancel_btn(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='btnCancelAdd']")); 
				return element;
			}
			
			public static WebElement AddNominee_Close_icon(WebDriver driver)
			{
				element = driver.findElement(By.xpath(".//*[@id='add-nominee-info']/div/div/div[1]/button")); 
				return element;
			}
			
			public static WebElement EditNominee_Cancel_btn(WebDriver driver)
			{
				element = driver.findElement(By.xpath("//button[@id='BtnCancel']")); 
				return element;
			}
			
			public static WebElement EditNominee2(WebDriver driver)
			{
				//html/body/form/div[6]/div/div/div/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/button
			element = driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button")); 
			return element;
			}

		}
