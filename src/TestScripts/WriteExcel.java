package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteExcel extends Login {
	HSSFWorkbook workbook, workbook1;
	FileInputStream ipstr, ipstr1;
	int row;
	public void writeExceldata(String UserId, String ChangedPassword) throws IOException, InterruptedException {



	try{	
		File file = new File("D:\\Testing Team Automation\\SanityTesting\\src\\Excels\\MyEsopsLogin.xls");
		ipstr = new FileInputStream(file);
		workbook = new HSSFWorkbook(ipstr);
		HSSFSheet sheet = workbook.getSheet("MyEsopsLogin");

		int totalNoRows = sheet.getLastRowNum();
		System.out.println("totalNoRows" + totalNoRows);
		for (row = 1; row <= totalNoRows; row++) {
			System.out.println("UserId" + UserId);
			String UserName = sheet.getRow(row).getCell(0).getStringCellValue();
			String NewChangedPassword = sheet.getRow(row).getCell(2).getStringCellValue();
			String OriginalPassword=sheet.getRow(row).getCell(1).getStringCellValue();
			System.out.println("UserName" + UserName + "changed password is" + NewChangedPassword+
					"Now changing for password"+OriginalPassword);

			if (UserName.equals(UserId)) {
				System.out.println("UserName matched");
				
				String Originalvalue=sheet.getRow(row).getCell(1).getStringCellValue();
				System.out.println("Originalvalue "+Originalvalue);
				
				sheet.getRow(row).createCell(1).setCellValue(NewChangedPassword);
			
				String NewValue=sheet.getRow(row).getCell(1).getStringCellValue();
				System.out.println("NewValue "+NewValue);
				Thread.sleep(5000);
				System.out.println("For " + UserId + " Password " +Originalvalue+ " has been changed to "+NewChangedPassword);
			} 
			else
			{
				System.out.println("For " + UserId + "Password has not been changed");
			}
		}
		
		ipstr.close();
		FileOutputStream opstr = new FileOutputStream(file);
		workbook.write(opstr);
		
		workbook.close();
		opstr.close();
		Thread.sleep(5000);
	
	}
	catch (IOException | EncryptedDocumentException ex) {
        ex.printStackTrace();
    }
	}
}
