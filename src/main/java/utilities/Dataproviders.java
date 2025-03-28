package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataproviders {
	
@DataProvider(name="LoginData")

	public String[][] getdata() throws IOException
	{
	 String path="C:\\Users\\Dell\\eclipse-workspace\\opencartV121\\testData\\opencart.xlsx";
	 ExcelUtility utility=new ExcelUtility();
	 int totalrows=utility.getRowCount("Sheet1", path);
	 int totalcells=utility.getCellCount(path, "Sheet1", 1);
	 
	 String logindata[][]=new String[totalrows][totalcells];
	 
	 for(int i=1;i<=totalrows;i++)
	 {
		 for(int j=0;j<totalcells;j++)
		 {
			 logindata[i-1][j]=utility.getCellData(path, "Sheet1", i, j);
		 }
	 }
	 return logindata;
}
}
