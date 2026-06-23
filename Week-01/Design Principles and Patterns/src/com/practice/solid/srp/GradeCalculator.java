package com.practice.solid.srp;

public class GradeCalculator {
	
	 public void calculateGrade(Student s) {

	        if(s.getMark() >= 50)
	            System.out.println("Pass");
	        else
	            System.out.println("Fail");
	    }
}
