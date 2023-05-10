/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package feemanagementsystem;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonu Keshari
 */
public class printReceipt extends javax.swing.JFrame {

    /**
     * Creates new form printReceipt
     */
    public printReceipt() {
        initComponents();
        getRecords();
    }
    public void getRecords(){
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM feedetails order by recieptNo desc limit 1 ";
        try{
            ps = Database.dbconnect().prepareStatement(query);
            rs = ps.executeQuery();
            rs.next();
            
            txt_receiptNo.setText(rs.getString("recieptNo"));
            txt_paymentMode.setText(rs.getString("paymentMode"));
            
            String paymentMode = rs.getString("PaymentMode");
            if(paymentMode.equalsIgnoreCase("Cash")){
                lbl_chequeNo.setText("cheque No");
                txt_CheckNo.setText("-");
                txt_bankname.setText("-");
                
            }
            
            if(paymentMode.equalsIgnoreCase("Cheque")){
                lbl_chequeNo.setText("cheque No");
                 txt_CheckNo.setText(rs.getString("checkNo"));
                 txt_bankname.setText(rs.getString("bankname"));
                
            }
            
             if(paymentMode.equalsIgnoreCase("card")){
                lbl_chequeNo.setText("cheque No");
                txt_CheckNo.setText("-");
                  txt_bankname.setText(rs.getString("bankname"));
             }
            
           
            txt_studentname.setText(rs.getString("studentname"));
            txt_year1.setText(rs.getString("year1"));
            txt_year2.setText(rs.getString("year2"));
            txt_date.setText(rs.getString("date"));
            txt_regNo.setText(rs.getString("regNo"));
            
            txt_amount.setText(rs.getString("amount"));
           txt_vat.setText(rs.getString("vat"));
            txt_edutax.setText(rs.getString("edutax"));
            txt_totalamount.setText(rs.getString("totalamout"));
            txt_totalinwords.setText(rs.getString("totalinword"));
            txt_remarks.setText(rs.getString("remark"));
            txt_head.setText(rs.getString("coursename"));
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        print_panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_receiptNo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_paymentMode = new javax.swing.JLabel();
        lbl_chequeNo = new javax.swing.JLabel();
        txt_CheckNo = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_bankname = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_studentname = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_year1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_year2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_head = new javax.swing.JLabel();
        txt_amount = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_vat = new javax.swing.JLabel();
        txt_edutax = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        txt_totalinwords = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txt_remarks = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txt_totalamount = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txt_date = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txt_regNo = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/home.png"))); // NOI18N
        jLabel1.setText("    HOME");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 70));

        jPanel4.setBackground(new java.awt.Color(153, 0, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(153, 0, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/search2.png"))); // NOI18N
        jLabel2.setText("Search Record");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 70));

        jPanel5.setBackground(new java.awt.Color(153, 0, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(153, 0, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/edit2.png"))); // NOI18N
        jLabel3.setText("Edit Course");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 80));

        jPanel6.setBackground(new java.awt.Color(153, 0, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setForeground(new java.awt.Color(153, 0, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(153, 0, 153));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/list_1.png"))); // NOI18N
        jLabel4.setText("Course List");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 240, 80));

        jPanel7.setBackground(new java.awt.Color(153, 0, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(153, 0, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/view all record.png"))); // NOI18N
        jLabel5.setText("View All Record");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 70));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 240, 80));

        jPanel8.setBackground(new java.awt.Color(153, 0, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(153, 0, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/back-button.png"))); // NOI18N
        jLabel6.setText("     Back");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 50));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 240, 50));

        jPanel9.setBackground(new java.awt.Color(153, 0, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(153, 0, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/edit2.png"))); // NOI18N
        jLabel7.setText("Edit");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 50));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 240, 50));

