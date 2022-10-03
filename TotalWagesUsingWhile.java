package com.Bridgelabz.EmpWage;

public class TotalWagesUsingWhile {
	public static final int isFULL_TIME = 1;
	public static final int isPART_TIME = 2;
	public static final int numOfWorkingday = 20;
	public static final int maxHrsInMonth = 100;

	public static void main(String[] args) {
		int wagePerHour = 20;
		int empHour = 0;
		int totalempHrs = 0;
		int totalWorkingDay = 0;
		while (totalempHrs <= maxHrsInMonth && totalWorkingDay < numOfWorkingday) {
			totalWorkingDay++;
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
			totalempHrs += empHour;
			System.out.println("Day#:" + totalWorkingDay + " Emp Hr: " + empHour);
		}
		int totalEmpWage = totalempHrs * wagePerHour;
		System.out.println("Total Employee wage is=" + totalEmpWage);
	}
}
