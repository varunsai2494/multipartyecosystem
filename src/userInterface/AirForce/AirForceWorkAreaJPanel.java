/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AirForce;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AirForceOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BudgetWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author root
 */
public class AirForceWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private AirForceOrganization organization;
    private Network network;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form NavyWorkAreaJPanel
     */
    public AirForceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AirForceOrganization organization,  Enterprise enterprise, Network network) {
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
        ArrayList<Object[]> result = new ArrayList<>();
        ArrayList<Object[]> certificateObj = new ArrayList<>();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request.getCategory();
            row[1] = request;
            row[2] = request.getDescription();
            row[3] = ((BudgetWorkRequest) request).getTotalBudgetRequest();
            Integer aa = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
            row[4] = aa.toString();
            row[5] = request.getStatus();
            result.add(row); 
            if(request.getCertificate()!=null){
                certificateObj.add(row);
            }
        }
        for(Object[] i : certificateObj){
            int index = result.indexOf(i);
            result.remove(index);
            result.add(0, i);
        }

        for(Object[] i : result){
            model.addRow(i);
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
        reportRequest = new javax.swing.JButton();
        createbtn = new javax.swing.JButton();

        armyJTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Category", "Message", "Description", "Total Fund Request", "Allocated Funds", "Status"
            }
        ));
        armyJTabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                armyJTabelFocusGained(evt);
            }
        });
        armyJTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                armyJTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(armyJTabel);

        titleLabel.setText("Air Force Work Area");

        reportRequest.setText("Upload Report");
        reportRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportRequestMouseClicked(evt);
            }
        });
        reportRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportRequestActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reportRequest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(createbtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportRequest)
                    .addComponent(createbtn))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("createBudgetRequest", new createBudgetRequest(userProcessContainer, userAccount, organization, enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createbtnActionPerformed

    private void armyJTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_armyJTabelMouseClicked
        int selectedRow = armyJTabel.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)armyJTabel.getValueAt(selectedRow, 0);
        reportRequest.setEnabled(false);
    }//GEN-LAST:event_armyJTabelMouseClicked

    private void armyJTabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_armyJTabelFocusGained
        // TODO add your handling code here:
        System.out.println(evt);
    }//GEN-LAST:event_armyJTabelFocusGained

    private void reportRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportRequestActionPerformed
        int selectedRow = armyJTabel.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)armyJTabel.getValueAt(selectedRow, 1);
        JFileChooser location=new JFileChooser();
        location.showOpenDialog(null); 
        File file=location.getSelectedFile();
        String absolutePath=file.getAbsolutePath();
        request.getCertificate().setReports(absolutePath);
    }//GEN-LAST:event_reportRequestActionPerformed

    private void reportRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportRequestMouseClicked
        int selectedRow = armyJTabel.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)armyJTabel.getValueAt(selectedRow, 1);
        reportRequest.setEnabled(false);
        if(request.getCertificate()!=null){
                reportRequest.setEnabled(true);
            }
    }//GEN-LAST:event_reportRequestMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable armyJTabel;
    private javax.swing.JButton createbtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reportRequest;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
