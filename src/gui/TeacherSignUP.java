package gui;

import java.sql.ResultSet;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme;
import static gui.StudentSignUp.cityMap;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MySQL;

public class TeacherSignUP extends javax.swing.JFrame {

    public static HashMap<String, Integer> cityMap = new HashMap();
    public static HashMap<String, Integer> classMap = new HashMap();

    public TeacherSignUP() {
        initComponents();
        loadTeachers();
        loadCities();
        loadClasses();
    }

    public void loadTeachers() {
        try {
            ResultSet resultSet = MySQL.execute("SELECT * FROM `teacher` "
                    + "INNER JOIN `city` ON `teacher`.`city_city_id`=`city`.`city_id` "
                    + "INNER JOIN `gender` ON `teacher`.`gender_id`=`gender`.`id` "
                    + "INNER JOIN `class` ON `teacher`.`class_class_no`=`class`.`class_no` ORDER BY `tno` ASC");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                Vector<String> v = new Vector();
                v.add(resultSet.getString("tno"));
                v.add(resultSet.getString("first_name"));
                v.add(resultSet.getString("last_name"));
                v.add(resultSet.getString("mobile"));
                v.add(resultSet.getString("address"));
                v.add(resultSet.getString("city.name"));
                v.add(resultSet.getString("class.class_name"));
                v.add(resultSet.getString("password"));
                v.add(resultSet.getString("gender.type"));

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

    private void loadClasses() {
        try {

            ResultSet resultSet = MySQL.execute("SELECT * FROM `class`");

            Vector v = new Vector();
            v.add("Select");

            while (resultSet.next()) {
                v.add(resultSet.getString("class_name"));
                classMap.put(resultSet.getString("class_name"), resultSet.getInt("class_no"));
            }

            DefaultComboBoxModel model1 = new DefaultComboBoxModel(v);
            jComboBox2.setModel(model1);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void reset() {

        jTextField2.setText("");
        jTextField3.setText("");
        jTextField6.setText("");
        jTextField5.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField1.setText("");
        jPasswordField1.setText("");
        buttonGroup1.clearSelection();
        jTextField2.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        jTextField6.setText(" ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(158, 158, 158));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));

        jPanel2.setBackground(new java.awt.Color(84, 110, 122));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 102, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adyapanaya");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/classroom.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/education.png"))); // NOI18N
        jLabel4.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel3.getAccessibleContext().setAccessibleName(" ");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Teacher Registration Page");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(44, 62, 80));
        jLabel7.setText("First Name");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(44, 62, 80));
        jLabel8.setText("Last  Name");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/smartphone.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(44, 62, 80));
        jLabel10.setText("Mobile Number");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(44, 62, 80));
        jLabel13.setText("City");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(44, 62, 80));
        jLabel14.setText("Class Name");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blackboard.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlock.png"))); // NOI18N
        jLabel16.setText(" ");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(44, 62, 80));
        jLabel17.setText("Password");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye (2).png"))); // NOI18N
        jButton1.setText(" ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel18.setText("Gender");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gender.png"))); // NOI18N
        jLabel19.setText(" ");

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher No", "First Name", "Last Name", "Mobile", "Address", "City", "Class Name", "Password", "Gender"
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

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 255, 0));
        jButton2.setText("Create Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delet Account");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/skyscraper.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/location.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(44, 62, 80));
        jLabel22.setText("Address");

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left (1).png"))); // NOI18N
        jButton5.setText(" ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(311, 311, 311))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel7))
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                        .addComponent(jTextField2)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel17))
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jPasswordField1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1))
                                .addComponent(jTextField3)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String firstName = jTextField1.getText();
        String lastName = jTextField2.getText();
        String mobileNumber = jTextField3.getText();
        String address = jTextField5.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        String city = String.valueOf(jComboBox1.getSelectedItem());
        String claz = String.valueOf(jComboBox2.getSelectedItem());
        ButtonModel genderSelection = buttonGroup1.getSelection();

        if (firstName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter First Name", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (lastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Last Name", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (mobileNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Mobile Number", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Address", "Warning", JOptionPane.WARNING_MESSAGE);
            System.out.println(address);
        } else if (city.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select City", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (claz.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select Class Name", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter password", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (genderSelection == null) {
            JOptionPane.showMessageDialog(this, "Please Enter Student Gender", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            String genderId = genderSelection.getActionCommand();
            int cityId = cityMap.get(city);
            int classId = classMap.get(claz);

            JOptionPane.showMessageDialog(this, "Registration Success", "Success", JOptionPane.PLAIN_MESSAGE);
            try {
                MySQL.execute("INSERT INTO `teacher`(`first_name`,`last_name`,`mobile`,`password`,`address`,`class_class_no`,`gender_id`,`city_city_id`) VALUES"
                        + "('" + firstName + "','" + lastName + "','" + mobileNumber + "','" + password + "','" + address + "','" + classId + "','" + genderId + "','" + cityId + "')");
                loadTeachers();
                reset();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 2) {

            jTable1.setEnabled(false);
            jButton2.setEnabled(false);

            int selectedRow = jTable1.getSelectedRow();

            String firstName = String.valueOf(jTable1.getValueAt(selectedRow, 1));
            jTextField1.setText(firstName);

            String lastName = String.valueOf(jTable1.getValueAt(selectedRow, 2));
            jTextField2.setText(lastName);

            String mobile = String.valueOf(jTable1.getValueAt(selectedRow, 3));
            jTextField3.setText(mobile);

            String password = String.valueOf(jTable1.getValueAt(selectedRow, 7));
            jPasswordField1.setText(password);

            String city = String.valueOf(jTable1.getValueAt(selectedRow, 5));
            jComboBox1.setSelectedItem(city);

            String claz = String.valueOf(jTable1.getValueAt(selectedRow, 6));
            jComboBox2.setSelectedItem(claz);

            String address = String.valueOf(jTable1.getValueAt(selectedRow, 4));
            jTextField5.setText(address);

            String gender = String.valueOf(jTable1.getValueAt(selectedRow, 8));
            if (gender.equals("Male")) {
                jRadioButton1.setSelected(true);
            } else if (gender.equals("Female")) {
                jRadioButton2.setSelected(true);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        jPasswordField1.setEchoChar('\u0000');
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
        jPasswordField1.setEchoChar('\u25cf');
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String id = String.valueOf(jTable1.getValueAt(selectedRow, 0));
            String firstName = jTextField1.getText();
            String lastName = jTextField2.getText();
            String mobileNumber = jTextField3.getText();
            String address = jTextField5.getText();
            String password = String.valueOf(jPasswordField1.getPassword());
            String city = String.valueOf(jComboBox1.getSelectedItem());
            String claz = String.valueOf(jComboBox2.getSelectedItem());
            ButtonModel genderSelection = buttonGroup1.getSelection();

            if (firstName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter First Name", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (lastName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Last Name", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (mobileNumber.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Mobile Number", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (address.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Address", "Warning", JOptionPane.WARNING_MESSAGE);
                System.out.println(address);
            } else if (city.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please Select City", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (claz.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please Select Class Name", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter password", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (genderSelection == null) {
                JOptionPane.showMessageDialog(this, "Please Enter Student Gender", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                String genderId = genderSelection.getActionCommand();
                int cityId = cityMap.get(city);
                int classId = classMap.get(claz);

                JOptionPane.showMessageDialog(this, "Successfuly Updated", "Success", JOptionPane.PLAIN_MESSAGE);
                try {

                    MySQL.execute("UPDATE `teacher` SET "
                            + "`first_name`='" + firstName + "',`last_name`='" + lastName + "',"
                            + "`mobile`='" + mobileNumber + "',`password`='" + password + "',"
                            + "`address`='" + address + "',`gender_id`='" + genderId + "',"
                            + "`class_class_no`='" + classId + "',`city_city_id`='" + cityId + "' WHERE `tno`='" + id + "'");

                    loadTeachers();
                    reset();

                    jTable1.setEnabled(true);
                    jButton2.setEnabled(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please Select Row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String id = String.valueOf(jTable1.getValueAt(selectedRow, 0));
            JOptionPane.showMessageDialog(this, "Successfuly Deleted", "Delete", JOptionPane.PLAIN_MESSAGE);

            try {
                MySQL.execute("DELETE FROM `teacher` WHERE `tno`='" + id + "'");

                loadTeachers();
                reset();

                jTable1.setEnabled(true);
                jButton2.setEnabled(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        new AdminPanel().setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //FlatGitHubDarkIJTheme.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherSignUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
