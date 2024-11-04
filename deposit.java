
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
public class deposit extends javax.swing.JFrame {

    /**
     * Creates new form splash
     */
    public deposit() {
        initComponents();
        seticon();
        
        
    }
    private void seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ATM.png")));
    }
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
        back = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        note = new javax.swing.JLabel();
        notes1 = new javax.swing.JLabel();
        note3 = new javax.swing.JLabel();
        collect = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        favourite = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        enter = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setText(">>>>");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        deposit.setText(">>>>");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        jPanel1.add(deposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(18, 6, -12, 6, new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        note.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        note.setForeground(new java.awt.Color(255, 255, 255));
        note.setText("Enter amount to deposit:");
        jPanel4.add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 54, 221, 29));

        notes1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        notes1.setForeground(new java.awt.Color(255, 255, 255));
        notes1.setText("Hello");
        jPanel4.add(notes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 29, 194, -1));

        note3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        note3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(note3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 115, 143, 15));

        collect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectActionPerformed(evt);
            }
        });
        jPanel4.add(collect, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 89, 131, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 19, -1, -1));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 0, 102));
        jButton11.setText("X");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 0, -1, -1));

        balance.setText("<<<<");
        balance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        jPanel1.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 67, 26));

        favourite.setText("<<<<");
        favourite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favouriteActionPerformed(evt);
            }
        });
        jPanel1.add(favourite, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 113, -1, -1));

        enter.setBackground(new java.awt.Color(0, 153, 0));
        enter.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(204, 204, 0));
        clear.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 270, 50));

        jPanel9.setBackground(new java.awt.Color(204, 204, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("DEPOSIT MONEY");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void favouriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favouriteActionPerformed
   notes1.setText("This feature is");
   note.setText("NOT availlable!!!");
    }//GEN-LAST:event_favouriteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

        note.setText("SEE YOU BACK AGAIN");
        note3.setText("***ATM MACHINE***");
        notes1.setText("****ATM MACHINE***");
        
       //pin.setVisible(false);
       clear.setEnabled(false);
       enter.setEnabled(false);
       
        
        
        //System.exit(0);
        
    }//GEN-LAST:event_cancelActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
//pin.setText("");
collect.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
int amount=Integer.parseInt(collect.getText());
//int temp=balancz+amount;

if(amount>=50000){
    note.setText("amount is greater than 50000"); 
    notes1.setText("logout to try again!!");
    collect.setVisible(false);
}
else if(amount<=50){
    note.setText("Amount too low to deposit");
    notes1.setText("logout to try again!!");
    collect.setVisible(false);
}
else{

 try{
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
    st = con.createStatement();
    String name=notes1.getText();
    String query = "SELECT * FROM customer WHERE fname = '"+notes1.getText()+"'";
    rs = st.executeQuery(query);
     if(rs.next()){
         int balan=rs.getInt("balance");
         int id=rs.getInt("ID");
         int temp=balan+amount;
         
            
            String strSQL = "Update customer set balance = "+(temp)+" where ID = " +(id);
            int rowsEffected = st.executeUpdate(strSQL);
             if (rowsEffected == 0){
                note.setText("Amount Is Not Deposited ");
                collect.setVisible(false);
            }
            else{
                 note.setText("Amount Is Deposited Success ");
                collect.setVisible(false);
            }
               
                }
            con.close();
            st.close();
            rs.close();
                }
         
     
     
 
 
 catch(Exception e){
        System.out.println("That wasn't suppose to happen"+e);
    
    //note.setVisible(false);
}
}
   
   

        
    }//GEN-LAST:event_enterActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    back.setText("Back");
    cancel.setEnabled(false);
    
    }//GEN-LAST:event_formWindowActivated

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
  notes1.setText("Current available");
  note.setText("balance: ksh "+balancz);
   
    }//GEN-LAST:event_balanceActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        notes1.setText("------------------");
        note.setText("Enter amount");
        note3.setText("___________________");
        collect.setEnabled(true);
        collect.setVisible(true);
        int depo=Integer.parseInt(collect.getText());
        
        balancz=balancz+depo;
         String update="UPDATE customer set balance= +"+(balancz);
            try {
                st= con.createStatement();
                 rs = st.executeQuery(update);
                 
            } catch (SQLException ex) {
                Logger.getLogger(deposit.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        
    }//GEN-LAST:event_depositActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        verify ver=new verify();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void collectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_collectActionPerformed

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
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton balance;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JTextField collect;
    private javax.swing.JButton deposit;
    private javax.swing.JButton enter;
    private javax.swing.JButton favourite;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel note;
    private javax.swing.JLabel note3;
    public javax.swing.JLabel notes1;
    // End of variables declaration//GEN-END:variables

}