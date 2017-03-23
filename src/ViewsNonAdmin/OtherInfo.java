/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewsNonAdmin;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import ViewsNonAdmin.WeddingDetails;

/**
 *
 * @author LopezLaps
 */
public class OtherInfo extends javax.swing.JFrame {

    /**
     * Creates new form OtherInfo
     */
    public OtherInfo() {
        Themes.Theme.renderAluminium(OtherInfo.class.getName());
        Themes.Theme.setIcon(this);
        initComponents();
    }

    public void frameClose() {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_numberofguest = new javax.swing.JTextField();
        btn_oidone = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_specialrequestnotes = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_photocoverage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OTHER INFORMATION");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 153));
        jLabel16.setText("Number of Guest :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, -1));

        txt_numberofguest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_numberofguest.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_numberofguest.setPreferredSize(new java.awt.Dimension(5, 18));
        jPanel1.add(txt_numberofguest, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, 34));

        btn_oidone.setBackground(new java.awt.Color(255, 0, 153));
        btn_oidone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_oidone.setForeground(new java.awt.Color(255, 255, 255));
        btn_oidone.setText("Done");
        btn_oidone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oidoneActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oidone, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 160, 41));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 153));
        jLabel22.setText("Special/Request/Notes :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 170, -1));

        ta_specialrequestnotes.setColumns(20);
        ta_specialrequestnotes.setRows(5);
        jScrollPane1.setViewportView(ta_specialrequestnotes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 620, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 810, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wd.png_64x64.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/g.png_64x64.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 70, 70));

        lbl_photocoverage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pc2.png_64x64.png"))); // NOI18N
        lbl_photocoverage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_photocoverageMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_photocoverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 70, 70));

        jPanel2.setBackground(new java.awt.Color(255, 0, 153));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 350, -1));

        jPanel4.setBackground(new java.awt.Color(255, 0, 153));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 300, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/g.png_48x48.png"))); // NOI18N
        jLabel5.setText("OTHER INFORMATION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 50));

        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.png"))); // NOI18N
        jMenu2.setText("HOME");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu5.setBackground(new java.awt.Color(153, 153, 153));
        jMenu5.setBorder(null);
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin_icon2.png"))); // NOI18N
        jMenu5.setText("Admin");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setBorder(null);
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/terms_and_agreement.png"))); // NOI18N
        jMenu4.setText("Terms and condition");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(870, 621));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Boolean getOtherInformation() {
        DataObjects.WeddingDetails wedDetails = ViewsNonAdmin.WeddingDetails.weddingDetails;

        wedDetails.setNumberOfGuest(this.txt_numberofguest.getText());
        wedDetails.setSpecialRequestNotes(this.ta_specialrequestnotes.getText());

        return wedDetails.save();
    }

    private void btn_oidoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oidoneActionPerformed

        if (this.getOtherInformation()) {
            ViewsNonAdmin.WeddingDetails.weddingDetails = null;
            new Views.Home().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_btn_oidoneActionPerformed

    private void lbl_photocoverageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_photocoverageMouseClicked
        new ViewsNonAdmin.PhotoCoverage().setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_photocoverageMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        new Views.Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        ViewsAdmin.Login login = new ViewsAdmin.Login(this, true);
        login.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(OtherInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtherInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtherInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtherInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtherInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_oidone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_photocoverage;
    private javax.swing.JTextArea ta_specialrequestnotes;
    private javax.swing.JTextField txt_numberofguest;
    // End of variables declaration//GEN-END:variables
}
