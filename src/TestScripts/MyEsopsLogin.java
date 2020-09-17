package TestScripts;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;

import BaseClasses.Login_BaseClass;
import Utility.Read_XLS;
import Utility.SuiteUtility;

public class MyEsopsLogin extends Login_BaseClass {

	Read_XLS FilePath = null;
	String SheetName = null;
	String TestCaseName = null;
	String ToRunColumnNameTestCase = null;
	String ToRunColumnNameTestData = null;
	String TestDataToRun[] = null;
	static int DataSet = -1;
	static boolean Testskip = false;
	static boolean Testfail;
	static boolean TestCasePass = true;
	SoftAssert s_assert = null;
	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @BeforeTest
	 * 
	 * DESCRIPTION : To run particular function before every test
	 * 
	 * FUNCTION NAME : checkCaseToRun()
	 * 
	 * 
	 * DESCRIPTION : This function is used to 1.To check which test case should
	 * be run from excel 2.Insert log In applog.log file. 3.To check test case's
	 * CaseToRun = Y or N In related excel sheet. If CaseToRun = N or blank,
	 * Test case will skip execution. Else It will be executed. 4.To report
	 * result as skip for test cases In TestCasesList sheet. 5.To throw skip
	 * exception for this test case. 6.To retrieve DataToRun flags of all data
	 * set lines from related test data sheet.
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 * 
	 * @throws Exception
	 **************************************************/

	@BeforeTest
	public void checkCaseToRun() throws Exception {
		init();

		report = new ExtentReports(System.getProperty("user.dir") + "/src/Reports/ExtentReportResults.html", true);

		FilePath = TestCaseListExcelOne;
		TestCaseName = this.getClass().getSimpleName();

		SheetName = "TestCasesList";

		ToRunColumnNameTestCase = "CaseToRun";

		ToRunColumnNameTestData = "DataToRun";

		Add_Log.info(TestCaseName + " : Execution started.");

		if (!SuiteUtility.checkToRunUtility(FilePath, SheetName, ToRunColumnNameTestCase, TestCaseName)) {
			Add_Log.info(TestCaseName + " : CaseToRun = N for So Skipping Execution.");

			SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip", TestCaseName, "SKIP");

			throw new SkipException(
					TestCaseName + "'s CaseToRun Flag Is 'N' Or Blank. So Skipping Execution Of " + TestCaseName);
		}

		TestDataToRun = SuiteUtility.checkToRunUtilityOfData(FilePath, TestCaseName, ToRunColumnNameTestData);
	}

	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @Test(dataProvider="LoginData",priority=1)
	 * 
	 * DESCRIPTION : 1.To run particular function for test with priority 2.To
	 * provide data from dataset
	 * 
	 * 
	 * FUNCTION NAME : Login()
	 * 
	 * 
	 * DESCRIPTION : This function is used to 1.To pass test data from data
	 * provider 2.If found DataToRun = "N" for data set then execution will be
	 * skipped for that data set.
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 * 
	 * @throws Exception
	 **************************************************/

