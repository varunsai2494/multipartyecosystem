/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PatentAndLicenseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class PatentAndLicensesOrganization extends Organization{
    public PatentAndLicensesOrganization() {
        super(Organization.Type.PatentAndLicenses.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatentAndLicenseRole());
        return roles;
    }
}
