package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization 
{
	public static String TestData(int row,int cell,String sheetName) throws EncryptedDocumentException, IOException
	{
	 
	FileInputStream file = new FileInputStream("D:\\software testing\\SwagLabsP\\src\\test\\resources\\SLABN.xlsx");
	
    String value =WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return value;
	
     

}
}
