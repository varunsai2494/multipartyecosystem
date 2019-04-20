/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FBI;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BudgetWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.FBI.fbiuserWorkAreaPanel;

/**
 *
 * @author imperio2494
 */
public class fbiOrgWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form fbiOrgWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization; 
    Enterprise enterprise;
    Network network;
    EcoSystem ecosystem;
    public fbiOrgWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.network=network;
        this.ecosystem=ecosystem;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)fbiWorkRequestTable.getModel();
        dtm.setRowCount(0);
   for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
       try{
            Object[] row = new Object[6];
            row[0] =  ((BudgetWorkRequest) request).getCertificate().getSenderOrganization();

            row[1]=request;
            row[2] = request.getDescription();
            row[3] = request.getStatus();
            int alloc = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
            row[4] = alloc;
            int total = ((BudgetWorkRequest) request).getTotalBudgetRequest();
            row[5] = total;
            
            dtm.addRow(row);
       }
       catch(Exception e)
       {
       }
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        fbiWorkRequestTable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        proceedWABtn = new javax.swing.JButton();
        viewFraudsBtn = new javax.swing.JButton();

        fbiWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "organization", "message", "description", "requested budget", "allocated budget", "status"
            }
        ));
        jScrollPane1.setViewportView(fbiWorkRequestTable);

        assignBtn.setText("assign to me");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        proceedWABtn.setText("proceed to workarea");
        proceedWABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedWABtnActionPerformed(evt);
            }
        });

        viewFraudsBtn.setText("view frauds");
        viewFraudsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFraudsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewFraudsBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignBtn)
                        .addGap(42, 42, 42)
                        .addComponent(proceedWABtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignBtn)
                    .addComponent(proceedWABtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewFraudsBtn)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = fbiWorkRequestTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)fbiWorkRequestTable.getValueAt(selectedRow, 1);
        
        
        organization.getWorkQueue().getWorkRequestList().remove(request);
        request.setReceiver(account);
        request.setStatus("Pending");
        account.getWorkQueue().getWorkRequestList().add(request);
        populateTable();
    }//GEN-LAST:event_assignBtnActionPerformed

    private void proceedWABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedWABtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        
        userProcessContainer.add("fbiUserJpanel", new fbiuserWorkAreaPanel(userProcessContainer, account, enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_proceedWABtnActionPerformed

    private void viewFraudsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFraudsBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        
        userProcessContainer.add("fbifraudsJpanel", new fbiFraudsJPanel(userProcessContainer,organization));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewFraudsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JTable fbiWorkRequestTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton proceedWABtn;
    private javax.swing.JButton viewFraudsBtn;
    // End of variables declaration//GEN-END:variables
}
