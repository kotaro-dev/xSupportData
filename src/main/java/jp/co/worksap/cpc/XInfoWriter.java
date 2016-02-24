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
		new XInfoWriter().createExcel();
	}


	private void execute() {
		//出力・編集fileのpath name を設定

		//data が配列に格納されているとして
		//Excel出力の要素・formatを作成
		//Excel出力の枠を作成
		//データを設定
		//Excelを出力

		//System.getProperties().list(System.out);

		String app = System.getProperty("sun.java.command", "XInfoWiter");
		System.out.println(app);
		System.out.println(FILEPATH);

//		XInfoMock xinfomock = new XInfoMock();
//		System.out.println(xinfomock.fixedLine[0].length);

	}

	private void createExcel() {

		//Excel work
		try (Workbook book = new XSSFWorkbook(); ) {

			//使用するfont関連を定義(黒・赤・青の３種 黒太字＋１種)
			Font font = book.createFont();
			font.setFontName("Arial");
			font.setFontHeightInPoints((short) 9);
			font.setColor(IndexedColors.BLACK.getIndex());

			Font font_blue = book.createFont();
			font_blue.setFontName("Arial");
			font_blue.setFontHeightInPoints((short) 9);
			font_blue.setColor(IndexedColors.BLUE.getIndex());

			Font font_red = book.createFont();
			font_red.setFontName("Arial");
			font_red.setFontHeightInPoints((short) 9);
			font_red.setColor(IndexedColors.RED.getIndex());

			Font font_bold = book.createFont();
			font_bold.setFontName("Arial");
			font_bold.setFontHeightInPoints((short) 9);
			font_bold.setColor(IndexedColors.BLACK.getIndex());
			font_bold.setBold(true);

			//Cellの種類別 Style定義
			/* normal (文字/背景) (黒/白) (黒/灰) (黒/青) (黒/水) (赤/白) (赤/灰) (青/白) (Bold/白)
			 * 書式 数字 文字 日付 (折り返し表示)
			 */
			//style & font set
			CellStyle styleHead = book.createCellStyle();

			//set border
			styleHead.setBorderTop(CellStyle.BORDER_THIN);
			styleHead.setBorderBottom(CellStyle.BORDER_THIN);
			styleHead.setBorderLeft(CellStyle.BORDER_THIN);
			styleHead.setBorderRight(CellStyle.BORDER_THIN);

			styleHead.setFillPattern(CellStyle.SOLID_FOREGROUND);
			styleHead.setFillForegroundColor(IndexedColors.PALE_BLUE.index);
//			styleHead.setFillBackgroundColor(IndexedColors.RED.index);
			styleHead.setFont(font);

			Row  row    = null;
			Cell cell   = null;
			int  rowNum = 0;
			int  colNum = 0;
			String fixedval = "";
			int  colEnd = 0;

			Sheet sheet = null;
			sheet = book.createSheet(SHEET_NAME);

			//load mock data
			XInfoMock xinfomock = new XInfoMock();

			for (int i = 0; i < xinfomock.fixedLine.length; i++) {

				row = sheet.createRow(i);
				if (i == 0) {continue;}

				for (int j = 0; j < xinfomock.fixedLine[i].length; j++) {

					cell = row.createCell(j);

					fixedval = xinfomock.fixedLine[i][j];
					cell.setCellValue(fixedval);
					cell.setCellStyle(styleHead);

				}
			}

			//COMPANY fixed block 縦横変換している
			CellStyle styleCpny = book.createCellStyle();

			//set border
			styleCpny.setBorderTop(CellStyle.BORDER_THIN);
			styleCpny.setBorderBottom(CellStyle.BORDER_THIN);
			styleCpny.setBorderLeft(CellStyle.BORDER_THIN);
			styleCpny.setBorderRight(CellStyle.BORDER_THIN);

			styleCpny.setFillPattern(CellStyle.SOLID_FOREGROUND);
			styleCpny.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.index);
			styleCpny.setFont(font);

			int curtCol = xinfomock.fixedLine[0].length;

			for (int i = 0; i < xinfomock.cnpyFixedBlock[0].length; i++) {

				row = sheet.getRow(i);

				fixedval = "";
				for (int j = 0; j < xinfomock.cnpyFixedBlock.length; j++) {

					cell = row.createCell(curtCol + j);

					if (!fixedval.equals(xinfomock.cnpyFixedBlock[j][i])) {
						fixedval = xinfomock.cnpyFixedBlock[j][i];
						cell.setCellValue(fixedval);
					}

					cell.setCellStyle(styleCpny);
				}

			}

			//was fixed block
			CellStyle styleWas = book.createCellStyle();

			//set border
			styleWas.setBorderTop(CellStyle.BORDER_THIN);
			styleWas.setBorderBottom(CellStyle.BORDER_THIN);
			styleWas.setBorderLeft(CellStyle.BORDER_THIN);
			styleWas.setBorderRight(CellStyle.BORDER_THIN);

			styleWas.setFont(font);

			int curtRow = xinfomock.fixedLine.length;

			for (int i = 0; i < xinfomock.wasFixedBlock.length; i++) {

				row = sheet.createRow(curtRow + i);

				fixedval = "";
				for (int j = 0; j < xinfomock.wasFixedBlock[i].length; j++) {

					fixedval = xinfomock.wasFixedBlock[i][j];

					cell = row.createCell(j);
					cell.setCellValue(fixedval);

/*					System.out.println("1:"+ fixedval.length());
					System.out.println("2:"+ fixedval.getBytes("UTF-8").length);
					System.out.println("3:"+ fixedval.getBytes("Shift_JIS").length);
*/
					if (fixedval.length() > 14) {
						styleWas.setWrapText(true);
					} else {
						styleWas.setWrapText(false);
					}
					cell.setCellStyle(styleWas);
				}

			}

			//COMPANY fixed block 縦横変換している
			CellStyle styleData = book.createCellStyle();

			//set border
			styleData.setBorderTop(CellStyle.BORDER_THIN);
			styleData.setBorderBottom(CellStyle.BORDER_THIN);
			styleData.setBorderLeft(CellStyle.BORDER_THIN);
			styleData.setBorderRight(CellStyle.BORDER_THIN);

			styleData.setFont(font);

			curtRow = xinfomock.fixedLine.length;
			curtCol = xinfomock.fixedLine[0].length;

			for (int i = 0; i < xinfomock.wasSupportData[0].length; i++) {

				row = sheet.getRow(curtRow + i);

				fixedval = "";
				for (int j = 0; j < xinfomock.wasSupportData.length; j++) {

					cell = row.createCell(curtCol + j);

					fixedval = xinfomock.wasSupportData[j][i];
					cell.setCellValue(fixedval);

					cell.setCellStyle(styleData);
				}

			}

			//merge block
			for (int i = 0; i < xinfomock.mergedBlock.length; i++) {

				sheet.addMergedRegion(new CellRangeAddress(
						xinfomock.mergedBlock[i][0],
						xinfomock.mergedBlock[i][1],
						xinfomock.mergedBlock[i][2],
						xinfomock.mergedBlock[i][3]
						)
				);
			}

			//fixed
			sheet.createFreezePane(xinfomock.freezeCol,xinfomock.freezeRow);

			colEnd = xinfomock.fixedLine[0].length + xinfomock.cnpyFixedBlock.length;
			//auto size col
			for (int i = 0; i < colEnd; i++) {
				sheet.autoSizeColumn(i, true);
			}

			//over 20char set 20char 1char 256
			for (int i = 0; i < colEnd; i++) {
				if (sheet.getColumnWidth(i) > (256*20)) {
					sheet.setColumnWidth(i, (256*20));
				}
			}

			//auto fillter
			//sheet.setAutoFilter(new CellRangeAddress(0, 0, 0, colNum));


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
