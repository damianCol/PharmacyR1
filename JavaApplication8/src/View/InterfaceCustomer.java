package View;

import Persistence1.MSAccess;
import Logic.DatesCustomer;
import FlatFiles.FlatFileCustomer;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class InterfaceCustomer extends javax.swing.JFrame {
    private MSAccess dataFile;
    private ImageIcon iconNoPhoto;
    
    /**
     * Creates new form Interfaz
     */
    public InterfaceCustomer() {
        initComponents();
        labPhotoFilename.setVisible(false);
        this.setIconNoPhoto((ImageIcon)labPhoto.getIcon());

        this.setDataFile(new MSAccess());
        this.selectCustomer();
        setLocationRelativeTo(null);
        
       
    }

    /**
     * Get data file
     * @return data file
     */
    public MSAccess getDataFile() {
        return dataFile;
    }

    /**
     * Set data file
     * @param dataFile data file
     */
    public void setDataFile(MSAccess dataFile) {
        this.dataFile = dataFile;
    }

    /**
     * Get Image Icon
     * @return Image Icon
     */
    public ImageIcon getIconNoPhoto() {
        return iconNoPhoto;
    }

    /**
     * Set Image Icon
     * @param iconNoPhoto Image Icon
     */
    public void setIconNoPhoto(ImageIcon iconNoPhoto) {
        this.iconNoPhoto = iconNoPhoto;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupGender = new javax.swing.ButtonGroup();
        panPersonalInformations = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblDateBirth = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        labPhoto = new javax.swing.JLabel();
        radFemale = new javax.swing.JRadioButton();
        radMale = new javax.swing.JRadioButton();
        dateBirthday = new com.toedter.calendar.JDateChooser();
        labId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labPhotoFilename = new javax.swing.JLabel();
        butPhoto = new javax.swing.JButton();
        panCrud = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Empleados Usta");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panPersonalInformations.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        panPersonalInformations.setToolTipText("");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setText("Name:");

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLastName.setText("Lastname");

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGender.setText("Gender");

        lblDateBirth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDateBirth.setText("Date of birth");

        labPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer/view/photo/nophoto.jpg"))); // NOI18N

        GroupGender.add(radFemale);
        radFemale.setSelected(true);
        radFemale.setText("Femenino");

        GroupGender.add(radMale);
        radMale.setText("Masculino");

        labId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labId.setText("Identification:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        butPhoto.setText("Load Photo...");
        butPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPersonalInformationsLayout = new javax.swing.GroupLayout(panPersonalInformations);
        panPersonalInformations.setLayout(panPersonalInformationsLayout);
        panPersonalInformationsLayout.setHorizontalGroup(
            panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                        .addComponent(lblDateBirth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butPhoto)
                        .addGap(84, 84, 84))
                    .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                        .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName)
                            .addComponent(lblGender)
                            .addComponent(labId)
                            .addComponent(lblName))
                        .addGap(78, 78, 78)
                        .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                                .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                                        .addComponent(radFemale)
                                        .addGap(18, 18, 18)
                                        .addComponent(radMale))
                                    .addComponent(dateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(labPhotoFilename, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addComponent(labPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        panPersonalInformationsLayout.setVerticalGroup(
            panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                        .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLastName)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblGender)
                                    .addComponent(radFemale)
                                    .addComponent(radMale)))
                            .addComponent(labPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panPersonalInformationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(lblDateBirth))
                            .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(butPhoto))
                            .addGroup(panPersonalInformationsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPersonalInformationsLayout.createSequentialGroup()
                        .addComponent(labPhotoFilename, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panPersonalInformations, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 611, 224));

        panCrud.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operations ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search ...");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCrudLayout = new javax.swing.GroupLayout(panCrud);
        panCrud.setLayout(panCrudLayout);
        panCrudLayout.setHorizontalGroup(
            panCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCrudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFirst)
                .addGap(18, 18, 18)
                .addComponent(btnPrevious)
                .addGap(16, 16, 16)
                .addComponent(btnNext)
                .addGap(18, 18, 18)
                .addComponent(btnLast)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(10, 10, 10)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        panCrudLayout.setVerticalGroup(
            panCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCrudLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(panCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNew)
                    .addComponent(btnUpdate)))
        );

        getContentPane().add(panCrud, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 298, -1, -1));

        lblTitle.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblTitle.setText("Register customer");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 11, 361, 51));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/view/X_ico.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer/view/photo/Wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 630, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * New Employee record 
     * @param evt 
     */
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if (btnNew.getText().equals("New")) {
            this.newView();
        }
        else if (btnNew.getText().equals("Save")) {
            if (validateView()) {
                this.insertCustomer();

                btnNew.setText("New");
                btnFirst.setEnabled(true);
                btnPrevious.setEnabled(true);
                btnNext.setEnabled(true);
                btnLast.setEnabled(true);
                btnSearch.setEnabled(true);
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
            }
            else {
                JOptionPane.showMessageDialog(this, "Please, fill the requeried fields", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            this.getDataFile().getResultSet().first();
            this.updateView();
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
         try {
            if (!this.getDataFile().getResultSet().isFirst()) {
                this.getDataFile().getResultSet().previous();
                this.updateView();
            }
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if (!this.getDataFile().getResultSet().isLast()) {
                this.getDataFile().getResultSet().next();
                this.updateView();
            }
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        long id = Long.parseLong(JOptionPane.showInputDialog(
                "Please, write the customer id", "customer id"));
        if (id > 0) {
            this.searchCustomer(id);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       this.updateCustomer();
        JOptionPane.showMessageDialog(this, "Updated record!", "Update record",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (JOptionPane.showConfirmDialog(this, 
                "Are you sure to delete this record?", "Delete record", 
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

            this.deleteCustomer();
            JOptionPane.showMessageDialog(this, "Deleted record!", "Delete record",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void butPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPhotoActionPerformed
        JFileChooser fc = new JFileChooser();
        int select = fc.showOpenDialog(this);
        if (select == JFileChooser.APPROVE_OPTION) {
            try {
                File photoFile = fc.getSelectedFile();
                labPhotoFilename.setText(photoFile.getCanonicalPath());
                ImageIcon iconPhoto = new ImageIcon(labPhotoFilename.getText());
                labPhoto.setIcon(iconPhoto);
            } catch (IOException ex) {
                Logger.getLogger(InterfaceCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_butPhotoActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            this.getDataFile().getResultSet().last();
            this.updateView();
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLastActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupGender;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton butPhoto;
    private com.toedter.calendar.JDateChooser dateBirthday;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labId;
    private javax.swing.JLabel labPhoto;
    private javax.swing.JLabel labPhotoFilename;
    private javax.swing.JLabel lblDateBirth;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panCrud;
    private javax.swing.JPanel panPersonalInformations;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    /**
     * Validate the view for save
     * @return True is ok
     */
    private boolean validateView() {
        boolean validate = !(txtId.getText().equals("")
                || txtName.getText().equals("") 
                || txtLastName.getText().equals("")
                || (dateBirthday.getDate() == null));
                //|| (datHired.getDate() == null)
               // || txtSalary.getText().equals(""));
        return validate;
    }

    /**
     * Obtain the view data and tranfer it to the object
     */
    private DatesCustomer view2Object() {
        DatesCustomer datesCustomer = new DatesCustomer();

        datesCustomer.setId(Long.parseLong(txtId.getText()));
        datesCustomer.setName(txtName.getText());
        datesCustomer.setLastName(txtLastName.getText());
        datesCustomer.setPhoto(labPhotoFilename.getText());
        datesCustomer.setGender(radFemale.isSelected() ? 0 : 1);
        datesCustomer.setDateBirth(dateBirthday.getDate());
        //datesCustomer.setHiredDate(datHired.getDate());
        //datesCustomer.setSalary(Integer.parseInt(txtSalary.getText()));
        
        return datesCustomer;
    }

    /**
     * You obtain data from an object and pass it to the view
     */
    private void updateView() {
        if (this.getDataFile().getResultSet() == null) {
            this.newView();
        }
        else {
            this.object2View();
        }
    }

    /**
     * You prepare the view to enter a new datesCustomer data
     */
    private void newView() {
        txtId.setText("");
        txtName.setText("");
        txtLastName.setText("");
        labPhotoFilename.setText("");
        labPhoto.setIcon(this.getIconNoPhoto());
        radFemale.setSelected(true);
        dateBirthday.setDate(new Date(90, 0, 1));
        
        btnNew.setText("Save");
        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext.setEnabled(false);
        btnLast.setEnabled(false);
        btnSearch.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    /**
     * Result set -> object
     */
    private void object2View() {
        DatesCustomer datesCustomer = new DatesCustomer();
        try {
            datesCustomer.setId(this.getDataFile().getResultSet().getLong("Identification"));
            datesCustomer.setName(this.getDataFile().getResultSet().getString("Name"));
            datesCustomer.setLastName(this.getDataFile().getResultSet().getString("Lastname"));
            datesCustomer.setPhoto(
                    (this.getDataFile().getResultSet().getString("photo") == null) 
                            ? "" : this.getDataFile().getResultSet().getString("photo"));
            datesCustomer.setGender(this.getDataFile().getResultSet().getInt("Gender"));
            datesCustomer.setDateBirth(this.getDataFile().getResultSet().getDate("Date_of_birth"));
            this.object2View(datesCustomer);
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Show the object data into view
     * @param datesCustomer Employee to show
     */
    private void object2View(DatesCustomer datesCustomer) {
        txtId.setText("" + datesCustomer.getId());
        txtName.setText(datesCustomer.getName());
        txtLastName.setText(datesCustomer.getLastName());

        if (datesCustomer.getPhoto().equals("")) {
            labPhotoFilename.setText("");
            labPhoto.setIcon(this.getIconNoPhoto());
        }
        else {
            labPhotoFilename.setText(datesCustomer.getPhoto());
            ImageIcon iconPhoto = new ImageIcon(labPhotoFilename.getText());
            labPhoto.setIcon(iconPhoto);
        }
        
        radFemale.setSelected(datesCustomer.getGender() == 0);
        dateBirthday.setDate(datesCustomer.getDateBirth());
        //datHired.setDate(datesCustomer.getHiredDate());
        //txtSalary.setText("" + datesCustomer.getSalary());

             
    }

    /**
     * Select employees from DB
     */
    private void selectCustomer() {
        String query = "SELECT * FROM Customer";
        if (this.getDataFile().execute(query)) {
            try {
                this.getDataFile().getResultSet().next();
                this.updateView();
            } catch (SQLException ex) {
                Logger.getLogger(InterfaceCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Insert new datesCustomer
     */
    private void insertCustomer() {
        DatesCustomer datesCustomer = this.view2Object();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String query = "INSERT INTO Customer "
                + "(Identification, Name, Lastname, photo, Gender, Date_of_birth) "
                + "VALUES ("
                + datesCustomer.getId() + ", '"
                + datesCustomer.getName()+ "', '"
                + datesCustomer.getLastName() + "', '"
                + datesCustomer.getPhoto() + "', "
                + datesCustomer.getGender() + ", #"
                + dateFormat.format(datesCustomer.getDateBirth()) + "# )";
//                + dateFormat.format(datesCustomer.getHiredDate()) + "#, "
//                + datesCustomer.getSalary() + ")";
        if (this.getDataFile().execute(query)) {
            this.selectCustomer();
            this.searchCustomer(datesCustomer.getId());
        }
    }

    /**
     * Update datesCustomer
     */
    private void updateCustomer() {
        DatesCustomer datesCustomer = this.view2Object();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String query = "UPDATE Customer SET "
                + "Name = '" + datesCustomer.getName() + "', "
                + "Lastname = '" + datesCustomer.getLastName() + "', "
                + "photo = '" + datesCustomer.getPhoto() + "', "
                + "Gender = " + datesCustomer.getGender() + ", "
                + "Date_of_birth = #" + dateFormat.format(datesCustomer.getDateBirth()) + "#, "
//                + "hiredDate = #" + dateFormat.format(datesCustomer.getHiredDate()) + "#, "
//                + "salary = " + datesCustomer.getSalary() + " "
                + "WHERE Identification = " + datesCustomer.getId();
        if (this.getDataFile().execute(query)) {
            this.selectCustomer();
            this.searchCustomer(datesCustomer.getId());
        }
    }

    /**
     * Delete datesCustomer
     */
    private void deleteCustomer() {
        DatesCustomer datesCustomer = this.view2Object();
        String query = "DELETE * FROM Customer WHERE Identification = " + datesCustomer.getId();
        if (this.getDataFile().execute(query)) {
            this.selectCustomer();
        }        
    }

    /**
     * Search datesCustomer by id
     * @param id Employee id
     */
    private void searchCustomer(long id) {
        boolean find = false;
        try {
            if (this.getDataFile().getResultSet() != null) {
                Long lastId = this.getDataFile().getResultSet().getLong("Identification");
                this.getDataFile().getResultSet().beforeFirst();
                while (this.getDataFile().getResultSet().next()) {
                    if (this.getDataFile().getResultSet().getLong("Identification") == id) {
                        find = true;
                        break;
                    }
                }
                if (find) {
                    this.updateView();
                }
                else {
                    this.getDataFile().getResultSet().first();
                    this.searchCustomer(lastId);
                    JOptionPane.showMessageDialog(this, "Customer " + id + " was not found!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
