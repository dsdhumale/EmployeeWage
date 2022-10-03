package com.Bridgelabz.EmpWage;

public class DailyWagesUsingSwitchCase {
	public static final int isFULL_TIME = 1;
	public static final int isPART_TIME = 2;

	public static void main(String[] args) {
		int wagePerHour = 20;
		int empHour = 0;
		int empWage = 0;
		int empcheck = (int) (Math.random() * 10) % 3;
		switch (empcheck) {
		case isFULL_TIME:
			empHour = 8;
			break;
		case isPART_TIME:
			empHour = 4;
			break;
		default:
			empHour = 0;
		}
		empWage = empHour * wagePerHour;
		System.out.println("Employee wage is=" + empWage);
	}
}