	@Test(dataProvider = "LoginData", priority = 1)
	public void EmployeeLogin(String UserId, String Password, String NewPassword, String companyid, String Product,
			String browserName, String Ans1, String Ans2, String Instruments) throws Exception {

		DataSet++;
		// Created object of testng SoftAssert class.
		s_assert = new SoftAssert();
		// If found DataToRun = "N" for data set then execution will be skipped
		// for that data set.
		if (!TestDataToRun[DataSet].equalsIgnoreCase("Y")) {
			Add_Log.info(TestCaseName + " : DataToRun = N for data set line " + (DataSet + 1)
					+ " So skipping Its execution.");
			// If DataToRun = "N", Set Testskip=true.
			Testskip = true;
			throw new SkipException(
					"DataToRun for row number " + DataSet + " Is No Or Blank. So Skipping Its Execution.");
		}
		System.out.println("Value Of DataSet in UserData = " + DataSet);
		// If found DataToRun = "N" for data set then execution will be skipped
		// for that data set.
		if (!TestDataToRun[DataSet].equalsIgnoreCase("Y")) {
			// If DataToRun = "N", Set Testskip=true.
			Testskip = true;
			throw new SkipException(
					"DataToRun for row number " + DataSet + " Is No Or Blank. So Skipping Its Execution.");
		}

		System.out.println("Product " + Product);
		String Productwithoutspace = Product.replaceAll("\\s", "");
		String CompanyId1 = companyid.toUpperCase();
		// ===Open browser=====
		fn_browserinit(browserName);
		// =================Login=================
		test = report.startTest("URLs");
		URLs Login2 = new URLs();
		Login2.Login(Productwithoutspace);
		// =================Login=================
		test = report.startTest("Login");
		UserCredentials UserCredentialsdetails1 = new UserCredentials();
		UserCredentialsdetails1.UserCredentialsData(UserId, Password, NewPassword, CompanyId1, Productwithoutspace,
				Ans1, Ans2);
		// ==================Default change PWD==========
		DefaultPWDChange PwdChange = new DefaultPWDChange();
		PwdChange.defaultPEDChangedata(UserId, Password, NewPassword);
		System.out.println("ChangePassword");
		// ===Open browser=====
		fn_browserinit(browserName);
		// =================Login=================
		test = report.startTest("URLs");
		URLs Login3 = new URLs();
		Login3.Login(Productwithoutspace);
		// =================Login=================
		test = report.startTest("Login");
		UserCredentials UserCredentialsdetails2 = new UserCredentials();
		UserCredentialsdetails2.UserCredentialsData(UserId, Password, NewPassword, CompanyId1, Productwithoutspace,
				Ans1, Ans2);

		// ===============NominationDetails=========
		Nomination NominationClk = new Nomination();
		NominationClk.NominationClick();
		Thread.sleep(2000);

		// =======ProfileMenu===================
		test = report.startTest("ProfileMenu");
		ProfileUserDetails user = new ProfileUserDetails();
		user.UserDetails();

		ProfileOtherDetails other = new ProfileOtherDetails();
		other.OtherDetails();

		ProfileDematDetails demat = new ProfileDematDetails();
		demat.DematDetails();
		// ========close browser=================
		test = report.startTest("close browser");
		CloseBrowser Logout2 = new CloseBrowser();
		Logout2.CloseBrowser1();
		// ===Open browser=====
		fn_browserinit(browserName);
		// =================Login=================
		test = report.startTest("URLs");
		URLs Login4 = new URLs();
		Login4.Login(Productwithoutspace);
		// =================Login=================
		test = report.startTest("Login");
		UserCredentials UserCredentialsdetails3 = new UserCredentials();
		UserCredentialsdetails3.UserCredentialsData(UserId, Password, NewPassword, CompanyId1, Productwithoutspace,Ans1, Ans2);
		// =============Dashboard====================
		test = report.startTest("Dashboard");
		Dashboard Dashboardclk = new Dashboard();
		Dashboardclk.Dashboardclick();
		// ========close browser=================
		test = report.startTest("close browser");
		CloseBrowser Logout4 = new CloseBrowser();
		Logout4.CloseBrowser1();
		// ===Open browser=====
		fn_browserinit(browserName);

		// =================Login=================
		test = report.startTest("URLs");
		URLs Login5 = new URLs();
		Login5.Login(Productwithoutspace);
		// =================Login=================
		test = report.startTest("Login");
		UserCredentials UserCredentialsdetails4 = new UserCredentials();
		UserCredentialsdetails4.UserCredentialsData(UserId, Password, NewPassword, CompanyId1, Productwithoutspace,
				Ans1, Ans2);

		// ==============ExerciseNow=================

		test = report.startTest("ExerciseNow");
		ExerciseNow ExerciseNowClk = new ExerciseNow();
		ExerciseNowClk.ExerciseNowClick(Instruments);

		// ========close browser=================
		test = report.startTest("close browser");
		CloseBrowser Logout5 = new CloseBrowser();
		Logout5.CloseBrowser1();
		// ===Open browser=====
		fn_browserinit(browserName);
		// =================Login=================
		test = report.startTest("URLs");
		URLs Login6 = new URLs();
		Login6.Login(Productwithoutspace);
		// =================Login=================
		test = report.startTest("Login");
		UserCredentials UserCredentialsdetails5 = new UserCredentials();
		UserCredentialsdetails5.UserCredentialsData(UserId, Password, NewPassword, CompanyId1, Productwithoutspace,
				Ans1, Ans2);

		// =============Inprocess===============
		test = report.startTest("InProcess");
		InProcess InprocessClk = new InProcess();
		InprocessClk.InProcessClick();
		// ========close browser=================
		test = report.startTest("close browser");
		CloseBrowser Logout6 = new CloseBrowser();
		Logout6.CloseBrowser1();
		// ===Open browser=====
		fn_browserinit(browserName);
		// =================Login=================
		test = report.startTest("URLs");
		URLs Login7 = new URLs();
		Login7.Login(Productwithoutspace);
		// =================Login=================
		test = report.startTest("Login");
		UserCredentials UserCredentialsdetails6 = new UserCredentials();
		UserCredentialsdetails6.UserCredentialsData(UserId, Password, NewPassword, CompanyId1, Productwithoutspace,
				Ans1, Ans2);

		// ===========ViewAllotment============
		test = report.startTest("ViewAllotment");
		ViewAllotment ViewAllotmentClk = new ViewAllotment();
		ViewAllotmentClk.ViewAllotmentClick();
		// ========close browser=================
		test = report.startTest("close browser");
		CloseBrowser Logout7 = new CloseBrowser();
		Logout7.CloseBrowser1();
		// ===Open browser=====
		fn_browserinit(browserName);
		// =================Login=================
		test = report.startTest("URLs");
		URLs Login8 = new URLs();
		Login8.Login(Productwithoutspace);
		// =================Login=================
		test = report.startTest("Login");
		UserCredentials UserCredentialsdetails7 = new UserCredentials();
		UserCredentialsdetails7.UserCredentialsData(UserId, Password, NewPassword, CompanyId1, Productwithoutspace,
				Ans1, Ans2);

		// ==============ReportDashboard=======
		test = report.startTest("ReportDashboard");
		ReportDashboard ReportDashboardclk = new ReportDashboard();
		ReportDashboardclk.ReportDashboardClick();

		CancellationReport CancellationReportClk = new CancellationReport();
		CancellationReportClk.cancellationReportClick();

		MySummaryReport MySummaryReportClk = new MySummaryReport();
		MySummaryReportClk.MySummaryReportClick();

		// =======================Information Centre========
		test = report.startTest("Information Centre");
		InformationCentre_FAQ informationCenterClk = new InformationCentre_FAQ();
		informationCenterClk.InformationCenterClick();

		InformationCenter_SchemeDetails InformationCenter_SchemeDetailsclk = new InformationCenter_SchemeDetails();
		InformationCenter_SchemeDetailsclk.InformationCenterClick();
		// ========close browser=================
		test = report.startTest("close browser");
		CloseBrowser Logout8 = new CloseBrowser();
		Logout8.CloseBrowser1();
		// ===Open browser=====
		fn_browserinit(browserName);
		// =================Login=================
		test = report.startTest("URLs");
		URLs Login9 = new URLs();
		Login9.Login(Productwithoutspace);
		// =================Login=================
		test = report.startTest("Login");
		UserCredentials UserCredentialsdetails8 = new UserCredentials();
		UserCredentialsdetails8.UserCredentialsData(UserId, Password, NewPassword, CompanyId1, Productwithoutspace,
				Ans1, Ans2);

		// ==========changePassword==============
		test = report.startTest("changePassword");
		ChangePasswordTest ChangePasswordClk = new ChangePasswordTest();
		ChangePasswordClk.ChangePasswordClick(UserId, Password, NewPassword);
		// ========close browser=================
		test = report.startTest("close browser");
		CloseBrowser Logout3 = new CloseBrowser();
		Logout3.CloseBrowser1();
	}

	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @DataProvider
	 * 
	 * DESCRIPTION :
	 * 
	 * 1.This data provider method will return 4 column's data one by one In
	 * every Iteration.
	 * 
	 * 
	 * FUNCTION NAME : LoginData()
	 * 
	 * 
	 * DESCRIPTION : This function is used to 1.To retrieve data from Data 1
	 * Column,Data 2 Column,Data 3 Column and Expected Result column of
	 * SuiteOneCaseOne data Sheet. Last two columns (DataToRun and
	 * Pass/Fail/Skip) are Ignored programatically when reading test data.
	 * 
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 **************************************************/

