/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BillingManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Akilan P
 */
public class CustomerFetch {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","123");
            Statement stmt=con.createStatement();
            String sql="select * from customer";
            ResultSet rs= stmt.executeQuery(sql);
            String csmail=String.valueOf(rs.getString("csmail"));
        } catch (Exception e) {
        }
    }
}
