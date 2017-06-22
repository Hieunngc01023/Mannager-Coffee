/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DaoMinhThien
 */
public class DataProcess {

    public static void main(String[] args) {
        getListEmployee();
    }

    public static Connection getConnecttion() {
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
            // line below needs to be modified to include the database name, user, and password (if any)
            con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=Coffe ", "sa", "ngochieu");

            System.out.println("Connected to database !");

        } catch (SQLException sqle) {
            System.out.println("Sql Exception :" + sqle.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception :" + e.getMessage());
        }
        return con;
    }

    public static boolean insertEmp(Employee emp) {
        String sql = "insert into Nhanvien values (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = getConnecttion().prepareStatement(sql);
            ps.setString(1, emp.getManv());
            ps.setString(2, emp.getTennv());
            ps.setString(3, emp.getBophan());
            ps.setString(4, emp.getSdt());
            ps.setString(5, emp.getCmnd());
            ps.setString(6, emp.getNgaysinh());
            ps.setString(7, emp.getGioitinh());
            ps.setString(8, emp.getDiachi());
            ps.setString(9, emp.getNgayvaolam());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("loi roi.");
        }

        return false;
    }
    // phương thức này lấy toàn bộ dữ liệu từ sql
    public static ArrayList<Employee> getListEmployee() {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "Select * from Nhanvien where Manv not like 'QA001' ";
        try {
            PreparedStatement ps = getConnecttion().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setManv(rs.getString(1));
                emp.setTennv(rs.getString(2));
                emp.setBophan(rs.getString(3));
                emp.setSdt(rs.getString(4));
                emp.setCmnd(rs.getString(5));
                emp.setNgaysinh(rs.getString(6));
                emp.setGioitinh(rs.getString(7));
                emp.setDiachi(rs.getString(8));
                emp.setNgayvaolam(rs.getString(9));
                list.add(emp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(list.size());
        return list;
    }

    public static Employee getEmp(String manv) {
        Employee emp = new Employee();
        String sql = "Select * from Nhanvien where manv = ?";
        try {
            PreparedStatement ps = getConnecttion().prepareStatement(sql);
            ps.setString(1, manv);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                emp.setManv(rs.getString(1));
                emp.setTennv(rs.getString(2));
                emp.setBophan(rs.getString(3));
                emp.setSdt(rs.getString(4));
                emp.setCmnd(rs.getString(5));
                emp.setNgaysinh(rs.getString(6));
                emp.setGioitinh(rs.getString(7));
                emp.setDiachi(rs.getString(8));
                emp.setNgayvaolam(rs.getString(9));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }

    public static boolean updateEmp(Employee emp) {

        String sql = "update Nhanvien set Tennv = ? , Bophan=?, Sdt = ? ,"
                + "Cmnd =?, Ngaysinh = ?, Gioitinh=?, Diachi=?,Ngayvaolam =?, "
                + "where  Manv = ? ";

        System.out.println(emp.getManv()+"\t"+emp.getTennv()+"\t"+emp.getBophan()+"\t"+emp.getSdt()+"\t"+emp.getCmnd()+"\t"+emp.getNgaysinh()+"\t"+emp.getGioitinh()+"\t"+emp.getDiachi()+"\t"+emp.getNgayvaolam()+"\t");
        try {
            PreparedStatement ps = getConnecttion().prepareStatement(sql);
            ps.setString(1, emp.getTennv());
            ps.setString(2, emp.getBophan());
            ps.setString(3, emp.getSdt());
            ps.setString(4, emp.getCmnd());
            ps.setString(5, emp.getNgaysinh());
            ps.setString(6, emp.getGioitinh());
            ps.setString(7, emp.getDiachi());
            ps.setString(8, emp.getNgayvaolam());
            ps.setString(10, emp.getManv());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean deleteEmp(String manv, String phongban) {
        if(phongban.equals("Thu Ngan"))
        {
            String sql1= "delete Login Where Manv =?";
            try {
            PreparedStatement ps = getConnecttion().prepareStatement(sql1);
            ps.setString(1, manv);
//            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Loi roi");
        }
        }
        String sql = "delete Nhanvien where Manv = ?";
        
        try {
            PreparedStatement ps = getConnecttion().prepareStatement(sql);
            ps.setString(1, manv);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("Loi roi");
        }

        return false;
    }
     
}
