/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.rmi.ServerError;
import java.sql.*;
import javax.swing.JOptionPane;
import BillingManagementSystem.CustomerTransactions;
/**
 *
 * @author Akilan P
 */
public class ConnectionProvider {

    /**
     *
     * @return
     */
    public static Connection getcon()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","123");
            //JOptionPane.showMessageDialog(null,"Database Connected");
            return con;
            
                
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database connection Error");
            
            return null;
        }
   
    }
}
