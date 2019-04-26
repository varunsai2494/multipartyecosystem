package userInterface.BureauOfEconomicCommerce;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.Organization.BureauOfEconomicAnalysisOrganization;
import Business.WorkQueue.BudgetWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class BureauOfEconomicCommerceWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private BureauOfEconomicAnalysisOrganization organization;
    private Network network;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form BureauOfEconomicCommerceWorkAreaJPanel
     */
    public BureauOfEconomicCommerceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, BureauOfEconomicAnalysisOrganization organization,  Enterprise enterprise, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.network = network;
        this.enterprise = enterprise;
        this.userAccount = account;
        initComponents();
        valueLabel.setText(this.enterprise.getName());
        populateRequestTable();
                try{
        ImageIcon iconLogo = new ImageIcon(Paths.get("imgs/bea_logo.png").toAbsolutePath().toString());
        imgLabel.setIcon(new ImageIcon(iconLogo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));

        }
        catch(Exception e){}
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        fundallocbtn = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        assignbtn = new javax.swing.JButton();
        rejectbtn = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Description", "Sender Org", "Receiver", "Total Budget Request", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        fundallocbtn.setText("suggest fund allocation");
        fundallocbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundallocbtnActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        assignbtn.setText("assign to me");
        assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtnActionPerformed(evt);
            }
        });

        rejectbtn.setText("reject");
        rejectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(assignbtn)
                .addGap(18, 18, 18)
                .addComponent(rejectbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundallocbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(refreshTestJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(refreshTestJButton))
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignbtn)
                    .addComponent(rejectbtn)
                    .addComponent(fundallocbtn))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fundallocbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundallocbtnActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("suggestFundsJPanel", new RequestBudgetJPanel(userProcessContainer, userAccount, enterprise, network,request));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_fundallocbtnActionPerformed
    public void populateRequestTable(){
            DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

            model.setRowCount(0);
            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
                Object[] row = new Object[6];
                row[0] = request;
                row[2] = request.getCertificate().getSenderOrganization().getName();
                row[3] = request.getReceiver();
                row[5] = request.getStatus();
                row[1] = request.getDescription();
                row[4] = ((BudgetWorkRequest)request).getTotalBudgetRequest();
//                String result = ((LabTestWorkRequest)request).getTestResult();
//                row[3] = result == null ? "Waiting" : result;

                model.addRow(row);
            }
        }
    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void assignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignbtnActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        populateRequestTable();
    }//GEN-LAST:event_assignbtnActionPerformed

    private void rejectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectbtnActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Bureau of Economics Rejected");
        populateRequestTable();
        
    }//GEN-LAST:event_rejectbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignbtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton fundallocbtn;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton rejectbtn;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
