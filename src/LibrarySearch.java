
import java.sql.*;
import java.io.*;
import java.util.*;

public class LibrarySearch
{
    
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
        
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter your search: ");
       String search = scan.nextLine();
       System.out.println("Please enter material type: ");
       String type = scan.nextLine();
       
        
       if("all".equals(type))
       {
        try
        {
            Connection con = DriverManager.getConnection(url,user,password);  
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT title, author, departmentCode FROM Material WHERE title LIKE '%"+search+"%' OR author LIKE '%"+search+"%'");
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
        }
       
       else
       {
          try
        {
            Connection con = DriverManager.getConnection(url,user,password);  
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT title, author, departmentCode FROM Material WHERE materialType = '"+type+"' AND (title LIKE '%"+search+"%' OR author LIKE '%"+search+"%')");
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
        } 
          
    }
}