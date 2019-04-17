/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.Organization.Organization;

/**
 *
 * @author imperio2494
 */
public class certificateWorkRequest{
    private Organization senderOrganization;

    public Organization getSenderOrganization() {
        return senderOrganization;
    }

    public void setSenderOrganization(Organization senderOrganization) {
        this.senderOrganization = senderOrganization;
    }
    private String reports;

    
    public String getReports() {
        return reports;
    }

    public void setReports(String reports) {
        this.reports = reports;
    }
    
    
}
