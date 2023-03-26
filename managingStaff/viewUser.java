/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package managingStaff;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author bidha
 */
public class viewUser extends javax.swing.JFrame {
viewIndi jdata=new viewIndi();
    /**
     * Creates new form viewUser
     */
    public viewUser() {
      initComponents();
      detailstable.setAutoCreateRowSorter(true);
      close.setVisible(false);
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailstable = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        tosearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        close = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 63, 107));

        jLabel4.setBackground(new java.awt.Color(255, 198, 0));
        jLabel4.setFont(new java.awt.Font("Poppins ExtraBold", 0, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 198, 0));
        jLabel4.setText("VIEW USERS");

        back.setBackground(new java.awt.Color(235, 29, 54));
        back.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 198, 0));
        back.setText("BACK");
        back.setAlignmentX(0.5F);
        back.setBorder(null);
        buttonGroup3.add(back);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        detailstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ROLE", "FIRST NAME", "SECOND NAME", "DAY", "MONTH", "YEAR", "GENDER", "STREET", "TOWN", "CITY", "DISTRTICT", "PROVINCE", "NUMBER", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detailstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailstableMouseClicked(evt);
            }
        });
        detailstable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                detailstableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(detailstable);

        jToggleButton1.setBackground(new java.awt.Color(255, 183, 43));
        buttonGroup2.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jToggleButton1.setText("DELIVERY STAFFS");
        jToggleButton1.setBorder(null);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(255, 183, 43));
        buttonGroup2.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jToggleButton2.setText("MANAGERS");
        jToggleButton2.setBorder(null);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        tosearch.setBackground(new java.awt.Color(246, 245, 77));
        tosearch.setFont(new java.awt.Font("Poppins Light", 1, 18)); // NOI18N
        tosearch.setForeground(new java.awt.Color(0, 0, 0));
        tosearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tosearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tosearchKeyReleased(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 198, 0));
        jLabel5.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 198, 0));
        jLabel5.setText("SEARCH");

        close.setBackground(new java.awt.Color(235, 29, 54));
        close.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        close.setForeground(new java.awt.Color(255, 198, 0));
        close.setText("BACK");
        close.setAlignmentX(0.5F);
        close.setBorder(null);
        buttonGroup3.add(close);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tosearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166)
                        .addComponent(jLabel4)
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(close))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1)
                        .addGap(15, 15, 15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tosearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
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
    }// </editor-fold>//GEN-END:initComponents
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new manageUser().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        removerow();
        showdelivery();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        removerow();
        showmanagers();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void detailstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailstableMouseClicked
        // TODO add your handling code here:
        int index=detailstable.getSelectedRow();
        TableModel model=detailstable.getModel();
        String eid=model.getValueAt(index,0).toString();
        String erole=model.getValueAt(index,1).toString();
        String efname=model.getValueAt(index,2).toString();
        String esname=model.getValueAt(index,3).toString();
        String eday=model.getValueAt(index,4).toString();
        String emonth=model.getValueAt(index,5).toString();
        String eyear=model.getValueAt(index,6).toString();
        String egender=model.getValueAt(index,7).toString();
        String estreet=model.getValueAt(index,8).toString();
        String etown=model.getValueAt(index,9).toString();
        String ecity=model.getValueAt(index,10).toString();
        String edistrict=model.getValueAt(index,11).toString();
        String eprovince=model.getValueAt(index,12).toString();
        String enumber=model.getValueAt(index,13).toString();
        String eemail=model.getValueAt(index,14).toString();
        
        jdata.setVisible(true);
        jdata.pack();
        jdata.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jdata.uid.setText(eid);
        jdata.roles.setText(erole);
        jdata.firstname.setText(efname);
        jdata.secondname.setText(esname);
        jdata.uday.setText(eday);
        jdata.umonth.setText(emonth);
        jdata.uyear.setText(eyear);
        jdata.sex.setText(egender);
        jdata.street.setText(estreet);
        jdata.city.setText(etown);
        jdata.municipality.setText(ecity);
        jdata.district.setText(edistrict);
        jdata.province.setText(eprovince);
        jdata.phone.setText(enumber);
        jdata.email.setText(eemail);
       
    }//GEN-LAST:event_detailstableMouseClicked

    private void tosearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tosearchKeyReleased
        // TODO add your handling code here:
        String searchString=tosearch.getText();
        searchintable(searchString);
    }//GEN-LAST:event_tosearchKeyReleased

    private void detailstableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detailstableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_detailstableKeyReleased

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    
    public void removerow(){
         DefaultTableModel tbl=(DefaultTableModel)detailstable.getModel();
        int torem=detailstable.getRowCount();
        for (int i=torem-1;i>=0;i--){
            tbl.removeRow(i);
        }
    }
    public void showmanagers(){
        String filePath ="C:\\Users\\bidha\\OneDrive\\Documents\\NetBeansProjects\\hw1\\src\\main\\java\\managingStaff\\managers.txt";
        File file = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)detailstable.getModel();
            model.addRow(columnsName);
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            br.close();
            
             
            
     // extratct data from lines
     // set data to jtable model
        for (Object tableLine : tableLines) {
            String line = tableLine.toString().trim();
            String[] dataRow = line.split(",");
            model.addRow(dataRow);
        }
            
            
       
        }
        catch (IOException ex) {
            Logger.getLogger(viewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showdelivery(){
        String filePath ="C:\\Users\\bidha\\OneDrive\\Documents\\NetBeansProjects\\hw1\\src\\main\\java\\deliveryStaff\\deliveryboys.txt";
        
        File file = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)detailstable.getModel();
            model.addRow(columnsName);
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            br.close();
            
             
            
     // extratct data from lines
     // set data to jtable model
        for (Object tableLine : tableLines) {
            String line = tableLine.toString().trim();
            String[] dataRow = line.split(",");
            model.addRow(dataRow);
        }
            
            
       
        }
        catch (IOException ex) {
            Logger.getLogger(viewUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void deleteduser(){
        //this method is only to generate report.
        String filePath ="C:\\Users\\bidha\\OneDrive\\Documents\\NetBeansProjects\\hw1\\src\\main\\java\\managingStaff\\deluser.txt";
        
        File file = new File(filePath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)detailstable.getModel();
            model.addRow(columnsName);
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            br.close();
            
             
            
     // extratct data from lines
     // set data to jtable model
        for (Object tableLine : tableLines) {
            String line = tableLine.toString().trim();
            String[] dataRow = line.split(",");
            model.addRow(dataRow);
        }
            
            
       
        }
        catch (IOException ex) {
            Logger.getLogger(viewUser.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(viewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewUser().setVisible(true);
            }
        });
    }
    public void searchintable(String str){
        DefaultTableModel model = (DefaultTableModel)detailstable.getModel();
        TableRowSorter<DefaultTableModel> ts=new TableRowSorter<>(model);
        detailstable.setRowSorter(ts);
        ts.setRowFilter(RowFilter.regexFilter(str));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    public javax.swing.JButton close;
    public javax.swing.JTable detailstable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JTextField tosearch;
    // End of variables declaration//GEN-END:variables
}
/*public void test(String format, String file) throws FileNotFoundException{
        table.setVisible(true);
        table.jToggleButton2.setVisible(false);
        table.jToggleButton1.setVisible(false);
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date date=new Date();
        String todaydate=formatter.format(date);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        DefaultTableModel model = (DefaultTableModel)table.detailstable.getModel();
        Object[] lines = br.lines().toArray();
        for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(",");
                if(row[17].equals(todaydate)){
                    model.addRow(row);}
            }
   }*/
