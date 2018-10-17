package handlexlfile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class HandlexlFile {

	@Test
	public static void testGrid() throws Exception{
//read
		Workbook w=WorkbookFactory.create(new FileInputStream("./input/book1.xlsx"));
		String v = w.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(v);
		
//write
//		w.getSheet("sheet1").getRow(0).getCell(0).setCellValue("vishal");
//		w.write(new FileOutputStream("./input/book2.xlsx"));
		w.getSheet("sheet1").createRow(1).createCell(1).setCellValue("automation");
		w.write(new FileOutputStream("./input/book1.xlsx"));
		
	}
}
