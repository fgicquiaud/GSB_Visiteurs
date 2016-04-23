/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Anas
 */
public class Visiteurs extends javax.swing.JFrame {
DefaultComboBoxModel modeleListeVisiteurs;

    /**
     * Creates new form Visiteurs
     */
    public Visiteurs() {
        initComponents();
        modeleListeVisiteurs = new DefaultComboBoxModel();
        jComboBoxListeVisiteurs.setModel(modeleListeVisiteurs);

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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButtonOK = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomVisiteur = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrenomVisiteur = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAdresseVisiteur = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCPVisiteur = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldVilleVisiteur = new javax.swing.JTextField();
        jComboBoxSecteurVisiteur = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxLaboVisiteur = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jButtonPrecedent = new javax.swing.JButton();
        jButtonSuivant = new javax.swing.JButton();
        jButtonFermer = new javax.swing.JButton();
        jComboBoxListeVisiteurs = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel1.setText("Visiteurs");

        jLabel2.setText("Recherche");

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jLabel3.setText("Nom");

        jTextFieldNomVisiteur.setEditable(false);
        jTextFieldNomVisiteur.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextFieldNomVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomVisiteurActionPerformed(evt);
            }
        });

        jLabel4.setText("Prenom");

        jTextFieldPrenomVisiteur.setEditable(false);
        jTextFieldPrenomVisiteur.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        jLabel5.setText("Adresse");

        jTextFieldAdresseVisiteur.setEditable(false);
        jTextFieldAdresseVisiteur.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        jLabel6.setText("CP");

        jTextFieldCPVisiteur.setEditable(false);
        jTextFieldCPVisiteur.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        jLabel8.setText("Ville");

        jTextFieldVilleVisiteur.setEditable(false);
        jTextFieldVilleVisiteur.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        jComboBoxSecteurVisiteur.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxSecteurVisiteur.setForeground(Color.BLACK);
        jComboBoxSecteurVisiteur.setToolTipText("");
        jComboBoxSecteurVisiteur.setEnabled(false);
        jComboBoxSecteurVisiteur.setOpaque(false);
        jComboBoxSecteurVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSecteurVisiteurActionPerformed(evt);
            }
        });

        jLabel9.setText("Secteur");

        jComboBoxLaboVisiteur.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxLaboVisiteur.setForeground(Color.BLACK);
        jComboBoxLaboVisiteur.setEnabled(false);
        jComboBoxLaboVisiteur.setOpaque(false);
        jComboBoxLaboVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLaboVisiteurActionPerformed(evt);
            }
        });

        jLabel10.setText("Labo");

        jButtonPrecedent.setText("Précédent");

        jButtonSuivant.setText("Suivant");

        jButtonFermer.setText("Fermer");
        jButtonFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFermerActionPerformed(evt);
            }
        });

        jComboBoxListeVisiteurs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxListeVisiteurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxListeVisiteursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxListeVisiteurs, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonOK))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAdresseVisiteur)
                            .addComponent(jTextFieldPrenomVisiteur)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCPVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8))
                                    .addComponent(jComboBoxSecteurVisiteur, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                    .addComponent(jComboBoxLaboVisiteur, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addComponent(jTextFieldVilleVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonPrecedent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSuivant))
                            .addComponent(jTextFieldNomVisiteur, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 16, Short.MAX_VALUE)
                                .addComponent(jButtonFermer)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonOK)
                    .addComponent(jComboBoxListeVisiteurs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNomVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPrenomVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAdresseVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldCPVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jTextFieldVilleVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxSecteurVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLaboVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrecedent)
                    .addComponent(jButtonSuivant)
                    .addComponent(jButtonFermer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerActionPerformed
        
    }//GEN-LAST:event_jButtonFermerActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jComboBoxListeVisiteursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListeVisiteursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxListeVisiteursActionPerformed

    private void jComboBoxSecteurVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSecteurVisiteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSecteurVisiteurActionPerformed

    private void jComboBoxLaboVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLaboVisiteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLaboVisiteurActionPerformed

    private void jTextFieldNomVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomVisiteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomVisiteurActionPerformed

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
            java.util.logging.Logger.getLogger(Visiteurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visiteurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visiteurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visiteurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visiteurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonPrecedent;
    private javax.swing.JButton jButtonSuivant;
    private javax.swing.JComboBox jComboBoxLaboVisiteur;
    private javax.swing.JComboBox jComboBoxListeVisiteurs;
    private javax.swing.JComboBox jComboBoxSecteurVisiteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldAdresseVisiteur;
    private javax.swing.JTextField jTextFieldCPVisiteur;
    private javax.swing.JTextField jTextFieldNomVisiteur;
    private javax.swing.JTextField jTextFieldPrenomVisiteur;
    private javax.swing.JTextField jTextFieldVilleVisiteur;
    // End of variables declaration//GEN-END:variables

    public DefaultComboBoxModel getModeleListeVisiteurs() {
        return modeleListeVisiteurs;
    }

    public JComboBox getjComboBoxListeVisiteurs() {
        return jComboBoxListeVisiteurs;
    }

    public JComboBox getjComboBoxLaboVisiteur() {
        return jComboBoxLaboVisiteur;
    }

    public JComboBox getjComboBoxSecteurVisiteur() {
        return jComboBoxSecteurVisiteur;
    }

    public JTextField getjTextFieldAdresseVisiteur() {
        return jTextFieldAdresseVisiteur;
    }

    public JTextField getjTextFieldCPVisiteur() {
        return jTextFieldCPVisiteur;
    }

    public JTextField getjTextFieldNomVisiteur() {
        return jTextFieldNomVisiteur;
    }

    public JTextField getjTextFieldPrenomVisiteur() {
        return jTextFieldPrenomVisiteur;
    }

    public JTextField getjTextFieldVilleVisiteur() {
        return jTextFieldVilleVisiteur;
    }

    public JButton getjButtonFermer() {
        return jButtonFermer;
    }

    public JButton getjButtonOK() {
        return jButtonOK;
    }

    public JButton getjButtonPrecedent() {
        return jButtonPrecedent;
    }

    public JButton getjButtonSuivant() {
        return jButtonSuivant;
    }
    
}
