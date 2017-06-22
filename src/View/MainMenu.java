/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ConnecDatabase.Connect;

import Function.FunctionOrder;
import Intity.Chitiethd;
import Intity.EmployeeLogin;
import Intity.Product;
import Intity.Table;
import Intity.Total;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

public class MainMenu extends javax.swing.JFrame {
   StorePanel stpanel;
    Opitions opition;
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    FunctionOrder function = new FunctionOrder();
    ArrayList<Product> arrProduct = new ArrayList<>();
    private static Product p = null;
    JButton[] button = new JButton[22];
//    Table table[] = new Table[22];
    ArrayList<Table> arrtable = new ArrayList<>();

    ArrayList<Total> arrTotal = new ArrayList<>();
    EmployeePanel employeePanel;
    public MainMenu(){}
    private static EmployeeLogin employeeLogin;
    public MainMenu(Login login, EmployeeLogin emp) {
        super();
        employeeLogin=emp;
        initComponents(); 
        setLocation(100, 0);
        setTitle("Manager");
        con = Connect.GetConnection();
        getBunnton();
        function.ShowMenu(tbMenu, "select *from Sanpham");

    }
    private void getBunnton() {
        button[0] = btTable1;
        button[1] = btTable2;
        button[2] = btTable3;
        button[3] = btTable4;
        button[4] = btTable5;
        button[5] = btTable6;
        button[6] = btTable7;
        button[7] = btTable8;
        button[8] = btTable9;
        button[9] = btTable10;
        button[10] = btTable11;
        button[11] = btTable12;
        button[12] = btTable13;
        button[13] = btTable14;
        button[14] = btTable15;
        button[15] = btTable16;
        button[16] = btTable17;
        button[17] = btTable18;
        button[18] = btTable19;
        button[19] = btTable20;
        button[20] = btTable21;
        button[21] = btTable22;

    }
    // Cua a Hieu.
    ArrayList<Chitiethd> arr = new ArrayList<>();
    private static String maHD;
    String strfr ="";
    String strto = "";
    DateFormat dfm = new SimpleDateFormat("yyy-MM-dd");
    private void initEmpPanel(){
        employeePanel = new EmployeePanel("nguyen ngox hieu");
        
        pnEmployeee.add(employeePanel);
        pnEmployeee.setVisible(true);
        SpringLayout sp = new SpringLayout();
        pnEmployeee.setLayout(sp);
        
        SpringLayout.Constraints empConstraints= sp.getConstraints(employeePanel);
        empConstraints.setX(Spring.constant(-1));
        empConstraints.setY(Spring.constant(-1));
    
        
    }
    private void initStPanel(){
        stpanel = new StorePanel();
        pnStorage.add(stpanel);
        pnStorage.setVisible(true);
        SpringLayout sp = new SpringLayout();
        pnStorage.setLayout(sp);
        SpringLayout.Constraints stConstraints= sp.getConstraints(stpanel);
        stConstraints.setX(Spring.constant(-1));
        stConstraints.setY(Spring.constant(-1));
    }
    private void initOppition(){
        opition = new Opitions();
        
        pnOptions.add(opition);
        pnOptions.setVisible(true);
        SpringLayout sp = new SpringLayout();
        pnOptions.setLayout(sp);
        
        SpringLayout.Constraints empConstraints= sp.getConstraints(opition);
        empConstraints.setX(Spring.constant(-1));
        empConstraints.setY(Spring.constant(-1));
    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHead = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnOrder = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnOption = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnMenu = new javax.swing.JPanel();
        pnOrder = new javax.swing.JPanel();
        pnTable = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btTable1 = new javax.swing.JButton();
        btTable2 = new javax.swing.JButton();
        btTable3 = new javax.swing.JButton();
        btTable4 = new javax.swing.JButton();
        btTable5 = new javax.swing.JButton();
        btTable6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btTable7 = new javax.swing.JButton();
        btTable8 = new javax.swing.JButton();
        btTable9 = new javax.swing.JButton();
        btTable10 = new javax.swing.JButton();
        btTable11 = new javax.swing.JButton();
        btTable12 = new javax.swing.JButton();
        btTable13 = new javax.swing.JButton();
        btTable14 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btTable15 = new javax.swing.JButton();
        btTable16 = new javax.swing.JButton();
        btTable17 = new javax.swing.JButton();
        btTable18 = new javax.swing.JButton();
        btTable19 = new javax.swing.JButton();
        btTable20 = new javax.swing.JButton();
        btTable21 = new javax.swing.JButton();
        btTable22 = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();
        pnImage = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnInfermation = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cbSearch = new javax.swing.JComboBox();
        tfsearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMenu = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbKHuvuc = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbBan = new javax.swing.JLabel();
        lbBophan = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrder = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbEMP = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        pnStatistics = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        dcfr = new com.toedter.calendar.JDateChooser();
        dcto = new com.toedter.calendar.JDateChooser();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblct = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHoadon = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblspham = new javax.swing.JTable();
        cbbsp = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        dcfr1 = new com.toedter.calendar.JDateChooser();
        dcto1 = new com.toedter.calendar.JDateChooser();
        pnEmployeee = new javax.swing.JPanel();
        pnOptions = new javax.swing.JPanel();
        pnStorage = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MenuBar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 12))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mug-icon.png"))); // NOI18N
        btnOrder.setText("Order");
        btnOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrder.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnOrder.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrder);

        btnStatistics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Statistics-icon (1).png"))); // NOI18N
        btnStatistics.setText("Statistics");
        btnStatistics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStatistics.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnStatistics.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnStatistics.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatisticsActionPerformed(evt);
            }
        });
        jPanel2.add(btnStatistics);

        btnEmployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Preppy-icon (1).png"))); // NOI18N
        btnEmployee.setText("Employee");
        btnEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmployee.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnEmployee.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmployee);

        btnOption.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apps-menu-editor-icon.png"))); // NOI18N
        btnOption.setText("Menu");
        btnOption.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOption.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnOption.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnOption.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionActionPerformed(evt);
            }
        });
        jPanel2.add(btnOption);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Stock-Folder-Blue-icon (1).png"))); // NOI18N
        jButton1.setText("Storage");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 2, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Welcome to Maxx Coffee");

        javax.swing.GroupLayout pnHeadLayout = new javax.swing.GroupLayout(pnHead);
        pnHead.setLayout(pnHeadLayout);
        pnHeadLayout.setHorizontalGroup(
            pnHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        pnHeadLayout.setVerticalGroup(
            pnHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeadLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(pnHeadLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnMenu.setForeground(new java.awt.Color(0, 0, 204));
        pnMenu.setLayout(new java.awt.CardLayout());

        pnTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outdoor", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 2, 12))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(2, 5));

        btTable1.setText("B1");
        btTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable1ActionPerformed(evt);
            }
        });
        jPanel4.add(btTable1);

        btTable2.setText("B2");
        btTable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable2ActionPerformed(evt);
            }
        });
        jPanel4.add(btTable2);

        btTable3.setText("B3");
        btTable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable3ActionPerformed(evt);
            }
        });
        jPanel4.add(btTable3);

        btTable4.setText("B4");
        btTable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable4ActionPerformed(evt);
            }
        });
        jPanel4.add(btTable4);

        btTable5.setText("B5");
        btTable5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable5ActionPerformed(evt);
            }
        });
        jPanel4.add(btTable5);

        btTable6.setText("B6");
        btTable6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable6ActionPerformed(evt);
            }
        });
        jPanel4.add(btTable6);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "1st FLoor", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 2, 12))); // NOI18N
        jPanel5.setLayout(new java.awt.GridLayout(2, 5));

        btTable7.setText("B7");
        btTable7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable7ActionPerformed(evt);
            }
        });
        jPanel5.add(btTable7);

        btTable8.setText("B8");
        btTable8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable8ActionPerformed(evt);
            }
        });
        jPanel5.add(btTable8);

        btTable9.setText("B9");
        btTable9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable9ActionPerformed(evt);
            }
        });
        jPanel5.add(btTable9);

        btTable10.setText("B10");
        btTable10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable10ActionPerformed(evt);
            }
        });
        jPanel5.add(btTable10);

        btTable11.setText("B11");
        btTable11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable11ActionPerformed(evt);
            }
        });
        jPanel5.add(btTable11);

        btTable12.setText("B12");
        btTable12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable12ActionPerformed(evt);
            }
        });
        jPanel5.add(btTable12);

        btTable13.setText("B13");
        btTable13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable13ActionPerformed(evt);
            }
        });
        jPanel5.add(btTable13);

        btTable14.setText("B14");
        btTable14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable14ActionPerformed(evt);
            }
        });
        jPanel5.add(btTable14);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2st Floor", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 2, 12))); // NOI18N
        jPanel6.setLayout(new java.awt.GridLayout(2, 5));

        btTable15.setText("B15");
        btTable15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable15ActionPerformed(evt);
            }
        });
        jPanel6.add(btTable15);

        btTable16.setText("B16");
        btTable16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable16ActionPerformed(evt);
            }
        });
        jPanel6.add(btTable16);

        btTable17.setText("B17");
        btTable17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable17ActionPerformed(evt);
            }
        });
        jPanel6.add(btTable17);

        btTable18.setText("B18");
        btTable18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable18ActionPerformed(evt);
            }
        });
        jPanel6.add(btTable18);

        btTable19.setText("B19");
        btTable19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable19ActionPerformed(evt);
            }
        });
        jPanel6.add(btTable19);

        btTable20.setText("B20");
        btTable20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable20ActionPerformed(evt);
            }
        });
        jPanel6.add(btTable20);

        btTable21.setText("B21");
        btTable21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable21ActionPerformed(evt);
            }
        });
        jPanel6.add(btTable21);

        btTable22.setText("B22");
        btTable22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTable22ActionPerformed(evt);
            }
        });
        jPanel6.add(btTable22);

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pnMain.setLayout(new java.awt.CardLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffeemoi.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel2.setText("Project:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel12.setText("Mannager Coffee");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Member:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Nguyễn Ngọc Hiếu:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Phạm Thị Hương:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Nguyễn Duy Hiếu:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Phạm Minh:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 153));
        jLabel20.setText("Let's get started!");

        javax.swing.GroupLayout pnImageLayout = new javax.swing.GroupLayout(pnImage);
        pnImage.setLayout(pnImageLayout);
        pnImageLayout.setHorizontalGroup(
            pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnImageLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnImageLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2))
                    .addGroup(pnImageLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)))
                    .addGroup(pnImageLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnImageLayout.setVerticalGroup(
            pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnImageLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jLabel12)
                .addGap(35, 35, 35)
                .addComponent(jLabel13)
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(27, 27, 27))
        );

        pnMain.add(pnImage, "pnImage");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        cbSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Search All", "Type", "Name" }));
        cbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchActionPerformed(evt);
            }
        });

        tfsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfsearchMouseClicked(evt);
            }
        });
        tfsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsearchActionPerformed(evt);
            }
        });

        btSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSearch)
                .addGap(186, 186, 186))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbMenu.setAutoCreateRowSorter(true);
        tbMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMenuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbMenu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Order", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Area:");

        lbKHuvuc.setText("jLabel8");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Table:");

        lbBan.setText("jLabel9");

        lbBophan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbBophan.setText("Cashier");

        tbOrder.setAutoCreateRowSorter(true);
        tbOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbOrder);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Amount:");

        txtNumber.setEditable(false);
        txtNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNumberMouseClicked(evt);
            }
        });
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });
        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberKeyTyped(evt);
            }
        });

        btEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDelete))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumber))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel10.setLayout(new java.awt.GridLayout(1, 4));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel10.add(btnSave);

        jButton3.setText("Move");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton3);

        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton4);

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        jPanel10.add(btCancel);

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 102));
        jLabel15.setText("Total:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel17.setText("VND");

        lbEMP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbEMP.setText("Nguyen Van Quan");

        lbTotal.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbKHuvuc)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbBan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(lbTotal)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbBophan)
                .addGap(28, 28, 28)
                .addComponent(lbEMP)
                .addGap(57, 57, 57))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbKHuvuc))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbBophan)
                    .addComponent(lbEMP))
                .addGap(1, 1, 1)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lbBan))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbTotal)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnInfermationLayout = new javax.swing.GroupLayout(pnInfermation);
        pnInfermation.setLayout(pnInfermationLayout);
        pnInfermationLayout.setHorizontalGroup(
            pnInfermationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfermationLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnInfermationLayout.setVerticalGroup(
            pnInfermationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnMain.add(pnInfermation, "Information");

        javax.swing.GroupLayout pnOrderLayout = new javax.swing.GroupLayout(pnOrder);
        pnOrder.setLayout(pnOrderLayout);
        pnOrderLayout.setHorizontalGroup(
            pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOrderLayout.createSequentialGroup()
                .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnOrderLayout.setVerticalGroup(
            pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnOrderLayout.createSequentialGroup()
                .addGroup(pnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnMenu.add(pnOrder, "Order");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel21.setText("Choose date:");

        jLabel22.setText("To:");

        jLabel23.setText("From:");

        jButton5.setText("View All");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcfr, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83)
                        .addComponent(jButton5)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcfr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton5)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tblct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill Detail"
            }
        ));
        jScrollPane2.setViewportView(tblct);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        tblHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Static"
            }
        ));
        tblHoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoadonMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblHoadon);

        jButton9.setText("Revenue");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel4)
                .addGap(631, 631, 631))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Show Bill", jPanel12);

        tblspham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane5.setViewportView(tblspham);

        cbbsp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cafe", "Nuoc ep", "Nuoc giai khat", "Sinh to", "Sua chua", "Thuocla", "Bia", "Do uong khac" }));

        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("From");

        jLabel24.setText("To");

        jLabel25.setText("Type of Product");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbsp, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcfr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(dcfr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dcto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbsp))
                .addGap(66, 66, 66)
                .addComponent(jButton2)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Show Products", jPanel13);

        javax.swing.GroupLayout pnStatisticsLayout = new javax.swing.GroupLayout(pnStatistics);
        pnStatistics.setLayout(pnStatisticsLayout);
        pnStatisticsLayout.setHorizontalGroup(
            pnStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        pnStatisticsLayout.setVerticalGroup(
            pnStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatisticsLayout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pnMenu.add(pnStatistics, "Statistics");

        javax.swing.GroupLayout pnEmployeeeLayout = new javax.swing.GroupLayout(pnEmployeee);
        pnEmployeee.setLayout(pnEmployeeeLayout);
        pnEmployeeeLayout.setHorizontalGroup(
            pnEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1243, Short.MAX_VALUE)
        );
        pnEmployeeeLayout.setVerticalGroup(
            pnEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        pnMenu.add(pnEmployeee, "Employee");

        javax.swing.GroupLayout pnOptionsLayout = new javax.swing.GroupLayout(pnOptions);
        pnOptions.setLayout(pnOptionsLayout);
        pnOptionsLayout.setHorizontalGroup(
            pnOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1243, Short.MAX_VALUE)
        );
        pnOptionsLayout.setVerticalGroup(
            pnOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        pnMenu.add(pnOptions, "Opitions");

        javax.swing.GroupLayout pnStorageLayout = new javax.swing.GroupLayout(pnStorage);
        pnStorage.setLayout(pnStorageLayout);
        pnStorageLayout.setHorizontalGroup(
            pnStorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1243, Short.MAX_VALUE)
        );
        pnStorageLayout.setVerticalGroup(
            pnStorageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
        );

        pnMenu.add(pnStorage, "storage");

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross-icon.png"))); // NOI18N
        jToggleButton1.setText("Exit:");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHead, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Phương thức kiểm tra phân quyền, nếu là Quản lý thì được sử dụng tất cả tính năng.
    private boolean Phanquyen(){
        if(employeeLogin.getPhongban().equals("Quan ly"))
        return true;
        else
            return false;
    }
    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        ShowPanel("Order");
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatisticsActionPerformed
        if(Phanquyen()==true)
        ShowPanel("Statistics");
        else
            JOptionPane.showMessageDialog(this, "You don' have enough right to do.");
    }//GEN-LAST:event_btnStatisticsActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        
        if(Phanquyen()==true)
        {
        ShowPanel("Employee");
        initEmpPanel();
        }
        else
            JOptionPane.showMessageDialog(this, "You don' have enough right to do.");
            
        
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionActionPerformed
        
        if(Phanquyen()==true){
         ShowPanel("Opitions");
        initOppition();
        }
        else
            JOptionPane.showMessageDialog(this, "You don' have enough right to do.");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOptionActionPerformed

    private void btTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable1ActionPerformed
        HandlingSave(btTable1.getText());
