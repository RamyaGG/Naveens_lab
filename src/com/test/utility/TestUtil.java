package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel(){

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			reader = new Xls_Reader("H:\\Edureka\\Selenium\\WorkSpace\\Naveens_lab\\src\\com\\testdata\\FacebookReg.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (int rowNum = 2; rowNum <= reader.getRowCount("AmazonRegTestData"); rowNum++) {
			
				String yourname = reader.getCellData("AmazonRegTestData", "yourname", rowNum);
				String mobileno = reader.getCellData("AmazonRegTestData", "mobileno", rowNum);
				String email = reader.getCellData("AmazonRegTestData", "email", rowNum);
				String password = reader.getCellData("AmazonRegTestData", "password", rowNum);
				
				
//				String city = reader.getCellData("RegTestData", "city", rowNum);
//				String state = reader.getCellData("RegTestData", "state", rowNum);
//				String zipCode = reader.getCellData("RegTestData", "zipcode", rowNum);
//				String emailAddress = reader.getCellData("RegTestData", "emailaddress", rowNum);

				Object ob[] = {yourname, mobileno, email, password};
				myData.add(ob);
				
		}
		return myData;
	
}
}
