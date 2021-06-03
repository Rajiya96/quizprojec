package com.technoelevate.assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class EmployeeMainDemo {

	public static void main(String[] args) {
      ArrayList<Employee> al = new ArrayList<Employee>();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of employee you want to enter");
      int n = sc.nextInt();
      for (int i = 1; i <=n; i++) {
    	  Employee c = new Employee();
    	  System.out.println("Enter details of Emplyoee "+i);
    	  System.out.println("Enter student name");
    	  c.setName(sc.next());
    	  System.out.println("Enter student year of pass out");
    	  c.setYearOfPassOut(sc.nextInt());
    	  System.out.println("Enter student percentage");
    	  c.setPercentage(sc.nextInt());
    	  al.add(c);
    	  
    	  
    	  c=null;
		
	}
		//System.out.println(al);
      
      System.out.println("List of candidte who are eligiable to join the company");
		
		ListIterator<Employee> itr = al.listIterator();

		while(itr.hasNext()) {
			Employee c1 = itr.next();
			if(c1.getYearOfPassOut()==2020) {
              System.out.println(c1);
		}
			c1=null;
		
	}

	}
}

