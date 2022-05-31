/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.awt.Color;

/**
 *
 * @author tatat
 */
public class Avatar extends javax.swing.JFrame {

    /**
     * Creates new form Avatar
     */
    public Avatar() {
        initComponents();
        setSize(530, 580);
        setLocationRelativeTo(null);
        setVisible(true);
                setBackground(Color.GREEN);

    }

    private String cabecaAvatar;
    private String corpoAvatar;

    public String getCorpoAvatar() {
        return corpoAvatar;
    }

    public void setCorpoAvatar(String corpoAvatar) {
        this.corpoAvatar = corpoAvatar;
    }

    public String getCabecaAvatar() {
        return cabecaAvatar;
    }

    public void setCabecaAvatar(String cabecaAvatar) {
        this.cabecaAvatar = cabecaAvatar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBIDaslon = new javax.swing.JButton();
        jBCbran = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBIDaslon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/CM.png"))); // NOI18N
        jBIDaslon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIDaslonActionPerformed(evt);
            }
        });
        getContentPane().add(jBIDaslon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 56, 51));

        jBCbran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/CB.png"))); // NOI18N
        jBCbran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCbranActionPerformed(evt);
            }
        });
        getContentPane().add(jBCbran, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 57, 51));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel2.setText("Escolha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 77, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/astrologia-astrocentro_1788.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 270));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/scary-snake-pictures-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 520, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIDaslonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIDaslonActionPerformed
                new Snake("cabeca.png", "bola.png");

    }//GEN-LAST:event_jBIDaslonActionPerformed

    private void jBCbranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCbranActionPerformed
              new Snake("002.png", "001.png");

    }//GEN-LAST:event_jBCbranActionPerformed

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
            java.util.logging.Logger.getLogger(Avatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Avatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Avatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Avatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avatar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCbran;
    private javax.swing.JButton jBIDaslon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
