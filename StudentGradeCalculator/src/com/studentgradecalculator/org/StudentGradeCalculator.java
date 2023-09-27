package com.studentgradecalculator.org;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		StudentDetails details = new StudentDetails();
		details.getDetails();
		details.total();
		details.averagePercentage();
		details.result();
		details.grade();
		details.showDetails();

	}
}

class StudentDetails {
	int totalSubjects = 5;
	int totalMarks = 0;
	String name = null;
	int tamil = 0, english = 0, maths = 0, science = 0, social = 0;
	int average = 0;
	String grade = null;
	boolean result = false;

	public void getDetails() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter your Name : ");
			this.name = scanner.nextLine();
			System.out.println("Enter your Marks : ");
			System.out.print("Tamil : ");
			this.tamil = scanner.nextInt();
			System.out.print("English : ");
			this.english = scanner.nextInt();
			System.out.print("Maths : ");
			this.maths = scanner.nextInt();
			System.out.print("Science : ");
			this.science = scanner.nextInt();
			System.out.print("Social : ");
			this.social = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Enter correct format");
			getDetails();
		}
		scanner.close();

	}

	public void total() {
		this.totalMarks = tamil + english + maths + science + social;
	}

	public void averagePercentage() {
		this.average = totalMarks / totalSubjects;
	}

	public void result() {
		if (tamil >= 35 && english >= 35 && maths >= 35 && science >= 35 && social >= 35) {
			this.result = true;
		}

	}

	public void grade() {
		if (result) {
			if (average >= 91 && average < 100) {
				this.grade = "A";
			} else if (average >= 81 && average < 90) {
				this.grade = "B";
			} else if (average >= 71 && average < 80) {
				this.grade = "C";
			} else if (average >= 61 && average < 70) {
				this.grade = "D";
			} else if (average >= 91 && average < 100) {
				this.grade = "E";
			} else {
				this.grade = "F";
			}

		}
	}

	public void showDetails() {
		if (result) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Student Mark and Grade shower :");
			System.out.println(

					"Student Name : " + name + "\nTotal Marks : " + totalMarks + "\nAverage Percentage : " + average
							+ "\nResult : Pass" + "\nGrade : " + grade);
		} else {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Student Mark and Grade shower :");
			System.out.println("Student Name : " + name + "\nTotal Marks : " + totalMarks + "\nResult : Fail");
		}
	}

}