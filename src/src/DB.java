
package src;

import java.sql.*;
public class DB {
    
    private static Connection con = null;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iba","iba","123456");
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
    
    
}
