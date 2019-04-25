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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

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
        valueLabel.setText(this.enterprise.getName());
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
            if(request.getCertificate().getReports()!=null){
                certificateObj.add(row);
            }
            model.addRow(row);
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
        reportsbtn = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        armyJTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                armyJTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(armyJTabel);

        titleLabel.setText("Army Work Area");

        reportRequest.setText("Upload Report");
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

        reportsbtn.setText("generate reports");
        reportsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsbtnActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 89, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportsbtn)
                        .addGap(18, 18, 18)
                        .addComponent(reportRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createbtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleLabel))
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportRequest)
                    .addComponent(createbtn)
                    .addComponent(reportsbtn))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new createBudgetRequest(userProcessContainer, userAccount,organization,enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createbtnActionPerformed

    private void armyJTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_armyJTabelMouseClicked
        // TODO add your handling code here:
        int selectedRow = armyJTabel.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)armyJTabel.getValueAt(selectedRow, 1);
        reportRequest.setEnabled(false);
        if(request.getCertificate().getReports()==null){
                reportRequest.setEnabled(true);
            }
    }//GEN-LAST:event_armyJTabelMouseClicked

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
        int total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if(!values[0].equals("Total")){
                    try{
                    total+=Integer.parseInt(values[1]);
                    }
                    catch(Exception e){}
                }
            }
            ((BudgetWorkRequest) request).setBudgetSpent(total);
        }
        
        catch(Exception e){
        }
    }//GEN-LAST:event_reportRequestActionPerformed

    private void reportsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsbtnActionPerformed
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ReportsJPanel", new reportsJPanel(userProcessContainer, userAccount,organization,enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reportsbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable armyJTabel;
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reportRequest;
    private javax.swing.JButton reportsbtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
