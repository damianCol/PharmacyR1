
package login.persistence;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class LoginAdmin extends javax.swing.JFrame {
    
    public static String user = "";
    public static String pass = "";

    public LoginAdmin() {
        initComponents();
        
           
    }        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pa1 = new javax.swing.JPanel();
        lbPass = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lbLog = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        pa1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbPass.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbPass.setText("Password:");

        lbUser.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbUser.setText("User:");

        lbLog.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbLog.setText("LOGIN");

        txtUser.setBackground(new java.awt.Color(204, 255, 255));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(204, 255, 255));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });

        btEnter.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btEnter.setText("Enter");
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pa1Layout = new javax.swing.GroupLayout(pa1);
        pa1.setLayout(pa1Layout);
        pa1Layout.setHorizontalGroup(
            pa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pa1Layout.createSequentialGroup()
                .addGroup(pa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pa1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUser)
                            .addGroup(pa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btEnter)
                                .addGroup(pa1Layout.createSequentialGroup()
                                    .addComponent(lbPass)
                                    .addGap(41, 41, 41)
                                    .addGroup(pa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPass)
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pa1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lbLog)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pa1Layout.setVerticalGroup(
            pa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pa1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lbLog)
                .addGap(29, 29, 29)
                .addGroup(pa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEnter)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(371, 254));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        // TODO add your handling code here:        
        String usuario = txtUser.getText().trim();        
        String contraseña = new String(txtPass.getPassword());
        
        if( usuario.equalsIgnoreCase(user) && contraseña.equalsIgnoreCase(pass) )
            {
            MainAdmin b = new MainAdmin();
            b.setVisible(true);
            dispose();
            }
        else if( usuario.isEmpty() && contraseña.isEmpty() )
            {
            JOptionPane.showMessageDialog(null, "Ingrese Usuario y Contraseña");
            }
        else if( usuario != user && contraseña != pass )
            {
            JOptionPane.showMessageDialog(null, "Usuario y Contraseña Incorrectos", "Error Al Ingresar", JOptionPane.ERROR_MESSAGE);
            }
        else if( usuario != user )
            {
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto", "Usuario No Existe", JOptionPane.ERROR_MESSAGE);
            }
        else if( contraseña != pass )
            {
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Contraseña Mal Escrita", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btEnterActionPerformed

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ( c == 10 )
            {
            txtPass.requestFocus();
            }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        // TODO add your handling code here:
        
        int c = evt.getKeyChar();
        if( c==10 )
        {
        String usuario = txtUser.getText().trim();        
        String contraseña = new String(txtPass.getPassword());
        
        if( usuario.equalsIgnoreCase(user) && contraseña.equalsIgnoreCase(pass) )
            {
            MainAdmin b = new MainAdmin();
            b.setVisible(true);
            dispose();
            }
        else if( usuario.isEmpty() && contraseña.isEmpty() )
            {
            JOptionPane.showMessageDialog(null, "Ingrese Usuario y Contraseña");
            }
        else if( usuario != user && contraseña != pass )
            {
            JOptionPane.showMessageDialog(null, "Usuario y Contraseña Incorrectos", "Error Al Ingresar", JOptionPane.ERROR_MESSAGE);
            }
        else if( usuario != user )
            {
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto", "Usuario No Existe", JOptionPane.ERROR_MESSAGE);
            }
        else if( contraseña != pass )
            {
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Contraseña Mal Escrita", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtPassKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnter;
    private javax.swing.JLabel lbLog;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pa1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
