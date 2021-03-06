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
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author root
 */
public class reportsJPanel extends javax.swing.JPanel {
    JFreeChart chart;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ArmyOrganization organization;
    private Network network;
    private UserAccount userAccount;
    /**
     * Creates new form testing
     */
    public reportsJPanel(JPanel userProcessContainer, UserAccount account, ArmyOrganization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        this.userAccount = account;
        barGraph();
        
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plotJPanel = new javax.swing.JPanel();
        backbtn = new javax.swing.JButton();
        graphcombobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout plotJPanelLayout = new javax.swing.GroupLayout(plotJPanel);
        plotJPanel.setLayout(plotJPanelLayout);
        plotJPanelLayout.setHorizontalGroup(
            plotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        plotJPanelLayout.setVerticalGroup(
            plotJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );

        backbtn.setText("back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        graphcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "total_spending", "funding_analysis" }));
        graphcombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphcomboboxActionPerformed(evt);
            }
        });

        jLabel1.setText("Report Type :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plotJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(graphcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(graphcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plotJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void barGraph(){
        HashMap<String, Integer> total_funds = new HashMap<>(); 
        HashMap<String, Integer> Allocated_funds = new HashMap<>(); 
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            int funds = ((BudgetWorkRequest) request).getTotalBudgetRequest();
            int allocated_funds = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
            String category = request.getCategory()==null ? "UNN" : request.getCategory();
            if(total_funds.get(category)==null){
                total_funds.put(category, funds);
            }
            else{
                total_funds.put(category, total_funds.get(category)+funds);
            }
            if(Allocated_funds.get(category)==null){
                Allocated_funds.put(category, allocated_funds);
            }
            else{
                Allocated_funds.put(category, Allocated_funds.get(category)+allocated_funds);
            }
            
        }
        for(String k: total_funds.keySet()){
            dataset.addValue(total_funds.get(k),k,"Total Funds");
        }
        for(String k: Allocated_funds.keySet()){
            dataset.addValue(Allocated_funds.get(k),k,"Allocated Funds");
        }
        JFreeChart chart = ChartFactory.createBarChart(
        "Army Spendings", // Title
        "Departments", // x-axis Label
        "Funds Spendings", // y-axis Label
        dataset, // Dataset
        PlotOrientation.VERTICAL, // Plot Orientation
        true, // Show Legend
        true, // Use tooltips
        false // Configure chart to generate URLs?
     );
        plotJPanel.removeAll();
        plotJPanel.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        plotJPanel.add(CP,BorderLayout.CENTER);
        plotJPanel.validate();
    }
    private void FundSpentBarGraph(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );  
        HashMap<String, Integer> Allocated_funds = new HashMap<>(); 
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            int funds = ((BudgetWorkRequest) request).getBudgetSpent();
            int allocated_funds = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
            String category = request.getCategory()==null ? "UNN" : request.getCategory();
            if(Allocated_funds.get(category)==null){
                Allocated_funds.put(category, funds-allocated_funds);
            }
            else{
                Allocated_funds.put(category, Allocated_funds.get(category)+funds-allocated_funds);
            }
        }
        for(String k: Allocated_funds.keySet()){
            dataset.addValue(Allocated_funds.get(k),k,"Excess Funds");
        }
        JFreeChart chart = ChartFactory.createBarChart(
        "Army Spendings", // Title
        "Departments", // x-axis Label
        "Excess Funds", // y-axis Label
        dataset, // Dataset
        PlotOrientation.VERTICAL, // Plot Orientation
        true, // Show Legend
        true, // Use tooltips
        false // Configure chart to generate URLs?
     );
        plotJPanel.removeAll();
        plotJPanel.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        
        plotJPanel.add(CP,BorderLayout.CENTER);
        plotJPanel.validate();
    }
    private void lineGraph(){
    XYSeries series = new XYSeries("Army Spendings");
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            int funds = ((BudgetWorkRequest) request).getAllocatedBudgetRequest();
//            series.add(request.getCategory(), Integer.toString(funds));
        }
            

     // Add the series to your data set
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

     // Generate the graph
        JFreeChart chart = ChartFactory.createXYLineChart(
        "Army Spendings", // Title
        "Departments", // x-axis Label
        "Funds Spendings", // y-axis Label
        dataset, // Dataset
        PlotOrientation.VERTICAL, // Plot Orientation
        true, // Show Legend
        true, // Use tooltips
        false // Configure chart to generate URLs?
     );
        plotJPanel.setLayout(new java.awt.BorderLayout());
        ChartPanel CP = new ChartPanel(chart);
        plotJPanel.add(CP,BorderLayout.CENTER);
        plotJPanel.validate();
    }
    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ArmyWorkAreaJPanel dwjp = (ArmyWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void graphcomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphcomboboxActionPerformed
        String val = (String) graphcombobox.getSelectedItem();
        if(val.equals("total_spending")){
            barGraph();
        }
        else{
            FundSpentBarGraph();
        }
    }//GEN-LAST:event_graphcomboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> graphcombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel plotJPanel;
    // End of variables declaration//GEN-END:variables
}
