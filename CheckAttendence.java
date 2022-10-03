package com.Bridgelabz.EmpWage;

public class CheckAttendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFULL_TIME = 1;
		int empcheck = (int) (Math.random() * 10) % 2;
		System.out.println(empcheck);
		if (empcheck == isFULL_TIME)
			System.out.println("Employee is Present");

		else

			System.out.println("Employee is Absent");

	}

}