//        ShowPanelMain("Information", btTable1.getText());
    }//GEN-LAST:event_btTable1ActionPerformed

    private void btTable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable2ActionPerformed
        HandlingSave(btTable2.getText());
//        ShowPanelMain("Information", btTable2.getText());
    }//GEN-LAST:event_btTable2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Phanquyen()==true){
        ShowPanel("storage");
        initStPanel();
        }
            else
            JOptionPane.showMessageDialog(this, "You don' have enough right to do.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSearchActionPerformed

    private void btTable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable4ActionPerformed
        HandlingSave(btTable4.getText());
//        ShowPanelMain("Information", btTable4.getText());


    }//GEN-LAST:event_btTable4ActionPerformed

    private void btTable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable3ActionPerformed
        HandlingSave(btTable3.getText());
//         ShowPanelMain("Information", btTable3.getText());
    }//GEN-LAST:event_btTable3ActionPerformed

    private void btTable5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable5ActionPerformed
        HandlingSave(btTable5.getText());
//        ShowPanelMain("Information", btTable5.getText());
    }//GEN-LAST:event_btTable5ActionPerformed

    private void btTable6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable6ActionPerformed
        HandlingSave(btTable6.getText());
//        ShowPanelMain("Information", btTable6.getText());
    }//GEN-LAST:event_btTable6ActionPerformed

    private void btTable7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable7ActionPerformed
        HandlingSave(btTable7.getText());
