import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Register_Page extends javax.swing.JFrame {
    
    Register_Manager reg = new Register_Manager();

    public Register_Page() {
        initComponents();
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male_ck);
        genderGroup.add(female_ck);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usr_reg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pass1_reg = new javax.swing.JPasswordField();
        pass2_reg = new javax.swing.JPasswordField();
        male_ck = new javax.swing.JRadioButton();
        female_ck = new javax.swing.JRadioButton();
        regist_btn = new javax.swing.JButton();
        log_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Register");

        usr_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr_regActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password");

        pass1_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1_regActionPerformed(evt);
            }
        });

        pass2_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass2_regActionPerformed(evt);
            }
        });

        male_ck.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        male_ck.setForeground(new java.awt.Color(255, 255, 255));
        male_ck.setText("Male");

        female_ck.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        female_ck.setForeground(new java.awt.Color(255, 255, 255));
        female_ck.setText("Female");

        regist_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regist_btn.setForeground(new java.awt.Color(255, 51, 51));
        regist_btn.setText("Register");
        regist_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regist_btnActionPerformed(evt);
            }
        });

        log_btn.setBackground(new java.awt.Color(255, 51, 51));
        log_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        log_btn.setForeground(new java.awt.Color(255, 255, 255));
        log_btn.setText("Have an account, Login");
        log_btn.setBorderPainted(false);
        log_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(male_ck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(female_ck))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addComponent(usr_reg)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(pass1_reg)
                    .addComponent(pass2_reg)
                    .addComponent(regist_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(log_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usr_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass1_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass2_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male_ck)
                    .addComponent(female_ck))
                .addGap(52, 52, 52)
                .addComponent(regist_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(log_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usr_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usr_regActionPerformed

    private void pass1_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass1_regActionPerformed

    private void pass2_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass2_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass2_regActionPerformed

    private void log_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_btnActionPerformed
        // TODO add your handling code here:
        Login_Page log = new Login_Page();
        log.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_log_btnActionPerformed

    private void regist_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regist_btnActionPerformed
        // TODO add your handling code here:
        String usr = usr_reg.getText().trim();
        String pass1 = pass1_reg.getText();
        String pass2 = pass2_reg.getText();

        if (usr.isEmpty() || pass1.isEmpty() || pass2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (Register_Manager.isUsernameTaken(usr)) {
            JOptionPane.showMessageDialog(this, "Username already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String gender = " ";
        if (male_ck.isSelected()) {
            gender = "male";
        } else if (female_ck.isSelected()) {
            gender = "female";
        } else {
            JOptionPane.showMessageDialog(this, "Chose you gender", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Register_Manager.registerUser(usr, pass1, gender);

        String message = "Register Success!\n\n"
                    + "Username: " + usr + "\n"
                    + "Password: " + pass1 + "\n"
                    + "Gender: " + gender;

        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
        Login_Page log = new Login_Page();
        log.setVisible(true);
        this.dispose();
}//GEN-LAST:event_regist_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton female_ck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log_btn;
    private javax.swing.JRadioButton male_ck;
    private javax.swing.JPasswordField pass1_reg;
    private javax.swing.JPasswordField pass2_reg;
    private javax.swing.JButton regist_btn;
    private javax.swing.JTextField usr_reg;
    // End of variables declaration//GEN-END:variables
}
