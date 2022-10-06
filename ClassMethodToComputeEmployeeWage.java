package com.Bridgelabz.EmpWage;

public class ClassMethodToComputeEmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static int calculateEmpWage() {
		int empHour = 0, totalEmpHour = 0, totalWorkingDays = 0;
		while (totalEmpHour <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empcheck = (int) (Math.random() * 10) % 3;
			switch (empcheck) {
			case IS_FULL_TIME:
				empHour = 8;
				break;
			case IS_PART_TIME:
				empHour = 4;
				break;
			default:
				empHour = 0;
			}
			totalEmpHour += empHour;
			System.out.println("Day#:" + totalWorkingDays + " Emp Hr: " + empHour);
		}
		int totalEmpWage = totalEmpHour * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee wage is=" + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		calculateEmpWage();
	}
}
