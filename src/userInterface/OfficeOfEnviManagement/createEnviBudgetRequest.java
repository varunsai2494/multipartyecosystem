/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.OfficeOfEnviManagement;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.OfficeOfEnviManagementOrganization;
import Business.Organization.OfficeOfNuclearEnergyOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Preetham Reddy
 */
public class createEnviBudgetRequest extends javax.swing.JPanel {

    /**
     * Creates new form createEnviBudgetRequest
     */
    private JPanel userProcessContainer;
    private OfficeOfEnviManagementOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    public createEnviBudgetRequest(JPanel userProcessContainer, UserAccount account, OfficeOfEnviManagementOrganization organization,  Enterprise enterprise, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.network = network;
        this.enterprise = enterprise;
        this.userAccount = account;
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

        jButton1 = new javax.swing.JButton();

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(556, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
