
package bnb.billing.system;
import java.sql.*;
import SQLManager.Connector;
import javax.swing.JOptionPane;
        
public class addBuyer extends javax.swing.JFrame implements Interface {

    public addBuyer() {
        initComponents();
        btnSave.setEnabled(false); // save button will initially be disabled
    }
    
    public void clear() { // used for the clear all button
        txtName.setText("");
        txtPhoneNo.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        btnSave.setEnabled(false);
    }
    
    // takes method from interface 
    @Override
    public void backHomePage() {
        setVisible(false);
    }

    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$"; // regular expressions used for email error handling 
    
    public void validateFields() { // validation of user inputs
        String name = txtName.getText();
        String email = txtEmail.getText();
        String gender = (String)txtGender.getSelectedItem();
        String phoneNo = txtPhoneNo.getText();
        String address = txtAddress.getText();
        if(!name.equals("") && email.matches(emailPattern) && !phoneNo.equals("") && phoneNo.length() == 12 && !address.equals("") && !gender.equals(""))
            btnSave.setEnabled(true);
        else
            btnSave.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtGender = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(380, 240, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setFont(new java.awt.Font("Moche", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 300, 30));

        txtPhoneNo.setFont(new java.awt.Font("Moche", 0, 14)); // NOI18N
        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNoKeyReleased(evt);
            }
        });
        getContentPane().add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 300, 30));

        txtEmail.setFont(new java.awt.Font("Moche", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 300, 30));

        txtAddress.setFont(new java.awt.Font("Moche", 0, 14)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 300, 30));

        txtGender.setFont(new java.awt.Font("Moche", 0, 14)); // NOI18N
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGenderKeyReleased(evt);
            }
        });
        getContentPane().add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 300, 30));

        btnSave.setFont(new java.awt.Font("Moche", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        btnClearAll.setFont(new java.awt.Font("Moche", 0, 14)); // NOI18N
        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnClearAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        btnClose.setFont(new java.awt.Font("Moche", 0, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addBuyerWallP.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        backHomePage();
    }//GEN-LAST:event_btnCloseActionPerformed

    // resets the whole page
    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        setVisible(false);
        new addBuyer().setVisible(true);
    }//GEN-LAST:event_btnClearAllActionPerformed

    // code for save button; when clicked, user input will be implemented to the SQL table 'buyer'
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String name = txtName.getText();
        String phoneNo = txtPhoneNo.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String gender = (String)txtGender.getSelectedItem();
        clear();
        
        try {
            Connection con = Connector.getCon(); // connecting to the SQL connector in Connector.java
            
            PreparedStatement ps = con.prepareStatement("insert into buyer values(?,?,?,?,?)"); // applying the user input into the SQL 'buyer' database table
            ps.setString(1, name);
            ps.setString(2, phoneNo);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setString(5, gender);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e); // the save button will still be disabled if there's something inaccurate
        } 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPhoneNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNoKeyReleased
        validateFields();
    }//GEN-LAST:event_txtPhoneNoKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        validateFields();
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyReleased
        validateFields();
    }//GEN-LAST:event_txtGenderKeyReleased

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
            java.util.logging.Logger.getLogger(addBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBuyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
