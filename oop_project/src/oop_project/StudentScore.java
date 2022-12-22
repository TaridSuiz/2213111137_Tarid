package oop_project;
import java.util.*;
public class StudentScore {
	// static Student stu = new Student();
	 static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("How many student in classt : ");
		int num = scn.nextInt();
		Student[] std = new Student[num];
		System.out.println();
		for (int i = 0 ; i<std.length ;i++) {
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("----------------------------------");
			std[i] = new Student();
			System.out.print("Input Student Name : ");
			std[i].setName(scn.next());
			System.out.print("Input Student Score : ");
			std[i].setScore(scn.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input Student Score, again :");
				std[i].setScore(scn.nextInt());
			}
			System.out.println();
			
			
		}
		
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50) ");
		System.out.println("----------------------------------");
		/*for(int i = 0 ; i<std.length;i++)
		{
			if(std[i].isPass()) {
				System.out.println(">> "+std[i].getName()+"("+std[i].getScore()+")");
			}
		}*/
		
		for(Student _std : std) {
			if(_std.isPass()) {
				System.out.println(">> "+_std.getName()+" get grade "+_std.findGrade(_std.getScore())+"");

			}
		}


	}

}
