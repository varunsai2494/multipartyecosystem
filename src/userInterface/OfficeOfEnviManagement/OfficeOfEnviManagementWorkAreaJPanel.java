/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.OfficeOfEnviManagement;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BudgetOrganization;
import Business.Organization.OfficeOfEnviManagementOrganization;
import Business.Organization.RevenueOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userInterface.OfficeOfNuclearEnergy.createNuclearBudgetRequestJpanel;

/**
 *
 * @author Preetham Reddy
 */
public class OfficeOfEnviManagementWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OfficeOfEnviManagementWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private OfficeOfEnviManagementOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    public OfficeOfEnviManagementWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, OfficeOfEnviManagementOrganization organization,  Enterprise enterprise, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network=network;
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateTable(){
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createRequestButton = new javax.swing.JButton();

        createRequestButton.setText("Create envi Budget Request");
        createRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRequestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(469, Short.MAX_VALUE)
                .addComponent(createRequestButton)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(createRequestButton)
                .addGap(128, 128, 128))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRequestButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("RequestLabTestJPanel", new createEnviBudgetRequest(userProcessContainer, userAccount,organization,enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createRequestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createRequestButton;
    // End of variables declaration//GEN-END:variables
}
