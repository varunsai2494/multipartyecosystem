/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Army;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ArmyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BudgetWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.Army.createBudgetRequest;

/**
 *
 * @author root
 */
public class ArmyWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private ArmyOrganization organization;
    private Network network;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form NavyWorkAreaJPanel
     */
    public ArmyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ArmyOrganization organization,  Enterprise enterprise, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.network = network;
        this.enterprise = enterprise;
        this.userAccount = account;
        initComponents();
        populateRequestTable();
    }
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) armyJTabel.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[2] = request.getCategory();
            row[0] = request;
            row[1] = request.getDescription();
            row[3] = ((BudgetWorkRequest) request).getTotalBudgetRequest();
            Integer aa = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
            row[4] = aa.toString();
            row[5] = request.getStatus();

            model.addRow(row);
        }
    }
    
       private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   

        populateRequestTable();

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
        armyJTabel = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        viewRequest = new javax.swing.JButton();
        createbtn = new javax.swing.JButton();

        armyJTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Description", "Category", "Total Fund Request", "Allocated Funds", "Status"
            }
        ));
        jScrollPane1.setViewportView(armyJTabel);

        titleLabel.setText("Army Work Area");

        viewRequest.setText("View");

        createbtn.setText("Create budget Request");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewRequest)
                        .addGap(18, 18, 18)
                        .addComponent(createbtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewRequest)
                    .addComponent(createbtn))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new createBudgetRequest(userProcessContainer, userAccount, enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable armyJTabel;
    private javax.swing.JButton createbtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewRequest;
    // End of variables declaration//GEN-END:variables
}
