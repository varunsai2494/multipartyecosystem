/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.Revenue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BudgetWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Preetham Reddy
 */
public class ApproveRevenuePanel extends javax.swing.JPanel {

    /**
     * Creates new form ApproveRevenuePanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;
    private UserAccount userAccount;
    private WorkRequest request;
    public ApproveRevenuePanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, WorkRequest request) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        this.userAccount = account;
        this.request = request;
        
        
        initComponents();
        valueLabel.setText(enterprise.getName());
        int s = ((BudgetWorkRequest)this.request).getSuggestedBudgetByBureauOfEconomics();
    
        String g = Integer.toString(s);
        suggestedfundsval.setText(g);
        Color color = new Color(211, 247, 255);
        this.setBackground(color);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approvebtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        suggestedfundsval = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        allocatedFund = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        approvebtn.setText("approve");
        approvebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvebtnActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Suggested Fund Allocation:");

        jLabel2.setText("Allocate Funds for Request:");

        allocatedFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allocatedFundActionPerformed(evt);
            }
        });

        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(suggestedfundsval)
                            .addComponent(allocatedFund, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(backJButton)
                        .addGap(119, 119, 119)
                        .addComponent(approvebtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(valueLabel)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(suggestedfundsval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(allocatedFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton)
                    .addComponent(approvebtn))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void approvebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvebtnActionPerformed
        if(allocatedFund.getText().equals("")||suggestedfundsval.getText().equals("")
                    )
            {   
              JOptionPane.showMessageDialog(null, "One or more feilds empty");  
              return;
            }
            int avail;
            try
            {
               avail = Integer.parseInt(suggestedfundsval.getText());
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Enter a number for Fund Request");
                return;
            }
            try
            {
               avail = Integer.parseInt(allocatedFund.getText());
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Enter a number for Fund Request");
                return;
            }
        request.setStatus("Revenue Approved");
        JOptionPane.showMessageDialog(null, "Request Sucessfully Approved");
        ((BudgetWorkRequest) request).setAllocatedBudgetRequest(Integer.parseInt(allocatedFund.getText()));

    }//GEN-LAST:event_approvebtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RevenueWorkAreaPanel dwjp = (RevenueWorkAreaPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void allocatedFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allocatedFundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allocatedFundActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField allocatedFund;
    private javax.swing.JButton approvebtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField suggestedfundsval;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables


}

