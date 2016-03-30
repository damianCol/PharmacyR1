
package login.persistence;



import View.InterfaceCustomer;
import View.EmpleadoCli;
import View.Interfaz;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import View.InterfazProduct;
import View.InterfaceSale;

public class MainAdmin extends javax.swing.JFrame {

    public static String DcmtoExcel;

    public MainAdmin() {
        initComponents();


    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEmplo = new javax.swing.JLabel();
        btnEmployees = new javax.swing.JLabel();
        lbSelli = new javax.swing.JLabel();
        btnSellProd = new javax.swing.JLabel();
        lbClient = new javax.swing.JLabel();
        btClient = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbRegisPro = new javax.swing.JLabel();
        btn_Product = new javax.swing.JLabel();
        btExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Menu_Areas1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        lbEmplo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbEmplo.setText("Register Employees");

        btnEmployees.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btnEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/empleado123.png"))); // NOI18N
        btnEmployees.setToolTipText("");
        btnEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeesMouseClicked(evt);
            }
        });

        lbSelli.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbSelli.setText("Selling products");

        btnSellProd.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btnSellProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/carrito.png"))); // NOI18N
        btnSellProd.setToolTipText("");
        btnSellProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSellProdMouseClicked(evt);
            }
        });

        lbClient.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbClient.setText("Client");

        btClient.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cliente.png"))); // NOI18N
        btClient.setToolTipText("");
        btClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btClientMouseClicked(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Trajan Pro", 1, 36)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Pharmacy");

        lbRegisPro.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lbRegisPro.setText("Register Product");

        btn_Product.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        btn_Product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ProdImg.png"))); // NOI18N
        btn_Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ProductMouseClicked(evt);
            }
        });

        btExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btExit.setText("Logout");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jMenu1.setText("Opcions");

        Menu_Areas1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        Menu_Areas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuSalir.png"))); // NOI18N
        Menu_Areas1.setText("Exit");
        Menu_Areas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Areas1ActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Areas1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Product)
                            .addComponent(lbRegisPro))
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSelli)
                            .addComponent(btnSellProd)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmployees)
                        .addGap(176, 176, 176)
                        .addComponent(btClient))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbEmplo)
                                .addGap(197, 197, 197)
                                .addComponent(lbClient)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExit)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btExit))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(btnEmployees)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbRegisPro)
                            .addComponent(lbSelli))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Product)
                            .addComponent(btnSellProd))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmplo)
                            .addComponent(lbClient))
                        .addGap(36, 36, 36)
                        .addComponent(btClient)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(535, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSellProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSellProdMouseClicked
        // TODO add your handling code here:     
            InterfaceSale is = new InterfaceSale();
            is.setVisible(true);
     
    }//GEN-LAST:event_btnSellProdMouseClicked

    private void btClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClientMouseClicked
        // TODO add your handling code here:
        InterfaceCustomer ic = new InterfaceCustomer();
        ic.setVisible(true);
    }//GEN-LAST:event_btClientMouseClicked

    private void btn_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductMouseClicked
        InterfazProduct ip = new InterfazProduct();
        ip.setVisible(true);
    }//GEN-LAST:event_btn_ProductMouseClicked

    private void Menu_Areas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Areas1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Menu_Areas1ActionPerformed

    private void btnEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeesMouseClicked
        // TODO add your handling code here:
        Interfaz ec = new Interfaz();
        ec.setVisible(true);
    }//GEN-LAST:event_btnEmployeesMouseClicked

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
         VInicio vi = new VInicio();
         vi.setVisible(true);
         dispose();
    }//GEN-LAST:event_btExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_Areas1;
    private javax.swing.JLabel btClient;
    private javax.swing.JButton btExit;
    private javax.swing.JLabel btnEmployees;
    private javax.swing.JLabel btnSellProd;
    private javax.swing.JLabel btn_Product;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbClient;
    private javax.swing.JLabel lbEmplo;
    private javax.swing.JLabel lbRegisPro;
    private javax.swing.JLabel lbSelli;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
