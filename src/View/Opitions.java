/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ConnecDatabase.Connect;
import Function.Regextion;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Opitions extends javax.swing.JPanel {
    Regextion regex= new Regextion();
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    public Opitions() {
        initComponents();
        con= Connect.GetConnection();
        showAllmenu();
    }
    private void showAllmenu() 
    {
        String slq="select * from Sanpham";
        
        Vector column= new Vector();
        column.addElement("Product ID");
        column.addElement("Product Type");
        column.addElement("Product name");
        column.addElement("Price");
        Vector data= new Vector();
        try {
            stmt =con.prepareStatement(slq);
            rs = stmt.executeQuery();
            while(rs.next())
            {
                Vector row= new Vector();
                row.addElement(rs.getString("Masp"));
                row.addElement(rs.getString("Loaisp"));
                row.addElement(rs.getString("Tensp"));
                row.addElement(rs.getFloat("Giasp"));
                data.add(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opitions.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbShow.setModel(new DefaultTableModel(data, column));
        
    }
    private void showType(String type)
    {
        String slq="select * from Sanpham where Loaisp =?";
        
        Vector column= new Vector();
        column.addElement("Product ID");
        column.addElement("Product Type");
        column.addElement("Product name");
        column.addElement("Price");
        Vector data= new Vector();
        try {
            stmt =con.prepareStatement(slq);
            stmt.setString(1, type);
            rs = stmt.executeQuery();
            while(rs.next())
            {
                Vector row= new Vector();
                row.addElement(rs.getString("Masp"));
                row.addElement(rs.getString("Loaisp"));
                row.addElement(rs.getString("Tensp"));
                row.addElement(rs.getFloat("Giasp"));
                data.add(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opitions.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbShow.setModel(new DefaultTableModel(data, column));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        btCafe = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbShow = new javax.swing.JTable();
        Operations = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1245, 470));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List of types", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jPanel2.setLayout(new java.awt.GridLayout(9, 1));

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Very-Basic-Menu-icon.png"))); // NOI18N
        jButton14.setText("Tat ca");
        jButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);

        btCafe.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Very-Basic-Menu-icon.png"))); // NOI18N
        btCafe.setText("Cafe");
        btCafe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCafeActionPerformed(evt);
            }
        });
        jPanel2.add(btCafe);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Very-Basic-Menu-icon.png"))); // NOI18N
        jButton2.setText("Nuoc ep");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Very-Basic-Menu-icon.png"))); // NOI18N
        jButton3.setText("Sinh to");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Very-Basic-Menu-icon.png"))); // NOI18N
        jButton4.setText("Nuoc giai khat");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Very-Basic-Menu-icon.png"))); // NOI18N
        jButton5.setText("Sua chua");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Very-Basic-Menu-icon.png"))); // NOI18N
        jButton6.setText("Thuocla");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Very-Basic-Menu-icon.png"))); // NOI18N
        jButton7.setText("Bia");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Very-Basic-Menu-icon.png"))); // NOI18N
        jButton8.setText("Do uong khac");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnMain.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List of Products", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        tbShow.setAutoCreateRowSorter(true);
        tbShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbShow);

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Operations.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operations", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel4.setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product_ID");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel1);

        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        jPanel4.add(txtID);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product_Type");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel2);

        cbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cafe", "Nuoc ep", "Sinh to", "Nuoc giai khat", "Sua chua", "Thuoc la", "Bia", "Do uong khac" }));
        jPanel4.add(cbType);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Product_Name");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel3);

        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtName);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Product_Price");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel4);

        txtPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPriceMouseClicked(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });
        jPanel4.add(txtPrice);

        jPanel3.setLayout(new java.awt.GridLayout(1, 4));

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton10.setText("Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);

        jButton11.setText("Delete");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);

        jButton12.setText("Cancel");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12);

        javax.swing.GroupLayout OperationsLayout = new javax.swing.GroupLayout(Operations);
        Operations.setLayout(OperationsLayout);
        OperationsLayout.setHorizontalGroup(
            OperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        OperationsLayout.setVerticalGroup(
            OperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperationsLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Operations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Operations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnMain, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        showAllmenu();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCafeActionPerformed
        showType(btCafe.getText());
    }//GEN-LAST:event_btCafeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showType(jButton2.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        showType(jButton3.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        showType(jButton4.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       showType(jButton5.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        showType(jButton6.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        showType(jButton7.getText());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        showType(jButton8.getText());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void tbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbShowMouseClicked
        int i = tbShow.getSelectedRow();
        if(i!=-1)
        {
            txtID.setEnabled(false);
            txtID.setText(tbShow.getValueAt(i, 0).toString());
            cbType.setSelectedItem(tbShow.getValueAt(i, 1).toString());
            txtName.setText(tbShow.getValueAt(i, 2).toString());
            txtPrice.setText(tbShow.getValueAt(i, 3).toString());
            
        }
    }//GEN-LAST:event_tbShowMouseClicked
    private void remove()
    {
        txtID.setEnabled(true);
        txtID.setText("");
        txtName.setText("");
        txtPrice.setText("");
        cbType.setSelectedItem("Cafe");
    }
    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
       txtName.setText("");
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPriceMouseClicked
        txtPrice.setText("");
    }//GEN-LAST:event_txtPriceMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // kiem tra xem co trung khong, neu true la khong trung   
        if(checkduplicate(txtID.getText(), txtName.getText())==true)
           {
              
               String sql ="insert into Sanpham values(?,?,?,?)";
               try {
                   stmt =con.prepareStatement(sql);
                   stmt.setString(1, txtID.getText());
                   stmt.setString(3, cbType.getSelectedItem().toString());
                   stmt.setString(2, txtName.getText());
                   stmt.setFloat(4, Float.parseFloat(txtPrice.getText()));
                   stmt.executeUpdate();
                   JOptionPane.showMessageDialog(this, "You have added a new product to Menu.");
               } catch (Exception e) {
               }
           }
        else
            JOptionPane.showMessageDialog(this, "Id or Name is exist!");
        showAllmenu();
        remove();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(checkduplicate(txtID.getText(), txtName.getText())==false)
        {
        String sql= "delete from Sanpham where Masp=? or Tensp=?";
            try {
                stmt = con.prepareStatement(sql);
                stmt.setString(1, txtID.getText());
                stmt.setString(2, txtName.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "you've deleted a product out side menu.");
            } catch (SQLException ex) {
                Logger.getLogger(Opitions.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
        else 
            JOptionPane.showMessageDialog(this, "Product you have choosed don't exist!");
        showAllmenu();
        remove();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String sql ="update Sanpham set Loaisp =? ,Tensp =? ,Giasp =? where Masp =?";
        try {
            stmt= con.prepareStatement(sql);
            stmt.setString(1, cbType.getSelectedItem().toString());
            stmt.setString(2, txtName.getText());
            stmt.setFloat(3, Float.parseFloat(txtPrice.getText()));
            stmt.setString(4, txtID.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "You've update success!");
        } catch (Exception e) {
            System.out.println("loi roi.");
        }
        showAllmenu();
        remove();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       remove();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       String txtseach = txtSearch.getText().trim();
        String slq="select * from Sanpham";
        
        Vector column= new Vector();
        column.addElement("Product ID");
        column.addElement("Product Type");
        column.addElement("Product name");
        column.addElement("Price");
        Vector data= new Vector();
        try {
            stmt =con.prepareStatement(slq);
            rs = stmt.executeQuery();
            while(rs.next())
            {
                Vector row= new Vector();
                row.addElement(rs.getString("Masp"));
                row.addElement(rs.getString("Loaisp"));
                row.addElement(rs.getString("Tensp"));
                row.addElement(rs.getFloat("Giasp"));
                if(row.toString().toLowerCase().contains(txtseach.toLowerCase()))
                {
                data.add(row);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Opitions.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbShow.setModel(new DefaultTableModel(data, column));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_PERIOD)))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped
    // phương thức isFormatID , kiểm tra xem nó có đúng định dang format không?
    private boolean isFormatID(String ID)
    {
        if(Pattern.matches("^[a-zA-Z][\\d]{1,3}$", ID)==true)
            return true;
        else
            return false;
    }
    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        if(isFormatID(txtID.getText())==false)
        {
            JOptionPane.showMessageDialog(this, "ID is wrong format. ex: a123");
            txtID.requestFocus();
        }
    }//GEN-LAST:event_txtIDFocusLost
        private boolean checkduplicate(String ID, String name) 
    {
       
        String sql="select * from Sanpham where Masp =? or Tensp =?";
      
        try {
            stmt= con.prepareStatement(sql);
            stmt.setString(1, ID);
           stmt.setString(2, name);
           rs= stmt.executeQuery();
           
            if(rs.next())
                return false;
       
        } catch (Exception ex) {
            System.out.println("loi");
        }
      return true;
              
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Operations;
    private javax.swing.JButton btCafe;
    private javax.swing.JComboBox cbType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnMain;
    private javax.swing.JTable tbShow;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