        jPanel10.setBackground(new java.awt.Color(153, 0, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(153, 0, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/logout.png"))); // NOI18N
        jLabel8.setText("Logout");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 240, 60));

        jPanel11.setBackground(new java.awt.Color(153, 0, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(153, 0, 153));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/printer-.png"))); // NOI18N
        jLabel9.setText("   Print");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 50));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 240, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 720));

        print_panel.setBackground(new java.awt.Color(255, 255, 255));
        print_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        print_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 204));
        jLabel10.setText("          FeeFont");
        print_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 150, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 204));
        jLabel11.setText("  Hajee Mohamad Danesh Science & technology university");
        print_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 500, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 204));
        jLabel12.setText("       Dinajpur-5200,Bangladesh");
        print_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 280, 20));

        jPanel12.setBackground(new java.awt.Color(153, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        print_panel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, 8));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("ReceiptNo:   HSTU-");
        print_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 20));

        txt_receiptNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_receiptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Payment Mode:");
        print_panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 20));

        txt_paymentMode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_paymentMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 120, 20));

        lbl_chequeNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_chequeNo.setText("Cheque No:");
        print_panel.add(lbl_chequeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 20));

        txt_CheckNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_CheckNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 210, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Bank Name");
        print_panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 20));

        txt_bankname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_bankname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Received From");
        print_panel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, 20));

        txt_studentname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_studentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 250, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Payment Year");
        print_panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, 20));

        txt_year1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 60, 20));

        jLabel24.setText("to");
        print_panel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 20, 20));

        txt_year2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 70, 20));

        jSeparator1.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(102, 0, 0));
        print_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 770, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(153, 0, 0));
        print_panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 770, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("SN.");
        print_panel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 40, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Head");
        print_panel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 120, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Amount");
        print_panel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 120, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("    1");
        print_panel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 50, 20));

        txt_head.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_head, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 200, 30));

        txt_amount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 150, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("VAT  7.5%");
        print_panel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 70, 20));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("EduTax  7.5%");
        print_panel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 90, 30));

        txt_vat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 90, 20));

        txt_edutax.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_edutax, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 90, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(102, 0, 0));
        print_panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 493, 300, 10));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("Total in Words");
        print_panel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 90, 20));

        txt_totalinwords.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_totalinwords, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 270, 30));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setText("Remarks");
        print_panel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 80, 20));

        txt_remarks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 560, 290, 50));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("           Signature");
        print_panel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 180, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(102, 0, 0));
        print_panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 593, 230, 10));

        txt_totalamount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_totalamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 170, 30));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("Date");
        print_panel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 40, -1));

        txt_date.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 110, 20));

        jLabel45.setText("Reg. No");
        print_panel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 60, 20));

        txt_regNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_panel.add(txt_regNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 110, 20));

        getContentPane().add(print_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 800, 660));

        jLabel42.setBackground(new java.awt.Color(102, 255, 102));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel42.setText("                           Print Receipts");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 800, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.52,0.52);
                
                print_panel.print(g2);
         
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
            boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){
	ex.printStackTrace();
}
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        UpdateFeedetails update = new UpdateFeedetails();
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        homepage Home = new homepage();
        Home.setVisible(true);
        this.dispose();
        
                
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
           SearchRecord search = new SearchRecord();
        search.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        EditCourse edit = new EditCourse();
        edit.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Courselist course = new Courselist();
        course.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
          ViewRecord viewr = new ViewRecord();
        viewr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
         homepage Home = new homepage();
        Home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Do you want to logout");
        System.exit(0);
        
    }//GEN-LAST:event_jLabel8MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(printReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(printReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(printReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(printReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_chequeNo;
    private javax.swing.JPanel print_panel;
    private javax.swing.JLabel txt_CheckNo;
    private javax.swing.JLabel txt_amount;
    private javax.swing.JLabel txt_bankname;
    private javax.swing.JLabel txt_date;
    private javax.swing.JLabel txt_edutax;
    private javax.swing.JLabel txt_head;
    private javax.swing.JLabel txt_paymentMode;
    private javax.swing.JLabel txt_receiptNo;
    private javax.swing.JLabel txt_regNo;
    private javax.swing.JLabel txt_remarks;
    private javax.swing.JLabel txt_studentname;
    private javax.swing.JLabel txt_totalamount;
    private javax.swing.JLabel txt_totalinwords;
    private javax.swing.JLabel txt_vat;
    private javax.swing.JLabel txt_year1;
    private javax.swing.JLabel txt_year2;
    // End of variables declaration//GEN-END:variables
}
