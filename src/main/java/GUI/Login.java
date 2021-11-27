/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author Suhendra
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFUsername = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        JBtnLogin = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(new java.awt.Dimension(1440, 900));
        setMinimumSize(new java.awt.Dimension(1440, 900));
        getContentPane().setLayout(null);

        jTFUsername.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jTFUsername.setForeground(new java.awt.Color(204, 204, 204));
        jTFUsername.setText("Username");
        jTFUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFUsernameFocusLost(evt);
            }
        });
        getContentPane().add(jTFUsername);
        jTFUsername.setBounds(520, 440, 400, 70);

        jPass.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jPass.setForeground(new java.awt.Color(204, 204, 204));
        jPass.setText("blablabla");
        jPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPassFocusLost(evt);
            }
        });
        getContentPane().add(jPass);
        jPass.setBounds(520, 530, 400, 70);

        JBtnLogin.setBackground(new java.awt.Color(31, 69, 144));
        JBtnLogin.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        JBtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        JBtnLogin.setText("Login");
        JBtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBtnLoginMouseClicked(evt);
            }
        });
        getContentPane().add(JBtnLogin);
        JBtnLogin.setBounds(620, 663, 200, 90);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Assets/login page.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -6, 1440, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFUsernameFocusGained
        // TODO add your handling code here:
        if(jTFUsername.getText().equals("Username"))
        {
            jTFUsername.setText("");
            jTFUsername.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTFUsernameFocusGained

    private void jTFUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFUsernameFocusLost
        // TODO add your handling code here:
        if(jTFUsername.getText().equals(""))
        {
            jTFUsername.setText("Username");
            jTFUsername.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_jTFUsernameFocusLost

    private void jPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassFocusGained
        // TODO add your handling code here:
        if(jPass.getText().equals("blablabla"))
        {
            jPass.setText("");
            jPass.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jPassFocusGained

    private void jPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPassFocusLost
        // TODO add your handling code here:
        if(jPass.getText().equals(""))
        {
            jPass.setText("blablabla");
            jPass.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_jPassFocusLost

    private void JBtnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBtnLoginMouseClicked
        // TODO add your handling code here:
        /*if(jTFUsername.getText().equals("Admin") && jPass.getText().equals("Admin"))
        {
            Car mobil = new Car();
            mobil.setVisible(true);
            dispose();
        }
        else{
            Error errorlogin = new Error();
            errorlogin.setVisible(true);
        }*/
    }//GEN-LAST:event_JBtnLoginMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnLogin;
    private javax.swing.JLabel background;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jTFUsername;
    // End of variables declaration//GEN-END:variables
}
