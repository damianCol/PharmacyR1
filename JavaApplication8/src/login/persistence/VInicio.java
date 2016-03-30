
package login.persistence;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JRootPane;
import View.InterfaceSale;
import static sun.security.jgss.GSSUtil.login;
/**
 *
 * @author Daniel Higuera
 */
public class VInicio extends javax.swing.JFrame {

 
    public VInicio() {
        setUndecorated(true);
        initComponents();
         
        
         Dimension pantalla =Toolkit.getDefaultToolkit().getScreenSize();
         int heigth=pantalla.height;
         int width= pantalla.width;
         setLocationRelativeTo(null);
         setVisible(true);
            
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btExit = new javax.swing.JButton();
        btClient = new javax.swing.JButton();
        btAdmin = new javax.swing.JButton();
        lbNameDrs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setForeground(new java.awt.Color(255, 255, 255));

        btExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exitboton.png"))); // NOI18N
        btExit.setBorderPainted(false);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        btClient.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserIcon.png"))); // NOI18N
        btClient.setText("Customer");
        btClient.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btClient.setBorderPainted(false);
        btClient.setContentAreaFilled(false);
        btClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btClient.setIconTextGap(-3);
        btClient.setInheritsPopupMenu(true);
        btClient.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btClient.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientActionPerformed(evt);
            }
        });

        btAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdministradorIcon.png"))); // NOI18N
        btAdmin.setText("Admin");
        btAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btAdmin.setBorderPainted(false);
        btAdmin.setContentAreaFilled(false);
        btAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdmin.setIconTextGap(-3);
        btAdmin.setInheritsPopupMenu(true);
        btAdmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAdminMouseClicked(evt);
            }
        });
        btAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdminActionPerformed(evt);
            }
        });

        lbNameDrs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ilrInicio.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btClient, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbNameDrs)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btExit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNameDrs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClient, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdminActionPerformed
       
    }//GEN-LAST:event_btAdminActionPerformed

    private void btClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientActionPerformed
       LoginEmployee le = new LoginEmployee();
       le.setVisible(true);
       dispose();
    }//GEN-LAST:event_btClientActionPerformed

    private void btAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAdminMouseClicked
        LoginAdmin lg = new LoginAdmin();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_btAdminMouseClicked

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VInicio().setVisible(true);
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdmin;
    private javax.swing.JButton btClient;
    private javax.swing.JButton btExit;
    private javax.swing.JLabel lbNameDrs;
    // End of variables declaration//GEN-END:variables
}