//        ShowPanelMain("Information", btTable7.getText());
    }//GEN-LAST:event_btTable7ActionPerformed

    private void btTable8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable8ActionPerformed
        HandlingSave(btTable8.getText());
//        ShowPanelMain("Information", btTable8.getText());
    }//GEN-LAST:event_btTable8ActionPerformed

    private void btTable9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable9ActionPerformed
        HandlingSave(btTable9.getText());
//        ShowPanelMain("Information", btTable9.getText());
    }//GEN-LAST:event_btTable9ActionPerformed

    private void btTable10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable10ActionPerformed
        HandlingSave(btTable10.getText());
//        ShowPanelMain("Information", btTable10.getText());
    }//GEN-LAST:event_btTable10ActionPerformed

    private void btTable11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable11ActionPerformed
        HandlingSave(btTable11.getText());
//        ShowPanelMain("Information", btTable11.getText());
    }//GEN-LAST:event_btTable11ActionPerformed

    private void btTable12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable12ActionPerformed
        HandlingSave(btTable12.getText());
//        ShowPanelMain("Information", btTable12.getText());
    }//GEN-LAST:event_btTable12ActionPerformed

    private void btTable13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable13ActionPerformed
        HandlingSave(btTable13.getText());
//        ShowPanelMain("Information", btTable13.getText());
    }//GEN-LAST:event_btTable13ActionPerformed

    private void btTable14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable14ActionPerformed
        HandlingSave(btTable14.getText());
