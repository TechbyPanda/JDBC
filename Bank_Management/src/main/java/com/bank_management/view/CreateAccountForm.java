
package com.bank_management.view;

import com.bank_management.model.AccountModel;
import com.bank_management.DAO.AccountDAO;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CreateAccountForm extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccountForm
     */
    public CreateAccountForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tFather = new javax.swing.JTextField();
        date_chooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tMobile = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tAmount = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lname = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        first = new javax.swing.JLabel();
        last = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tMale = new javax.swing.JRadioButton();
        tFemale = new javax.swing.JRadioButton();
        another = new javax.swing.JRadioButton();
        father = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1016, 553));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setText("First Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setText("Father Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 134, -1, -1));

        tFather.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        tFather.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFatherKeyReleased(evt);
            }
        });
        jPanel3.add(tFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 166, 264, -1));

        date_chooser.setDateFormatString("dd/MM/y");
        jPanel3.add(date_chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 299, 130, 32));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("Date of Birth");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 266, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setText("Mobile No.");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 366, -1, -1));

        tMobile.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        tMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tMobileKeyReleased(evt);
            }
        });
        jPanel3.add(tMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 399, 221, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 134, -1, -1));

        tEmail.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        tEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tEmailKeyReleased(evt);
            }
        });
        jPanel3.add(tEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 166, 296, -1));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setText("Address");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 266, -1, -1));

        tAddress.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        tAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAddressActionPerformed(evt);
            }
        });
        jPanel3.add(tAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 299, 438, -1));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel10.setText("Amount");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 366, -1, -1));

        tAmount.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        tAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAmountActionPerformed(evt);
            }
        });
        tAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tAmountKeyReleased(evt);
            }
        });
        jPanel3.add(tAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 399, 154, -1));

        btnCreate.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 88, -1));
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 127, -1, -1));

        firstName.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameKeyReleased(evt);
            }
        });
        jPanel3.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 46, 151, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 13, -1, -1));

        lastName.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameKeyReleased(evt);
            }
        });
        jPanel3.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 46, 153, -1));

        first.setForeground(new java.awt.Color(255, 255, 255));
        first.setText("Please enter proper name");
        jPanel3.add(first, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 85, -1, -1));

        last.setForeground(new java.awt.Color(255, 255, 255));
        last.setText("Please enter proper name");
        jPanel3.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 85, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 12))); // NOI18N
        jPanel1.setOpaque(false);

        buttonGroup1.add(tMale);
        tMale.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        tMale.setText("Male");
        tMale.setOpaque(false);
        tMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(tFemale);
        tFemale.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        tFemale.setText("Female");
        tFemale.setOpaque(false);

        buttonGroup1.add(another);
        another.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        another.setText("Another");
        another.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tMale)
                    .addComponent(tFemale)
                    .addComponent(another))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tMale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addComponent(another))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 0, -1, -1));

        father.setForeground(new java.awt.Color(255, 255, 255));
        father.setText("Please enter proper name");
        jPanel3.add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 205, -1, -1));

        mobile.setForeground(new java.awt.Color(255, 255, 255));
        mobile.setText("Please enter valid mobile number");
        jPanel3.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 438, -1, -1));

        amount.setForeground(new java.awt.Color(255, 255, 255));
        amount.setText("Amount must be 2000 or above");
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 438, -1, -1));

        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Please enter valid email");
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 205, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton1.setText("Create Account");

        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton2.setText("Show Records");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton3.setText("Withdraw");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton4.setText("Deposit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton7.setText("New User");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton8.setText("Log Out");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton9.setText("Customer Details");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 4, 210, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String lname = lastName.getText();
        String name = firstName.getText();
        String fname = tFather.getText();
        String gender = null ;
        if(tMale.isSelected())
            gender = "m";
        else if(tFemale.isSelected())
            gender = "f";
        else if(another.isSelected())
            gender = "t";
      
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String DOB = sdf.format(date_chooser.getDate());
        String address = tAddress.getText();
        String mobile = tMobile.getText();
        String Email = tEmail.getText();
        String amount = tAmount.getText();
        if(name.isEmpty() || lname.isEmpty() || fname.isEmpty() || gender == null || address.isEmpty() || mobile.isEmpty() || Email.isEmpty() || amount.isEmpty())
            JOptionPane.showMessageDialog(this, "Please complete the form");
        else{
            if(Checker.isValidData(mobile, name, Integer.parseInt(amount), Email)){
                AccountModel model = new AccountModel(fname, gender, DOB, address, mobile, Email, Integer.parseInt(amount), name, lname);
        boolean status = AccountDAO.save(model);
        if(status){
            JOptionPane.showMessageDialog(this, "Account Created \n Your account no. is "
            +Checker.accountNo(tMobile.getText()));
            firstName.setText("");
            lastName.setText("");
            tFather.setText("");
            tAddress.setText("");
            tMobile.setText("");
            tEmail.setText("");
            tAmount.setText("");
            
        }
        else 
            JOptionPane.showMessageDialog(this, "Something went wrong . Please try again.");
            }
            else
                JOptionPane.showMessageDialog(this, "Please fill the valid information");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void tMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMaleActionPerformed
        
    }//GEN-LAST:event_tMaleActionPerformed

    private void firstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameKeyReleased
        if(!Checker.isValidUsername(firstName.getText()))
            first.setForeground(Color.RED);
        else
            first.setForeground(Color.WHITE);
    }//GEN-LAST:event_firstNameKeyReleased

    private void lastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameKeyReleased
        if(!Checker.isValidUsername(lastName.getText()))
            last.setForeground(Color.RED);
        else
            last.setForeground(Color.WHITE);
    }//GEN-LAST:event_lastNameKeyReleased

    private void tFatherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tFatherKeyReleased
        if(!Checker.isValidUsername(tFather.getText()))
            father.setForeground(Color.RED);
        else
            father.setForeground(Color.WHITE);
    }//GEN-LAST:event_tFatherKeyReleased

    private void tMobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMobileKeyReleased
        if(!Checker.isValidMobile(tMobile.getText()))
            mobile.setForeground(Color.RED);
        else
            mobile.setForeground(Color.WHITE);
    }//GEN-LAST:event_tMobileKeyReleased

    private void tAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tAmountKeyReleased
        if(!Checker.isValidAmount(Integer.parseInt(tAmount.getText())))
            amount.setForeground(Color.RED);
        else
            amount.setForeground(Color.WHITE);
    }//GEN-LAST:event_tAmountKeyReleased

    private void tEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tEmailKeyReleased
        if(!Checker.isValidEmail(tEmail.getText()))
            email.setForeground(Color.RED);
        else
            email.setForeground(Color.WHITE);
    }//GEN-LAST:event_tEmailKeyReleased

    private void tAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAmountActionPerformed

    private void tAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAddressActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new DepositForm().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new UpdateForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new DeleteForm().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new NewUserForm().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setVisible(false);
        new loginForn().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.setVisible(false);
        new ShowDetails().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Table().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new WithdrawForm().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
 
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
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JRadioButton another;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JLabel email;
    private javax.swing.JLabel father;
    private javax.swing.JLabel first;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel last;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel mobile;
    private javax.swing.JTextField tAddress;
    private javax.swing.JTextField tAmount;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tFather;
    private javax.swing.JRadioButton tFemale;
    private javax.swing.JRadioButton tMale;
    private javax.swing.JTextField tMobile;
    // End of variables declaration//GEN-END:variables
}
