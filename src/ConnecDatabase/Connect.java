/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnecDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import javax.swing.JOptionPane;


public class Connect {
    private static Connection con;
    public static Connection GetConnection()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=Coffe ", "sa", "ngochieu");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection to Data is faild");
        }
        return con;
    }
    
}
