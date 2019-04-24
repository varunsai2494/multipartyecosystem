/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface.Budget;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ArmyOrganization;
import Business.Organization.BudgetOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import userInterface.Army.ArmyWorkAreaJPanel;

/**
 *
 * @author Preetham Reddy
 */
public class AllocateBudgetPanel extends javax.swing.JPanel {

    /**
     * Creates new form AllocateBudgetPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private BudgetOrganization organization;
    private Network network;
    private UserAccount userAccount;
    public AllocateBudgetPanel(JPanel userProcessContainer, UserAccount account, BudgetOrganization organization, Enterprise enterprise, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        this.userAccount = account;
        initComponents();
        
        categoryVal.addItem("Air Force Organization");
        categoryVal.addItem("Army Organization");
        categoryVal.addItem("Budget Organization");
        categoryVal.addItem("Navy Organization");
        categoryVal.addItem("Office Of Environment Organization");
        categoryVal.addItem("Office Of Nuclear Organization");
//        categoryVal.addItem("");
//        categoryVal.addItem("");
//        categoryVal.addItem("");
//        categoryVal.addItem("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        categoryVal = new javax.swing.JComboBox<String>();
        categoryLabel = new javax.swing.JLabel();

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        categoryLabel.setText("Organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(categoryLabel)
                .addGap(166, 166, 166)
                .addComponent(categoryVal, 0, 337, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel)
                    .addComponent(categoryVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BudgetWorkAreaPanel dwjp = (BudgetWorkAreaPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> categoryVal;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}