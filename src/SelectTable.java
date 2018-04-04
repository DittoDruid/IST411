package stny;
import java.sql.*;
import java.io.*;
import java.util.*;

public class SelectTable {    

    static String ClassVariableSQL;
    static String myString = "";
   
  
    public static String executeQuery(String SQL){
        ClassVariableSQL = SQL; 
        
        //Strings for DB connections
        String className=null;
        String url=null;
        String user = null;
        String password = null;
        
        
        //Connection to Database
        try
        {
            ResourceBundle resources;
            InputStream in = null;
            ResourceBundle newResources;

            in = ClassLoader.getSystemResourceAsStream("db.properties");

            resources = new PropertyResourceBundle(in);

            in.close();

            className = resources.getString("jdbc.driver");
            url = resources.getString("jdbc.url");
            System.out.println(url);
            user = resources.getString("jdbc.user");
            password = resources.getString("jdbc.password");
        }
        catch (Exception exp)
        {
            System.out.println("Couldn't load resources." + exp);
            System.exit(-1);
        }

       try
        {
            Class.forName(className);
        }
        catch (Exception e) 
        {
            System.out.println("Failed to load  driver.");            
        }
        
        try
        {
            Connection con = DriverManager.getConnection(url,user,password);  

            Statement stmt = con.createStatement();

            //execute the query
            ResultSet rs = stmt.executeQuery(SQL);
            //rs.getString(SQL);

            ResultSetMetaData rsmd = rs.getMetaData();

            int numberOfColumns = rsmd.getColumnCount();
            int rowCount = 1;

            while (rs.next())
            {
                for (int i = 1; i <= numberOfColumns; i++) 
                {
                    //System.out.print(rs.getString(i) + " ");
                    myString = myString + rs.getString(i) + ", ";
                    String colon = ":";
                }
                System.out.println("Output DB Row");                
                rowCount++;
            }
            System.out.println(myString);
            stmt.close();

            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        //return the string        
        return myString;
    }
    
    
/******************************************************************************/  
    
//Main method to test connection and output
    public static void main (String args[])
    {

        String className=null;
        String url=null;
        String user = null;
        String password = null;
        
        try
        {
            ResourceBundle resources;
            InputStream in = null;
            ResourceBundle newResources;

            in = ClassLoader.getSystemResourceAsStream("db.properties");

            resources = new PropertyResourceBundle(in);

            in.close();

            className = resources.getString("jdbc.driver");
            url = resources.getString("jdbc.url");
            System.out.println(url);
            user = resources.getString("jdbc.user");
            password = resources.getString("jdbc.password");
        }
        catch (Exception exp)
        {
            System.out.println("Couldn't load resources." + exp);
            System.exit(-1);
        }

       try
        {
            Class.forName(className);
        }
        catch (Exception e) 
        {
            System.out.println("Failed to load  driver.");
            return;
        }
        
        try
        {
             Connection con = DriverManager.getConnection(url,user,password);  

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM Inventory");

            ResultSetMetaData rsmd = rs.getMetaData();

            int numberOfColumns = rsmd.getColumnCount();
            int rowCount = 1;

            while (rs.next())
            {
                for (int i = 1; i <= numberOfColumns; i++) 
                {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println("");
                rowCount++;
            }

            stmt.close();

            con.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }//End Main method
}


