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
import Business.Organization.OfficeOfNuclearEnergyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BudgetWorkRequest;
import Business.WorkQueue.certificateWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import userInterface.Army.ArmyWorkAreaJPanel;

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
        categoryVal.addItem("Transport Waste");
        categoryVal.addItem("Incenerate Waste");
        categoryVal.addItem("Procure Vheicles/ maintain veheicles");
        categoryVal.addItem("Recruit man power");
        categoryVal.addItem("Research & Development");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionVal = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        totalFundVal = new javax.swing.JTextPane();
        titleLabel = new javax.swing.JLabel();
        categoryVal = new javax.swing.JComboBox<String>();
        categoryLabel = new javax.swing.JLabel();
        createbtn = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageVal = new javax.swing.JTextPane();

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(descriptionVal);

        jScrollPane3.setViewportView(totalFundVal);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLabel.setText("Create Environment Budget Request");

        categoryLabel.setText("Category: ");

        createbtn.setText("create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        messageLabel.setText("Message:");

        descriptionLabel.setText("Description:");

        priceLabel.setText("Total Fund Request:");

        jScrollPane1.setViewportView(messageVal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceLabel)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(messageLabel)
                                            .addComponent(categoryLabel)
                                            .addComponent(descriptionLabel))
                                        .addGap(41, 41, 41)))
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(categoryVal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(titleLabel)))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(289, 376, Short.MAX_VALUE)
                    .addComponent(createbtn)
                    .addGap(252, 252, 252)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryLabel))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(messageLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel))
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addGap(96, 96, 96))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(287, 287, 287)
                    .addComponent(createbtn)
                    .addContainerGap(95, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OfficeOfEnviManagementWorkAreaJPanel dwjp = (OfficeOfEnviManagementWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        String message = messageVal.getText();
        String description = descriptionVal.getText();
        String totalFundRequest = totalFundVal.getText();
        BudgetWorkRequest request = new BudgetWorkRequest();
        request.setMessage(message);
        request.setDescription(description);
        request.setTotalBudgetRequest(Integer.parseInt(totalFundRequest));
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setCategory(categoryVal.getSelectedItem().toString());
        certificateWorkRequest c=new certificateWorkRequest();
        c.setSenderOrganization(organization);
        request.setCertificate(c);
        Organization org = null;
        for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
            for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof BudgetOrganization){
                    org = organization;
                    break;
                }
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_createbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> categoryVal;
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextPane descriptionVal;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextPane messageVal;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextPane totalFundVal;
    // End of variables declaration//GEN-END:variables
}
