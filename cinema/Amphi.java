/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;


/**
 *
 * @author christinecarylchen
 */
public class Amphi extends javax.swing.JFrame {

    
    
    /**
     * Creates new form Amphi
     */
    public Amphi() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAmphi = new javax.swing.JPanel();
        BeforeIFall = new javax.swing.JPanel();
        AmphibuttonBeforeIFall = new javax.swing.JButton();
        AmphipanelschedBeforeIFall = new javax.swing.JPanel();
        AmphilabelBeforeIFall = new javax.swing.JLabel();
        AmphilabelGenreBeforeIFall = new javax.swing.JLabel();
        AmphilabelRTimeBeforeIFall = new javax.swing.JLabel();
        AmphilabelSchedBeforeIFall = new javax.swing.JLabel();
        AmphibuttonReserveBeforeIFall = new javax.swing.JButton();
        AmphilabelShowBeforeIFall = new javax.swing.JLabel();
        DespicableMe = new javax.swing.JPanel();
        AmphibuttonDespicableMe = new javax.swing.JButton();
        AmphipanelschedDespicableMe = new javax.swing.JPanel();
        AmphilabelDespicableMe = new javax.swing.JLabel();
        AmphilabelGenreDespicableMe = new javax.swing.JLabel();
        AmphilabelRTimeDespicableMe = new javax.swing.JLabel();
        AmphilabelSchedDespicableMe = new javax.swing.JLabel();
        AmphibuttonReserveDespicableMe = new javax.swing.JButton();
        AmphilabelShowDespicableMe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BeforeIFall.setBackground(new java.awt.Color(255, 255, 255));

        AmphibuttonBeforeIFall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/posters/posterBeforeIFall.png"))); // NOI18N
        AmphibuttonBeforeIFall.setBorderPainted(false);
        AmphibuttonBeforeIFall.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonRolloverPressed/buttonBeforeIFallPressed.png"))); // NOI18N
        AmphibuttonBeforeIFall.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonRolloverPressed/buttonBeforeIFallRollover.png"))); // NOI18N

        AmphipanelschedBeforeIFall.setBackground(new java.awt.Color(255, 255, 255));

        AmphilabelBeforeIFall.setFont(new java.awt.Font("Novecento sans wide", 1, 13)); // NOI18N
        AmphilabelBeforeIFall.setForeground(new java.awt.Color(34, 66, 180));
        AmphilabelBeforeIFall.setText("BEFORE I FALL");

        AmphilabelGenreBeforeIFall.setBackground(new java.awt.Color(255, 255, 255));
        AmphilabelGenreBeforeIFall.setFont(new java.awt.Font("Novecento sans wide", 0, 10)); // NOI18N
        AmphilabelGenreBeforeIFall.setForeground(new java.awt.Color(102, 102, 102));
        AmphilabelGenreBeforeIFall.setText("FANTASY | MYSTERY");

        AmphilabelRTimeBeforeIFall.setBackground(new java.awt.Color(255, 255, 255));
        AmphilabelRTimeBeforeIFall.setFont(new java.awt.Font("Novecento sans wide", 0, 10)); // NOI18N
        AmphilabelRTimeBeforeIFall.setForeground(new java.awt.Color(102, 102, 102));
        AmphilabelRTimeBeforeIFall.setText("1 HOUR 39 MINUTES");

        AmphilabelSchedBeforeIFall.setBackground(new java.awt.Color(255, 255, 255));
        AmphilabelSchedBeforeIFall.setFont(new java.awt.Font("Novecento sans wide", 1, 10)); // NOI18N
        AmphilabelSchedBeforeIFall.setForeground(new java.awt.Color(249, 115, 0));
        AmphilabelSchedBeforeIFall.setText("SCHEDULE:");