//        ShowPanelMain("Information", btTable14.getText());
    }//GEN-LAST:event_btTable14ActionPerformed

    private void btTable15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable15ActionPerformed
        HandlingSave(btTable15.getText());
//        ShowPanelMain("Information", btTable15.getText());
    }//GEN-LAST:event_btTable15ActionPerformed

    private void btTable16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable16ActionPerformed
        HandlingSave(btTable16.getText());
//        ShowPanelMain("Information", btTable16.getText());
    }//GEN-LAST:event_btTable16ActionPerformed

    private void btTable17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable17ActionPerformed
        HandlingSave(btTable17.getText());
//        ShowPanelMain("Information", btTable17.getText());
    }//GEN-LAST:event_btTable17ActionPerformed

    private void btTable18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable18ActionPerformed
        HandlingSave(btTable18.getText());
//        ShowPanelMain("Information", btTable18.getText());
    }//GEN-LAST:event_btTable18ActionPerformed

    private void btTable19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable19ActionPerformed
        HandlingSave(btTable19.getText());
//        ShowPanelMain("Information", btTable19.getText());
    }//GEN-LAST:event_btTable19ActionPerformed

    private void btTable20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable20ActionPerformed
        HandlingSave(btTable20.getText());
//        ShowPanelMain("Information", btTable20.getText());
    }//GEN-LAST:event_btTable20ActionPerformed

    private void btTable21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable21ActionPerformed
        HandlingSave(btTable21.getText());
//        ShowPanelMain("Information", btTable21.getText());
    }//GEN-LAST:event_btTable21ActionPerformed

    private void btTable22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTable22ActionPerformed
        HandlingSave(btTable22.getText());
