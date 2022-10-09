package com.Bridgelabz.EmpWage;

public class WagesForMultiComp {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static int calculateEmpWage( String company, int maxHourInMonth, int numOfWorkingDay, int empRateperHour ) {
		int empHour = 0, totalEmpHour = 0, totalWorkingDays = 0;
		while (totalEmpHour <= maxHourInMonth && totalWorkingDays < numOfWorkingDay) {
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
		int totalEmpWage = totalEmpHour * empRateperHour;
		System.out.println("Total Employee wage for "+ company +" is = " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		calculateEmpWage("Dell",100,20,20);
		calculateEmpWage("Wipro",100,24,30);
	}
}
