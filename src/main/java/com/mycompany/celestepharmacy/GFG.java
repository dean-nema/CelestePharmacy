
package com.mycompany.celestepharmacy;

/**
 *
 * @author ssstepbro
 */
// Java Program to Illustrate Writing  
// Data to Excel File using Apache POI 
  
// Import statements 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream; 
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
  
// Main class 
public class GFG { 
    //variables
    private static int count = 1;
  
    // Main driver method 
    public static void main(String[] args) 
    { 
  
        // Blank workbook 
        XSSFWorkbook workbook = new XSSFWorkbook(); 
  
        // Creating a blank Excel sheet 
        XSSFSheet sheet 
            = workbook.createSheet("student Details"); 
  
        // Creating an empty TreeMap of string and Object][] 
        // type 
        Map<String, Object[]> data 
            = new TreeMap<String, Object[]>(); 
       try{
           
           
       } catch (Exception e) { 
  
            // Display exceptions along with line number 
            // using printStackTrace() method 
            e.printStackTrace(); 
        } 
       
    } 
    public static int start(String name, int aMount, int cOst){
         // Blank workbook 
        XSSFWorkbook workbook = new XSSFWorkbook(); 
  
        // Creating a blank Excel sheet 
        XSSFSheet sheet 
            = workbook.createSheet("student Details"); 
  
        // Creating an empty TreeMap of string and Object][] 
        // type 
        Map<String, Object[]> data 
            = new TreeMap<String, Object[]>(); 
      
        try{
         //   setData
         data = initiate(name, aMount, cOst);
         setData(data, sheet);
         add(workbook);
         
            
        } catch (Exception e) { 
  
            // Display exceptions along with line number 
            // using printStackTrace() method 
            e.printStackTrace(); 
        } 
        return 0;
    }
    
    // Reading and Writing data to excel file using Apache POI
// Via Appending to the Existing File

// Getting the path from the local directory
private static final String FILE_NAME
    = "C:\\Users\\pankaj\\Desktop\\projectOutput\\blo.xlsx";

// Methods
public static Map<String, Object[]> initiate(String name, int amount, int cost){
    Map<String, Object[]> viagraData = new TreeMap<String, Object[]>(); 
    String s = String.valueOf(name);
    String amountt = String.valueOf(amount);
    String costt = String.valueOf(cost);
    count++;
   viagraData.put(s, new Object[] {s, amountt, costt});
    return viagraData;
    
}
public static void write() throws IOException, InvalidFormatException 
{

    InputStream inp = new FileInputStream(FILE_NAME);
    Workbook wb = WorkbookFactory.create(inp);
    Sheet sheet = wb.getSheetAt(0);

    int num = sheet.getLastRowNum();
    Row row = sheet.createRow(++num);
    row.createCell(0).setCellValue("xyz");
   
    // Now it will write the output to a file
    FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
    wb.write(fileOut);

    // Closing the file connections
    fileOut.close();
}
public static void setData(Map<String, Object[]> data1, XSSFSheet sheet1  ){
   /*  data1.put("1", 
                 new Object[] { "ID", "NAME", "LASTNAME" }); 
        data1.put("2", 
                 new Object[] { 1, "Pankaj", "Kumar" }); 
        data1.put("3", 
                 new Object[] { 2, "Prakashni", "Yadav" }); 
        data1.put("4", new Object[] { 3, "Ayan", "Mondal" }); 
        data1.put("5", new Object[] { 4, "Virat", "kohli" }); 
  */
        // Iterating over data and writing it to sheet 
        Set<String> keyset = data1.keySet(); 
  
        int rownum = 0; 
  
        for (String key : keyset) { 
  
            // Creating a new row in the sheet 
            Row row = sheet1.createRow(rownum++); 
  
            Object[] objArr = data1.get(key); 
  
            int cellnum = 0; 
  
            for (Object obj : objArr) { 
  
                // This line creates a cell in the next 
                //  column of that row 
                Cell cell = row.createCell(cellnum++); 
  
                if (obj instanceof String) 
                    cell.setCellValue((String)obj); 
  
                else if (obj instanceof Integer) 
                    cell.setCellValue((Integer)obj); 
            } 
        } 
}

//method 
public static void add( XSSFWorkbook workbook1) throws IOException, InvalidFormatException{

       FileOutputStream out = new FileOutputStream( 
                new File("gfgc.xlsx")); 
            workbook1.write(out); 
  
            // Closing file output connections 
            out.close(); 
  
            // Console message for successful execution of 
            // program 
            System.out.println( 
                "gfg.xlsx written successfully on disk."); 

}

}
