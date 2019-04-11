/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Organization.BureauOfEconomicAnalysisOrganization;
import userInterface.BureauOfEconomicCommerce.BureauOfEconomicCommerceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author root
 */
public class PatentAndLicenseRole extends Role{
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new BureauOfEconomicCommerceWorkAreaJPanel(userProcessContainer, account, (BureauOfEconomicAnalysisOrganization)organization, enterprise, network);
    }
}
