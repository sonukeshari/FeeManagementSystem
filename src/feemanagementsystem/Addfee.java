/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package feemanagementsystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
 

/**
 *
 * @author Sonu Keshari
 */
public class Addfee extends javax.swing.JFrame {

    /**
     * Creates new form Addfee
     */
    public Addfee() {
        initComponents();
        displayCashfirst();
        fillcombobox();
        int reciptNO = getReceiptNo();
        txt_receipts.setText(Integer.toString(reciptNO));
    }
    
    
 public void displayCashfirst(){
     lbl_checkNo.setVisible(false);
     lbl_BankName.setVisible(false);
     
     txt_checkNo.setVisible(false);
     txt_bankName.setVisible(false);
 }
 public boolean validation(){
    if(txt_receivedFrom.getText().equals("")) {
        JOptionPane.showMessageDialog(this,"Please write username ");
              return false;
    }
    if(datechooser.getDate()==null) {
        JOptionPane.showMessageDialog(this,"Please enter date");
              return false;
    }
    
    if(txt_amount.getText().equals("")) {
        JOptionPane.showMessageDialog(this,"Please enter your amount(in digits) ");
              return false;
    }
    
    if (comboPaymentMode.getSelectedItem().toString().equalsIgnoreCase("Cheque")){
       if(txt_checkNo.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Please enter your check number ");
              return false;
       }
       if(txt_bankName.getText().equals("")){
          JOptionPane.showMessageDialog(this,"Please enter your Bank name ");
              return false; 
       }
   }
   if (comboPaymentMode.getSelectedItem().toString().equalsIgnoreCase("card")){
       
       if(txt_bankName.getText().equals("")){
       JOptionPane.showMessageDialog(this,"Please enter your bank name");
       return false;
               }
   }
    return true;
 }
 
