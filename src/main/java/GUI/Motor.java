/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Suhendra
 */
import Classes.*;
public class Motor extends javax.swing.JFrame {
    public String nama;
    public String transmisi;
    public String bbm;
    public double harga;
    /**
     * Creates new form Motor
     */
    public Motor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCars = new javax.swing.JLabel();
        jLMotor = new javax.swing.JLabel();
        jLLogout = new javax.swing.JLabel();
        jLMotor1 = new javax.swing.JLabel();
        jLHarga1 = new javax.swing.JLabel();
        jLTransmisi1 = new javax.swing.JLabel();
        jLBbm1 = new javax.swing.JLabel();
        jBtnRent1 = new javax.swing.JButton();
        jLMotor2 = new javax.swing.JLabel();
        jLHarga2 = new javax.swing.JLabel();
        jLTransmisi2 = new javax.swing.JLabel();
        jLBbm2 = new javax.swing.JLabel();
        jBtnRent2 = new javax.swing.JButton();
        jLMotor3 = new javax.swing.JLabel();
        jLHarga3 = new javax.swing.JLabel();
        jLTransmisi3 = new javax.swing.JLabel();
        jLBbm3 = new javax.swing.JLabel();
        jBtnRent3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        carbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Motorcycles");
        setMaximumSize(new java.awt.Dimension(1440, 900));
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setPreferredSize(new java.awt.Dimension(1440, 900));
        setResizable(false);
        getContentPane().setLayout(null);

