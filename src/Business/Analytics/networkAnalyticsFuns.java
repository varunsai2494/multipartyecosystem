/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Analytics;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
/**
 *
 * @author imperio2494
 */
public class networkAnalyticsFuns {
    private EcoSystem system;
    public networkAnalyticsFuns(EcoSystem system){
    this.system=system;
    
    
    }
    
    
    public HashMap<String,HashMap<String,Integer>> getUsersInNetWorkByOrganization(String networkSel){
        
        
        
        String temp;
        HashMap<String,HashMap<String,Integer>> ent=null;
        for(Network network:system.getNetworkList()){
             ent= new HashMap<String,HashMap<String,Integer>>();
                if(networkSel==null)
                    temp=system.getNetworkList().get(0).getName();
                else
                    temp=networkSel;
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    HashMap<String,Integer> org =new HashMap<String,Integer>();
                    org.put("Admins",enterprise.getEmployeeDirectory().getEmployeeList().size());
                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                       org.put(organization.getName(),organization.getUserAccountDirectory().getUserAccountList().size()) ;
                    }
                ent.put(enterprise.getEnterpriseType().getValue(),org);
                
                }
                  
                if(temp==network.getName())
                    return ent;
                
                }
        

            System.out.print("asdf");
        return ent;
        
    
    }
    
}

//public int getAdminCountByOrg(){



