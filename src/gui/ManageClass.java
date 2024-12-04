package gui;

import java.util.HashMap;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.MySQL;

public class ManageClass extends javax.swing.JFrame {

    public static HashMap<String, Integer> subMap = new HashMap();
    public static HashMap<String, Integer> classMap = new HashMap();
    public static HashMap<String, Integer> teacherMap = new HashMap();

    public ManageClass() {
        initComponents();
        loadSubjects();
        loadTeachers();
        loadClasses();
        loadTable();
    }

    private void reset() {

        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jTextField1.setText("");
        jTextField1.requestFocus();

    }

    private void loadSubjects() {
        try {

            ResultSet resultSet = MySQL.execute("SELECT * FROM `subject`");

            Vector v = new Vector();
            v.add("Select");

            while (resultSet.next()) {
                v.add(resultSet.getString("name"));
                subMap.put(resultSet.getString("name"), resultSet.getInt("subno"));
            }

            DefaultComboBoxModel model1 = new DefaultComboBoxModel(v);
            jComboBox1.setModel(model1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadTeachers() {
        try {

            ResultSet resultSet = MySQL.execute("SELECT * FROM `teacher`");

            Vector v = new Vector();
            v.add("Select");

            while (resultSet.next()) {
                v.add(resultSet.getString("first_name"));
                teacherMap.put(resultSet.getString("first_name"), resultSet.getInt("tno"));
            }

            DefaultComboBoxModel model1 = new DefaultComboBoxModel(v);
            jComboBox2.setModel(model1);

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
            jComboBox3.setModel(model1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(158, 158, 158));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));

        jPanel3.setBackground(new java.awt.Color(84, 110, 122));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 102, 0)));
        jPanel3.setToolTipText("");
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 100));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adyapanaya");
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/education.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/classroom.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Subject Adding");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Subject");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Teacher");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Timeslot");

        jTextField1.setText("2023-07-04 10:21:50");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 255, 0));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Subject", "Teacher", "Last Name", "Timeslot", "Claas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Class Name");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField2MouseReleased(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seacrch");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Search Details");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 255, 0));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 255, 0));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13)))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextField1)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String subject = String.valueOf(jComboBox1.getSelectedItem());
        String teacher = String.valueOf(jComboBox2.getSelectedItem());
        String claz = String.valueOf(jComboBox3.getSelectedItem());
        String timeSlot = jTextField1.getText();
//      String time = jTextField2.getText();
//      String link = jTextField3.getText();

        if (subject.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select Subject", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (teacher.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select Teacher", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (claz.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select Class", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (timeSlot.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Timeslot", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            int subId = subMap.get(subject);
            int classId = classMap.get(claz);
            int tId = teacherMap.get(teacher);

            JOptionPane.showMessageDialog(this, "Added Success", "Success", JOptionPane.PLAIN_MESSAGE);
            try {
                MySQL.execute("INSERT INTO `class_regitration`(`class_class_no`,`timeslot`,`subject_subno`,`teacher_tno`) VALUES"
                        + "('" + classId + "','" + timeSlot + "','" + subId + "','" + tId + "')");
                loadTable();
                reset();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void loadTable() {

        try {
            ResultSet resultSet = MySQL.execute("SELECT * FROM `class_regitration` "
                    + "INNER JOIN `subject` ON `class_regitration`.`subject_subno`=`subject`.`subno` "
                    + "INNER JOIN `teacher` ON `class_regitration`.`teacher_tno`=`teacher`.`tno`"
                    + " INNER JOIN `class` ON `class_regitration`.`class_class_no`=`class`.`class_no` "
                    + "ORDER BY `id` ASC");

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                Vector<String> v = new Vector();
                v.add(resultSet.getString("id"));
                v.add(resultSet.getString("subject.name"));
                v.add(resultSet.getString("teacher.first_name"));
                v.add(resultSet.getString("teacher.last_name"));
                v.add(resultSet.getString("timeslot"));
                v.add(resultSet.getString("class.class_name"));

                model.addRow(v);
                jTable2.setModel(model);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void search(String searchText) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable2.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(searchText));
    }


    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        if (evt.getClickCount() == 2) {

            jTable2.setEnabled(false);
            jButton1.setEnabled(false);

            int selectedRow = jTable2.getSelectedRow();

            String subject = String.valueOf(jTable2.getValueAt(selectedRow, 1));
            jComboBox1.setSelectedItem(subject);

            String teacher = String.valueOf(jTable2.getValueAt(selectedRow, 2));
            jComboBox2.setSelectedItem(teacher);

            String className = String.valueOf(jTable2.getValueAt(selectedRow, 5));
            jComboBox3.setSelectedItem(className);

            String timeSlot = String.valueOf(jTable2.getValueAt(selectedRow, 4));
            jTextField1.setText(timeSlot);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String searchString = jTextField2.getText();
        search(searchString);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MousePressed


    }//GEN-LAST:event_jTextField2MousePressed

    private void jTextField2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseReleased


    }//GEN-LAST:event_jTextField2MouseReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased

//        String searchString = jTextField2.getText();
//        search(searchString);

    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please Select Row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String id = String.valueOf(jTable2.getValueAt(selectedRow, 0));
            JOptionPane.showMessageDialog(this, "Successfuly Deleted", "Dlete", JOptionPane.PLAIN_MESSAGE);

            try {
                MySQL.execute("DELETE FROM `class_regitration` WHERE `id`='" + id + "'");

                loadTeachers();
                reset();

                jTable2.setEnabled(true);
                jButton2.setEnabled(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int selectedRow = jTable2.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please Select Row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            String id = String.valueOf(jTable2.getValueAt(selectedRow, 0));

            String subject = String.valueOf(jComboBox1.getSelectedItem());
            String teacher = String.valueOf(jComboBox2.getSelectedItem());
            String claz = String.valueOf(jComboBox3.getSelectedItem());
            String timeSlot = jTextField1.getText();

            if (subject.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please Select Subject", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (teacher.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please Select Teacher", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (claz.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please Select Class", "Warning", JOptionPane.WARNING_MESSAGE);

            } else if (timeSlot.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Timeslot", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                int subId = subMap.get(subject);
                int classId = classMap.get(claz);
                int tId = teacherMap.get(teacher);
                JOptionPane.showMessageDialog(this, "Successfuly Updated", "Success", JOptionPane.PLAIN_MESSAGE);
                try {

                    MySQL.execute("UPDATE `class_regitration` SET "
                            + "`class_class_no`='" + classId + "',`timeslot`='" + timeSlot + "',"
                            + "`subject_subno`='" + subId + "',`teacher_tno`='" + tId + "' WHERE `id`='" + id + "'");

                    loadTable();
                    reset();

                    jTable2.setEnabled(true);
                    jButton1.setEnabled(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        AdminPanel admin = new AdminPanel();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