        jLCars.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLCars.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCars.setText("Cars");
        jLCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCarsMouseClicked(evt);
            }
        });
        getContentPane().add(jLCars);
        jLCars.setBounds(950, 50, 70, 30);

        jLMotor.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLMotor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMotor.setText("Motorcycles");
        jLMotor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMotorMouseClicked(evt);
            }
        });
        getContentPane().add(jLMotor);
        jLMotor.setBounds(1060, 50, 160, 30);

        jLLogout.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLLogout.setForeground(new java.awt.Color(255, 0, 51));
        jLLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLLogout.setText("Logout");
        jLLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(jLLogout);
        jLLogout.setBounds(1270, 50, 100, 30);

        jLMotor1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLMotor1.setText("Vario");
        getContentPane().add(jLMotor1);
        jLMotor1.setBounds(100, 520, 100, 30);

        jLHarga1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLHarga1.setText("Rp. 50.000/Hari");
        getContentPane().add(jLHarga1);
        jLHarga1.setBounds(140, 560, 145, 30);

        jLTransmisi1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLTransmisi1.setText("Automatic");
        getContentPane().add(jLTransmisi1);
        jLTransmisi1.setBounds(140, 614, 100, 20);

        jLBbm1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLBbm1.setText("Pertamax");
        getContentPane().add(jLBbm1);
        jLBbm1.setBounds(140, 660, 90, 30);

        jBtnRent1.setBackground(new java.awt.Color(31, 69, 144));
        jBtnRent1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jBtnRent1.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRent1.setText("Rent Now");
        jBtnRent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnRent1MouseClicked(evt);
            }
        });
        getContentPane().add(jBtnRent1);
        jBtnRent1.setBounds(100, 720, 180, 70);

        jLMotor2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLMotor2.setText("Beat");
        getContentPane().add(jLMotor2);
        jLMotor2.setBounds(550, 520, 100, 30);

        jLHarga2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLHarga2.setText("Rp. 50.000/Hari");
        getContentPane().add(jLHarga2);
        jLHarga2.setBounds(590, 560, 145, 30);

        jLTransmisi2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLTransmisi2.setText("Automatic");
        getContentPane().add(jLTransmisi2);
        jLTransmisi2.setBounds(590, 614, 100, 20);

        jLBbm2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLBbm2.setText("Pertamax");
        getContentPane().add(jLBbm2);
        jLBbm2.setBounds(590, 660, 90, 30);

        jBtnRent2.setBackground(new java.awt.Color(31, 69, 144));
        jBtnRent2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jBtnRent2.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRent2.setText("Rent Now");
        jBtnRent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnRent2MouseClicked(evt);
            }
        });
        getContentPane().add(jBtnRent2);
        jBtnRent2.setBounds(550, 720, 180, 70);

        jLMotor3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLMotor3.setText("Vixion");
        getContentPane().add(jLMotor3);
        jLMotor3.setBounds(990, 520, 100, 30);

        jLHarga3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLHarga3.setText("Rp. 80.000/Hari");
        getContentPane().add(jLHarga3);
        jLHarga3.setBounds(1030, 560, 145, 30);

        jLTransmisi3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLTransmisi3.setText("Kopling");
        getContentPane().add(jLTransmisi3);
        jLTransmisi3.setBounds(1030, 610, 70, 30);

        jLBbm3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLBbm3.setText("Pertamax");
        getContentPane().add(jLBbm3);
        jLBbm3.setBounds(1030, 660, 90, 30);

        jBtnRent3.setBackground(new java.awt.Color(31, 69, 144));
        jBtnRent3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jBtnRent3.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRent3.setText("Rent Now");
        jBtnRent3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnRent3MouseClicked(evt);
            }
        });
        jBtnRent3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRent3ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnRent3);
        jBtnRent3.setBounds(990, 720, 180, 70);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("MPV");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(870, 520, 40, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("MPV");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1310, 520, 40, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("MPV");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(414, 520, 40, 20);

        carbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Assets/motorcyle page.png"))); // NOI18N
        getContentPane().add(carbg);
        carbg.setBounds(0, 0, 1440, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCarsMouseClicked
        // TODO add your handling code here:
        Mobil mobil = new Mobil();
        mobil.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLCarsMouseClicked

    private void jLMotorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMotorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLMotorMouseClicked

    private void jLLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLLogoutMouseClicked
        // TODO add your handling code here:
        Login masuk = new Login();
        masuk.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLLogoutMouseClicked

    private void jBtnRent3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRent3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnRent3ActionPerformed

    private void jBtnRent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnRent1MouseClicked
        // TODO add your handling code here:
        Motorcycle motor1 = new Motorcycle("Vario", "Skuter");
        motor1.setHarga(50000);
        motor1.setTipeBbm("Pertamax");
        motor1.setTransmisi("Automatic");
        nama = motor1.getNama();
        transmisi = motor1.getTransmisi();
        harga = motor1.getHarga();
        bbm = motor1.getTipebbm();
        Rent rental = new Rent(nama.toString(), transmisi.toString(), bbm.toString(), harga);
        rental.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnRent1MouseClicked

    private void jBtnRent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnRent2MouseClicked
        // TODO add your handling code here:
        Motorcycle motor1 = new Motorcycle("Beat", "Skuter");
        motor1.setHarga(50000);
        motor1.setTipeBbm("Pertamax");
        motor1.setTransmisi("Automatic");
        nama = motor1.getNama();
        transmisi = motor1.getTransmisi();
        harga = motor1.getHarga();
        bbm = motor1.getTipebbm();
        Rent rental = new Rent(nama.toString(), transmisi.toString(), bbm.toString(), harga);
        rental.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnRent2MouseClicked

    private void jBtnRent3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnRent3MouseClicked
        // TODO add your handling code here:
        Motorcycle motor1 = new Motorcycle("Vixion", "Sport");
        motor1.setHarga(80000);
        motor1.setTipeBbm("Pertamax");
        motor1.setTransmisi("Kopling");
        nama = motor1.getNama();
        transmisi = motor1.getTransmisi();
        harga = motor1.getHarga();
        bbm = motor1.getTipebbm();
        Rent rental = new Rent(nama.toString(), transmisi.toString(), bbm.toString(), harga);
        rental.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnRent3MouseClicked

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
            java.util.logging.Logger.getLogger(Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Motor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carbg;
    private javax.swing.JButton jBtnRent1;
    private javax.swing.JButton jBtnRent2;
    private javax.swing.JButton jBtnRent3;
    private javax.swing.JLabel jLBbm1;
    private javax.swing.JLabel jLBbm2;
    private javax.swing.JLabel jLBbm3;
    private javax.swing.JLabel jLCars;
    private javax.swing.JLabel jLHarga1;
    private javax.swing.JLabel jLHarga2;
    private javax.swing.JLabel jLHarga3;
    private javax.swing.JLabel jLLogout;
    private javax.swing.JLabel jLMotor;
    private javax.swing.JLabel jLMotor1;
    private javax.swing.JLabel jLMotor2;
    private javax.swing.JLabel jLMotor3;
    private javax.swing.JLabel jLTransmisi1;
    private javax.swing.JLabel jLTransmisi2;
    private javax.swing.JLabel jLTransmisi3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}