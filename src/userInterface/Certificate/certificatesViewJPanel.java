/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Certificate;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AirForceOrganization;
import Business.Organization.ArmyOrganization;
import Business.Organization.CertificateOrganization;
import Business.Organization.OfficeOfEnviManagementOrganization;
import Business.Organization.OfficeOfNuclearEnergyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BudgetWorkRequest;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author imperio2494
 */
public class certificatesViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form certificatesViewJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    Network network;
    Organization organization;
    public certificatesViewJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization,Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.enterprise=enterprise;
        this.network=network;
        this.organization=organization;
        populateComboBox();
        populateTable();
    }

    public void populateComboBox(){
    OrgCB.removeAllItems();
    for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
    for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
    if(o instanceof ArmyOrganization || o instanceof AirForceOrganization || o instanceof OfficeOfEnviManagementOrganization ||o instanceof OfficeOfNuclearEnergyOrganization){
        OrgCB.addItem(o.toString());
    }}
    }
    }
    public void populateTable(){
        List<BudgetWorkRequest> reqs=((CertificateOrganization)organization).getOrgcertificates();
        for(BudgetWorkRequest request:reqs){
            try{
                DefaultTableModel dtm = (DefaultTableModel)workRequestTable.getModel();
        dtm.setRowCount(0);
        if(request.getCertificate().getSenderOrganization().toString().equals(OrgCB.getSelectedItem().toString())){
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
            System.out.print("zzzz");
        }
            }
            catch(Exception e){
            System.out.print("asdg");
            }
            
         }}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        WRViewTable = new javax.swing.JTable();
        OrgCB = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();

        workRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "sender", "message", "description", "requested budget", "allocated budget", "status"
            }
        ));
        jScrollPane1.setViewportView(workRequestTable);

        viewBtn.setText("view");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        WRViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "attribute", "value"
            }
        ));
        jScrollPane2.setViewportView(WRViewTable);

        OrgCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        backBtn.setText("back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(OrgCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrgCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(viewBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        BudgetWorkRequest workrequest= (BudgetWorkRequest)workRequestTable.getValueAt(selectedRow, 1);

        DefaultTableModel dtm = (DefaultTableModel)WRViewTable.getModel();
        dtm.setRowCount(0); 
        dtm.addRow(new Object[]{"senderOrganization",workrequest.getCertificate().getSenderOrganization().getName()});
        dtm.addRow(new Object[]{"message",workrequest});
        dtm.addRow(new Object[]{"description",workrequest.getDescription()});
        dtm.addRow(new Object[]{"sender",workrequest.getSender()});
        dtm.addRow(new Object[]{"receiver",workrequest.getReceiver()});
        dtm.addRow(new Object[]{"requestdate",workrequest.getRequestDate().toString()});
        dtm.addRow(new Object[]{"resolvedate",(workrequest.getResolveDate()!=null)?workrequest.getResolveDate().toString():null});
        dtm.addRow(new Object[]{"requestedbudget",workrequest.getTotalBudgetRequest()});
        dtm.addRow(new Object[]{"allocatedbudget",workrequest.getAllocatedBudgetRequest()});
        dtm.addRow(new Object[]{"reports",workrequest.getCertificate().getReports()});
        dtm.addRow(new Object[]{"status",workrequest.getStatus()});
    }//GEN-LAST:event_viewBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> OrgCB;
    private javax.swing.JTable WRViewTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton viewBtn;
    private javax.swing.JTable workRequestTable;
    // End of variables declaration//GEN-END:variables
}