        AmphibuttonReserveBeforeIFall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/buttonReserveDark.png"))); // NOI18N
        AmphibuttonReserveBeforeIFall.setBorder(null);
        AmphibuttonReserveBeforeIFall.setBorderPainted(false);
        AmphibuttonReserveBeforeIFall.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/buttonReserveLight.png"))); // NOI18N
        AmphibuttonReserveBeforeIFall.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/buttonReserveLight.png"))); // NOI18N
        AmphibuttonReserveBeforeIFall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmphibuttonReserveBeforeIFallActionPerformed(evt);
            }
        });

        AmphilabelShowBeforeIFall.setBackground(new java.awt.Color(255, 255, 255));
        AmphilabelShowBeforeIFall.setFont(new java.awt.Font("Novecento sans wide", 0, 10)); // NOI18N
        AmphilabelShowBeforeIFall.setForeground(new java.awt.Color(102, 102, 102));
        AmphilabelShowBeforeIFall.setText("5:55 PM");

        javax.swing.GroupLayout AmphipanelschedBeforeIFallLayout = new javax.swing.GroupLayout(AmphipanelschedBeforeIFall);
        AmphipanelschedBeforeIFall.setLayout(AmphipanelschedBeforeIFallLayout);
        AmphipanelschedBeforeIFallLayout.setHorizontalGroup(
            AmphipanelschedBeforeIFallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmphipanelschedBeforeIFallLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AmphipanelschedBeforeIFallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AmphilabelShowBeforeIFall)
                    .addComponent(AmphibuttonReserveBeforeIFall)
                    .addComponent(AmphilabelSchedBeforeIFall)
                    .addComponent(AmphilabelRTimeBeforeIFall)
                    .addComponent(AmphilabelGenreBeforeIFall)
                    .addComponent(AmphilabelBeforeIFall, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AmphipanelschedBeforeIFallLayout.setVerticalGroup(
            AmphipanelschedBeforeIFallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmphipanelschedBeforeIFallLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AmphilabelBeforeIFall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmphilabelGenreBeforeIFall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmphilabelRTimeBeforeIFall)
                .addGap(26, 26, 26)
                .addComponent(AmphilabelSchedBeforeIFall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmphilabelShowBeforeIFall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AmphibuttonReserveBeforeIFall)
                .addContainerGap())
        );

        javax.swing.GroupLayout BeforeIFallLayout = new javax.swing.GroupLayout(BeforeIFall);
        BeforeIFall.setLayout(BeforeIFallLayout);
        BeforeIFallLayout.setHorizontalGroup(
            BeforeIFallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeforeIFallLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AmphibuttonBeforeIFall, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmphipanelschedBeforeIFall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BeforeIFallLayout.setVerticalGroup(
            BeforeIFallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeforeIFallLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BeforeIFallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AmphipanelschedBeforeIFall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BeforeIFallLayout.createSequentialGroup()
                        .addComponent(AmphibuttonBeforeIFall, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        DespicableMe.setBackground(new java.awt.Color(255, 255, 255));

        AmphibuttonDespicableMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/posters/posterDespicableMe3.png"))); // NOI18N
        AmphibuttonDespicableMe.setBorderPainted(false);
        AmphibuttonDespicableMe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonRolloverPressed/buttonDM3Pressed.png"))); // NOI18N
        AmphibuttonDespicableMe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonRolloverPressed/buttonDM3Rollover.png"))); // NOI18N
        AmphibuttonDespicableMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmphibuttonDespicableMeActionPerformed(evt);
            }
        });

        AmphipanelschedDespicableMe.setBackground(new java.awt.Color(255, 255, 255));

        AmphilabelDespicableMe.setFont(new java.awt.Font("Novecento sans wide", 1, 13)); // NOI18N
        AmphilabelDespicableMe.setForeground(new java.awt.Color(34, 66, 180));
        AmphilabelDespicableMe.setText("DESPICABLE ME 3");

        AmphilabelGenreDespicableMe.setBackground(new java.awt.Color(255, 255, 255));
        AmphilabelGenreDespicableMe.setFont(new java.awt.Font("Novecento sans wide", 0, 10)); // NOI18N
        AmphilabelGenreDespicableMe.setForeground(new java.awt.Color(102, 102, 102));
        AmphilabelGenreDespicableMe.setText("SCIENCE FICTION | ACTION");

        AmphilabelRTimeDespicableMe.setBackground(new java.awt.Color(255, 255, 255));
        AmphilabelRTimeDespicableMe.setFont(new java.awt.Font("Novecento sans wide", 0, 10)); // NOI18N
        AmphilabelRTimeDespicableMe.setForeground(new java.awt.Color(102, 102, 102));
        AmphilabelRTimeDespicableMe.setText("1 HOUR 36 MINUTES");
        AmphilabelRTimeDespicableMe.setToolTipText("");

        AmphilabelSchedDespicableMe.setBackground(new java.awt.Color(255, 255, 255));
        AmphilabelSchedDespicableMe.setFont(new java.awt.Font("Novecento sans wide", 1, 10)); // NOI18N
        AmphilabelSchedDespicableMe.setForeground(new java.awt.Color(249, 115, 0));
        AmphilabelSchedDespicableMe.setText("SCHEDULE:");

        AmphibuttonReserveDespicableMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/buttonReserveDark.png"))); // NOI18N
        AmphibuttonReserveDespicableMe.setBorder(null);
        AmphibuttonReserveDespicableMe.setBorderPainted(false);
        AmphibuttonReserveDespicableMe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/buttonReserveLight.png"))); // NOI18N
        AmphibuttonReserveDespicableMe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesHome/buttonReserveLight.png"))); // NOI18N
        AmphibuttonReserveDespicableMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmphibuttonReserveDespicableMeActionPerformed(evt);
            }
        });

        AmphilabelShowDespicableMe.setBackground(new java.awt.Color(255, 255, 255));
        AmphilabelShowDespicableMe.setFont(new java.awt.Font("Novecento sans wide", 0, 10)); // NOI18N
        AmphilabelShowDespicableMe.setForeground(new java.awt.Color(102, 102, 102));
        AmphilabelShowDespicableMe.setText("4:00 PM");

        javax.swing.GroupLayout AmphipanelschedDespicableMeLayout = new javax.swing.GroupLayout(AmphipanelschedDespicableMe);
        AmphipanelschedDespicableMe.setLayout(AmphipanelschedDespicableMeLayout);
        AmphipanelschedDespicableMeLayout.setHorizontalGroup(
            AmphipanelschedDespicableMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmphipanelschedDespicableMeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AmphipanelschedDespicableMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AmphipanelschedDespicableMeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(AmphipanelschedDespicableMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AmphilabelDespicableMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AmphilabelGenreDespicableMe)
                            .addComponent(AmphilabelRTimeDespicableMe)
                            .addComponent(AmphilabelSchedDespicableMe)
                            .addComponent(AmphibuttonReserveDespicableMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(AmphipanelschedDespicableMeLayout.createSequentialGroup()
                        .addComponent(AmphilabelShowDespicableMe)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        AmphipanelschedDespicableMeLayout.setVerticalGroup(
            AmphipanelschedDespicableMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmphipanelschedDespicableMeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(AmphilabelDespicableMe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmphilabelGenreDespicableMe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmphilabelRTimeDespicableMe)
                .addGap(26, 26, 26)
                .addComponent(AmphilabelSchedDespicableMe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmphilabelShowDespicableMe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AmphibuttonReserveDespicableMe)
                .addContainerGap())
        );

        javax.swing.GroupLayout DespicableMeLayout = new javax.swing.GroupLayout(DespicableMe);
        DespicableMe.setLayout(DespicableMeLayout);
        DespicableMeLayout.setHorizontalGroup(
            DespicableMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DespicableMeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AmphibuttonDespicableMe, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmphipanelschedDespicableMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DespicableMeLayout.setVerticalGroup(
            DespicableMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DespicableMeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AmphibuttonDespicableMe, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(AmphipanelschedDespicableMe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelAmphiLayout = new javax.swing.GroupLayout(panelAmphi);
        panelAmphi.setLayout(panelAmphiLayout);
        panelAmphiLayout.setHorizontalGroup(
            panelAmphiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAmphiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(DespicableMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BeforeIFall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        panelAmphiLayout.setVerticalGroup(
            panelAmphiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAmphiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelAmphiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DespicableMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BeforeIFall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(319, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAmphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAmphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmphibuttonReserveDespicableMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmphibuttonReserveDespicableMeActionPerformed
        AmphiDespicableMe3 AmphiDespicableMe3 = new AmphiDespicableMe3();
        AmphiDespicableMe3.setVisible(true);
    }//GEN-LAST:event_AmphibuttonReserveDespicableMeActionPerformed

    private void AmphibuttonReserveBeforeIFallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmphibuttonReserveBeforeIFallActionPerformed
        AmphiBeforeIFall AmphiBeforeIFall = new AmphiBeforeIFall();
        AmphiBeforeIFall.setVisible(true);
    }//GEN-LAST:event_AmphibuttonReserveBeforeIFallActionPerformed

    private void AmphibuttonDespicableMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmphibuttonDespicableMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmphibuttonDespicableMeActionPerformed

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
            java.util.logging.Logger.getLogger(Amphi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Amphi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Amphi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Amphi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Amphi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmphibuttonBeforeIFall;
    private javax.swing.JButton AmphibuttonDespicableMe;
    private javax.swing.JButton AmphibuttonReserveBeforeIFall;
    private javax.swing.JButton AmphibuttonReserveDespicableMe;
    private javax.swing.JLabel AmphilabelBeforeIFall;
    private javax.swing.JLabel AmphilabelDespicableMe;
    private javax.swing.JLabel AmphilabelGenreBeforeIFall;
    private javax.swing.JLabel AmphilabelGenreDespicableMe;
    private javax.swing.JLabel AmphilabelRTimeBeforeIFall;
    private javax.swing.JLabel AmphilabelRTimeDespicableMe;
    private javax.swing.JLabel AmphilabelSchedBeforeIFall;
    private javax.swing.JLabel AmphilabelSchedDespicableMe;
    private javax.swing.JLabel AmphilabelShowBeforeIFall;
    private javax.swing.JLabel AmphilabelShowDespicableMe;
    private javax.swing.JPanel AmphipanelschedBeforeIFall;
    private javax.swing.JPanel AmphipanelschedDespicableMe;
    private javax.swing.JPanel BeforeIFall;
    private javax.swing.JPanel DespicableMe;
    private javax.swing.JPanel panelAmphi;
    // End of variables declaration//GEN-END:variables
}
