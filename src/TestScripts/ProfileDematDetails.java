package TestScripts;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import Locators.Profile_menu;

public class ProfileDematDetails extends MyEsopsLogin {
	
	 public void DematDetails() throws Exception
	{ 
		 String DepositoryName="NSDL";
			//DematDetails
		 	Boolean DematDetailsDematDetails_tab = driver.findElements(By.id("DematDetails")).size() != 0;
			System.out.println("DematDetailsDematDetails_tab" + DematDetailsDematDetails_tab);
			if (DematDetailsDematDetails_tab == true) {
			Profile_menu.DematDetailsDematDetails_tab(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "DematDetailsDematDetails_tab Clicked");
			} else {
			test.log(LogStatus.FAIL, "DematDetailsDematDetails_tab not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean DematDetailsEdit_btn = driver.findElements(By.xpath(".//*[@class='fa fa-pencil']")).size() != 0;
			System.out.println("DematDetailsEdit_btn" + DematDetailsEdit_btn);
			if (DematDetailsEdit_btn == true) {
			Profile_menu.DematDetailsEdit_btn(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "DematDetailsEdit_btn Clicked");
			} else {
			test.log(LogStatus.FAIL, "DematDetailsEdit_btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean Edit_DematDetailsDepositoryName_ddl = driver.findElements(By.id("ddlDepositoryName")).size() != 0;
			System.out.println("Edit_DematDetailsDepositoryName_ddl" + Edit_DematDetailsDepositoryName_ddl);
			if (Edit_DematDetailsDepositoryName_ddl == true) {
			Profile_menu.Edit_DematDetailsDepositoryName_ddl(driver).sendKeys(DepositoryName);
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Edit_DematDetailsDepositoryName_ddl Entered");
			} else {
			test.log(LogStatus.FAIL, "Edit_DematDetailsDepositoryName_ddl not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean Edit_DematDetailsDematAccountType_ddl = driver.findElements(By.id("ddlDematAccType")).size() != 0;
			System.out.println("Edit_DematDetailsDematAccountType_ddl" + Edit_DematDetailsDematAccountType_ddl);
			if (Edit_DematDetailsDematAccountType_ddl == true) {
			Profile_menu.Edit_DematDetailsDematAccountType_ddl(driver).sendKeys("Non Repatriable");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Edit_DematDetailsDematAccountType_ddl Entered");
			} else {
			test.log(LogStatus.FAIL, "Edit_DematDetailsDematAccountType_ddl not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean Edit_DematDetailsDepository_ParticipantName = driver.findElements(By.id("txtDpName")).size() != 0;
			System.out.println("Edit_DematDetailsDepository_ParticipantName" + Edit_DematDetailsDepository_ParticipantName);
			if (Edit_DematDetailsDepository_ParticipantName == true) {
			Profile_menu.Edit_DematDetailsDepository_ParticipantName(driver).clear();
			Profile_menu.Edit_DematDetailsDepository_ParticipantName(driver).sendKeys("DP nme");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Edit_DematDetailsDepository_ParticipantName Entered");
			} else {
			test.log(LogStatus.FAIL, "Edit_DematDetailsDepository_ParticipantName not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			if(DepositoryName.equals("NSDL"))
			{
			Profile_menu.Edit_DematDetailsDepository_ParticipantId(driver).clear();
			Profile_menu.Edit_DematDetailsDepository_ParticipantId(driver).sendKeys("435464");
			test.log(LogStatus.PASS, "Edit_DematDetailsDepository_ParticipantId Entered");
			} else {
			test.log(LogStatus.FAIL, "Edit_DematDetailsDepository_ParticipantId not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			Thread.sleep(2000);
			
			Boolean Edit_DematDetailsClient_DematAccNo = driver.findElements(By.id("txtClientId")).size() != 0;
			System.out.println("Edit_DematDetailsClient_DematAccNo" + Edit_DematDetailsClient_DematAccNo);
			if (Edit_DematDetailsClient_DematAccNo == true) {
			Profile_menu.Edit_DematDetailsClient_DematAccNo(driver).clear();
			Profile_menu.Edit_DematDetailsClient_DematAccNo(driver).sendKeys("1435235235235665");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Edit_DematDetailsClient_DematAccNo Entered");
			} else {
			test.log(LogStatus.FAIL, "Edit_DematDetailsClient_DematAccNo not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean Edit_DematDetailsName_DP_Record = driver.findElements(By.id("txtDpRecord")).size() != 0;
			System.out.println("Edit_DematDetailsName_DP_Record" + Edit_DematDetailsName_DP_Record);
			if (Edit_DematDetailsName_DP_Record == true) {
			Profile_menu.Edit_DematDetailsName_DP_Record(driver).clear();
			Profile_menu.Edit_DematDetailsName_DP_Record(driver).sendKeys("DP name");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Edit_DematDetailsName_DP_Record Entered");
			} else {
			test.log(LogStatus.FAIL, "Edit_DematDetailsName_DP_Record not Entered" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			
			Boolean DematDetailsUpdate_btn = driver.findElements(By.id("BtnUpdateDematDetails")).size() != 0;
			System.out.println("DematDetailsUpdate_btn" + DematDetailsUpdate_btn);
			if (DematDetailsUpdate_btn == true) {
			Profile_menu.DematDetailsUpdate_btn(driver).click();
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "DematDetailsUpdate_btn Clicked");
			} else {
			test.log(LogStatus.FAIL, "DematDetailsUpdate_btn not Clicked" + test.addScreenCapture(Screenshot.captureImage(driver)));
			}
			}

		}