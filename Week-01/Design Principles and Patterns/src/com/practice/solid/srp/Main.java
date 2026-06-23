package com.practice.solid.srp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =
                new Student("Sudharshana",80);
		Student s1=new Student("Mohan",45);

        GradeCalculator g =
                new GradeCalculator();

        g.calculateGrade(s);
        g.calculateGrade(s1);

	}

}
