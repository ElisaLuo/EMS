/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luoli
 */
public class PTE extends EmployeeInfo {
    
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
	
    public PTE(int eN, String fN, String lN, double dR, double hW, double hPW, double wPY) {
	super(eN, fN, lN, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
		// TODO Auto-generated constructor stub
    }
    
    public double getWeeklySalary() {
        return (hourlyWage);
    }
    
    
    public double calcAnnualNetIncome() {
        return (hourlyWage*hoursPerWeek*weeksPerYear *(1.0 - deductRate));
    }
}
