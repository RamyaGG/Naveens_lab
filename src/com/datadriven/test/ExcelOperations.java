package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		// get test data from excel
				Xls_Reader reader = new Xls_Reader(
						"H:\\Edureka\\Selenium\\WorkSpace\\Naveens_lab\\src\\com\\testdata\\FacebookReg.xlsx");
				int rowCount = reader.getRowCount("RegTestData");
				 
				
				if(!reader.isSheetExist("HomePage")) {
					reader.addSheet("HomePage");
				}

				
			int colCount = reader.getColumnCount("RegTestData");
			System.out.println("Total column present in RegTestData sheet : "+colCount);
			System.out.println(reader.getCellRowNum("RegTestdata", "firstname", "tom1"));
	}

}
