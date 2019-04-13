/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import Business.Organization.Organization.Type;

/**
 *
 * @author imperio2494
 */
public class certificateWorkRequest extends BudgetWorkRequest {
    private Type senderOrganization;

    public Type getSenderOrganization() {
        return senderOrganization;
    }

    public void setSenderOrganization(Type senderOrganization) {
        this.senderOrganization = senderOrganization;
    }
    
    
}