 public void fillcombobox(){
     PreparedStatement ps;
        ResultSet rs;
        
         String query = "SELECT coursename FROM `course`";
         
         try{
             ps = Database.dbconnect().prepareStatement(query);
             rs = ps.executeQuery();
             
             while(rs.next()){
                 comboxCourse.addItem(rs.getString("coursename"));
             }
         }catch(Exception ex){
             ex.printStackTrace();
         }
 }
 public int getReceiptNo(){
     PreparedStatement ps;
        ResultSet rs;
        int receiptNo = 0;
        String query = "SELECT max(recieptNo) FROM `feedetails`";
        
        try{
             ps = Database.dbconnect().prepareStatement(query);
             rs = ps.executeQuery();
             if(rs.next()== true){
                receiptNo= rs.getInt(1);
             }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
     return receiptNo+1;
 }
 
 public String dataInsert(){
     String status ="";
     
     int recieptNo =Integer.parseInt(txt_receipts.getText()) ;
     String studentname = txt_receivedFrom.getText();
     String paymentMode = comboPaymentMode.getSelectedItem().toString();
     String checkNo = txt_checkNo.getText();
     String bankname =txt_bankName.getText();
     String coursename =txt_CourseName.getText();
     String regNo =lbl_regNo.getText();
     float totalamout =Float.parseFloat(txt_totalAmount.getText());
     SimpleDateFormat Date_Format = new SimpleDateFormat("YYYY-MM-dd"); 
     String date=  Date_Format.format(datechooser.getDate());
     float vat = Float.parseFloat(txt_vat.getText());
     float edutax=Float.parseFloat(txt_edutax.getText());
     String totalinword =txt_words.getText();
     String remark = txt_areaRemarks.getText();
     int year1 =Integer.parseInt(txt_firstYear.getText());
     int year2 =Integer.parseInt(txt_lastYear.getText());
      String rollno =txt_rollno.getText();
      float amount = Float.parseFloat(txt_amount.getText());
     
     PreparedStatement ps;
        ResultSet rs;
        
        String query = "INSERT INTO `feedetails`VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
     try{
         ps = Database.dbconnect().prepareStatement(query);
         ps.setInt(1,recieptNo);
         ps.setString(2, studentname);
         ps.setString(3, paymentMode);
         ps.setString(4, checkNo);
         ps.setString(5, bankname);
         ps.setString(6,coursename);
         ps.setString(7, regNo);
         ps.setFloat(8, totalamout);
         ps.setString(9,date);
         ps.setFloat(10, vat);
         ps.setFloat(11, edutax);
         ps.setString(12, totalinword);
         ps.setString(13, remark);
         ps.setInt(14,year1);
         ps.setInt(15, year2);
          ps.setString(16, rollno);
         ps.setFloat(17,amount);
        
         
         
                 int rowcount= ps.executeUpdate();
                if(rowcount==1) {
                    status ="success";
                    
                }
                else status ="fail";
                 
     }catch(Exception ex){
        ex.printStackTrace(); 
     }
     return status;
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
        panelParent = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_checkNo = new javax.swing.JLabel();
        lbl_BankName = new javax.swing.JLabel();
        txt_receipts = new javax.swing.JTextField();
        comboPaymentMode = new javax.swing.JComboBox<>();
        txt_checkNo = new javax.swing.JTextField();
        txt_bankName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_regNo = new javax.swing.JLabel();
        panelchild = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_receivedFrom = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_firstYear = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_lastYear = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        comboxCourse = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_CourseName = new javax.swing.JTextField();
        txt_amount = new javax.swing.JTextField();
        txt_vat = new javax.swing.JTextField();
        txt_edutax = new javax.swing.JTextField();
        txt_totalAmount = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_words = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_areaRemarks = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        btn_print = new javax.swing.JButton();
        txt_rollno = new javax.swing.JTextField();
        datechooser = new com.toedter.calendar.JDateChooser();

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
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, 70));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 70));

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
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 220, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, 80));

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

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, 80));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 70));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 240, 80));

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
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 70));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 240, 70));

        jPanel9.setBackground(new java.awt.Color(153, 0, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(153, 0, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feemanagementsystem/images/logout.png"))); // NOI18N
        jLabel7.setText("Logout");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 240, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 690));

        panelParent.setBackground(new java.awt.Color(102, 102, 255));
        panelParent.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(51, 102, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ReceiptsNo Hstu-");

        jLabel9.setBackground(new java.awt.Color(51, 102, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Mode of Payment");

        lbl_checkNo.setBackground(new java.awt.Color(51, 102, 255));
        lbl_checkNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_checkNo.setText("Cheque No.");

        lbl_BankName.setBackground(new java.awt.Color(51, 102, 255));
        lbl_BankName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_BankName.setText("Bank Name");

        comboPaymentMode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboPaymentMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque", "card" }));
        comboPaymentMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaymentModeActionPerformed(evt);
            }
        });

        txt_checkNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_checkNoActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(51, 102, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("    Date");

        jLabel13.setBackground(new java.awt.Color(51, 102, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("REG-NO-");

        lbl_regNo.setBackground(new java.awt.Color(51, 102, 255));
        lbl_regNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_regNo.setText("DP00edu92042");

        panelchild.setBackground(new java.awt.Color(102, 102, 255));
        panelchild.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(51, 102, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Received From:");
        panelchild.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 20));
        panelchild.add(txt_receivedFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 310, -1));

        jLabel16.setBackground(new java.awt.Color(51, 102, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Payment For the Year:");
        panelchild.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        panelchild.add(txt_firstYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 120, -1));

        jLabel17.setBackground(new java.awt.Color(51, 102, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("To");
        panelchild.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 30, -1));
        panelchild.add(txt_lastYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 120, 20));

        jLabel18.setBackground(new java.awt.Color(51, 102, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Course:");
        panelchild.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 20));

        comboxCourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboxCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxCourseActionPerformed(evt);
            }
        });
        panelchild.add(comboxCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 190, 30));

        jLabel19.setBackground(new java.awt.Color(51, 102, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("RollNO:");
        panelchild.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 70, 20));
        panelchild.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 700, 10));
        panelchild.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 700, 10));

        jLabel20.setBackground(new java.awt.Color(51, 102, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("SN");
        panelchild.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 40, 20));

        jLabel21.setBackground(new java.awt.Color(51, 102, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Head");
        panelchild.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, 20));

        jLabel22.setBackground(new java.awt.Color(51, 102, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Amount");
        panelchild.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 90, 20));

        jLabel23.setBackground(new java.awt.Color(51, 102, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("VAT 7.5%");
        panelchild.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel24.setBackground(new java.awt.Color(51, 102, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Edutax 7.5%");
        panelchild.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, 20));
        panelchild.add(txt_CourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 300, 30));

        txt_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amountActionPerformed(evt);
            }
        });
        panelchild.add(txt_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 160, 30));
        panelchild.add(txt_vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 160, 30));
        panelchild.add(txt_edutax, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 258, 160, -1));
        panelchild.add(txt_totalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 180, 30));
        panelchild.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 200, -1));
        panelchild.add(txt_words, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 320, 30));

        jLabel25.setBackground(new java.awt.Color(51, 102, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("words");
        panelchild.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 70, 30));

        jLabel26.setBackground(new java.awt.Color(51, 102, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Rev. Signature");
        panelchild.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 170, 30));

        jLabel27.setBackground(new java.awt.Color(51, 102, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Remarks");
        panelchild.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 80, 30));

        txt_areaRemarks.setColumns(20);
        txt_areaRemarks.setRows(5);
        jScrollPane1.setViewportView(txt_areaRemarks);

        panelchild.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 320, 60));
        panelchild.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 190, -1));

        btn_print.setBackground(new java.awt.Color(255, 0, 0));
        btn_print.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        panelchild.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 180, 30));
        panelchild.add(txt_rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 110, -1));

        javax.swing.GroupLayout panelParentLayout = new javax.swing.GroupLayout(panelParent);
        panelParent.setLayout(panelParentLayout);
        panelParentLayout.setHorizontalGroup(
            panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParentLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelParentLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txt_receipts, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelParentLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_regNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelParentLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datechooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(panelParentLayout.createSequentialGroup()
                        .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(lbl_checkNo)
                            .addComponent(lbl_BankName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboPaymentMode, 0, 155, Short.MAX_VALUE)
                                .addComponent(txt_checkNo))
                            .addComponent(txt_bankName, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(panelchild, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        panelParentLayout.setVerticalGroup(
            panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParentLayout.createSequentialGroup()
                .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelParentLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel12))
                            .addComponent(txt_receipts, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelParentLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(datechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboPaymentMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_regNo)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_checkNo)
                    .addComponent(txt_checkNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_BankName)
                    .addComponent(txt_bankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelchild, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelParent, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 720, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_checkNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_checkNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_checkNoActionPerformed

    private void comboPaymentModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaymentModeActionPerformed
        // TODO add your handling code here:
        if(comboPaymentMode.getSelectedIndex()==0){
             lbl_checkNo.setVisible(false);
             lbl_BankName.setVisible(false);
     
             txt_checkNo.setVisible(false);
             txt_bankName.setVisible(false);
        }
        
         if(comboPaymentMode.getSelectedIndex()==1){
             lbl_checkNo.setVisible(true);
             lbl_BankName.setVisible(true);
     
             txt_checkNo.setVisible(true);
             txt_bankName.setVisible(true);
             
        }
          if(comboPaymentMode.getSelectedIndex()==2){
             lbl_checkNo.setVisible(false);
             lbl_BankName.setVisible(true);
     
             txt_checkNo.setVisible(false);
             txt_bankName.setVisible(true);
        }
    }//GEN-LAST:event_comboPaymentModeActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
        if(validation()==true){
            
           String result = dataInsert();
           if(result.equals("success")){
              JOptionPane.showMessageDialog(this,"Record inserted  "); 
              printReceipt pr = new printReceipt();
              pr.setVisible(true);
              this.dispose();
           }
           else{
               JOptionPane.showMessageDialog(this,"Record inserted failed ");
           }
               
            
              
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void txt_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amountActionPerformed
        // TODO add your handling code here:
        Float amount =Float.parseFloat(txt_amount.getText());
        
        Float vat =(amount*0.075f);
        
        Float edutax = (amount*0.075f);
        
        txt_vat.setText(vat.toString());
        txt_edutax.setText(edutax.toString());
        
        float total = amount+ vat+ edutax;
        txt_totalAmount.setText(Float.toString(total));
        
        txt_words.setText(NumberToWordsConverter.convert((int)total) +  " only");
    }//GEN-LAST:event_txt_amountActionPerformed

    private void comboxCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxCourseActionPerformed
        // TODO add your handling code here:
        txt_CourseName.setText(comboxCourse.getSelectedItem().toString());
    }//GEN-LAST:event_comboxCourseActionPerformed

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

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         Courselist course = new Courselist();
        course.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Addfee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addfee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addfee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addfee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Addfee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_print;
    private javax.swing.JComboBox<String> comboPaymentMode;
    private javax.swing.JComboBox<String> comboxCourse;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl_BankName;
    private javax.swing.JLabel lbl_checkNo;
    private javax.swing.JLabel lbl_regNo;
    private javax.swing.JPanel panelParent;
    private javax.swing.JPanel panelchild;
    private javax.swing.JTextField txt_CourseName;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextArea txt_areaRemarks;
    private javax.swing.JTextField txt_bankName;
    private javax.swing.JTextField txt_checkNo;
    private javax.swing.JTextField txt_edutax;
    private javax.swing.JTextField txt_firstYear;
    private javax.swing.JTextField txt_lastYear;
    private javax.swing.JTextField txt_receipts;
    private javax.swing.JTextField txt_receivedFrom;
    private javax.swing.JTextField txt_rollno;
    private javax.swing.JTextField txt_totalAmount;
    private javax.swing.JTextField txt_vat;
    private javax.swing.JTextField txt_words;
    // End of variables declaration//GEN-END:variables
}
