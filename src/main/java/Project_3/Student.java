package com.digit.Project_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String stu_id, stu_name, stu_course,sdet;
	int stu_mark, n, j = 0;
	boolean stuflag = false;
	Course c2;
	Professor p2;
	public static ArrayList stuname = new ArrayList();
	public static ArrayList stuid = new ArrayList();
	public static ArrayList stuPro = new ArrayList();
	public static ArrayList stuCou = new ArrayList();
	public static ArrayList stuDet = new ArrayList();


	void stulogin() {
		String orgid = "S";
		String orgpass = "S1";

		System.out.print("Enter  Username : ");
		String name = sc.next();

		System.out.print("Enter Password : ");
		String pass = sc.next();

		if (orgid.equals(name) && orgpass.equals(pass)) {
			System.out.println("Student Login Succesfully.");
			
			System.out.println("");
			stuflag = true;
		} else {
			System.out.println("Invalid Credentials");
			System.out.println("Try Again..");
			stulogin();
		}
	}

	void createStu() {
		System.out.print("Enter the no. of Student : ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			stu_id = "S-"+(i+1);
			stuid.add(stu_id);
			System.out.println("Student Id : "+stuid.get(i));

			System.out.print("Student Name : ");
			stu_name = sc.next();
			stuname.add(stu_name);

			System.out.println("Course Available for the Student ");
			Iterator itr3 = c2.courseList.iterator();

			while (itr3.hasNext()) {
				System.out.print("\033[1m" + itr3.next() + "\033[0m    ");
			}
			System.out.println();
			studentCou();

		}

	}

	void studentCou() {
		System.out.println("Enter Course for the Student: ");
		stu_course = sc.next();
		for (int i = 0; i < c2.courseList.size(); i++) {
			if (stu_course.equalsIgnoreCase((String) c2.courseList.get(i))) {
				stuCou.add(i,c2.courseList.get(i));
				stuPro.add(i,p2.pro.get(i));
			}
		}
	}
	
	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}



	public int getStu_mark() {
		return stu_mark;
	}

	public void setStu_mark(int stu_mark) {
		this.stu_mark = stu_mark;
	}

	public Course getC2() {
		return c2;
	}

	public void setC2(Course c2) {
		this.c2 = c2;
	}

}
