package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Profile_menu 
{
private static WebElement element = null;

public static WebElement UserLogo(WebDriver driver)
{
	element = driver.findElement(By.id("UserLogo")); 
	return element;
}
    //Profile tab
	public static WebElement Profile(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Profile")); 
		return element;
	}
	
	//BrokerDetails
	
	
	public static WebElement BrokerDetails_tab(WebDriver driver)
	{
		element = driver.findElement(By.id("BrokerDetails")); 
		return element;
	}
	public static WebElement BrokerDetails_Add(WebDriver driver)
	{
		element = driver.findElement(By.id("AddBrokerDetails")); 
		return element;
	}
	/*public static WebElement BrokerDetailsedit_icon_1(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='tab-broker-details']/div[1]/div[1]/div[1]/div/div[1]/div[2]/button")); 
		return element;
	}

	public static WebElement BrokerDetailsedit_icon_2(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='tab-broker-details']/div[1]/div[1]/div[2]/div/div[1]/div[2]/button")); 
		return element;
	}

	public static WebElement BrokerDetailsedit_icon_3(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='tab-broker-details']/div[1]/div[1]/div[3]/div/div[1]/div[2]/button")); 
		return element;
	}

	public static WebElement BrokerDetailsedit_icon_4(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='tab-broker-details']/div[1]/div[1]/div[4]/div/div[1]/div[2]/button")); 
		return element;
	}*/

	public static WebElement BrokerDetailsBrokerName(WebDriver driver)
	{
		element = driver.findElement(By.id("txtTrustCompanyNameEdit")); 
		return element;
	}
	public static WebElement EditBrokerDetails(WebDriver driver)
	{
		element = driver.findElement(By.id("BrokerAcc17")); 
		return element;
	}
	public static WebElement BrokerDetailsBrokerId(WebDriver driver)
	{
		element = driver.findElement(By.id("txtTrustCompanyIdEdit")); 
		return element;
	}

	public static WebElement BrokerDetailsBrokerAccountNo(WebDriver driver)
	{
		element = driver.findElement(By.id("txtElectAccNoEdit")); 
		return element;
	}
	public static WebElement BrokerDetailsSave_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnAddBrokerAcc")); 
		return element;
	}
	public static WebElement BrokerDetailsUpdate_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnUpdateBrokerAccount")); 
		return element;
	}
	public static WebElement BrokerDetailsDelete_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnDeleteBrokerAccount")); 
		return element;
	}
	public static WebElement BrokerDetailsEditCancel_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnCancelBrokerAccountEdit")); 
		return element;
	}
	
	public static WebElement BrokerDetailsCancel_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnCancelBrokerAcc")); 
		return element;
	}
/*	public static WebElement BrokerDetailsUpdate_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnUpdateBrokerAccount")); 
		return element;
	}
	
	public static WebElement BrokerDetailsDelete_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnDeleteBrokerAccount")); 
		return element;
	}*/
	
	
	
	public static WebElement BrokerDetailsClose_icon(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='edit-broker-info']/div/div/div[1]/button")); 
		return element;
	}
	
	//DematDetails
	public static WebElement DematDetailsDematDetails_tab(WebDriver driver)
	{
		element = driver.findElement(By.id("DematDetails")); 
		return element;
	}
	public static WebElement DematDetailsDematDetails_Add(WebDriver driver)
	{
		element = driver.findElement(By.className("add-demat-acc"));
			return element;
	}
	public static WebElement DematDetailsEdit_btn(WebDriver driver)
	{	element = driver.findElement(By.xpath("//button[@class='btn-edit openModal editDemat']")); 
		return element;
	}
	
	
	public static WebElement Add_DematDetailsDepositoryName_ddl(WebDriver driver)
	{
		element = driver.findElement(By.id("ddlDepositename")); 
		return element;
	}
	
	public static WebElement Add_DematDetailsDematAccountType_ddl(WebDriver driver)
	{
		element = driver.findElement(By.id("ddlDematAccountType")); 
		return element;
	}
	
	public static WebElement Add_DematDetailsDepository_ParticipantName(WebDriver driver)
	{
		element = driver.findElement(By.id("txtDepositoryParticipantName")); 
		return element;
	}
	
	public static WebElement Add_DematDetailsDepository_ParticipantId(WebDriver driver)
	{
		element = driver.findElement(By.id("txtDepositoryParticipantId")); 
		return element;
	}
	
	public static WebElement Add_DematDetailsClient_DematAccNo(WebDriver driver)
	{
		element = driver.findElement(By.id("txtClientIdNo")); 
		return element;
	}
	
	public static WebElement Add_DematDetailsName_DP_Record(WebDriver driver)
	{
		element = driver.findElement(By.id("txtNameDPRecord")); 
		return element;
	}
	
	public static WebElement Edit_DematDetailsDepositoryName_ddl(WebDriver driver)
	{
		element = driver.findElement(By.id("ddlDepositoryName")); 
		return element;
	}
	
	public static WebElement Edit_DematDetailsDematAccountType_ddl(WebDriver driver)
	{
		element = driver.findElement(By.id("ddlDematAccType")); 
		return element;
	}
	
	public static WebElement Edit_DematDetailsDepository_ParticipantName(WebDriver driver)
	{
		element = driver.findElement(By.id("txtDpName")); 
		return element;
	}
	
	public static WebElement Edit_DematDetailsDepository_ParticipantId(WebDriver driver)
	{
		element = driver.findElement(By.id("txtDepositoryPartiId")); 
		return element;
	}
	
	public static WebElement Edit_DematDetailsClient_DematAccNo(WebDriver driver)
	{
		element = driver.findElement(By.id("txtClientId")); 
		return element;
	}
	
	public static WebElement Edit_DematDetailsName_DP_Record(WebDriver driver)
	{
		element = driver.findElement(By.id("txtDpRecord")); 
		return element;
	}
	public static WebElement DematDetailsSave_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnAddNow")); 
		return element;
	}
	public static WebElement DematDetailsUpdate_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("BtnUpdateDematDetails")); 
		return element;
	}
	
	//BtnUpdateDematDetails
