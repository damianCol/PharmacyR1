
package login.persistence;
import java.awt.*;
import javax.swing.ImageIcon;

public class WelcomeFond extends javax.swing.JPanel {

    public WelcomeFond() {
        initComponents();
        
        this.setSize(1032, 596);
    }
    


    public void paintComponent(Graphics g)
        {
        Dimension tam = getSize();
        ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource("/Recursos/FondoInicio.jpg")).getImage());
        g.drawImage(ImagenFondo.getImage(), 0, 0, tam.width,tam.height,null) ;
        setOpaque(false);
        super.paintComponent(g);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
