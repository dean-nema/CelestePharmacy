
package com.mycompany.celestepharmacy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
/**
 *
 * @author ssstepbro
 */
public class ConH2 {
    
    // JDBC URL, username, and password of H2 database
    private static final String JDBC_URL = "jdbc:h2:~/celestePharm";
    private static final String USER = "admin";
    private static final String PASSWORD = "1234";

    // JDBC variables for opening, closing, and managing t)he connection
    private static Connection connection;
   private static  PreparedStatement preparedStatement = null;
   private static Statement statement = null;
   private static  ResultSet resultSet = null;

    // Method to establish a database connection
    public static Connection getConnection() throws SQLException {
        
        
        
        try {
            if (connection == null || connection.isClosed()){
                
                // Register the H2 JDBC driver
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            
//String selectQuery = "SELECT * FROM VIAGRAS";
//            preparedStatement = connection.prepareStatement(selectQuery);
//            resultSet = preparedStatement.executeQuery();
//
//            // Print column headers
//            System.out.printf("%-15s %-10s %-10s%n", "ITEM", "AMOUNT", "COST");
//            System.out.println("----------------------------String selectQuery = "SELECT * FROM VIAGRAS";
//            preparedStatement = connection.prepareStatement(selectQuery);
//            resultSet = preparedStatement.executeQuery();
//
//            // Print column headers
//            System.out.printf("%-15s %-10s %-10s%n", "ITEM", "AMOUNT", "COST");
//            System.out.println("------------------------------");
//
//            // Print data
//            while (resultSet.next()) {
//                String item = resultSet.getString("ITEM");
//                int amount = resultSet.getInt("AMOUNT");
//                int cost = resultSet.getInt("COST");
//
//                System.out.printf("%-15s %-10d %-10d%n", item, amount, cost);--");
//
//            // Print data
//            while (resultSet.next()) {
//                String item = resultSet.getString("ITEM");
//                int amount = resultSet.getInt("AMOUNT");
//                int cost = resultSet.getInt("COST");
//
//                System.out.printf("%-15s %-10d %-10d%n", item, amount, cost);
            // Establish the connection
//            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
//
//            System.out.println("Connected successfully");
//
              // Create the 'viagras' table if it doesn't exist
         

           
            System.out.println("Connectioin Successfuly");   
            }
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    //TABLE CREATION
    public static void createATable() throws SQLException{
         //create connection
        Connection dbConnection = ConH2.getConnection();
        
  
        //create table
          String createTableQuery = "CREATE TABLE IF NOT EXISTS ACCOUNT (" +
                  "ACCID INT NOT NULL AUTO_INCREMENT,"+
                    "Item VARCHAR(255), " +
                    "Amount DOUBLE, " +
                   "Date Date"+
                    ")";
            preparedStatement = connection.prepareStatement(createTableQuery);
            preparedStatement.executeUpdate();
            
            //close connection
            ConH2.closeConnection();
    }
    
    public static void createEODTable() throws SQLException{
        //create connection
        Connection dbConnection = ConH2.getConnection();
        
  
        //create table
          String createTableQuery = "CREATE TABLE IF NOT EXISTS EOD (" +
                  "ACCID INT NOT NULL AUTO_INCREMENT,"+
                    "Change DOUBLE, " +
                    "COLLECTED DOUBLE, " +
                    "TILL DOUBLE,"+
                  "TCOLLECTED DOUBLE,"+
                   "SHIFT VARCHAR(255),"+
                   "Date Date"+
                    ")";
            preparedStatement = connection.prepareStatement(createTableQuery);
            preparedStatement.executeUpdate();
            
            //close connection
            ConH2.closeConnection();
    }
    
    public static void createETable() throws SQLException{
         //create connection
        Connection dbConnection = ConH2.getConnection();
        
  
        //create table
          String createTableQuery = "CREATE TABLE IF NOT EXISTS EXPENSES (" +
                  "EXPID INT NOT NULL AUTO_INCREMENT,"+
                    "Item VARCHAR(255), " +
                    "Amount DOUBLE, " +
                   "Date Date"+
                    ")";
            preparedStatement = connection.prepareStatement(createTableQuery);
            preparedStatement.executeUpdate();
            
            //close connection
            ConH2.closeConnection();
    }
    
    public static void createCTable() throws SQLException{
        //create connection
        Connection dbConnection = ConH2.getConnection();
        
  
        //create table
          String createTableQuery = "CREATE TABLE IF NOT EXISTS CONTROL (" +
                    "Item VARCHAR(255), " +
                    "Amount INT, " +
                    "Cost INT" +
                    ")";
       
            preparedStatement = connection.prepareStatement(createTableQuery);
            preparedStatement.executeUpdate();
            
            //close connection
            ConH2.closeConnection();
    }
    
    public static void createMTable() throws SQLException{
        //create connection
        Connection dbConnection = ConH2.getConnection();
        
  
        //create table
          String createTableQuery = "CREATE TABLE IF NOT EXISTS MRNGAFTR (" +
                    "Item VARCHAR(255), " +
                    "Amount INT, " +
                    "Cost INT"+
                    ")";
       
            preparedStatement = connection.prepareStatement(createTableQuery);
            preparedStatement.executeUpdate();
            
            //close connection
            ConH2.closeConnection();
    }
    
    public static void createSTable() throws SQLException{
        //create connection
        Connection dbConnection = ConH2.getConnection();
        
  
        //create table
          String createTableQuery = "CREATE TABLE IF NOT EXISTS SALES (" +
                    "SID INT NOT NULL AUTO_INCREMENT,"+
                    "Item VARCHAR(255), " +
                    "Amount INT, " +
                    "Cost INT," +
                    "DEPARTMENT VARCHAR(255),"+
                    "Date Date"+
                    ")";
       
            preparedStatement = connection.prepareStatement(createTableQuery);
            preparedStatement.executeUpdate();
            
            //close connection
            ConH2.closeConnection();
    }
    
    public static void createRTable() throws SQLException{
          //create connection
        Connection dbConnection = ConH2.getConnection();
        
  
        //create table
          String createTableQuery = "CREATE TABLE IF NOT EXISTS RETURNS (" +
                    "Item VARCHAR(255), " +
                    "Amount INT, " +
                    "Cost INT," +
                   "Date Date,"+
                    "Department VARCHAR(255)"+
                    ")";
       
            preparedStatement = connection.prepareStatement(createTableQuery);
            preparedStatement.executeUpdate();
            
            //close connection
            ConH2.closeConnection();
    }
    
    public static void createVTable() throws SQLException{
        //create connection
        Connection dbConnection = ConH2.getConnection();
        
  
        //create table
          String createTableQuery = "CREATE TABLE IF NOT EXISTS VIAGRAS (" +
                    "Item VARCHAR(255), " +
                    "Amount INT, " +
                    "Cost INT" +
                    ")";
       
            preparedStatement = connection.prepareStatement(createTableQuery);
            preparedStatement.executeUpdate();
            
            //close connection
            ConH2.closeConnection();
    }
    
    //END

 
    
    /*
    
    
   
    
         DATABASE TO CLASS
    
    
    
    */
    
    
    
    
    //following two function maps database to viagra class
   public static ArrayList<Viagras> getVData() throws SQLException{
       //create connection
       Connection dbConnection = ConH2.getConnection();
       //get data 
       ArrayList<Viagras> viagras = new ArrayList<>();
       statement = connection.createStatement();
       resultSet = statement.executeQuery("SELECT * FROM Viagras");
       mapViagras(resultSet, viagras);
       
       //close connection
       ConH2.closeConnection();
       return viagras;
   }
  
   //HELPS IN MAPPING VIAGRA FILES FROM DATABASE TO APPLICATION
   public static void mapViagras(ResultSet vresult, ArrayList<Viagras> viagras1) throws SQLException{
       while (vresult.next()){
           //get from resultSet
           String item = vresult.getString("Item");
           int amount = vresult.getInt("Amount");
           int cost = vresult.getInt("Cost");
           //create viagra obj
           Viagras viagra = new Viagras(item, amount, cost);
           //add to arrayList
           viagras1.add(viagra);
       }
   }
   
    //now morning afters
   
   public static ArrayList<MornClass> getMData() throws SQLException{
       //create connection
       Connection dbConnection = ConH2.getConnection();
       //get data 
       ArrayList<MornClass> morningAfter = new ArrayList<>();
       statement = connection.createStatement();
       resultSet = statement.executeQuery("SELECT * FROM MRNGAFTR");
       mapMorning(resultSet, morningAfter);
       
       //close connection
       ConH2.closeConnection();
       return morningAfter;
   }
    
   public static void mapMorning(ResultSet mresult, ArrayList<MornClass> morn) throws SQLException{
        while (mresult.next()){
           //get from resultSet
           String item = mresult.getString("Item");
           int amount = mresult.getInt("Amount");
           int cost = mresult.getInt("Cost");
           //create morning After class
           MornClass morning = new MornClass(item, amount, cost);
           //add to arrayList
           morn.add(morning);
       }
   }
   
   //now Control L
   
   public static ArrayList<Control> getCData() throws SQLException{
        //create connection
       Connection dbConnection = ConH2.getConnection();
       //get data 
       ArrayList<Control> control = new ArrayList<>();
       statement = connection.createStatement();
       resultSet = statement.executeQuery("SELECT * FROM CONTROL");
       mapControl(resultSet, control);
       
       //close connection
       ConH2.closeConnection();
       return control;
   }
   
   public static void mapControl(ResultSet cresult, ArrayList<Control> cont) throws SQLException{
        while (cresult.next()){
           //get from resultSet
           String item = cresult.getString("Item");
           int amount = cresult.getInt("Amount");
           int cost = cresult.getInt("Cost");
           //create morning After class
           Control controlL = new Control(item, amount, cost);
           //add to arrayList
           cont.add(controlL);
       }
   }
   
   //Expenses
   
   public static ArrayList<Expense> getEData() throws SQLException{
         //create connection
       Connection dbConnection = ConH2.getConnection();
       //get data 
       ArrayList<Expense> expenses = new ArrayList<>();
       statement = connection.createStatement();
       resultSet = statement.executeQuery("SELECT * FROM EXPENSES");
       mapExpenses(resultSet, expenses);
       
       //close connection
       ConH2.closeConnection();
       return expenses;
   }
   
   public static void mapExpenses(ResultSet eresult, ArrayList<Expense> exp) throws SQLException{
        while (eresult.next()){
           //get from resultSet
           int expId = eresult.getInt("EXPID");
           String item = eresult.getString("Item");
           double amount = eresult.getDouble("Amount");
           Date date = eresult.getDate("Date");
           //create morning After class
           Expense expense = new Expense(expId, item, amount, date);
           //add to arrayList
           exp.add(expense);
       }
   }
   
   //Returns
   
   public static ArrayList<Returns> getRData() throws SQLException{
           //create connection
       Connection dbConnection = ConH2.getConnection();
       //get data 
       ArrayList<Returns> returns = new ArrayList<>();
       statement = connection.createStatement();
       resultSet = statement.executeQuery("SELECT * FROM RETURNS");
       mapReturns(resultSet, returns);
       
       //close connection
       ConH2.closeConnection();
       return returns;
   }
   
   public static void mapReturns(ResultSet rresult, ArrayList<Returns> r) throws SQLException{
        while (rresult.next()){
           //get from resultSet
           String item = rresult.getString("Item");
           int amount = rresult.getInt("Amount");
           Date date = rresult.getDate("Date");     
           int cost = rresult.getInt("Cost");
           String dp = rresult.getString("Department");

           //create morning After class
          Returns rreturn = new Returns(item, amount, cost, date, dp);
           //add to arrayList
           r.add(rreturn);
       }
   }
   
   //ACCOUNT
   
   public static ArrayList<Account> getAData() throws SQLException{
         //create connection
       Connection dbConnection = ConH2.getConnection();
       //get data 
       ArrayList<Account> returns = new ArrayList<>();
       statement = connection.createStatement();
       resultSet = statement.executeQuery("SELECT * FROM ACCOUNT");
       mapAccount(resultSet, returns);
       
       //close connection
       ConH2.closeConnection();
       return returns;
   }
   
   public static void mapAccount(ResultSet aresult, ArrayList<Account> a) throws SQLException{
        while (aresult.next()){
           //get from resultSet
           String item = aresult.getString("Item");
           int amount = aresult.getInt("Amount");
           Date date = aresult.getDate("Date");     
           int id = aresult.getInt("ACCID");

           //create morning After class
          Account acc = new Account(item, amount, id, date);
           //add to arrayList
           a.add(acc);
       }
   }
   
   public static ArrayList<Sales> getSData() throws SQLException{
         //create connection
       Connection dbConnection = ConH2.getConnection();
       //get data 
       ArrayList<Sales> sales = new ArrayList<>();
       statement = connection.createStatement();
       resultSet = statement.executeQuery("SELECT * FROM SALES");
       mapSales(resultSet, sales);
       
       //close connection
       ConH2.closeConnection();
       return sales;
   }
   
   public static void mapSales(ResultSet sresult, ArrayList<Sales> s) throws SQLException{
        while (sresult.next()){
           //get from resultSet
           String item = sresult.getString("Item");
           int amount = sresult.getInt("Amount");
           int cost = sresult.getInt("Cost");
           Date date = sresult.getDate("Date");
           String department  = sresult.getString("DEPARTMENT");
           int id = sresult.getInt("SID");

           //create morning After class
          Sales sale = new Sales(id, item, amount, cost, department, date);
           //add to arrayList
           s.add(sale);
       }
   }
   
    public static ArrayList<EndOfDay> getEODData() throws SQLException {
        //create connection
        Connection dbConnection = ConH2.getConnection();

        //get data
        ArrayList<EndOfDay> eodList = new ArrayList<>();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM EOD");
        mapEOD(resultSet, eodList);

        //close connection
        ConH2.closeConnection();
        return eodList;
    }

    public static void mapEOD(ResultSet eodResult, ArrayList<EndOfDay> eodList) throws SQLException {
        while (eodResult.next()) {
            //get from resultSet
            double change = eodResult.getDouble("Change");
            double collected = eodResult.getDouble("COLLECTED");
            double till = eodResult.getDouble("TILL");
            double tCollected = eodResult.getDouble("TCOLLECTED");
            String shift = eodResult.getString("SHIFT");
            Date date = eodResult.getDate("Date");
            int accId = eodResult.getInt("ACCID");

            //create EOD object
            EndOfDay eod = new EndOfDay(accId, change, collected, till, tCollected, shift, date);

            //add to arrayList
            eodList.add(eod);
        }
    }
      /*
    
    
    
    
        DATABASE RELATED FUNCTIONS
    
    
    
    */
   
     public static String[] getVNames(){
        //establish connection
        try{
              ArrayList<Viagras> vData = ConH2.getVData();
            String[] sData = new String[vData.size()];
            for(int i = 0; i<vData.size(); i++){
                sData[i] = vData.get(i).getName();   
            }
            return sData;
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
     
     public static String[] getMNames(){
        try{
              ArrayList<MornClass> mData = ConH2.getMData();
            String[] sData = new String[mData.size()];
            for(int i = 0; i<mData.size(); i++){
                sData[i] = mData.get(i).getName();   
            }
            return sData;
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
     }
     
     public static String[] getCNames(){
          //establish connection
        try{
              ArrayList<Control> cData = ConH2.getCData();
            String[] sData = new String[cData.size()];
            for(int i = 0; i<cData.size(); i++){
                sData[i] = cData.get(i).getName();   
            }
            return sData;
        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
     }
     
     
   
     public static Viagras getVObj(String item) throws SQLException{
       //varijables
       int count = 0;
       int i = 0; //serves as count as well
 
       boolean state = true;
       ArrayList<Viagras> vData = ConH2.getVData();
       Viagras obj = new Viagras();
       //open connnection
       Connection dbConnection = ConH2.getConnection();
       while(state){
           count++;
           if(item.equals(vData.get(i).getName())){
               obj = vData.get(i);
               state = false;
           }else if(count >= vData.size()){
               state = false;
           }else{
               i++;
           }
       }   
       return obj;
   }
     
     public static MornClass getMObj(String item) throws SQLException{
          //varijables
       int count = 0;
       int i = 0; //serves as count as well
 
       boolean state = true;
       ArrayList<MornClass> mData = ConH2.getMData();
       MornClass obj = new MornClass();
       //open connnection
       Connection dbConnection = ConH2.getConnection();
       while(state){
           count++;
           if(item.equals(mData.get(i).getName())){
               obj = mData.get(i);
               state = false;
           }else if(count >= mData.size()){
               state = false;
           }else{
               i++;
           }
       }   
       return obj;
     }
     
     public static Control getCObj(String item) throws SQLException{
          //varijables
       int count = 0;
       int i = 0; //serves as count as well
 
       boolean state = true;
       ArrayList<Control> cData = ConH2.getCData();
       if(cData.isEmpty()){
           state = false;
       } else {
       }
       Control obj = new Control();
       //open connnection
       Connection dbConnection = ConH2.getConnection();
       while(state){
           count++;
           if(item.equals(cData.get(i).getName())){
               obj = cData.get(i);
               state = false;
           }else if(count >= cData.size()){
               state = false;
           }else{
               i++;
           }
       }   
       return obj;
     }
     
     
     public static void insertEOD(double change, double collected, double till, double tCollected, String shift) throws SQLException{
         //open connection
        Connection dbConnection = ConH2.getConnection();
       //varijables
        long now = System.currentTimeMillis();
        Date date = new Date(now);
       String insertDataQuery = "INSERT INTO EOD (Change, COLLECTED, TILL, TCOLLECTED, SHIFT, Date) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

       
            // Prepare statement for insertion
          preparedStatement = connection.prepareStatement(insertDataQuery);

            // Set values for parameters
            preparedStatement.setDouble(1, change);      // Change
            preparedStatement.setDouble(2, collected);   // COLLECTED
            preparedStatement.setDouble(3, till);        // TILL
            preparedStatement.setDouble(4, tCollected);  // TCOLLECTED
            preparedStatement.setString(5, shift);      // SHIFT
            preparedStatement.setDate(6, date);         // Date

            // Execute the insertion
            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully.");
       ConH2.closeConnection();
       
     }
     public static void insertVSales(String item, int amount, int cost) throws SQLException{
       //open connection
        Connection dbConnection = ConH2.getConnection();
       //varijables
        long now = System.currentTimeMillis();
        Date date = new Date(now);
       // Insert data into the 'SALES' table
           
            String insertDataQuery = "INSERT INTO SALES (Item, Amount, Cost, Date ,Department) VALUES (?, ?, ? , ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataQuery);
            preparedStatement.setString(1, item);
            preparedStatement.setInt(2, amount);
            preparedStatement.setInt(3, cost);            
            preparedStatement.setDate(4, date);
            preparedStatement.setString(5, "Viagras");

            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
       ConH2.closeConnection();
       
       
   }
     
     public static void insertMSales(String item, int amount, int cost) throws SQLException{
         //open connection
        Connection dbConnection = ConH2.getConnection();
        //variables
         long now = System.currentTimeMillis();
        Date date = new Date(now);
        // Insert data into the 'SALES' table
           
            String insertDataQuery = "INSERT INTO SALES (Item, Amount, Cost, Date, Department) VALUES (?, ?, ? , ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataQuery);
            preparedStatement.setString(1, item);
            preparedStatement.setInt(2, amount);
            preparedStatement.setInt(3, cost);            
            preparedStatement.setDate(4, date);
            preparedStatement.setString(5, "Morning After");

            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
       ConH2.closeConnection();
         
     }
     
     public static void insertCSales(String item, int amount, int cost) throws SQLException{
           //open connection
        Connection dbConnection = ConH2.getConnection();
        //variables
       long now = System.currentTimeMillis();
        Date date = new Date(now);
        // Insert data into the 'SALES' table
           
            String insertDataQuery = "INSERT INTO SALES (Item, Amount, Cost,Date, Department) VALUES (?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataQuery);
            preparedStatement.setString(1, item);
            preparedStatement.setInt(2, amount);
            preparedStatement.setInt(3, cost);            
            preparedStatement.setDate(4, date);
            preparedStatement.setString(5, "Control");

            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
       ConH2.closeConnection();
         
     }
     
     public static void insertReturns(String item, int amount, int cost, String dp) throws SQLException{
         //open connection
        Connection dbConnection = ConH2.getConnection();
        //variables
       long now = System.currentTimeMillis();
        Date date = new Date(now);
        // Insert data into the 'SALES' table
           
            String insertDataQuery = "INSERT INTO RETURNS (Item, Amount, Cost,Date, Department) VALUES (?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataQuery);
            preparedStatement.setString(1, item);
            preparedStatement.setInt(2, amount);
            preparedStatement.setInt(3, cost);            
            preparedStatement.setDate(4, date);
            preparedStatement.setString(5, dp);

            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
       ConH2.closeConnection();
         
     }
     
     
     
   
   public static void sellUpdateVTable(Viagras obj, int amount) throws SQLException{
       //establish connection
        Connection dbConnection = ConH2.getConnection();
       //variables 
    
       String viagraName = obj.getName();
      
       //update amount in class
       obj.subAmount(amount);
       int updatedAmount = obj.getAmount();
       System.out.println("Amount: "+updatedAmount);
       //update on dbs
       String updateData = "UPDATE VIAGRAS SET AMOUNT=? WHERE Item=\'"+viagraName+"\';";
      preparedStatement = connection.prepareStatement(updateData);
      preparedStatement.setInt(1, updatedAmount);
     
      
      preparedStatement.executeUpdate();
      
   }
   
   public static void returnUpdateVTable(Viagras obj, int amount) throws SQLException{
        //establish connection
        Connection dbConnection = ConH2.getConnection();
       //variables 
       String viagraName = obj.getName();
      
       //update amount in class
       obj.addAmount(amount);
       int updatedAmount = obj.getAmount();
       //update on dbs
       String updateData = "UPDATE VIAGRAS SET AMOUNT=? WHERE Item=\'"+viagraName+"\';";
      preparedStatement = connection.prepareStatement(updateData);
      preparedStatement.setInt(1, updatedAmount);
      preparedStatement.executeUpdate();
   }
   
   public static void sellUpdateMTable(MornClass obj, int amount) throws SQLException{
       //establish connection
        Connection dbConnection = ConH2.getConnection();
       //variables 
       String morningAfterName = obj.getName();
      
       //update amount in class
       obj.subAmount(amount);
       int updatedAmount = obj.getAmount();
       //update on dbs
       String updateData = "UPDATE MRNGAFTR SET AMOUNT=? WHERE Item=\'"+morningAfterName+"\';";
      preparedStatement = connection.prepareStatement(updateData);
      preparedStatement.setInt(1, updatedAmount);
      preparedStatement.executeUpdate();
   }
   
   public static void returnUpdateMTable(MornClass obj, int amount) throws SQLException{
         Connection dbConnection = ConH2.getConnection();
       //variables 
       String morningAfterName = obj.getName();
      
       //update amount in class
       obj.addAmount(amount);
       int updatedAmount = obj.getAmount();
       //update on dbs
       String updateData = "UPDATE MRNGAFTR SET AMOUNT=? WHERE Item=\'"+morningAfterName+"\';";
      preparedStatement = connection.prepareStatement(updateData);
      preparedStatement.setInt(1, updatedAmount);
      preparedStatement.executeUpdate();
   }
   
   public static void sellUpdateCTable(Control obj, int amount) throws SQLException{
         //establish connection
        Connection dbConnection = ConH2.getConnection();
       //variables 
       String controlName = obj.getName();
      
       //update amount in class
       obj.subAmount(amount);
       int updatedAmount = obj.getAmount();
       //update on dbs
       String updateData = "UPDATE CONTROL SET AMOUNT=? WHERE Item=\'"+controlName+"\';";
      preparedStatement = connection.prepareStatement(updateData);
      preparedStatement.setInt(1, updatedAmount);
      preparedStatement.executeUpdate();
   }
   
   public static void returnUpdateCTable(Control obj, int amount) throws SQLException{
         //establish connection
        Connection dbConnection = ConH2.getConnection();
       //variables 
       String controlName = obj.getName();
      
       //update amount in class
       obj.addAmount(amount);
       int updatedAmount = obj.getAmount();
       //update on dbs
       String updateData = "UPDATE CONTROL SET AMOUNT=? WHERE Item=\'"+controlName+"\';";
      preparedStatement = connection.prepareStatement(updateData);
      preparedStatement.setInt(1, updatedAmount);
      preparedStatement.executeUpdate();
   }
 
   
   
   public static void addUpdateVTable(Viagras obj) throws SQLException{
        //establish connection
        Connection dbConnection = ConH2.getConnection();
       //variables 
       int amount = obj.getAmount();
       int cost = obj.getCost();
       String viagraName = obj.getName();
      
       //update on dbs
       String updateData1 = "UPDATE VIAGRAS SET AMOUNT=? WHERE Item=\'"+viagraName+"\';";
      preparedStatement = connection.prepareStatement(updateData1);
      preparedStatement.setInt(1, amount);
      preparedStatement.executeUpdate();
      updateData1 = "UPDATE VIAGRAS SET COST=? WHERE Item=\'"+viagraName+"\';";
      preparedStatement = connection.prepareStatement(updateData1);
      preparedStatement.setInt(1, cost);
      preparedStatement.executeUpdate();
       System.out.println("Update viagras!");
       
       //connection closed
       ConH2.closeConnection();
   }
   
   public static void addUpdateMTable(MornClass obj) throws SQLException{
       //establish connection
        Connection dbConnection = ConH2.getConnection();
       //variables 
       int amount = obj.getAmount();
       int cost = obj.getCost();
       String morningName = obj.getName();
      
       //update on dbs
       String updateData1 = "UPDATE MRNGAFTR SET AMOUNT=? WHERE Item=\'"+morningName+"\';";
      preparedStatement = connection.prepareStatement(updateData1);
      preparedStatement.setInt(1, amount);
      preparedStatement.executeUpdate();
      updateData1 = "UPDATE MRNGAFTR SET COST=? WHERE Item=\'"+morningName+"\';";
      preparedStatement = connection.prepareStatement(updateData1);
      preparedStatement.setInt(1, cost);
      preparedStatement.executeUpdate();
       System.out.println("Update morning afters!");
       
       //connection closed
       ConH2.closeConnection();
   }
   
   public static void addUpdateCTable(Control obj) throws SQLException{
       //establish connection
        Connection dbConnection = ConH2.getConnection();
       //variables 
       int amount = obj.getAmount();
       int cost = obj.getCost();
       String controlName = obj.getName();
      
       //update on dbs
       String updateData1 = "UPDATE CONTROL SET AMOUNT=? WHERE Item=\'"+controlName+"\';";
      preparedStatement = connection.prepareStatement(updateData1);
      preparedStatement.setInt(1, amount);
      preparedStatement.executeUpdate();
      updateData1 = "UPDATE CONTROL SET COST=? WHERE Item=\'"+controlName+"\';";
      preparedStatement = connection.prepareStatement(updateData1);
      preparedStatement.setInt(1, cost);
      preparedStatement.executeUpdate();
       System.out.println("Update control L!");
       
       //connection closed
       ConH2.closeConnection();
   }
   
   
   
    
    public static void insertVData(String item, int amount, int cost ) throws SQLException{
        Connection dbConnection = ConH2.getConnection();
         // Insert data into the 'viagras' table
            String insertDataQuery = "INSERT INTO VIAGRAS (Item, Amount, Cost) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataQuery);
            preparedStatement.setString(1, item);
            preparedStatement.setInt(2, amount);
            preparedStatement.setInt(3, cost);
            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
       ConH2.closeConnection();
    }
    
    public static void insertMData(String item, int amount, int cost) throws SQLException{
         Connection dbConnection = ConH2.getConnection();
         // Insert data into the 'viagras' table
            String insertDataQuery = "INSERT INTO MRNGAFTR (Item, Amount, Cost) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataQuery);
            preparedStatement.setString(1, item);
            preparedStatement.setInt(2, amount);
            preparedStatement.setInt(3, cost);
            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
       ConH2.closeConnection();
    }
    
    public static void insertCData(String item, int amount, int cost) throws SQLException{
         Connection dbConnection = ConH2.getConnection();
         // Insert data into the 'viagras' table
            String insertDataQuery = "INSERT INTO CONTROL (Item, Amount, Cost) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataQuery);
            preparedStatement.setString(1, item);
            preparedStatement.setInt(2, amount);
            preparedStatement.setInt(3, cost);
            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
       ConH2.closeConnection();
    }
    
    public static void insertEData(String description, double amount, Date date ) throws SQLException{
          Connection dbConnection = ConH2.getConnection();
         // Insert data into the 'viagras' table
            String insertDataQuery = "INSERT INTO EXPENSES (Item, Amount, Date) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataQuery);
            preparedStatement.setString(1, description);
            preparedStatement.setDouble(2, amount);
            preparedStatement.setDate(3, date);
            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
       ConH2.closeConnection();
    }
    
    public static void insertAData(String item, double amount, Date date) throws SQLException{
        Connection dbConnection = ConH2.getConnection();
         // Insert data into the 'viagras' table
            String insertDataQuery = "INSERT INTO ACCOUNT (Item, Amount, Date) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertDataQuery);
            preparedStatement.setString(1, item);
            preparedStatement.setDouble(2, amount);
            preparedStatement.setDate(3, date);
            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
       ConH2.closeConnection();
    }
    
    
    
 
    public static void deleteRecord(String condition) throws SQLException{
        //open connnection
        Connection dbConnection = ConH2.getConnection();
        
        //delete tuples
        // Print the table contents before deletion
           // System.out.println("Table contents before deletion:");
            

            // Execute SQL statement to delete rows from the 'viagras' table
            String deleteQuery = "DELETE FROM Viagras WHERE Item = ?";
            preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1, condition);
            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " row(s) deleted.");

            // Print the table contents after deletion
            System.out.println("Table contents after deletion:");
         ConH2.closeConnection();
    }
    
    public static void deleteAllRecords(String table) throws SQLException{
         //open connnection
        Connection dbConnection = ConH2.getConnection();
        
        //delete tuples
        // Print the table contents before deletion
           // System.out.println("Table contents before deletion:");
            // Execute SQL statement to delete rows from the 'viagras' table
            String deleteQuery = "DELETE FROM "+table;
            preparedStatement = connection.prepareStatement(deleteQuery);
            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " row(s) deleted.");

            // Print the table contents after deletion
            System.out.println("Table contents after deletion:");
         ConH2.closeConnection();
    }
    
    public static void displaySales() throws SQLException{
        //open connection
          Connection dbConnection = ConH2.getConnection();
          //execute sql statement 
          String selectQuery = "SELECT * FROM SALES;";
            preparedStatement = connection.prepareStatement(selectQuery);
            resultSet = preparedStatement.executeQuery();

            // Print column headers
           
            System.out.printf("%-15s %-10s %-10s %-10s%n", "Item", "Amount", "Cost", "Department");

            System.out.println("------------------------------");

            // Print data
            while (resultSet.next()) {
                String item = resultSet.getString("Item");
                int amount = resultSet.getInt("Amount");
                int cost = resultSet.getInt("Cost");
                String department = resultSet.getString("Department");

                System.out.printf("%-15s %-10s %-10s %-10s%n", item, amount, cost, department);
            }
            //close connection
           ConH2.closeConnection();
    } 
    
   public static void displayVData() throws SQLException {
    // Open connection
    Connection dbConnection = ConH2.getConnection();

    // Execute SQL statement
    String selectQuery = "SELECT * FROM VIAGRAS;";
    preparedStatement = dbConnection.prepareStatement(selectQuery);
    resultSet = preparedStatement.executeQuery();

    // Print column headers
    System.out.printf("%-15s %-10s %-10s%n", "Item", "Amount", "Cost");
    System.out.println("------------------------------");

    // Print data
    while (resultSet.next()) {
        String item = resultSet.getString("Item");
        int amount = resultSet.getInt("Amount");
        int cost = resultSet.getInt("Cost");

        System.out.printf("%-15s %-10s %-10s%n", item, amount, cost);
    }
   }
   
   public static void displayMData() throws SQLException{
        // Open connection
    Connection dbConnection = ConH2.getConnection();

    // Execute SQL statement
    String selectQuery = "SELECT * FROM MRNGAFTR;";
    preparedStatement = dbConnection.prepareStatement(selectQuery);
    resultSet = preparedStatement.executeQuery();

    // Print column headers
    System.out.printf("%-15s %-10s %-10s%n", "Item", "Amount", "Cost");
    System.out.println("------------------------------");

    // Print data
    while (resultSet.next()) {
        String item = resultSet.getString("Item");
        int amount = resultSet.getInt("Amount");
        int cost = resultSet.getInt("Cost");

        System.out.printf("%-15s %-10s %-10s%n", item, amount, cost);
    }
   }
   
   public static void displayCData() throws SQLException{
        // Open connection
    Connection dbConnection = ConH2.getConnection();

    // Execute SQL statement
    String selectQuery = "SELECT * FROM CONTROL;";
    preparedStatement = dbConnection.prepareStatement(selectQuery);
    resultSet = preparedStatement.executeQuery();

    // Print column headers
    System.out.printf("%-15s %-10s %-10s%n", "Item", "Amount", "Cost");
    System.out.println("------------------------------");

    // Print data
    while (resultSet.next()) {
        String item = resultSet.getString("Item");
        int amount = resultSet.getInt("Amount");
        int cost = resultSet.getInt("Cost");

        System.out.printf("%-15s %-10s %-10s%n", item, amount, cost);
    }
   }
   
   public static void displayRData() throws SQLException{
          // Open connection
    Connection dbConnection = ConH2.getConnection();

    // Execute SQL statement
    String selectQuery = "SELECT * FROM RETURNS;";
    preparedStatement = dbConnection.prepareStatement(selectQuery);
    resultSet = preparedStatement.executeQuery();

    // Print column headers
    System.out.printf("%-15s %-10s %-10s%n", "Item", "Amount", "Cost");
    System.out.println("------------------------------");

    // Print data
    while (resultSet.next()) {
        String item = resultSet.getString("Item");
        int amount = resultSet.getInt("Amount");
        int cost = resultSet.getInt("Cost");

        System.out.printf("%-15s %-10s %-10s%n", item, amount, cost);
    }
   }

    
    public static void main(String[] args) throws SQLException {
        // Example usage:
    //   ArrayList<Viagras> vData = ConH2.getVData();

//            insertVData("Sildenafil", 100, 15);
//            insertVData("Oto", 50, 10);
//            insertVData("Tadalafil", 30, 10);
//            insertVData("Kamagra", 50,30);
//        
//        for(Viagras viagras : vData ){
//            System.out.println(viagras);
//        }
//         displayVData();
//        deleteAllRecords();
//          displayVData();
        // Perform database operations here...
 //  displayVData();
        // Close the connection when done
      //  ConH2.closeConnection();
//      createMTable();
//      createCTable();

    //    insertMData("Revoke", 100, 40);
   // createEODTable();

    }
}
