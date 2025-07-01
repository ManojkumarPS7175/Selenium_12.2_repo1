package genericUtility;

/**
 * @author ManojKumarPS
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	/**
	 * This method is used to read data from excel file in String format
	 * @param sheetName
	 * @param rowIndex
	 * @param coloumIndex
	 * @return value
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
 
	public String getStringDataFromExcel(String sheetName,int rowIndex,int coloumIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resource/TestData/TestScriptData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(coloumIndex).getStringCellValue();
		}
		
		/**
		 * 
		 * @param sheetName
		 * @param rowIndex
		 * @param coloumIndex
		 * @return value
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public double getNumberDataFromExcel(String sheetName,int rowIndex,int coloumIndex) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("./src/test/resource/TestData/TestScriptData.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			return wb.getSheet(sheetName).getRow(rowIndex).getCell(coloumIndex).getNumericCellValue();
		}
			
			/**
			 * 
			 * @param sheetName
			 * @param rowIndex
			 * @param coloumIndex
			 * @return value
			 * @throws EncryptedDocumentException
			 * @throws IOException
			 */
	     public boolean getbooleanDataFromExcel(String sheetName,int rowIndex,int coloumIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resource/TestData/TestScriptData.xlsx");
				Workbook wb= WorkbookFactory.create(fis);
				return wb.getSheet(sheetName).getRow(rowIndex).getCell(coloumIndex).getBooleanCellValue();
	     }
	     
	     /**
	      * 
	      * @param sheetName
	      * @param rowIndex
	      * @param coloumIndex
	      * @return value
	      * @throws EncryptedDocumentException
	      * @throws IOException
	      */
			public Date getDateandTimeDataFromExcel(String sheetName,int rowIndex,int coloumIndex) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("./src/test/resource/TestData/TestScriptData.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
		    return wb.getSheet(sheetName).getRow(rowIndex).getCell(coloumIndex).getDateCellValue();

		}
				
				
	}
				

