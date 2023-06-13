 package enventrysystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.sql.*;
public class initconnection
{
    public static Connection getConn()
    {
            Connection con=null;
   
         try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           //System.out.println("Driver is open");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","sanju");
           //System.out.println("Connection open");
         }
        catch(Exception tt)
    {
        System.out.println(tt);
    }
         return con;
   

}
}