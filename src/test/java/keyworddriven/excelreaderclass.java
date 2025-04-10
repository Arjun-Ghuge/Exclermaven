package keyworddriven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excelreaderclass {





	static List<String> Keywords=new ArrayList<String>();
		
	public static void readexcelfilemethod() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\DjS\\eclipse-workspace\\MyMevenProject\\src\\test\\resources\\TestDataCore.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet");
	//no.of rows
			int rowcnt=sheet.getLastRowNum();
			System.out.println(rowcnt);
			
			//to focus on row inorder to get the column numbers
			int colcnt=sheet.getRow(0).getLastCellNum();
			System.out.println(colcnt);
			
			//to read the values from excel sheet
			for (int i=1;i<=rowcnt;i++){
				XSSFRow currentrow=sheet.getRow(i);
				//to read the cell values from the current row the below for loop is given
				for(int j=0;j<colcnt;j++){
					
					if(j==2) {
						String keyword=currentrow.getCell(j).toString();
						//String cellvalue=currentrow.getCell(j).
						System.out.println("   "+keyword);
						Keywords.add(keyword);
					}
					System.out.println("keywords:"+Keywords);
					}
				workbook.close();
				}
	}
		
	public static void keywordcomparision()  {
		for(int i=0;i<Keywords.size();i++) {
			if(Keywords.get(i).equals("openbrowser")) {
				keyword.openbrowser();
			}
			if(Keywords.get(i).equals("gotourl")) {
				keyword.gotourl();
			}
			if(Keywords.get(i).equals("enterusername")) {
				keyword.enterusername();
			}
			if(Keywords.get(i).equals("enterpassword")) {
				keyword.enterpassword();
			}
			if(Keywords.get(i).equals("clicklogin")) {
				keyword.clicklogin();
			}
		}
		
	}
	public static void main(String[] args) throws IOException{
		
		excelreaderclass.readexcelfilemethod();
		excelreaderclass.keywordcomparision();
		
	}
}
