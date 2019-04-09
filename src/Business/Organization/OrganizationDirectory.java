/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Army.getValue())){
            organization = new ArmyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AirForce.getValue())){
            organization = new AirForceOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Navy.getValue())){
            organization = new NavyOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.PatentAndLicenses.getValue())){
            organization = new PatentAndLicensesOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.BureauOfEconomicAnalysis.getValue())){
            organization = new BureauOfEconomicAnalysisOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Revenue.getValue())){
            organization = new BureauOfEconomicAnalysisOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Budget.getValue())){
            organization = new BureauOfEconomicAnalysisOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}