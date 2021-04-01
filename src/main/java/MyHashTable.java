/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luoli
 */
import java.util.*;
import java.io.*;


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is a employeeInfo
	// object holding a reference value pointing to a employee.

	public ArrayList<EmployeeInfo>[] buckets;
        
        

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate buckets as an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int employeeNumber) {
		return(employeeNumber % buckets.length);  // employee number modulo number of buckets
	}


	public void addToTable(EmployeeInfo theemployee) {
		// Add the employee referenced by theemployee to the hash table.
		
		if (theemployee != null) {
			int targetBucket = calcBucket(theemployee.empNumber);
			// Append that employee to the ArrayList for that bucket.
			boolean addStatus = buckets[targetBucket].add(theemployee);
		}
		
	}


	public EmployeeInfo removeFromTable(int employeeNumber) {
		// Remove that employee from the hash table and return the reference value for that employee.
		// Return null if that employee isn't in the table.
		int targetBucket = calcBucket(employeeNumber);
		int index = -1;
		for(int i = 0; i < buckets[targetBucket].size(); i++) {
			if(buckets[targetBucket].get(i).empNumber == employeeNumber) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			return null;
		} else {
			return buckets[targetBucket].remove(index);
		}
	}

	
	public EmployeeInfo getFromTable(int employeeNumber) {
		int targetBucket = calcBucket(employeeNumber);
		int index = -1;
		for(int i = 0; i < buckets[targetBucket].size(); i++) {
			if(buckets[targetBucket].get(i).empNumber == employeeNumber) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			return null;
		} else {
			return buckets[targetBucket].get(index);
		}
	}

	public boolean isInTable(int employeeNumber) {
		// Return true if that employee is in the hash table, false otherwise.
		int targetBucket = calcBucket(employeeNumber);
		int index = -1;
		for(int i = 0; i < buckets[targetBucket].size(); i++) {
			if(buckets[targetBucket].get(i).empNumber == employeeNumber) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			return false;
		} else {
			return true;
		}
	}


	public void displayTable() {
		// Walk through the buckets and display the items in each bucket's ArrayList.
		EmployeeInfo currentEmployee;
		for (int i = 0; i < buckets.length; i++) {
			System.out.print("\nContents for Bucket #" + i + "\n");
			// Display the items in this bucket's ArrayList.
			if (buckets[i].size() == 0) {
				System.out.println("     No items for this bucket!");
			}
			else {
				// Get the info for each item in this ArrayList.
				for (int j = 0; j < buckets[i].size(); j++) {
					currentEmployee = buckets[i].get(j);
					System.out.println("     " + currentEmployee.empNumber + " " + currentEmployee.firstName + " " + currentEmployee.lastName);
				}
			}
		}
	}
        
        public ArrayList<EmployeeInfo> returnAllEmp(){
            ArrayList<EmployeeInfo> allEmp = new ArrayList<EmployeeInfo>();
            for(int i = 0; i < buckets.length; i++){
                if(buckets[i].size() > 0){
                    for(int j = 0; j < buckets[i].size(); j++){
                        allEmp.add(buckets[i].get(j));
                    }
                }
            }
            return allEmp;
        }


}
