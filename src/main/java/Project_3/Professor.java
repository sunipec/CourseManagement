package com.digit.Project_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Professor {
	Scanner sc = new Scanner(System.in);
	String pro_id;
	String pro_name, grade;
	String pro_exp;
	String pro_sub;
	Course c1 = new Course();
	Student s1 = new Student();
	int fmark = 100, mark, r = 0;
	boolean proflag = false;
	//String feedback, remark;
	public static ArrayList pro = new ArrayList();
	public static ArrayList proid = new ArrayList();
	public static ArrayList prosub = new ArrayList();
	public static ArrayList proexp = new ArrayList();
	public static ArrayList grading = new ArrayList();
	public static ArrayList remarking = new ArrayList();
	public static ArrayList stumark = new ArrayList();

	void createPro() {
		System.out.println("Enter the no. of professor  : ");
		int no_pro = sc.nextInt();
		for (int i = 0; i < no_pro; i++) {
			pro_id = "P-" + (i + 1);
			proid.add(pro_id);
			System.out.println("Professor Id : " + proid.get(i));

			System.out.print("Enter  Professor Name : ");
			pro_name = sc.next();
			pro.add(pro_name);

//			System.out.println("Enter The Exp Of the Professor");
//			pro_exp = sc.next();
//			proexp.add(pro_exp);

			addsub();
			if (!c1.courseList.contains(pro_sub)) {
				System.out.println("Select the courses that are available");
				addsub();
			} else {
				System.out.println("Successfully added");
				
			}

		}
		for (int i = 0; i < no_pro; i++) {
			System.out.println("Professor "+(i+1));
			System.out.println("ID : " + proid.get(i) + "\nName : " + pro.get(i)
					+ "\nCourse :  " + prosub.get(i) + " ");
			System.out.println("---------");

		}
	}

	void markep() {
		System.out.print("Enter the mark Out of 100 : ");
		mark = sc.nextInt();
		

		stumark.add(mark);
	}

	void addsub() {
		System.out.println("Select from available courses :");
		Iterator itr = c1.courseList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "   ");
		}
		System.out.println();

		pro_sub = sc.next();
		prosub.add(pro_sub);

	}

	void markstu(int i) {
		System.out.println("Welcome professor " + pro.get(i) + " " + "\nGrade the student\n");
		System.out.println("ID of the student :\033[1m" + s1.stuid.get(i) + "\033[0m");
		System.out.println("Name of the student :\033[1m" + s1.stuname.get(i) + "\033[0m");
		System.out.println("Course :\033[1m" + s1.stuCou.get(i) + "\033[0m");
		System.out.println("The Total mark for " + s1.stuCou.get(i) + " is :\033[1m100\033[0m ");
		markep();
//		System.out.println("Enter Grade: ");
//		grade = sc.next();
//		grading.add(remark);
//		System.out.println("Any remark :");
//		remark = sc.next();
//		remarking.add(remark);

		r = r + 1;
	}

	void getStumark(int i) {
		System.out.println("");
		System.out.println("Marksheet Of Student ");
		System.out.println("Student ID :" + s1.stuid.get(i));
		System.out.println("Student Name :" + s1.stuname.get(i));
		System.out.println("Course ID:" + c1.courseId.get(i));
		System.out.println("Course :" + s1.stuCou.get(i));
		System.out.println("You Scored Mark :" + stumark.get(i));
//		System.out.println("Your Grade :" + grading.get(i));
//		System.out.println("Your Remark :" + remarking.get(i) + "\033[0m");

	}

	void prologin() {
		String orgid = "P";
		String orgpass = "P1";

		System.out.print("Enter Professor Username : ");
		String name = sc.next();
		System.out.print("Enter Password : ");
		String pass = sc.next();

		if (orgid.equals(name) && orgpass.equals(pass)) {
			System.out.println("Professor Login Succesfully.");
			
			System.out.println("");
			proflag = true;
		} else {
			System.out.println("Invalid Credentials");
			System.out.println("Try Again..");
			prologin();
		}
	}

	// Getter And Setter
	public String getPro_id() {
		return pro_id;
	}

	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public String getPro_exp() {
		return pro_exp;
	}

	public void setPro_exp(String pro_exp) {
		this.pro_exp = pro_exp;
	}

	public Course getC1() {
		return c1;
	}

	public void setC1(Course c1) {
		this.c1 = c1;
	}

	public int getFullmark() {
		return fmark;
	}

	public void setFullmark(int fullmark) {
		this.fmark = fullmark;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	

}
