package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExerciseNow_Locators {
	private static WebElement element = null;
	
	/*******************************************************************************************
	* 
	*                       
	* HISTORY          :   AUTHOR                  	DATE            	VERSION
	* 
	* CREATED BY       :   Gaurav			18-December-2019     	1.0
	*
	*******************************************************************************************/	

		
		public static WebElement ExerciseNow(WebDriver driver)
		{
		element =  driver.findElement(By.linkText("Exercise"));
		return element;
		}
		public static WebElement ExerciseNowLink(WebDriver driver)
		{
		element =  driver.findElement(By.linkText("Exercise Now"));
		return element;
		}
		public static WebElement ExerciseNowResetGrid(WebDriver driver)
		{
		element =  driver.findElement(By.xpath("//button[@id='btnResetGrid']"));
		return element;
		}
		public static WebElement ExerciseNowclose(WebDriver driver)
		{
		element =  driver.findElement(By.xpath(".//*[@id='btnCloseNotes']"));
		return element;
		}
		public static WebElement IstruNames(WebDriver driver)
		{
		element =  driver.findElement(By.xpath(".//*[@class='nav nav-tabs nav-tabs-custom']"));
		return element;
		}
		
		public static WebElement ExerciseNowNotesBtn(WebDriver driver)
		{
		element =  driver.findElement(By.xpath("//button[@id='btnExNotes']"));
		return element;
		}
		public static WebElement ExerciseNowInstruction(WebDriver driver)
		{
		element =  driver.findElement(By.xpath("//button[@id='btnExInstuction']"));
		return element;
		}
		public static WebElement ExerciseNowInstructionClose(WebDriver driver)
		{
		element =  driver.findElement(By.xpath("//button[@id='btnExInstuction']"));
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
public static WebElement ExerciseNowGrid(WebDriver driver,String MIT_ID)
{
	/* element = driver.findElement(By.xpath("//div[@class='tab-pane tab-esops active']//div[@class='col-sm-12 table-wrapper-scroll-y tableFixHead']"));
				 return element;*/
	 if(MIT_ID.equals("1"))
	 {
		// TESOPSInstrId
		 element=driver.findElement(By.xpath(".//*[@id='exerciseESOPTable']"));
	 }
	 if(MIT_ID.equals("2"))
	 {//TRSUsInstrId
		 element=driver.findElement(By.xpath(".//*[@id='exerciseRSUsTable']"));
	 }
	 if(MIT_ID.equals("3"))
	 {//TADRsInstrId
		 element = driver.findElement(By.xpath(".//*[@id='exerciseADRTable']")); 
	 }
	
	 if(MIT_ID.equals("4"))
	 {//TADRsRSUInstrId
		 element =driver.findElement(By.xpath(".//*[@id='exerciseADRsRSUTable']"));
	 }
	 if(MIT_ID.equals("5"))
	 {//TPhantomInstrId
		 element =driver.findElement(By.xpath(".//*[@id='exercisePhantomTable']"));
	 }
	 if(MIT_ID.equals("6"))
	 {//TEquitySARsInstrId
		 element=driver.findElement(By.xpath("//table[@id='exerciseEquityTable']"));
	 }
	 if(MIT_ID.equals("7"))
	 {//TCashSARsInstrId
		  element=driver.findElement(By.xpath("//table[@id='exerciseCashTable']"));
	 }	
	 if(MIT_ID.equals("8"))
	 {//TEquityCashSARsInstrId
		  element=driver.findElement(By.xpath(".//*[@id='exerciseEquityCashTable']"));
	 }	
				 return element;
				 
}
public static WebElement BtnCalculate(WebDriver driver)
{
	element = driver.findElement(By.id("btnCompute"));
	return element;
}
public static WebElement BtnCalculatePopUpCloseBtm2(WebDriver driver)
{element = driver.findElement(By.id("btn1"));
return element;
}
public static WebElement BtnCalculatePopUpCloseMessage(WebDriver driver)
{
	element = driver.findElement(By.xpath("//div[@class='jconfirm-content']"));
return element;
}
public static WebElement TentativetaxPopup(WebDriver driver)
{
	element = driver.findElement(By.id("TpopupComponentTaxId"));	
	return element;
}
public static WebElement ClosePopUp(WebDriver driver)
{
	element = driver.findElement(By.id("exerciseNowpopup_modal_taxCloseID"));
	return element;
}
public static WebElement ProceedToExercise(WebDriver driver)
{
	element = driver.findElement(By.id("ExWizardID"));
	return element;
}
public static WebElement ProceedToExercisePopUpCloseBtm(WebDriver driver)
{
	element = driver.findElement(By.id("closeConfirmexerciseID"));
	return element;
}

public static WebElement ProceedToExerciseClose(WebDriver driver)
{
	element = driver.findElement(By.id("closeConfirmexerciseID"));
	return element;
}
public static WebElement ExNowTentativeTax(WebDriver driver)
{
	element = driver.findElement(By.id("TconfirmTaxId"));
	return element;
}
public static WebElement ExNowTentativeTaxClose(WebDriver driver)
{
	element = driver.findElement(By.xpath("/html/body/div[11]/div/div/div[1]/button/i"));
	return element;
}

public static WebElement ExNowPaymentModeBackBtn(WebDriver driver)
{
	element = driver.findElement(By.xpath("//button[@id='btnBackToForm']"));
	return element;
}




public static WebElement DirectDebit(WebDriver driver)
{
	element = driver.findElement(By.id("of-direct-debit"));
	return element;
}
public static WebElement DirectDebitClose(WebDriver driver)
{
	element = driver.findElement(By.xpath("//div[@id='OwnfundsPaymentViewId']//button[@class='close']"));
	return element;
}
public static WebElement DirectDebitView(WebDriver driver)
{
	element = driver.findElement(By.xpath("//*[@id=\"paymentmodesId\"]/div[1]/div[1]/label/a"));
	return element;
}
public static WebElement RTGS(WebDriver driver)
{
	element = driver.findElement(By.id("of-rtgs"));
	return element;
}
public static WebElement RTGSView(WebDriver driver)
{
	element = driver.findElement(By.xpath("//*[@id=\"paymentmodesId\"]/div[1]/div[2]/label/a"));
	return element;
}
public static WebElement WireTransfer(WebDriver driver)
{
	element = driver.findElement(By.id("of-wiretransfer"));
	return element;
}
public static WebElement WireTransferView(WebDriver driver)
{
	element = driver.findElement(By.xpath("//*[@id=\"paymentmodesId\"]/div[1]/div[3]/label/a"));
	return element;
}
public static WebElement DD(WebDriver driver)
{
	element = driver.findElement(By.id("of-dd"));
	return element;
}
public static WebElement DDView(WebDriver driver)
{
	element = driver.findElement(By.xpath("//*[@id=\"paymentmodesId\"]/div[2]/div[1]/label/a"));
	return element;
}
public static WebElement Cheque(WebDriver driver)
{
	element = driver.findElement(By.id("of-cheque"));
	return element;
}
public static WebElement ChequeView(WebDriver driver)
{
	element = driver.findElement(By.xpath("//*[@id=\"paymentmodesId\"]/div[2]/div[2]/label/a"));
	return element;
}
public static WebElement PaymentModeAgree(WebDriver driver)
{
	element = driver.findElement(By.id("remember"));
	return element;
}
public static WebElement PaymentModeBack(WebDriver driver)
{
	element = driver.findElement(By.id("btnBackToForm"));
	return element;
}
public static WebElement PaymentModePayNow(WebDriver driver)
{
	element = driver.findElement(By.id("btnPayNowID"));
	return element;
}
public static WebElement PaymentModePayNowOk(WebDriver driver)
{
	element = driver.findElement(By.id("btn1"));
	return element;
}
public static WebElement ConfirmExercisedBtn_Ok_PopUpBtn(WebDriver driver)
{
	element =   driver.findElement(By.id("btn1"));
	return element;
}

/*-----------------------Direct Debit method--------------------*/
public static WebElement DebitNoExerciseAmount(WebDriver driver)
{
	element = driver.findElement(By.name("DebitNoAmount"));
	return element;
}
public static WebElement DebitNoExercisePerquisite(WebDriver driver)
{
	element = driver.findElement(By.name("DebitNoTax"));
	return element;
}
public static WebElement ConfirmUpdateDetails(WebDriver driver)
{
	element = driver.findElement(By.id("confirmupdatesID"));
	return element;
}
public static WebElement ConfirmForm(WebDriver driver)
{
	element = driver.findElement(By.id("GeneratedFormConfirmId"));
	return element;
}
public static WebElement DownloadForm(WebDriver driver)
{
	element = driver.findElement(By.id("DownloadGeneratedForm"));
	return element;
}

/*-------------------------RRTGS--------------------------*/
public static WebElement AmtRTGSNo(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSNoAmount"));
	return element;
}
public static WebElement AmtBankName(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSBankNameAmount"));
	return element;
}
public static WebElement AmtBankBranch(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSBankBranchAmount"));
	return element;
}
public static WebElement AmtBankAccNo(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSBankAccNoAmount"));
	return element;
}
public static WebElement AmtPaymentDate(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSPaymentDateAmount"));
	return element;
}

public static WebElement TaxRTGSNo(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSNoTax"));
	return element;
}
public static WebElement TaxBankName(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSBankNameTax"));
	return element;
}
public static WebElement TaxBankBranch(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSBankBranchTax"));
	return element;
}
public static WebElement TaxBankAccNo(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSBankAccNoTax"));
	return element;
}
public static WebElement TaxPaymentDate(WebDriver driver)
{
	element = driver.findElement(By.name("RTGSPaymentDateTax"));
	return element;
}
/*-----------------------WireTransfer-----------------------*/
public static WebElement AmtWRemID(WebDriver driver)
{
	element = driver.findElement(By.name("WTRefIdAmount"));
	return element;
}
public static WebElement AmtSWIFT(WebDriver driver)
{
	element = driver.findElement(By.name("WTBANNoAmount"));
	return element;
}
public static WebElement AmtWBankName(WebDriver driver)
{
	element = driver.findElement(By.name("WTBankNameAmount"));
	return element;
}
public static WebElement AmtWBankBranch(WebDriver driver)
{
	element = driver.findElement(By.name("WTBankBranchAmount"));
	return element;
}
public static WebElement AmtWBankAccNo(WebDriver driver)
{
	element = driver.findElement(By.name("WTBankAccNoAmount"));
	return element;
}
public static WebElement AmtWDate(WebDriver driver)
{
	element = driver.findElement(By.name("WTDateAmount"));
	return element;
}

public static WebElement TaxWRemID(WebDriver driver)
{
	element = driver.findElement(By.name("WTRefIdTax"));
	return element;
}
public static WebElement TaxSWIFT(WebDriver driver)
{
	element = driver.findElement(By.name("WTBANNoTax"));
	return element;
}
public static WebElement TaxWBankName(WebDriver driver)
{
	element = driver.findElement(By.name("WTBankNameTax"));
	return element;
}
public static WebElement TaxWBankBranch(WebDriver driver)
{
	element = driver.findElement(By.name("WTBankBranchTax"));
	return element;
}
public static WebElement TaxWBankAccNo(WebDriver driver)
{
	element = driver.findElement(By.name("WTBankAccNoTax"));
	return element;
}
public static WebElement TaxWDate(WebDriver driver)
{
	element = driver.findElement(By.name("WTDateTax"));
	return element;
}
/*-----------------------DD-----------------------------------*/
public static WebElement AmtDD(WebDriver driver)
{
	element = driver.findElement(By.name("DDNOAmount"));
	return element;
}
public static WebElement AmtDDDate(WebDriver driver)
{
	element = driver.findElement(By.name("DDDateAmount"));
	return element;
}
public static WebElement AmtDDBankName(WebDriver driver)
{
	element = driver.findElement(By.name("DDBankNameAmount"));
	return element;
}

public static WebElement TaxDD(WebDriver driver)
{
	element = driver.findElement(By.name("DDNOTax"));
	return element;
}
public static WebElement TaxDDDate(WebDriver driver)
{
	element = driver.findElement(By.name("DDDateTax"));
	return element;
}
public static WebElement TaxDDBankName(WebDriver driver)
{
	element = driver.findElement(By.name("DDBankNameTax"));
	return element;
}
/*------------------------Cheque--------------------------------------------*/
public static WebElement AmtChequeNo(WebDriver driver)
{
	element = driver.findElement(By.name("ChequeNoAmount"));
	return element;
}
public static WebElement AmtChequeDate(WebDriver driver)
{
	element = driver.findElement(By.name("ChequeDateAmount"));
	return element;
}
public static WebElement AmtChequeBankName(WebDriver driver)
{
	element = driver.findElement(By.name("BankNameAmount"));
	return element;
}

public static WebElement TaxChequeNo(WebDriver driver)
{
	element = driver.findElement(By.name("ChequeNoTax"));
	return element;
}
public static WebElement TaxChequeDate(WebDriver driver)
{
	element = driver.findElement(By.name("ChequeDateTax"));
	return element;
}
public static WebElement TaxChequeBankName(WebDriver driver)
{
	element = driver.findElement(By.name("BankNameTax"));
	return element;
}

public static WebElement FileNotFound(WebDriver driver)
{
	element = driver.findElement(By.xpath("//*[@id=\"step-3\"]/div[2]/div"));
	return element;
}


}
