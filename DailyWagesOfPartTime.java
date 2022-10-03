package com.Bridgelabz.EmpWage;

public class DailyWagesOfPartTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFULL_TIME = 1;
		int isPART_TIME = 2;
		int wagePerHour = 20;
		int empHour = 0;
		int empWage = 0;
		int empcheck = (int) (Math.random() * 10) % 3;
		if (empcheck == isFULL_TIME) {
			empHour = 8;
		} else if (empcheck == isPART_TIME) {
			empHour = 4;
		} else {
			empHour = 0;
		}
		empWage = empHour * wagePerHour;
		System.out.println("Employee wage is=" + empWage);

	}

}
