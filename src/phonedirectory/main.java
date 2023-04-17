 
package phonedirectory;
  
import java.awt.HeadlessException;
import java.sql.*; 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {  
    
    static Connection conn;
    static Statement st;
    static String a1,b1,c1,d1,e1,f1,g1,h1,i1,j1,k1, m1, n1;
    
    public main() {
        initComponents(); 
        dataentry();      
        //tableHeader set false to editable
    } 
    private static void dataentry(String finder){
    try {
       
               DefaultTableModel model = new DefaultTableModel(new String[]{"Name","Lab","Lab Incharge","Status","Lab Id","Year of Purchase","Specification","price"}, 0);
                
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();;
                conn = DriverManager.getConnection("jdbc:mysql://localhost/laboratory","root","root");
                st = conn.createStatement();
                //Multiple Querying Using Select, Like, Where , Or
                String stmt="SELECT Name,Lab,Incharge,Status,Labid,YearOfPurchase,Specification, Price, Quantity From equipments WHERE Name LIKE '%" + finder +
                       
                        "%' or Lab LIKE '%" + finder +
                        "%' or Incharge LIKE '%" + finder +
                        "%' or Status LIKE '%" + finder +
                        "%' or  Labid LIKE '%" + finder +
                        "%' or YearOfPurchase LIKE '%" + finder +
                        "%' or Specification LIKE '%" + finder +
                        "%' or Price LIKE '%" + finder +
                        "%' or Quantity LIKE '%" + finder +
                       
                        "%'";
                st.executeQuery(stmt);  
                String sql=stmt;
                ResultSet rs = st.executeQuery(sql);
                
                while(rs.next())
                {     
                    String a = rs.getString("Name");
                  
                    String c = rs.getString("Lab");
                    String d = rs.getString("Incharge");
                    String e = rs.getString("Status");
                    String f = rs.getString("Labid");
                    String g = rs.getString("YearOfPurchase");
                    String h = rs.getString("Specification"); 
                    String m = rs.getString("Price");
                    String n = rs.getString("Quantity");
                    
                    model.addRow(new Object[]{a,c,d,e,f,g,h,m,n});
                }
               
               jTable1.setModel(model);
               if(model.getRowCount()==0)
                {
                    JOptionPane.showMessageDialog(null,"NO RECORD FOUND!!!!!","MESSAGE",JOptionPane.WARNING_MESSAGE);
                
                }
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           } 
    }
    private static void dataentry(){ 
        jTextField2.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        jTextField11.setEditable(false);
           try {
               
               DefaultTableModel model = new DefaultTableModel(new String[]{"Name","Lab","Lab Incharge","Status","Lab Id","Year of Purchase","Specification","price","Quantity"}, 0);
               
                String myDriver = "com.mysql.cj.jdbc.Driver";
                String myUrl = "jdbc:mysql://localhost/laboratory";
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/laboratory","root","root");
                st = conn.createStatement();
                String stmt="SELECT * FROM equipments";
                st.executeQuery(stmt);  
                String sql=stmt;
                ResultSet rs = st.executeQuery(sql);
                while(rs.next())
                {     
                    String a = rs.getString("Name");
                   
                    String c = rs.getString("Lab");
                    String d = rs.getString("Incharge");
                    String e = rs.getString("Status");
                    String f = rs.getString("Labid");
                    String g = rs.getString("YearOfPurchase");
                    String h = rs.getString("Specification"); 
                    String m = rs.getString("Price");
                    String n = rs.getString("Quantity");
                    
                    model.addRow(new Object[]{a,c,d,e,f,g,h,m,n});
                }
                jTextField2.setText("");
               
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
               jTable1.setModel(model);
           } catch (ClassNotFoundException | SQLException e) {
               JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           }  
    }
    
    private static void filter(String sel){
    try {
       
               DefaultTableModel model = new DefaultTableModel(new String[]{"Name","Lab","Lab Incharge","Status","Lab Id","Year of Purchase","Specification","price","Quantity"}, 0);
                
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();;
                conn = DriverManager.getConnection("jdbc:mysql://localhost/laboratory","root","root");
                st = conn.createStatement();
                //Multiple Querying Using Select, Like, Where , Or
                String stmt="SELECT Name,Lab,Incharge,Status,Labid,YearOfPurchase,Specification, Price, Quantity From equipments WHERE Name LIKE '%" + sel + 
                        
                        "%' or Lab LIKE '%" + sel +
                        "%' or Incharge LIKE '%" + sel +
                        "%' or Status LIKE '%" + sel +
                        "%' or  Labid LIKE '%" + sel +
                        "%' or YearOfPurchase LIKE '%" + sel +
                        "%' or Specification LIKE '%" + sel +
                        "%' or Price LIKE '%" + sel +
                        "%' or Quantity LIKE '%" + sel +
                        "%'";
                st.executeQuery(stmt);  
                String sql=stmt;
                ResultSet rs = st.executeQuery(sql);
                
                while(rs.next())
                {     
                    String a = rs.getString("Name");
                  
                    String c = rs.getString("Lab");
                    String d = rs.getString("Incharge");
                    String e = rs.getString("Status");
                    String f = rs.getString("Labid");
                    String g = rs.getString("YearOfPurchase");
                    String h = rs.getString("Specification"); 
                    String m = rs.getString("Price");
                    String n = rs.getString("Quantity");
                    
                    model.addRow(new Object[]{a,c,d,e,f,g,h,m,n});
                }
               
               jTable1.setModel(model);
               if(model.getRowCount()==0)
                {
                    JOptionPane.showMessageDialog(null,"NO RECORD FOUND!!!!!","MESSAGE",JOptionPane.WARNING_MESSAGE);
                
                }
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jTextField12 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        stxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();

        jTextField12.setText("Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phone Directory");
        setBackground(new java.awt.Color(0, 102, 102));
        setIconImages(null);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phonedirectory/header.png"))); // NOI18N

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Equipments", "Lab", "Lab Incharge", "Status", "Lab Id", "Year of Purchase", "Specifications", "Price", "Quantity"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        stxt.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        stxt.setForeground(new java.awt.Color(51, 51, 51));
        stxt.setToolTipText("SEARCH FOR RECORDS");
        stxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stxtActionPerformed(evt);
            }
        });
        stxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stxtKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search : ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Sync ");
        jButton1.setToolTipText("SYNC DATA");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField2.setText("Equipment Name");
        jTextField2.setToolTipText("EQUIPMENT NAME");
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField4.setText("Lab");
        jTextField4.setToolTipText("LAB");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField5.setText("Lab Incharge");
        jTextField5.setToolTipText("LAB INCHARGE");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField6.setText("Status");
        jTextField6.setToolTipText("STATUS");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField7.setText("Lab Id");
        jTextField7.setToolTipText("LAB ID");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField8.setText("dd-mm-yyyy");
        jTextField8.setToolTipText("YEAR OF PURCHASE");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField9.setText("Specifications");
        jTextField9.setToolTipText("SPECIFICATIONS");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField10.setText("Price of Equipment");
        jTextField10.setToolTipText("PRICE OF EQUIPMENT");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTextField11.setText("Quantity");
        jTextField11.setToolTipText("Quantity");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Add New Data");
        jButton2.setToolTipText("ADD NEW DATA");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Delete");
        jButton3.setToolTipText("DELETE DATA");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Update");
        jButton4.setToolTipText("UPDATE DATA");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Equipment Name");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lab Incharge Name");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lab Name");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Equipment Status");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lab Id");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Specification");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Year Of Purchase");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Price of Equipment");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity");
        jLabel11.setToolTipText("QUANTITY");

        jComboBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter", "Name", "Machines", "Specification", "Lab", "Incharge", "Status", "Labid", "YearOfPurchase", "Specifications", "Price" }));
        jComboBox.setToolTipText("FILTER");
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44)
                                            .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(stxt, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jComboBox});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3, jButton4, jComboBox});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField6, jTextField9});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stxtActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_stxtActionPerformed

    private void stxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stxtKeyTyped
        // TODO add your handling code here:
        dataentry(stxt.getText()); 
    }//GEN-LAST:event_stxtKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dataentry();
        stxt.setText("");
        jButton3.setEnabled(false); jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed
        
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here: 
        jTextField2.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);
        jTextField6.setEditable(true);
        jTextField7.setEditable(true);
        jTextField8.setEditable(true);
        jTextField9.setEditable(true);
        jTextField10.setEditable(true);
        jTextField11.setEditable(true);
            a1 = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            c1 = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            d1 = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            e1 = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            f1 = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            g1 = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
            h1 = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
            m1 = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
            n1 = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
           
            jTextField2.setText(a1);
            
            jTextField4.setText(c1);
            jTextField5.setText(d1);
            jTextField6.setText(e1);
            jTextField7.setText(f1);
            jTextField8.setText(g1);
            jTextField9.setText(h1);
            jTextField10.setText(m1);
            jTextField11.setText(n1);
          
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Save 
        new Updates().setVisible(true);
         
          //new SAMPLE().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Update
        Connection con = null;
        Statement st = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/laboratory","root","root");
            st = con.createStatement();
            String sqlconn = "UPDATE `equipments` SET `Name` = '" +jTextField2.getText() +
                 
                    "',`Lab` = '" + jTextField4.getText() + 
                    "',`Incharge` = '" +jTextField5.getText() + 
                    "',`Status` = '" +jTextField6.getText() + 
                    "',`Labid` = '" + jTextField7.getText() + 
                    "',`YearOfPurchase` = '" + jTextField8.getText() + 
                    "',`Specification` = '" +jTextField9.getText()+ 
                    "',`Price` = '" +jTextField10.getText()+
                    "',`Quantity` = '" +jTextField11.getText()+ 
                  
                    
                    "' WHERE `equipments`.`Name` = '" + a1 + 
                  
                    "' and `Lab` = '" + c1 +
                    "' and `Incharge` = '" + d1 +
                    "' and `Status` = '" + e1 +
                    "' and `Labid` = '" + f1 +
                    "' and `YearOfPurchase` = '" + g1 +
                    "' and `Specification` = '" + h1 + 
                    "' and `Price` = '" + m1 + 
                    "' and `Quantity` = '" + n1 + 
                  
                    "'";
            st.executeUpdate(sqlconn);
            
          JOptionPane.showMessageDialog(null,"YOUR RECORD HAS BEEN UPDATED");
            dataentry(); 
          
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }  //call view method for refresh
    }//GEN-LAST:event_jButton4ActionPerformed
    private static void archive(){
        Connection con = null;
        Statement st = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/laboratory","root","root");
            st = con.createStatement();
            String sqlconn = "UPDATE `equipments`  WHERE `equipments`.`Name` = '" + a1 + 
                  
                    "' and `Lab` = '" + c1 +
                    "' and `Incharge` = '" + d1 +
                    "' and `Status` = '" + e1 +
                    "' and `Labid` = '" + f1 +
                    "' and `YearOfPurchase` = '" + g1 +
                    "' and `Specification` = '" + h1 +
                    "' and `Price` = '" + m1 +
                    "' and `Quantity` = '" + n1 +
                   
                    "'";
            
            st.executeUpdate(sqlconn);
          
            dataentry(); 
          
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }  //call view method for refresh
    }
  
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Delete  
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete "+jTextField2.getText()+" record ?", "System Notification", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            
        Connection con = null;
        Statement st = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/laboratory","root","root");
            st = con.createStatement();
            String sqlconn = "delete from `equipments` where `Name` = '" + a1 + 
                  
                    "' and `Lab` = '" + c1 +
                    "' and `Incharge` = '" + d1 +
                    "' and `Status` = '" + e1 +
                    "' and `Labid` = '" + f1 +
                    "' and `YearOfPurchase` = '" + g1 +
                    "' and `Specification` = '" + h1 + 
                    "' and `Price` = '" + m1 + 
                    "' and `Quantity` = '" + n1 + 
                    
                    "'";
            st.executeUpdate(sqlconn);
          JOptionPane.showMessageDialog(null,"YOUR RECORD HAS BEEN DELETED");
            dataentry(); 
            
      }catch(HeadlessException | SQLException ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }  
        }
        else { 
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
        String sel = (String) jComboBox.getSelectedItem();
        if(sel.equals("Filter")){
            dataentry();
        }else if(sel.equals("Specification")){
            try {
       
               DefaultTableModel model = new DefaultTableModel(new String[]{"Name","Lab","Lab Incharge","Status","Lab Id","Year of Purchase","Specification","price","Quantity"}, 0);
                
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();;
                conn = DriverManager.getConnection("jdbc:mysql://localhost/laboratory","root","root");
                st = conn.createStatement();
                //Multiple Querying Using Select, Like, Where , Or
                String stmt="SELECT Name, GROUP_CONCAT(DISTINCT Lab SEPARATOR '&') AS Labs, GROUP_CONCAT(DISTINCT Incharge SEPARATOR '&') AS Incharges, GROUP_CONCAT(DISTINCT Status SEPARATOR '&') AS Stats, GROUP_CONCAT(DISTINCT Labid SEPARATOR '&') AS Labids, GROUP_CONCAT(DISTINCT YearOfPurchase SEPARATOR '&') AS Purchases, Specification, SUM(Price) AS Cost, SUM(Quantity) AS total_quantity FROM equipments GROUP BY Specification;";
                st.executeQuery(stmt);  
                String sql=stmt;
                ResultSet rs = st.executeQuery(sql);
                
                while(rs.next())
                {     
                    String a = rs.getString("Name");
                  
                    String c = rs.getString("Labs");
                    String d = rs.getString("Incharges");
                    String e = rs.getString("Stats");
                    String f = rs.getString("Labids");
                    String g = rs.getString("Purchases");
                    String h = rs.getString("Specification"); 
                    String m = rs.getString("Cost");
                    String n = rs.getString("total_quantity");
                    
                    model.addRow(new Object[]{a,c,d,e,f,g,h,m,n});
                }
               
               jTable1.setModel(model);
               if(model.getRowCount()==0)
                {
                    JOptionPane.showMessageDialog(null,"NO RECORD FOUND!!!!!","MESSAGE",JOptionPane.WARNING_MESSAGE);
                
                }
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           }
        }
        else{
            filter(sel);
        }
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    /**
     * @param args
     */ 
    public static void main(String args[]) {   
        try { 
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
 
        /* Create and display the form */
       
            new main().setVisible(true);
      
        
    } 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private static javax.swing.JTextField jTextField10;
    private static javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField jTextField5;
    private static javax.swing.JTextField jTextField6;
    private static javax.swing.JTextField jTextField7;
    private static javax.swing.JTextField jTextField8;
    private static javax.swing.JTextField jTextField9;
    private javax.swing.JTextField stxt;
    // End of variables declaration//GEN-END:variables
}