	@DataProvider
	public Object[][] LoginData() {

		return SuiteUtility.GetTestDataUtility(FilePath, TestCaseName);

	}

	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @AfterMethod
	 * 
	 * DESCRIPTION :
	 * 
	 * 1.@AfterMethod method will be executed after execution of @Test method
	 * every time.
	 * 
	 * 
	 * FUNCTION NAME : reporterDataResults()
	 * 
	 * 
	 * DESCRIPTION : This function is used to
	 * 
	 * 1.It writes Pass/Fail/Skip in excel sheet
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 **************************************************/

	@AfterMethod
	public void reporterDataResults() {
		if (Testskip) {
			Add_Log.info(TestCaseName + " : Reporting test data set line " + (DataSet + 1) + " as SKIP In excel.");
			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "SKIP");
		} else if (Testfail == true) {
			Add_Log.info(TestCaseName + " : Reporting test data set line " + (DataSet + 1) + " as FAIL In excel.");

			TestCasePass = false;

			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "FAIL");

		} else {
			Add_Log.info(TestCaseName + " : Reporting test data set line " + (DataSet + 1) + " as PASS In excel.");

			SuiteUtility.WriteResultUtility(FilePath, TestCaseName, "Pass/Fail/Skip", DataSet + 1, "PASS");
		}

		Testskip = false;
		Testfail = false;

	}

	/*****************************************
	 * Function to checkCaseToRun
	 * ************************************************** Annotation
	 * : @AfterTest
	 * 
	 * DESCRIPTION :
	 * 
	 * 1.@AfterTest method will be executed after execution of all tests
	 * 
	 * 
	 * FUNCTION NAME : closeBrowser()
	 * 
	 * 
	 * DESCRIPTION : This function is used to
	 * 
	 * 1.To close browser
	 * 
	 * 
	 * HISTORY : AUTHOR DATE VERSION
	 * 
	 * CREATED BY : Vasanti 6-JUNE-2016 1.0
	 *
	 ***************************************** Function to checkCaseToRun
	 **************************************************/

	/*
	 * @AfterTest public void closeBrowser() { if (TestCasePass) {
	 * Add_Log.info(TestCaseName + " : Reporting test case as PASS In excel.");
	 * SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip",
	 * TestCaseName, "PASS"); } else { Add_Log.info(TestCaseName +
	 * " : Reporting test case as FAIL In excel.");
	 * SuiteUtility.WriteResultUtility(FilePath, SheetName, "Pass/Fail/Skip",
	 * TestCaseName, "FAIL");
	 * 
	 * }
	 * 
	 * }
	 */
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}

}
