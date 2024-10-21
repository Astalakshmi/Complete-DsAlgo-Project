package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileReader {
	private int totalRow;
	public List<Map<String, String>> getData(String excelFilePath, String sheetName) {
		File tempFile = null;
		Workbook workbook = null;
		try {
			// Create a temporary copy of the file for this thread/process
			tempFile = File.createTempFile("copy_", ".xlsx");
			Files.copy(Paths.get(excelFilePath), tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
			workbook = WorkbookFactory.create(tempFile);
			Sheet sheet = workbook.getSheet(sheetName);
			return readSheet(sheet);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace(); // Handle or log the exception as needed
			return Collections.emptyList(); // Return an empty list in case of error
		} finally {
			if (workbook != null) {
				try {
					workbook.close(); // Ensure the workbook is closed
				} catch (IOException e) {
					e.printStackTrace(); // Handle the exception if closing the workbook fails
				}
			}
			if (tempFile != null && tempFile.exists()) {
				tempFile.delete(); // Clean up the temporary file
			}
		}
	}

	private List<Map<String, String>> readSheet(Sheet sheet) {
		Row row;
		Cell cell;
		totalRow = sheet.getLastRowNum(); // Total rows in the sheet
		List<Map<String, String>> excelRows = new ArrayList<>();

		for (int currentRow = 1; currentRow <= totalRow; currentRow++) { // Start from row 1 to skip header
			row = sheet.getRow(currentRow);
			if (row == null) {
				continue; // Skip the row if it's null
			}
			int totalColumn = row.getLastCellNum(); // Total columns in the current row
			LinkedHashMap<String, String> columnnMapdata = new LinkedHashMap<>();

			for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
				cell = row.getCell(currentColumn);

				// Getting column name from the first row (header)
				String columnHeaderName = sheet.getRow(sheet.getFirstRowNum()).getCell(currentColumn)
						.getStringCellValue();

				// Check if cell is null to avoid NullPointerException
				if (cell != null) {
					// Check the cell type before calling getStringCellValue
					switch (cell.getCellType()) {
					case STRING:
						columnnMapdata.put(columnHeaderName, cell.getStringCellValue());
						break;
//                        case NUMERIC:
//                            // If the cell is numeric, convert to a string
//                            columnnMapdata.put(columnHeaderName, String.valueOf(cell.getNumericCellValue()));
					// break;
					case NUMERIC:
						// If the cell is numeric, convert to a string
						int cellValue = (int) cell.getNumericCellValue();
						columnnMapdata.put(columnHeaderName, String.valueOf(cellValue));
						break;
					case BOOLEAN:
						// If the cell contains a boolean, convert it to a string
						columnnMapdata.put(columnHeaderName, String.valueOf(cell.getBooleanCellValue()));
						break;
					case BLANK:
						columnnMapdata.put(columnHeaderName, "");
						break;
					default:
						columnnMapdata.put(columnHeaderName, ""); // Default value for unsupported cell types
					}
				} else {
					// If the cell is null, store an empty string
					columnnMapdata.put(columnHeaderName, "");
				}
			}
			excelRows.add(columnnMapdata); // Add the row's data to the list
		}
		return excelRows;
	}

	public int countRow() {
		return totalRow; // Return the total number of rows in the sheet
	}
}