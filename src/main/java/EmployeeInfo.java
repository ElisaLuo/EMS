/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luoli
 */
public class EmployeeInfo {
    protected int empNumber;
    protected String firstName;
    protected String lastName;
    protected double deductRate;
	
    public EmployeeInfo(int eN, String fN, String lN, double dR) {
	empNumber = eN;
	firstName = fN;
	lastName = lN;
	deductRate = dR;
    }
        
    public int getEmpNum() {
        return empNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}