//        ShowPanelMain("Information", btTable22.getText());
    }//GEN-LAST:event_btTable22ActionPerformed
    // Xử lý rằng buộc nút save.

    private void HandlingSave(String nameTable) {
        boolean check = false;
        for (int i = 0; i < arrtable.size(); i++) {
            // Trường hợp có bàn chưa save
            if (arrtable.get(i).getStatus() == false) {
                arrtable.get(i).setStatus(true);
                int ask = JOptionPane.showConfirmDialog(this, "Do you want to save?");
                // xử lý 2 trường hợp , save hoặc không save
                if (ask == 0)// trường hợp save
                {
                    for (int j = 0; j < button.length; j++) {
                        if (button[j].getText().equals(arrtable.get(i).getTableName())) {
                            button[j].setBackground(Color.red);
                            break;
                        }
                    }
                } else// trường hợp không save, phải xóa hết các product, các giá ra khỏi List.
                {
                    for (Iterator<Product> iterator = arrProduct.iterator(); iterator.hasNext();) {
                        Product product = iterator.next();
                        if (product.getNamTable().equals(arrtable.get(i).getTableName())) {
                            // Remove the current element from the iterator and the list.
                            iterator.remove();
                        }
                    }
                    for (int k = 0; k < arrTotal.size(); k++) {
                        if (arrtable.get(i).getTableName().equals(arrTotal.get(k).getNameTable())) {
                            arrTotal.remove(i);
                            break;
                        }
                    }
                    arrtable.remove(arrtable.get(i));
                }
                ShowPanelMain("Information", nameTable);
                check = true;
                break;
            }
        }
        // Trường hợp qua lại bình thường, coi như mới
        if (check == false) {
            ShowPanelMain("Information", nameTable);
        }
    }
    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed

        if (cbSearch.getSelectedItem().toString() == "Search All") {

            String sql = "select *from Sanpham";
            function.Search(tbMenu, sql, tfsearch.getText().trim(), false);
        } else if (cbSearch.getSelectedItem().toString() == "Type") {
            String sql = "select *from Sanpham where Loaisp like ?";
            function.Search(tbMenu, sql, tfsearch.getText().trim(), true);
        } else if (cbSearch.getSelectedItem().toString() == "Name") {
            String sql = "select *from Sanpham where Tensp like ?";
            function.Search(tbMenu, sql, tfsearch.getText().trim(), true);
        }


    }//GEN-LAST:event_btSearchActionPerformed

    private void tbMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMenuMouseClicked
        Product product = new Product();
        int j = tbMenu.getSelectedRow();
        if (j != -1 && function.CheckDuplicate(lbBan.getText(), tbMenu.getValueAt(j, 2).toString(), arrProduct) == false) {
            product.setNamTable(lbBan.getText());
            product.setProductID(tbMenu.getValueAt(j, 0).toString());
            product.setType(tbMenu.getValueAt(j, 1).toString());
            product.setName(tbMenu.getValueAt(j, 2).toString());
            product.setPrice(Float.parseFloat(tbMenu.getValueAt(j, 3).toString()));
            product.setNumber(1);
            product.setMoney(product.getPrice() * product.getNumber());
            // Nhớ xóa Product khi in sản phẩm khỏi bàn. 
            arrProduct.add(product);
            ShowOrder();
            if (tbOrder.getRowCount() == 1) {
                Table table = new Table();
                table.setTableName(lbBan.getText());
                table.setStatus(false);
                // Nhớ rằng khi in vào hóa đơn, phải xóa bàn đó khỏi arraylist
                arrtable.add(table);
                Total total = new Total();
                total.setNameTable(lbBan.getText());
                total.setTotal(Float.parseFloat(lbTotal.getText()));
                arrTotal.add(total);
            }
            if (tbOrder.getRowCount() > 1) {
                for (int i = 0; i < arrTotal.size(); i++) {
                    if (arrTotal.get(i).getNameTable().equals(lbBan.getText())) {
                        arrTotal.get(i).setTotal(Float.parseFloat(lbTotal.getText()));
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Product you have entered is exised in Order.");
        }
    }//GEN-LAST:event_tbMenuMouseClicked
// Khi nhấn nút save trạng thái tên của bàn sẽ chuyển sang màu đỏ.
// Nếu không có bất kì sản phẩm nào, thì sẽ không thể lưu được sản phẩm.
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        SaveOrder();
    }//GEN-LAST:event_btnSaveActionPerformed
    //Phuong thuc save , de save cac san pham lai.

    private void SaveOrder() {
        if (tbOrder.getRowCount() > 0) {
            for (int i = 0; i < button.length; i++) {
                if (button[i].getText().equals(lbBan.getText())) {
                    button[i].setBackground(Color.red);
                    break;
                }
            }
            for (int i = 0; i < arrtable.size(); i++) {
                if (arrtable.get(i).getTableName().equals(lbBan.getText())) {
                    arrtable.get(i).setStatus(true);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Don't have any Product to save.");
        }
    }
    private void tbOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOrderMouseClicked
        int i = tbOrder.getSelectedRow();
        if (i != -1) {
            
            p = new Product();
            txtNumber.setEditable(true);
            txtNumber.requestFocus();
            p.setName(tbOrder.getValueAt(i, 0).toString());
            p.setPrice(Float.parseFloat(tbOrder.getValueAt(i, 2).toString()));
            p.setNumber(Integer.parseInt(tbOrder.getValueAt(i, 1).toString()));
            txtNumber.setText(tbOrder.getValueAt(i, 1).toString());
        }

    }//GEN-LAST:event_tbOrderMouseClicked

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        for (int i = 0; i < arrProduct.size(); i++) {
            if (lbBan.getText().equals(arrProduct.get(i).getNamTable()) && p.getName().equals(arrProduct.get(i).getName())) {

                arrProduct.get(i).setNumber(Integer.parseInt(txtNumber.getText()));
                arrProduct.get(i).setMoney(Float.parseFloat(txtNumber.getText()) * p.getPrice());
                break;
            }

        }
        ShowOrder();
        txtNumber.setText("");
    }//GEN-LAST:event_btEditActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        for (int i = 0; i < arrProduct.size(); i++) {
            if (lbBan.getText().equals(arrProduct.get(i).getNamTable()) && p.getName().equals(arrProduct.get(i).getName())) {
                arrProduct.remove(arrProduct.get(i));
                break;
            }

        }
        ShowOrder();

        txtNumber.setText("");

    }//GEN-LAST:event_btDeleteActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        CancelOrder();
    }//GEN-LAST:event_btCancelActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (tbOrder.getRowCount() > 0) {
            String motable = JOptionPane.showInputDialog(this, "Move to table what?");
            if (motable == null) {
                return;
            } else {
                if (Pattern.matches("^([bB][1-9])|([bB][1][0-9])|([bB][2][0-2])$", motable)) {
//            String motable =  JOptionPane.showInputDialog(this, "Move to table what?");
                    String movetable = motable.toUpperCase();

                    boolean flag = false;

                    for (int i = 0; i < arrtable.size(); i++) {
                        // trường hợp đầu tiên ,kiểm tra xem Bàn chuyển đến chưa có.
                        if (arrtable.get(i).getTableName().equals(movetable)) {
                            flag = true;
                            break;
                        }
                    }  // Bàn chuyển đến chưa có product.                 
                    if (flag == false) {
                        for (int b = 0; b < arrProduct.size(); b++) {

                            // thay đổi tên bàn của mỗi sản phẩm.
                            if (arrProduct.get(b).getNamTable().equals(lbBan.getText())) {
                                arrProduct.get(b).setNamTable(movetable);
                            }
                        }

                        for (int i = 0; i < arrtable.size(); i++) {
                            if (arrtable.get(i).getTableName().equals(lbBan.getText())) {
                                arrtable.get(i).setTableName(movetable);
                                break;
                            }
                        }
                        // chuyển tổng tiền qua bàn kia.
                        for (int i = 0; i < arrTotal.size(); i++) {
                            if (arrTotal.get(i).getNameTable().equals(lbBan.getText())) {
                                arrTotal.get(i).setNameTable(movetable);
                                break;
                            }
                        }
                        for (int i = 0; i < button.length; i++) {
                            if (button[i].getText().equals(lbBan.getText())) {
                                button[i].setBackground(null);
                                break;
                            }
                        }
                        for (int i = 0; i < button.length; i++) {
                            if (button[i].getText().equals(movetable)) {
                                button[i].setBackground(Color.RED);
                                break;
                            }
                        }
                        ShowPanelMain("Information", movetable);
                        // Phai nhan save truoc. 
                    } // Bàn đã đến đã có sản phẩm rồi.
                    else {
                        // Thay đổi Sản phẩm, kiểm tra xem sản phẩm có trùng tên không.
                        for (int i = 0; i < arrProduct.size(); i++) {
                            if (arrProduct.get(i).getNamTable().equals(lbBan.getText())) {
                                boolean checkdublicate = false;
                                for (int b = 0; b < arrProduct.size(); b++) {
                                    if (arrProduct.get(b).getNamTable().equals(movetable) && arrProduct.get(b).getName().equals(arrProduct.get(i).getName())) {
                                        checkdublicate = true;
                                        arrProduct.get(b).setNumber(arrProduct.get(i).getNumber() + arrProduct.get(b).getNumber());
                                        arrProduct.get(b).setMoney(arrProduct.get(b).getNumber() * arrProduct.get(b).getPrice());
                                        break;
                                    }

                                }
                                if (checkdublicate == false) {
                                    arrProduct.get(i).setNamTable(movetable);
                                }
                            }
                        }
                        for (Iterator<Product> iterator = arrProduct.iterator(); iterator.hasNext();) {
                            Product product = iterator.next();
                            if (product.getNamTable().equals(lbBan.getText())) {
                                // Remove the current element from the iterator and the list.
                                iterator.remove();
                            }
                        }
                        // Xử lý total.
                        for (int i = 0; i < arrTotal.size(); i++) {
                            if (arrTotal.get(i).getNameTable().equals(movetable)) {
                                arrTotal.get(i).setTotal(arrTotal.get(i).getTotal() + Float.parseFloat(lbTotal.getText()));
                                break;
                            }
                            
                        }
                        for (int i = 0; i < arrTotal.size(); i++) {
                            if (arrTotal.get(i).getNameTable().equals(lbBan)) {
                                arrTotal.remove(i);
                                 break;
                            }
                           
                        }
                        // Xóa bàn hiện tại. 
                        for (int i = 0; i < arrtable.size(); i++) {
                            if (arrtable.get(i).getTableName().equals(lbBan.getText())) {
                                arrtable.get(i).setTableName(movetable);
                                break;
                            }
                        }
                        // Xử lý button.
                        for (int i = 0; i < button.length; i++) {
                            if (button[i].getText().equals(lbBan.getText())) {
                                button[i].setBackground(null);
                                break;
                            }
                        }
                        ShowPanelMain("Information", movetable);

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Name of Table is wrong");
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Don't have any product to move.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void tfsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsearchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(tbOrder.getRowCount()>0)
        {
        String tableID = function.getTableID(lbBan.getText());
//        String empID = function.getEmployeeID(lbEMP.getText());
        long mill = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(mill);
        java.util.Date da = new java.util.Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dhID = formatter.format(da);
        // Đọc vào Sql.
        String sqlhoadon = "insert into Hoadon(Mahd,Thoigian, Maban, Tongtien , Tennv) values (?,?,?,?,?)";
        try {
            stmt = con.prepareStatement(sqlhoadon);
            stmt.setString(1, dhID);
            stmt.setDate(2, date);
            stmt.setString(3, tableID);
            stmt.setString(4, lbTotal.getText());
            stmt.setString(5, lbEMP.getText());
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("xay ra loi");
        }
        for (int i = 0; i < arrProduct.size(); i++) {
            if (arrProduct.get(i).getNamTable().equals(lbBan.getText())) {
                String sqlChitiet = "insert into Chitiethd(Mahd,Loaisp, Tensp,Soluong, Thanhtien, Masp) values (?,?,?,?,?,?)";
                try {
                    stmt = con.prepareStatement(sqlChitiet);
                    stmt.setString(1, dhID);
                    stmt.setString(2, arrProduct.get(i).getType());
                    stmt.setString(3, arrProduct.get(i).getName());
                    stmt.setInt(4, arrProduct.get(i).getNumber());
                    
                    stmt.setFloat(5, arrProduct.get(i).getMoney());
                    stmt.setString(6, arrProduct.get(i).getProductID());
                    stmt.executeUpdate();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "xay raloi gi do.");
                }
            }
        }
        // In hóa đơn.
        Document document = new Document();
        try {
            try {
           
                PdfWriter.getInstance(document, new FileOutputStream("dhID.pdf"));
                document.open();
                
                document.add(new Paragraph("               Maxx Cafe", new Font(Font.FontFamily.TIMES_ROMAN,37, Font.BOLD)));
                document.add(new Paragraph("                                8/Ton That Thuyet, My Dinh, Tu Liem.", new Font(Font.FontFamily.TIMES_ROMAN,14, Font.ITALIC)));
                document.add(new Paragraph("                                             Tel: 01678194860.", new Font(Font.FontFamily.TIMES_ROMAN,14, Font.ITALIC)));
                document.add(new Paragraph("                      Phieu Thanh Toan",new Font(Font.FontFamily.TIMES_ROMAN,24, Font.BOLD)));
                document.add(new Paragraph("               Khu: "+lbKHuvuc.getText()+"                               "+dhID,new Font(Font.FontFamily.TIMES_ROMAN,14, Font.BOLD)));
                document.add(new Paragraph("               Ban: "+lbBan.getText()+"                                            "+lbBophan.getText()+": "+ lbEMP.getText(),new Font(Font.FontFamily.TIMES_ROMAN,14, Font.BOLD)));
                DefaultTableModel model = (DefaultTableModel) tbOrder.getModel();
                
                PdfPTable pdfTable= new PdfPTable(model.getColumnCount());
                pdfTable.setSpacingBefore(5f);
                pdfTable.setSpacingAfter(1f);
                float[] columnWidths = {1f, 0.5f, 0.5f, 0.5f};
                pdfTable.setWidths(columnWidths);
                pdfTable.getDefaultCell().setBorderWidth(0f);
                for(int i=0; i<model.getColumnCount();i++)
                {
                    pdfTable.addCell(model.getColumnName(i));
                }
                
                    for(int rows =0; rows < model.getRowCount() ; rows++)
                    {
                        for(int cols =0; cols <model.getColumnCount(); cols++)
                        {
                            pdfTable.addCell(model.getValueAt(rows, cols).toString());
                        }
                        
                    }
                document.add(pdfTable);
                document.add(new Paragraph("               -----------------------------------------------------------------------------------------",new Font(Font.FontFamily.TIMES_ROMAN,13, Font.NORMAL)));
                document.add(new Paragraph("               Tong cong                                        "+lbTotal.getText()+"    VND",new Font(Font.FontFamily.TIMES_ROMAN,17, Font.BOLD)));
               document.add(new Paragraph(" "));
                document.add(new Paragraph("                                   Chuc quy khach vui ve,hen gap lai!",new Font(Font.FontFamily.TIMES_ROMAN,14, Font.BOLDITALIC)));
                
                document.close();
            } catch (DocumentException ex) {
            }
        } catch (FileNotFoundException ex) {
        }
        
        CancelOrder();
        }
        else
            JOptionPane.showMessageDialog(this, "Don't have any product to save!");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumberMouseClicked
        txtNumber.setText("");
    }//GEN-LAST:event_txtNumberMouseClicked

    private void tfsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfsearchMouseClicked
        tfsearch.setText("");
    }//GEN-LAST:event_tfsearchMouseClicked

    private void txtNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c== KeyEvent.VK_DELETE)))
        {
            getToolkit().beep();
            evt.consume();
            
        }
    }//GEN-LAST:event_txtNumberKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Date fr = dcfr.getDate();
        Date to = dcto.getDate();
        Viewtkht(fr, to);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblHoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoadonMouseClicked
        // TODO add your handling code here:
        int i= tblHoadon.getSelectedRow();
        if(i!=-1)
        {
            maHD= tblHoadon.getValueAt(i, 0).toString();
            // System.out.println(maHD);
        }
        ViewDetails(maHD);
    }//GEN-LAST:event_tblHoadonMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Date fr = dcfr.getDate();
        Date to = dcto.getDate();
        Doanhthu(fr, to);
    }//GEN-LAST:event_jButton9ActionPerformed
    public void ViewSp(java.util.Date fr, java.util.Date to){
            if(fr == null){
                strfr = "2000-01-01";
            }else{
                strfr = dfm.format(fr);
            }
            if(to == null){
                strto = "3000-01-01";
            }else{
                strto = dfm.format(to);
            }
        String sql = "Select Chitiethd.Tensp, Sum(Chitiethd.Soluong)[sl],sum(Chitiethd.Thanhtien)[tt]"
                    + " from Chitiethd inner join Hoadon on Chitiethd.Mahd=Hoadon.Mahd "
                    + "where Loaisp=? and hoadon.Thoigian between \'" + strfr + "\'   and \'" + strto + "\' "
                    + "group by Chitiethd.Tensp order by [sl]";
        try {
            stmt=con.prepareStatement(sql);
            stmt.setString(1, (String)this.cbbsp.getSelectedItem().toString());
            rs=stmt.executeQuery();
            Vector col = new Vector();
            col.add("Tensp");
            col.add("sl");
            col.add("tt");
            Vector data = new Vector();
            while(rs.next()){
                Vector ve = new Vector();
                ve.add(rs.getString("Tensp"));
                ve.add(rs.getString("sl"));
                ve.add(rs.getString("tt"));
                data.add(ve);
            }
            tblspham.setModel(new DefaultTableModel(data, col));
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
     public ArrayList<Chitiethd> ViewDetails(String maHD){
         System.out.println(maHD);
         String sql = "select Loaisp,Tensp,Soluong,Thanhtien from Chitiethd where Mahd =?";
        try {
            stmt=con.prepareStatement(sql);
            stmt.setString(1, maHD);
            rs=stmt.executeQuery();
            Vector col = new Vector();
            col.add("Loaisp");
            col.add("Tensp");
            col.add("Soluong");         
            col.add("Thanhtien");
            Vector data = new Vector();
            while(rs.next()){
                Vector ve = new Vector();
                ve.add(rs.getString("Loaisp"));
                ve.add(rs.getString("Tensp"));
                ve.add(rs.getInt("Soluong"));
                ve.add(rs.getFloat("Thanhtien"));
                data.add(ve);
            }
            DefaultTableModel dtm = new DefaultTableModel(data, col);
            tblct.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
     public void Viewtkht(java.util.Date fr, java.util.Date to){
        String strfr ="";
        String strto = "";
        if(fr == null){
            strfr = "2000-01-01";
        }else{
            strfr = dfm.format(fr);
        }
        if(to == null){
            strto = "3000-01-01";
        }else{
            strto = dfm.format(to);
        }        
        String sql = "select Hoadon.Mahd, hoadon.Thoigian, Hoadon.Tongtien, Hoadon.Tennv, ban.Tenban from Hoadon "
               
                + "inner join Ban on Hoadon.Maban = ban.Maban where hoadon.Thoigian between \'" + strfr + "\'   and \'" + strto + "\' " ;

 
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            Vector columns = new Vector();
            columns.add("Mã hóa đơn");
            columns.add("Tên bàn");
            columns.add("Tên Nv"); 
            columns.add("Thời gian");
            columns.add("Tổng tiền");     
            Vector data = new Vector();
            while(rs.next()){
                Vector ve = new Vector();
                ve.add(rs.getString("Mahd"));
                ve.add(rs.getString("Tenban"));
                ve.add(rs.getString("Tennv"));
                ve.add(rs.getString("Thoigian"));
                ve.add(rs.getString("Tongtien"));                
                data.add(ve);
            }
            DefaultTableModel dtm = new DefaultTableModel(data, columns);
            tblHoadon.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
            

    }
    public void Doanhthu(java.util.Date fr, java.util.Date to){
        
        if(fr == null){
            strfr = "2000-01-01";
        }else{
            strfr = dfm.format(fr);
        }if(to == null){
            strto = "3000-01-01";
        }else{
            strto = dfm.format(to);
        }        
        String sql = "select sum(tongtien)[Doanhthu] from Hoadon"
                    + " where hoadon.Thoigian between \'" + strfr + "\'   and \'" + strto + "\' ";
        try {
            stmt=con.prepareStatement(sql);
            rs=stmt.executeQuery();
//                Vector col = new Vector();
//                col.add("Doanhthu");
//                Vector data = new Vector();
//                while(rs.next()){
//                Vector ve = new Vector();
//                ve.add(rs.getString("Doanhthu"));
//                data.add(ve);
//                }
//                tbldt.setModel(new DefaultTableModel(data, col));
            float a =0;
            while(rs.next()){
                 a=rs.getFloat("Doanhthu");
            }            
            jLabel4.setText(new Float(a).toString());
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Date fr = dcfr1.getDate();
        Date to = dcto1.getDate();
        ViewSp(fr, to);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged
    private void CancelOrder() {
        for (int i = 0; i < button.length; i++) {
            if (button[i].getText().equals(lbBan.getText())) {
                button[i].setBackground(null);
                break;
            }
        }
        for (int i = 0; i < arrtable.size(); i++) {
            if (lbBan.getText().equals(arrtable.get(i).getTableName())) {
                arrtable.remove(arrtable.get(i));
                break;
            }
        }
        for (int i = 0; i < arrTotal.size(); i++) {
            if (lbBan.getText().equals(arrTotal.get(i).getNameTable())) {
                arrTotal.remove(i);
                break;
            }
        }
        // Khong hieu.
        for (Iterator<Product> iterator = arrProduct.iterator(); iterator.hasNext();) {
            Product product = iterator.next();
            if (product.getNamTable().equals(lbBan.getText())) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
            }
        }
        ShowPanelImage("pnImage");

    }

    private void ShowOrder() {
        Vector column = new Vector();
        column.addElement("Name");
        column.addElement("Number");
        column.addElement("Price");
        column.addElement("Money");
        Vector data = new Vector();

        for (Product product : arrProduct) {
            if (lbBan.getText().equals(product.getNamTable())) {
                Vector data1 = new Vector();
                data1.addElement(product.getName());
                data1.addElement(product.getNumber());
                data1.addElement(product.getPrice());
                data1.addElement(product.getMoney());
                data.add(data1);
            }

        }
        tbOrder.setModel(new DefaultTableModel(data, column));
        lbTotal.setText(new Float(function.Total(arrProduct, lbBan.getText())).toString());
    }

// Tạo phương thức ShowPanel để tại sử dụng các phương thức gọi cardlayout.
// Đây là các panel của Menu chính
    private void ShowPanel(String panelname) {
        CardLayout card = (CardLayout) pnMenu.getLayout();
        card.show(pnMenu, panelname);

    }

    //Đây là các phương thức lấy panel Image và Information
    private void ShowPanelImage(String panelname) {
        CardLayout cardLayout = (CardLayout) pnMain.getLayout();
        cardLayout.show(pnMain, panelname);

    }

    /// Đây là phương thức lấy panel gọi thực đơn.

    private void ShowPanelMain(String panelname, String table) {
        boolean flag = false;
        CardLayout cardLayout = (CardLayout) pnMain.getLayout();
        cardLayout.show(pnMain, panelname);
        function.ShowMenu(tbMenu, "select *from Sanpham");
        lbBan.setText(table);
        lbEMP.setText(employeeLogin.getTenNv());
        lbBophan.setText(employeeLogin.getPhongban());
        //Lay khu vuc.
        lbKHuvuc.setText(function.getArea(table));
        for (int i = 0; i < arrtable.size(); i++) {
            Table table1 = arrtable.get(i);
            if (lbBan.getText().equals(table1.getTableName())) {
                if (table1.getStatus() == true) {
                    ShowOrder();
                    flag = true;
                }
            }
        }
        for (int i = 0; i < arrTotal.size(); i++) {
            if (lbBan.getText().equals(arrTotal.get(i).getNameTable())) {
                lbTotal.setText(arrTotal.get(i).getTotal().toString());
            }
        }

        if (flag == false) {

            txtNumber.setText("");

            lbTotal.setText("");
            Vector column = new Vector();
            column.addElement("Name");
            column.addElement("Number");
            column.addElement("Price");
            column.addElement("Money");
            tbOrder.setModel(new DefaultTableModel(null, column));

        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btTable1;
    private javax.swing.JButton btTable10;
    private javax.swing.JButton btTable11;
    private javax.swing.JButton btTable12;
    private javax.swing.JButton btTable13;
    private javax.swing.JButton btTable14;
    private javax.swing.JButton btTable15;
    private javax.swing.JButton btTable16;
    private javax.swing.JButton btTable17;
    private javax.swing.JButton btTable18;
    private javax.swing.JButton btTable19;
    private javax.swing.JButton btTable2;
    private javax.swing.JButton btTable20;
    private javax.swing.JButton btTable21;
    private javax.swing.JButton btTable22;
    private javax.swing.JButton btTable3;
    private javax.swing.JButton btTable4;
    private javax.swing.JButton btTable5;
    private javax.swing.JButton btTable6;
    private javax.swing.JButton btTable7;
    private javax.swing.JButton btTable8;
    private javax.swing.JButton btTable9;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnOption;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JComboBox cbSearch;
    private javax.swing.JComboBox cbbsp;
    private com.toedter.calendar.JDateChooser dcfr;
    private com.toedter.calendar.JDateChooser dcfr1;
    private com.toedter.calendar.JDateChooser dcto;
    private com.toedter.calendar.JDateChooser dcto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbBan;
    private javax.swing.JLabel lbBophan;
    private javax.swing.JLabel lbEMP;
    private javax.swing.JLabel lbKHuvuc;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel pnEmployeee;
    private javax.swing.JPanel pnHead;
    private javax.swing.JPanel pnImage;
    private javax.swing.JPanel pnInfermation;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnOptions;
    private javax.swing.JPanel pnOrder;
    private javax.swing.JPanel pnStatistics;
    private javax.swing.JPanel pnStorage;
    private javax.swing.JPanel pnTable;
    private javax.swing.JTable tbMenu;
    private javax.swing.JTable tbOrder;
    private javax.swing.JTable tblHoadon;
    private javax.swing.JTable tblct;
    private javax.swing.JTable tblspham;
    private javax.swing.JTextField tfsearch;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
