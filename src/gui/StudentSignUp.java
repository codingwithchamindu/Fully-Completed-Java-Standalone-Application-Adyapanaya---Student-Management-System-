package gui;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MySQL;

public class StudentSignUp extends javax.swing.JFrame {

    public static HashMap<String, Integer> cityMap = new HashMap();

    public StudentSignUp() {
        initComponents();
        loadStudents();
        loadCities();
    }

    private void reset() {

        jTextField2.setText("");
        jTextField3.setText("");
        jTextField6.setText("");
        jComboBox1.setSelectedIndex(0);
        jTextField7.setText("");
        jTextField8.setText("");
        jPasswordField2.setText("");
        buttonGroup1.clearSelection();
        jTextField2.requestFocus();

    }

    private void loadStudents() {

        try {
            ResultSet resultSet = MySQL.execute("SELECT * FROM `student` INNER JOIN `city` ON `student`.`city_city_id`= `city`.`city_id` "
                    + "INNER JOIN `gender` ON `student`.`gender_id`=`gender`.`id` ORDER BY `sno` ASC");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {

                Vector<String> v = new Vector();
                v.add(resultSet.getString("sno"));
                v.add(resultSet.getString("first_name"));
                v.add(resultSet.getString("last_name"));
                v.add(resultSet.getString("mobile"));
                v.add(resultSet.getString("password"));
                v.add(resultSet.getString("address"));
                v.add(resultSet.getString("dob"));
                v.add(resultSet.getString("gender.type"));
                v.add(resultSet.getString("city.name"));

                model.addRow(v);
                jTable1.setModel(model);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    private void loadCities() {
        try {

            ResultSet resultSet = MySQL.execute("SELECT * FROM `city`");

            Vector v = new Vector();
            v.add("Select");

            while (resultSet.next()) {
                v.add(resultSet.getString("name"));
                cityMap.put(resultSet.getString("name"), resultSet.getInt("city_id"));
            }

            DefaultComboBoxModel model1 = new DefaultComboBoxModel(v);
            jComboBox1.setModel(model1);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(158, 158, 158));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBackground(new java.awt.Color(84, 110, 122));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 102, 0)));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adyapanaya");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/education.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/classroom.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 350));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Student Registration Page");

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(44, 62, 80));
        jLabel8.setText("First Name");
        jLabel8.setAlignmentX(0.5F);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(44, 62, 80));
        jLabel10.setText("Address");
        jLabel10.setAlignmentX(0.5F);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(44, 62, 80));
        jLabel12.setText("Mobile Number");
        jLabel12.setAlignmentX(0.5F);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(44, 62, 80));
        jLabel14.setText("Date Of Birth");
        jLabel14.setAlignmentX(0.5F);

        jTextField7.setText("2002-03-08");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(44, 62, 80));
        jLabel15.setText("Password");
        jLabel15.setAlignmentX(0.5F);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/smartphone.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/location.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlock.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/date-of-birth.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student No", "First Name", "Last Name", "Mobile", "Password ", "Address", "DOB", "Gender", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(44, 62, 80));
        jLabel16.setText("Gender");
        jLabel16.setAlignmentX(0.5F);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gender.png"))); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(178, 34, 34));
        jRadioButton1.setText("Male");
        jRadioButton1.setActionCommand("1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(178, 34, 34));
        jRadioButton2.setText("Female");
        jRadioButton2.setActionCommand("2");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 0));
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Delete Account");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(44, 62, 80));
        jLabel18.setText("Last Name");
        jLabel18.setAlignmentX(0.5F);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(44, 62, 80));
        jLabel19.setText("City");
        jLabel19.setAlignmentX(0.5F);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye (2).png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skyscraper.png"))); // NOI18N

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7)
                    .addComponent(jTextField8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel10)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton6)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String id = String.valueOf(jTable1.getValueAt(selectedRow, 0));
            JOptionPane.showMessageDialog(this, "Successfuly Deleted", "Delete", JOptionPane.PLAIN_MESSAGE);

            try {
                MySQL.execute("DELETE FROM `student` WHERE `sno`='" + id + "'");

                loadStudents();
                reset();

                jTable1.setEnabled(true);
                jButton1.setEnabled(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String firstName = jTextField2.getText();
        String lastName = jTextField3.getText();
        String mobileNumber = jTextField8.getText();
        String password = String.valueOf(jPasswordField2.getPassword());
        String address = jTextField6.getText();
        String city = String.valueOf(jComboBox1.getSelectedItem());
        String dob = jTextField7.getText();
        ButtonModel genderSelection = buttonGroup1.getSelection();

        //System.out.println(firstName);
        //System.out.println(lastName);
        //System.out.println(studentNumber);
        //System.out.println(address);
        //System.out.println(city);
        //System.out.println(dob);
        //System.out.println(password);
        //System.out.println(genderSelection);
        if (firstName.isEmpty()) {
            //System.out.println("Invalid First Name");
            JOptionPane.showMessageDialog(this, "Please Enter First Name", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (lastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Last Name", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (mobileNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Mobile Number", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Address", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (city.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please select City", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (dob.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Date Of Birth", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter password", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (genderSelection == null) {
            JOptionPane.showMessageDialog(this, "Please Enter Student Gender", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            String genderId = genderSelection.getActionCommand();
            int cityId = cityMap.get(city);

            JOptionPane.showMessageDialog(this, "Registration Success", "Success", JOptionPane.PLAIN_MESSAGE);

            try {
                MySQL.execute("INSERT INTO `student`(`first_name`,`last_name`,`mobile`,`password`,`address`,`dob`,`gender_id`,`city_city_id`) VALUES"
                        + "('" + firstName + "','" + lastName + "','" + mobileNumber + "','" + password + "','" + address + "','" + dob + "','" + genderId + "','" + cityId + "')");
                loadStudents();
                reset();

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        // TODO add your handling code here:
        jPasswordField2.setEchoChar('\u0000');
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        // TODO add your handling code here:
        jPasswordField2.setEchoChar('\u25cf');
    }//GEN-LAST:event_jButton3MouseReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2) {
            jTable1.setEnabled(false);
            jButton1.setEnabled(false);

            int selectedRow = jTable1.getSelectedRow();

            String firstName = String.valueOf(jTable1.getValueAt(selectedRow, 1));
            jTextField2.setText(firstName);

            String lastName = String.valueOf(jTable1.getValueAt(selectedRow, 2));
            jTextField3.setText(lastName);

            String mobileNumber = String.valueOf(jTable1.getValueAt(selectedRow, 3));
            jTextField8.setText(mobileNumber);

            String password = String.valueOf(jTable1.getValueAt(selectedRow, 4));
            jPasswordField2.setText(password);

            String address = String.valueOf(jTable1.getValueAt(selectedRow, 5));
            jTextField6.setText(address);

            String dob = String.valueOf(jTable1.getValueAt(selectedRow, 6));
            jTextField7.setText(dob);

            String gender = String.valueOf(jTable1.getValueAt(selectedRow, 7));
            if (gender.equals("Male")) {
                jRadioButton1.setSelected(true);
            } else if (gender.equals("Female")) {
                jRadioButton2.setSelected(true);
            }

            String city = String.valueOf(jTable1.getValueAt(selectedRow, 8));
            jComboBox1.setSelectedItem(city);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            String id = String.valueOf(jTable1.getValueAt(selectedRow, 0));
            String firstName = jTextField2.getText();
            String lastName = jTextField3.getText();
            String mobileNumber = jTextField8.getText();
            String password = String.valueOf(jPasswordField2.getPassword());
            String address = jTextField6.getText();
            String city = String.valueOf(jComboBox1.getSelectedItem());
            String dob = jTextField7.getText();
            ButtonModel genderSelection = buttonGroup1.getSelection();

            if (firstName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter First Name", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (lastName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Last Name", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (mobileNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Mobile Number", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (address.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Address", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (city.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please Enter City", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (dob.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Date Of Birth", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter password", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (genderSelection == null) {
                JOptionPane.showMessageDialog(this, "Please Enter Student Gender", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                String genderId = genderSelection.getActionCommand();
                int cityId = cityMap.get(city);
                //System.out.println("Success");
                JOptionPane.showMessageDialog(this, "Successfully Updated", "Success", JOptionPane.PLAIN_MESSAGE);
                try {
                    MySQL.execute("UPDATE `student` SET `first_name`='" + firstName + "',`last_name`='" + lastName + "',"
                            + "`mobile`='" + mobileNumber + "',`password`='" + password + "',`address`='" + address + "',"
                            + "`dob`='" + dob + "',`gender_id`='" + genderId + "',`city_city_id`='" + cityId + "' WHERE `sno`='" + id + "'");

                    loadStudents();
                    reset();

                    jTable1.setEnabled(true);
                    jButton1.setEnabled(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        new AdminPanel().setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        FlatCyanLightIJTheme.setup();
//        FlatGitHubDarkIJTheme.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
