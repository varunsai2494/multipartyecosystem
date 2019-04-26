/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.Revenue;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ArmyOrganization;
import Business.Organization.BudgetOrganization;
import Business.Organization.Organization;
import Business.Organization.RevenueOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BudgetWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.BureauOfEconomicCommerce.RequestBudgetJPanel;

/**
 *
 * @author Preetham Reddy
 */
public class RevenueWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form RevenuePanel
     */
    private JPanel userProcessContainer;
    private RevenueOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    public RevenueWorkAreaPanel(JPanel userProcessContainer, UserAccount account, RevenueOrganization organization,  Enterprise enterprise, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network=network;
        initComponents();
        populateTable();
        valueLabel.setText(this.enterprise.getName());
        Color color = new Color(198,248,250);
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

        jLabel1 = new javax.swing.JLabel();
        revApproveButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RevJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Revenue Panel");

        revApproveButton.setText("approve to do");
        revApproveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revApproveButtonActionPerformed(evt);
            }
        });

        RevJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Description", "Reciver", "Total Budget", "Allocated Budget", "Status", "Suggestedl"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(RevJTable);

        jButton1.setText("Reject");

        assignButton.setText("assign to me");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(revApproveButton)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revApproveButton)
                    .addComponent(jButton1)
                    .addComponent(assignButton))
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void revApproveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revApproveButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = RevJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row"); 
            return;
        }
        
        WorkRequest request = (WorkRequest)RevJTable.getValueAt(selectedRow, 0);
        populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("suggestFundsJPanel", new ApproveRevenuePanel(userProcessContainer, userAccount, enterprise, network,request));
        layout.next(userProcessContainer);
      
        
        
        
        
    }//GEN-LAST:event_revApproveButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        int selectedRow = RevJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a row");
            return;
        }

        WorkRequest request = (WorkRequest)RevJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        JOptionPane.showMessageDialog(null, "Task assigned Sucessfully ");
        populateTable();

    }//GEN-LAST:event_assignButtonActionPerformed
    
    
    public void populateTable(){
    
        DefaultTableModel dtm = (DefaultTableModel)RevJTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getDescription();
            row[2] = request.getReceiver();
            int alloc = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
            row[3] = alloc;
            int total = ((BudgetWorkRequest) request).getTotalBudgetRequest();
            row[4] = total;
            row[5] = request.getStatus();
            int sug = ((BudgetWorkRequest) request).getSuggestedBudgetByBureauOfEconomics();
            row[6] = sug;
            
            dtm.addRow(row);
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RevJTable;
    private javax.swing.JButton assignButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton revApproveButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
