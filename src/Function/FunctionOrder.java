/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import ConnecDatabase.Connect;
import Intity.Product;
import View.MainMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FunctionOrder {
    private Connection con= Connect.GetConnection();
    private PreparedStatement stmt;
    private  ResultSet rs;
    
    
   public void  ShowMenu( JTable tbMenu, String sql)
    {
        // Tạo tên cột;
       
        Vector column = new Vector(); 
        column.addElement("ID");
        column.addElement("Type");
        column.addElement("Name");
        column.addElement("Price");
       
        // Lấy dữ liệu.
//        String sql ="select *from Sanpham";
        Vector data= new Vector();
        try {
            
            stmt = con.prepareStatement(sql);
            rs= stmt.executeQuery();
           while(rs.next())
           {
               Vector product = new Vector();
               product.addElement(rs.getString("Masp"));
               product.addElement(rs.getString("Loaisp"));
               product.addElement(rs.getString("Tensp"));
               product.addElement(rs.getFloat("Giasp"));
               data.add(product);
           }
        } catch (Exception e) {
        }
        
        tbMenu.setModel(new DefaultTableModel(data, column));
        
    }
   // sử dụng phương thức Search() để tìm kiếm sản phẩm.
   public void Search(JTable tbMenu, String sql, String txtSearch, boolean flag)
   {
      
       // Tạo tên cột;
       
        Vector column = new Vector();
        column.addElement("Masp");
        column.addElement("Type");
        column.addElement("Name");
        column.addElement("Price");
        // Lấy dữ liệu.

        Vector data= new Vector();
        try {
            
            stmt = con.prepareStatement(sql);
            // Sử dụng biến flag để phân tách trường hợp là search all, và search theo theo trường. 
            if(flag == true)
            stmt.setString(1, "%"+txtSearch+"%");
            rs= stmt.executeQuery();
           while(rs.next())
           {
               Vector product = new Vector();
               product.addElement(rs.getString("Masp"));
               product.addElement(rs.getString("Loaisp"));
               product.addElement(rs.getString("Tensp"));
               product.addElement(rs.getFloat("Giasp"));
           if(product.toString().toLowerCase().contains(txtSearch.toLowerCase()))
               data.add(product);
           }
        } catch (Exception e) {
        }
        
        tbMenu.setModel(new DefaultTableModel(data, column));
       
   }
   // Phương thức getArea được sử dụng để lấy ra khu vực ứng với mỗi bàn.
   public String getArea(String table)
   {
       String khuvuc="";

       String sql ="select Khuvuc.Tenkv from Ban inner join Khuvuc on Ban.Makv = Khuvuc.Makv where Tenban =?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, table);
            rs= stmt.executeQuery();
            while(rs.next())
            {
                khuvuc = rs.getString("Tenkv");
                return khuvuc;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
       
  return khuvuc;
   }
   // Phương thức checkDuplicate được sử dụng để kiểm tra xem trong danh sách các sản phẩm có tồn tại 1 sản phẩm cần kiểm
   // tra hay không? nên nó trùng thì trả về true.
//   public boolean CheckDuplicate(String billID, String Name, ArrayList<Product> arrProduct)
   public boolean CheckDuplicate(String nameTable, String Name, ArrayList<Product> arrProduct)
   {
//       boolean flag= false;
       for(Product product : arrProduct)
       {
//           if(product.getBillID().equals(billID)&&product.getName().equals(Name))
           if(product.getNamTable().equals(nameTable)&& product.getName().equals(Name))
           {
               return true;
             
           }
       }
   return false;
   }
   public float Total(ArrayList<Product> arrProduct, String nameTable)
   {
       float price=0;
       for(Product product : arrProduct)
       {
           if(product.getNamTable().equals(nameTable))
           price += product.getMoney();
       }
   return price;
   }
   public String getTableID(String nametable)
   {
       String tableID="";
       String sql= "select*from Ban where TenBan = ?";
       
       try {
           stmt= con.prepareStatement(sql);
           stmt.setString(1, nametable);
           rs= stmt.executeQuery();
           while(rs.next())
           {               
            tableID = rs.getString("Maban");  
            break;
           }
       } catch (Exception e) {
           System.out.println("Faild");
       }
       return tableID;
   }
  public String getEmployeeID(String name)
  {
      String empID="";
      String sql="select *from Nhanvien where Tennv = ?";
      try {
          stmt =con.prepareStatement(sql);
          stmt.setString(1, name);
          rs= stmt.executeQuery();
          while(rs.next())
          {
             empID = rs.getString("Manv");
             break;
          }
      } catch (Exception e) {
          
      }
      return empID;
  }
   
}
