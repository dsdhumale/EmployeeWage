package com.Bridgelabz.EmpWage;

public class DailyWages {
	public static void main(String[] args) {
		int isFULL_TIME = 1;
		int wagePerHour = 20;
		int empHour = 0;
		int empWage = 0;
		int empcheck = (int) (Math.random() * 10) % 2;
		if (empcheck == isFULL_TIME) {
			System.out.println("Employee is Present");
			empHour = 8;
		} else {
			System.out.println("Employee is Absent");
			empHour = 0;
		}
		empWage = empHour * wagePerHour;
		System.out.println("Employee wage is=" + empWage);
	}
}

