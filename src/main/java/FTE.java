/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luoli
 */

public class FTE extends EmployeeInfo {
    
    private double yearlySalary;

    public FTE(int eN, String fN, String lN, double dR, double yS) {
	super(eN, fN, lN, dR);
        yearlySalary = yS;
		// TODO Auto-generated constructor stub
    }
	
	
	
    public double getYearlySalary() {
        return yearlySalary;
    }
    
    
    public double calcAnnualNetIncome() {
        return (yearlySalary *(1.0 - deductRate));
    }
}
