package strings;

import java.util.Scanner;
//Student details using methods

class Student {
	// creating member variables
	int rno;
	int ja,c,phy,tel,eng;
	String name;
	float marks,avg;
	Scanner sc = new Scanner(System.in);
	// method for user input for the data
	public void inputData() {
		System.out.println("Enter your Rno: ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your JAVA marks: ");
		ja=sc.nextInt();
		System.out.println("Enter your C marks: ");
		c=sc.nextInt();
		System.out.println("Enter your PHYSICS marks: ");
		phy=sc.nextInt();
		System.out.println("Enter your TELUGU marks: ");
		tel=sc.nextInt();
		System.out.println("Enter your ENGLISH marks: ");
		eng=sc.nextInt();
	}
	// method for user display for the data
	public void displayData() {
		System.out.println("-----STUDENT DETAILS-----");
		System.out.println("Rno : "+rno);
		System.out.println("Name : "+name);
		System.out.println("---------------MARKS-------------------");
		System.out.println("Enter your JAVA marks: "+ja);
		System.out.println("Enter your C marks: "+c);
		System.out.println("Enter your PHYSICS marks: "+phy);
		System.out.println("Enter your TELUGU marks: "+tel);
		System.out.println("Enter your ENGLISH marks: "+eng);
		System.out.println("----------------------------------------");
		marks=ja+c+phy+tel+eng;
		System.out.println("Your Total Marks : "+marks);
		avg=marks/5;
		System.out.println("Enter your Average marks: "+avg);
	}
	
}
public class StudentData {
	public static void main(String[] args) {
		Student std = new Student();
		std.inputData();
		std.displayData();
	}
	

}
