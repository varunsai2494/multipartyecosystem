/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.BureauOfEconomicCommerce;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BudgetOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BudgetWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RequestBudgetJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;
    private UserAccount userAccount;
    private WorkRequest request;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestBudgetJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, WorkRequest request) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        this.userAccount = account;
        this.request = request;
        valueLabel.setText(enterprise.getName());
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
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        suggestedfundsval = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approvebtn.setText("approve");
        approvebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvebtnActionPerformed(evt);
            }
        });
        add(approvebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));
        add(suggestedfundsval, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 89, -1));

        jLabel1.setText("Suggested Fund Allocation:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void approvebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvebtnActionPerformed
        
        request.setStatus("Bureau of Ecomonics Approved");
        try{
            Integer.parseInt(suggestedfundsval.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "error total funds should be integer"); 
        }
        ((BudgetWorkRequest) request).setSuggestedBudgetByBureauOfEconomics(Integer.parseInt(suggestedfundsval.getText()));
          JOptionPane.showMessageDialog(null, "Success!!"); 
    }//GEN-LAST:event_approvebtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BureauOfEconomicCommerceWorkAreaJPanel dwjp = (BureauOfEconomicCommerceWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approvebtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField suggestedfundsval;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
