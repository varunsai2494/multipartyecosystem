/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imperio2494
 */
package Business.Enterprise;
import Business.Role.Role;
import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;
public class DOJ extends Enterprise {
    public DOJ(String name){
        super(name,EnterpriseType.DOJ);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

