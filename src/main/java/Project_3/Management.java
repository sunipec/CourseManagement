package com.digit.Project_3;

import java.util.ArrayList;
import java.util.Scanner;

class Admin {
	Scanner sc = new Scanner(System.in);
//	Course c1;
//	Professor p1;
//	Student s1;
	boolean flag;
	int roles;
	Student stu1 = new Student();
	Professor pro1 = new Professor();
	Course cou1 = new Course();

	void adminlogin() {
		System.out.println("$$$------WELCOME TO COURSE MANAGEMENT APPLICATION------$$$");
		System.out.println();
		String orgid = "A";
		String orgpass = "A1";

		System.out.print("Enter Admin Username : ");
		String name = sc.next();
		System.out.print("Enter Admin Password : ");
		String pass = sc.next();

		if (orgid.equals(name) && orgpass.equals(pass)) {
			System.out.println();
			System.out.println("Admin Login Succesfully.");
			
			System.out.println("");
			flag = true;
			System.out.println("Register the Courses\n");
			cou1.createCou();
			System.out.println("Register the Professor\n");
			pro1.createPro();
			System.out.println("Register the Students\n");
			stu1.createStu();

		} else {
			System.out.println("Invalid Credentials");
			System.out.println("Try Again");
			adminlogin();
		}

		role();
		System.out.println("Thank You...");
	}

	void role() {
		System.out.println("Enter 1 to login as Professor \n"
				+ "Enter 2 to login as Student \n");

		roles = sc.nextInt();
		if (roles==1) {
			professorlogin();
		} else if (roles==2) {
			studentlogin();
		}
	}

	void professorlogin() {

		System.out.println("\nLogin first to Grade Student");
		pro1.prologin();
		if (pro1.proflag) {
			
			for (int i = 0; i < stu1.stuid.size(); i++) {
				pro1.markstu(i);

			}
			studentlogin();
		}
	}

	void studentlogin() {
		System.out.println("Login to check Student marks ");
		stu1.stulogin();
		if (stu1.stuflag) {
			if (pro1.r == 0) {
				System.out.println("Your are not Graded by the Professor.");
				System.out.println("Ask Professor to grade ");
				professorlogin();
			} else {
				for (int i = 0; i < stu1.stuid.size(); i++) {
					pro1.getStumark(i);
				}
			}
		}
	}

}

public class Management {
	Scanner sc = new Scanner(System.in);
	boolean flag = false;

	public static void main(String[] args) {

		Admin adm = new Admin();
		adm.adminlogin();

	}
}
