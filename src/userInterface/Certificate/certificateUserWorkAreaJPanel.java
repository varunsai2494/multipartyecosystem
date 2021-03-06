/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Certificate;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ArmyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import Business.WorkQueue.BudgetWorkRequest;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imperio2494
 */
public class certificateUserWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form certificateUserWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private Organization organization;
    private Network network;
    private Enterprise enterprise;
    private UserAccount userAccount;
    
    public certificateUserWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,Organization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.network = network;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        populateTable();
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

        viewworkRDetails = new javax.swing.JButton();
        viewCertiBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        certificateUserworkareaTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        viewworkRDetails.setText("view details");
        viewworkRDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewworkRDetailsActionPerformed(evt);
            }
        });

        viewCertiBtn.setText("view certificates");
        viewCertiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCertiBtnActionPerformed(evt);
            }
        });

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        certificateUserworkareaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "organization", "message", "description", "requestedbudget", "allocatedbudget", "status"
            }
        ));
        jScrollPane1.setViewportView(certificateUserworkareaTable);

        jLabel1.setText("USER WORK AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(backBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(viewCertiBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewworkRDetails))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewworkRDetails)
                    .addComponent(viewCertiBtn))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        certificateOrgWorkAreaJPanel dwjp = (certificateOrgWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewworkRDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewworkRDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = certificateUserworkareaTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        BudgetWorkRequest c= (BudgetWorkRequest)certificateUserworkareaTable.getValueAt(selectedRow, 1);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("certificateviewJpanel", new certificateViewJPanel(userProcessContainer,c,userAccount,enterprise,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewworkRDetailsActionPerformed

    private void viewCertiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCertiBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("certificatesviewJpanel",new certificatesViewJPanel( userProcessContainer,  userAccount,  enterprise, organization, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewCertiBtnActionPerformed
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)certificateUserworkareaTable.getModel();
        dtm.setRowCount(0);
   for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request.getMessage()!=null){
            Object[] row = new Object[6];
            row[0] =  ((BudgetWorkRequest) request).getCertificate().getSenderOrganization();
            row[1]=request;
            row[2] = request.getDescription();
            row[3] = request.getStatus();
            int alloc = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
            row[4] = alloc;
            int total = ((BudgetWorkRequest) request).getTotalBudgetRequest();
            row[5] = total;
            
            dtm.addRow(row);}
   }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable certificateUserworkareaTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewCertiBtn;
    private javax.swing.JButton viewworkRDetails;
    // End of variables declaration//GEN-END:variables
}
