package com.digit.Project_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Course {
	Scanner sc = new Scanner(System.in);
	String cou_id;
	String cou_name;
	String cou_time;
	int cou_mark, n;

	public static ArrayList courseList = new ArrayList();
	public static ArrayList courseId = new ArrayList();

	void createCou() {
		System.out.print("Enter the no of Courses : ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			
			cou_id="C-"+(i+1);
			courseId.add(cou_id);
			System.out.println("Course Id: "+courseId.get(i));
			System.out.print("Enter course name : ");
			cou_name = sc.next();

			courseList.add(cou_name);
		}
		Iterator itr1 = courseId.iterator();
		Iterator itr2 = courseList.iterator();

		while (itr1.hasNext()) {
			System.out.println("Course Id: "+itr1.next()+"\nCourse Name : "+itr2.next());
		}
	}

}
