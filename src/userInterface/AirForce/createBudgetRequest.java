/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AirForce;

import userInterface.AirForce.*;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BudgetOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BudgetWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import userInterface.BureauOfEconomicCommerce.BureauOfEconomicCommerceWorkAreaJPanel;

/**
 *
 * @author root
 */
public class createBudgetRequest extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;
    private UserAccount userAccount;
    /**
     * Creates new form createBudgetRequest
     */
    public createBudgetRequest(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
                
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        this.userAccount = account;
//        valueLabel.setText(enterprise.getName());
        categoryVal.addItem("Operations");
        categoryVal.addItem("AirForce Personnel");
        categoryVal.addItem("Procurement");
        categoryVal.addItem("Machine Manufacturing");
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

        titleLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageVal = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionVal = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        totalFundVal = new javax.swing.JTextPane();
        categoryVal = new javax.swing.JComboBox<>();
        createbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        titleLabel.setText("Create Budget Request");

        categoryLabel.setText("Category: ");

        messageLabel.setText("Message:");

        descriptionLabel.setText("Description:");

        priceLabel.setText("Total Fund Request:");

        jScrollPane1.setViewportView(messageVal);

        jScrollPane2.setViewportView(descriptionVal);

        jScrollPane3.setViewportView(totalFundVal);

        createbtn.setText("create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        backbtn.setText("back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(messageLabel)
                                    .addComponent(categoryLabel)
                                    .addComponent(descriptionLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(categoryVal, 0, 107, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)))))))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addGap(32, 32, 32)
                .addComponent(createbtn)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel)
                    .addComponent(categoryVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(messageLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createbtn)
                    .addComponent(backbtn))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AirForceWorkAreaJPanel dwjp = (AirForceWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> categoryVal;
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextPane descriptionVal;
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
