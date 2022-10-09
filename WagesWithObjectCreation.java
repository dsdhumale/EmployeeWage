package com.Bridgelabz.EmpWage;

public class WagesWithObjectCreation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRateperHour;
	private final int maxHourInMonth;
	private final int numOfWorkingDay;
	private int totalEmpWage;

	public WagesWithObjectCreation(String company, int maxHourInMonth, int numOfWorkingDay, int empRateperHour) {
		this.company = company;
		this.empRateperHour = empRateperHour;
		this.maxHourInMonth = maxHourInMonth;
		this.numOfWorkingDay = numOfWorkingDay;

	}

	public void calculateEmpWage() {
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
		totalEmpWage = totalEmpHour * empRateperHour;
	}

	public String toString() {
		return "Toatl wage for company " + company + " is = " + totalEmpWage;
	}

	public static void main(String[] args) {
		WagesWithObjectCreation Dell = new WagesWithObjectCreation("Dell", 100, 20, 20);
		WagesWithObjectCreation Wipro = new WagesWithObjectCreation("Wipro", 100, 24, 30);
		Dell.calculateEmpWage();
		System.out.println(Dell);
		Wipro.calculateEmpWage();
		System.out.println(Wipro);
	}

}