/*	public static WebElement DematDetailsUpdate_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("BtnUpdateDematDetails")); 
		return element;
	}
	
	public static WebElement DematDetailsDelete_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnDelete")); 
		return element;
	}
	*/
	public static WebElement DematDetailsCancel_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnCancelDematAcc")); 
		return element;
	}
	
	/*public static WebElement DematDetailsClose_icon(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='edit-demat-info']/div/div/div[1]/button")); 
		return element;
	}*/
		
	
	//OtherDetails
	public static WebElement OtherDetails(WebDriver driver)
	{
		element = driver.findElement(By.id("OtherDetails")); 
		return element;
	}
	
	public static WebElement OtherDetailsPAN(WebDriver driver)
	{
		element = driver.findElement(By.id("txtPan")); 
		return element;
	}
	
	public static WebElement OtherDetailsResidentialStatus(WebDriver driver)
	{
		element = driver.findElement(By.id("ddlResidentialStatus")); 
		return element;
	}
	
	public static WebElement OtherDetailsInsiderEmployee(WebDriver driver)
	{
		element = driver.findElement(By.id("ddlInsiderEmployee")); 
		return element;
	}
	
	public static WebElement OtherDetailsEntity(WebDriver driver)
	{
		element = driver.findElement(By.id("txtDepartment")); 
		return element;
	}
	public static WebElement OtherDetailsDepartment(WebDriver driver)
	{
		element = driver.findElement(By.id("txtDepartment")); 
		return element;
	}
	
	public static WebElement OtherDetailsCostCenter(WebDriver driver)
	{
		element = driver.findElement(By.id("txtSBU")); 
		return element;
	}
	public static WebElement OtherDetailsSBU(WebDriver driver)
	{
		element = driver.findElement(By.id("txtSBU")); 
		return element;
	}
	public static WebElement OtherDetailsLocation(WebDriver driver)
	{
		element = driver.findElement(By.id("txtLocation")); 
		return element;
	}
	
	public static WebElement OtherDetailsTaxIdentifierCountry(WebDriver driver)
	{
		element = driver.findElement(By.id("ddltaxIdCountry")); 
		return element;
	}
	
	public static WebElement OtherDetailsTaxIdentifierState(WebDriver driver)
	{
		element = driver.findElement(By.id("ddlTaxIdentifierState")); 
		return element;
	}
	
	public static WebElement OtherDetailsSave_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("BtnSaveDetails")); 
		return element;
	}
	
	public static WebElement OtherDetailsCancel_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("BtnCancelOtherDetails")); 
		return element;
	}
	
	//UserDetails
	public static WebElement UserDetails(WebDriver driver)
	{
		element = driver.findElement(By.id("UserDetails")); 
		return element;
	}
	
	public static WebElement DateOfJoining(WebDriver driver)
	{
		element = driver.findElement(By.id("txtDOJ")); 
		return element;
	}
	public static WebElement Grade(WebDriver driver)
	{
		element = driver.findElement(By.id("txtGrade")); 
		return element;
	}
	public static WebElement FathersName(WebDriver driver)
	{
		element = driver.findElement(By.id("txtFathersName")); 
		return element;
	}
	
	public static WebElement CountryName_ddl(WebDriver driver)
	{
		element = driver.findElement(By.id("ddlCountryName")); 
		return element;
	}
	
	public static WebElement ContactNumber(WebDriver driver)
	{
		element = driver.findElement(By.id("txtContactNumber")); 
		return element;
	}
	
	public static WebElement Email(WebDriver driver)
	{
		element = driver.findElement(By.id("txtEmail")); 
		return element;
	}
	
	public static WebElement Designation(WebDriver driver)
	{
		element = driver.findElement(By.id("txtDesignation")); 
		return element;
	}
	
	public static WebElement Address(WebDriver driver)
	{
		element = driver.findElement(By.id("txtAddress")); 
		return element;
	}
	
	public static WebElement Save_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("btnSave")); 
		return element;
	}
	public static WebElement Save_btnPopUP(WebDriver driver)
	{
		element = driver.findElement(By.id("btn1")); 
		return element;
	}
	public static WebElement Cancel_btn(WebDriver driver)
	{
		element = driver.findElement(By.id("BtnCancelUserDetails")); 
		return element;
	}
	
	public static WebElement Cancel_btn_Other(WebDriver driver)
	{
		element = driver.findElement(By.id("BtnCancelOtherDetails")); 
		return element;
	}
	
	
}
