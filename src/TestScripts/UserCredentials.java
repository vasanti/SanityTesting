package TestScripts;

public class UserCredentials extends MyEsopsLogin{
public void UserCredentialsData(String UserId, String Password,String NewPassword, String CompanyId1, String Productwithoutspace, String Ans1,
		String Ans2) throws Exception
{
	Login UserLogin=new Login();
	UserLogin.LoginPage(UserId, Password, NewPassword, CompanyId1, Productwithoutspace, Ans1, Ans2);
}
}

