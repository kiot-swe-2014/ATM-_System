
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_system;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Boniface Kipruto
 */
public class verify extends javax.swing.JFrame {

    /**
     * Creates new form splash
     */
    public verify() {
        initComponents();
        seticon();
    }
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ATM.png")));
    }
    String fnamez;
int balancz;
int operation;
Connection con;
ResultSet rs;
Statement st;
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
        cancel = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        widthraw = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        note = new javax.swing.JLabel();
        note1 = new javax.swing.JLabel();
        note3 = new javax.swing.JLabel();
        pin = new javax.swing.JPasswordField();
        sin = new javax.swing.JLabel();
        sin1 = new javax.swing.JButton();
        use = new javax.swing.JLabel();
        ty = new javax.swing.JComboBox<>();
        enter = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        favourite = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(21, 8, -10, 8, new java.awt.Color(204, 204, 204)));

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(204, 204, 0));
        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 290, 70));

        widthraw.setText(">>>>");
        widthraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthrawActionPerformed(evt);
            }
        });
        jPanel1.add(widthraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));

        deposit.setText(">>>>");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        jPanel1.add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(18, 6, -12, 6, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        note.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        note.setForeground(new java.awt.Color(255, 255, 255));
        note.setText("PASSWORD(PIN) :");
        jPanel4.add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 29));

        note1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        note1.setForeground(new java.awt.Color(255, 255, 255));
        note1.setText("          LOG IN PAGE");
        jPanel4.add(note1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 190, -1));

        note3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        note3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(note3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 270, 30));

        pin.setBackground(new java.awt.Color(204, 204, 204));
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel4.add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, 30));

        sin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sin.setForeground(new java.awt.Color(255, 255, 255));
        sin.setText("IF YET REGISTERED?");
        jPanel4.add(sin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        sin1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sin1.setForeground(new java.awt.Color(0, 51, 51));
        sin1.setText("SIGN UP");
        sin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sin1ActionPerformed(evt);
            }
        });
        jPanel4.add(sin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        use.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        use.setForeground(new java.awt.Color(255, 255, 255));
        use.setText("USER TYPE      :");
        jPanel4.add(use, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 40));

        ty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "customer", "admin" }));
        jPanel4.add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 160, 30));

        enter.setBackground(new java.awt.Color(0, 153, 0));
        enter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enter.setText("Login");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        jPanel4.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 180, 120, 32));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 320, 270));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 0, 102));
        jButton11.setText("X");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 0, -1, -1));

        balance.setText("<<<<");
        balance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        jPanel1.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 100, 30));

        favourite.setText("<<<<");
        favourite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        jPanel1.add(favourite, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 100, 30));

        jPanel9.setBackground(new java.awt.Color(204, 204, 0));
        jPanel9.setAutoscrolls(true);

        jLabel10.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("WELL COME TO CARA ATM  SYSTEM");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        transfer tras=new transfer();
       tras.setVisible(true);
       tras.setLocationRelativeTo(null);
       tras.note1.setText(fnamez);
       this.dispose();
      
     
    }//GEN-LAST:event_transferActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //loan.setEnabled(false);
        widthraw.setEnabled(false);
        //transaction.setEnabled(false);
        deposit.setEnabled(false);
        favourite.setEnabled(false);
        balance.setEnabled(false);
       
        
        
    }//GEN-LAST:event_formWindowActivated

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
  note1.setText("Current available");
  note.setText("balance: "+balancz);
  note3.setVisible(false);
    note.setVisible(true);
     widthraw.setText("Widthraw");
     deposit.setText("Deposit");
     favourite.setText("Transfer");
   
    }//GEN-LAST:event_balanceActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        deposit depositer= new deposit();
        depositer.setVisible(true);
        depositer.setLocationRelativeTo(null);
        depositer.notes1.setText(fnamez);
        this.dispose();
        
    }//GEN-LAST:event_depositActionPerformed

    private void widthrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthrawActionPerformed
       widthraw wed=new widthraw();
       wed.setVisible(true);
       wed.setLocationRelativeTo(null);
       wed.note1.setText(fnamez);
       this.dispose();
    }//GEN-LAST:event_widthrawActionPerformed

    private void sin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sin1ActionPerformed
          registration Keypad=new registration();
        Keypad.setVisible(true);
        Keypad.setLocationRelativeTo(null);
    }//GEN-LAST:event_sin1ActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        String usert=ty.getSelectedItem().toString();
        if(usert=="admin"){
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
                st = con.createStatement();
                String query = "SELECT * FROM customer WHERE pin = '"+pin.getText()+"'";
                rs = st.executeQuery(query);
                if(rs.next()){
                    adminpage Keypad=new adminpage();
                    Keypad.setVisible(true);
                    Keypad.setLocationRelativeTo(null);
                    verify very=new verify();
                    this.dispose();
                }
                else{
                    note3.setVisible(false);
                    pin.setText("");
                    JOptionPane.showMessageDialog(this, "incorrect admin password");
                    operation=1;
                } }catch (SQLException ex) {
                    Logger.getLogger(verify.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            else{
                try{
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
                    st = con.createStatement();
                    String query = "SELECT * FROM customer WHERE pin = '"+pin.getText()+"'";
                    rs = st.executeQuery(query);
                    if(rs.next()){

                        balancz =rs.getInt("balance");
                        //loan.setText("LOAN");
                        widthraw.setText("Widthraw");
                        deposit.setText("Deposit");
                        fnamez=rs.getString("fname");
                        note3.setText("Welcome " + rs.getString("fname") +" "+  rs.getString("lname") +"" );
                        favourite.setText("Transfer");
                        balance.setText("Balance");
                        // transaction.setText("Transaction");
                        //note3.setText("*************************");
                        note1.setText("_________________________");
                        pin.setVisible(false);
                        //loan.setEnabled(true);
                        widthraw.setEnabled(true);
                        //transaction.setEnabled(true);
                        deposit.setEnabled(true);
                        favourite.setEnabled(true);
                        balance.setEnabled(true);

                        operation=0;
                        jPanel3.setVisible(false);
                        jPanel3.setVisible(false);
                        enter.setVisible(false);
                        sin.setVisible(false);
                        sin1.setVisible(false);
                        use.setVisible(false);
                        ty.setVisible(false);
                        note.setVisible(false);

                    }
                    else{
                        note3.setVisible(false);
                        pin.setText("");
                        JOptionPane.showMessageDialog(this, "no such user");
                        operation=1;

                    }
                }catch(Exception e){
                    pin.setVisible(false);
                    note.setText("_______________");
                    note3.setText("***************");
                    note1.setText("Oops!! connection problem");

                    //note.setVisible(false);
                }
            }
            if(operation==0){

            }
    }//GEN-LAST:event_enterActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

        note.setText("SEE YOU BACK AGAIN");
        note3.setText("***ATM MACHINE***");
        note1.setText("****ATM MACHINE***");

        pin.setVisible(false);
        clear.setEnabled(false);
        enter.setEnabled(false);

        //System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        pin.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balance;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton deposit;
    private javax.swing.JButton enter;
    private javax.swing.JButton favourite;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel note;
    private javax.swing.JLabel note1;
    private javax.swing.JLabel note3;
    private javax.swing.JPasswordField pin;
    private javax.swing.JLabel sin;
    private javax.swing.JButton sin1;
    private javax.swing.JComboBox<String> ty;
    private javax.swing.JLabel use;
    private javax.swing.JButton widthraw;
    // End of variables declaration//GEN-END:variables
}
