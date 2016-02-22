package jp.co.worksap.cpc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XInfoWriter {

	private static final SimpleDateFormat YYYYMM_FORMAT = new SimpleDateFormat("yyyyMM");
	private static final String YYYYMM = YYYYMM_FORMAT.format( new Date() );

	private static final String EXCEL_EXTENSION = ".xlsx";
	private static final String BOOK_NAME = YYYYMM + EXCEL_EXTENSION;

	private static final String BOOK_PATH = "C:\\Dev\\";
	//private static final String BOOK_NAME = "Sample4.xlsx";
	private static final String SHEET_NAME = "mySheet";

	private static final String CURRENT_DIR = System.getProperty("user.dir", BOOK_PATH);
	private static final String FILEPATH = new File(CURRENT_DIR, BOOK_NAME).getPath();

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new XInfoWriter().execute();
	}


	private void execute() {
		//出力・編集fileのpath name を設定

		//data が配列に格納されているとして
		//Excel出力の要素・formatを作成
		//Excel出力の枠を作成
		//データを設定
		//Excelを出力

	}

	private void createExcel() {

		//System.out.println(CURRENT_DIR);
		//String filePath = new File(CURRENT_DIR, BOOK_NAME).getPath();
		System.out.println(FILEPATH);
		//System.exit(0);

		try (Workbook book = new XSSFWorkbook(); ) {

			//style & font set
			CellStyle style = book.createCellStyle();

			//set border
			style.setBorderTop(CellStyle.BORDER_THIN);
			style.setBorderBottom(CellStyle.BORDER_HAIR);
			style.setBorderLeft(CellStyle.BORDER_MEDIUM);
			style.setBorderRight(CellStyle.BORDER_DOTTED);

			Font font = book.createFont();
			font.setColor(IndexedColors.AQUA.getIndex());

			Row  row    = null;
			Cell cell   = null;
			int  rowNum = 0;
			int  colNum = 0;

			Sheet sheet = null;

			for (int i = 0; i < 3; i++) {
				//sheet create & name set
				sheet = book.createSheet(SHEET_NAME+i);

				//create header line
				rowNum = 0;
				colNum = 0;
				row = sheet.createRow(rowNum);

				cell = row.createCell(colNum);
				cell.setCellValue(rowNum+"-"+colNum);  //set cell value

				cell = row.createCell(++colNum);
				cell.setCellValue(rowNum+"-"+colNum+"longlonglongcell");

				cell = row.createCell(++colNum);
				cell.setCellValue(rowNum+"-"+colNum);

				cell = row.createCell(++colNum);
				cell.setCellValue(rowNum+"-"+colNum);

				cell = row.createCell(++colNum);
				cell.setCellValue(rowNum+"-"+colNum);

				cell = row.createCell(++colNum);
				cell.setCellValue(rowNum+"-"+colNum);

				//fixed
				sheet.createFreezePane(1, 1);

				//auto fillter
				//sheet.setAutoFilter(new CellRangeAddress(0, 0, 0, colNum));

				//auto size col
				for (int j = 0; j < colNum; j++) {
					sheet.autoSizeColumn(j, true);
				}

				//create data row
				for (int j = 0; j < 10; j++) {
					rowNum++;
					colNum = 0;

					row = sheet.createRow(rowNum);

					for (int j2 = 0; j2 < 6; j2++) {
						cell = row.createCell(j2);
						cell.setCellValue(rowNum+"-"+j2);

						cell.setCellStyle(style);
					}
					for (int j2 = 0; j2 < 6; j2++) {
						sheet.autoSizeColumn(j2, true);
					}

				}
				sheet.addMergedRegion(new CellRangeAddress(1, 2, 1, 3));


			}



			style.setFont(font);
			cell.setCellStyle(style);

			//output file
			try (FileOutputStream out = new FileOutputStream(FILEPATH);) {
				book.write(out);
			} catch (IOException e) {
				// TODO: handle exception
				System.err.println(e.getStackTrace());
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getStackTrace());
		}
	}

}
