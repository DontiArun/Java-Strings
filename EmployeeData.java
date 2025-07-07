package strings;
import java.util.Scanner;
///Employee details using methods

class Emplyoee {
	//creating member variables
	    int id;
	    int salary;
	    float ta=1700;
	    float pf=0.2f;
	    String name;
	    Scanner sc = new Scanner(System.in);
	 // method for user input for the data
	    public void InputData(){
	    	System.out.println("Enter Employee ID : ");
	    	id=sc.nextInt();
	    	sc.nextLine();
	    	System.out.println("Enter Employee Name : ");
	    	name=sc.nextLine();
	    	System.out.println("Enter Employee Salary : ");
	    	salary=sc.nextInt();
	    	
	    }
	    //method for diplaying data
	    public void ShowDetails(){
	    	System.out.println("-----------EMPLOYEE DETAILS-------------");
	    	System.out.println("Employee ID : "+id);
	    	System.out.println("Employee Name : "+name);
	    	
	    	System.out.println("Your Travel Allowence Amount is : "+ta);
	    	
	    	System.out.println("-------------AFTER PF AMOUNT DEDUCTION-------------------");
	    	pf=salary*pf;
	    	System.out.println("Your PF Amount Debited this month is : "+pf);
	    	salary =(int) (salary-pf);
	    	System.out.println("Employee Salary : "+salary);

	    	System.out.println("--------------AFTER TF AMOUNT ADD-----------------");
	    	salary+=ta;
	    	System.out.println("Employee Salary : "+salary);
	 
}
}
 public class EmployeeData{
	 public static void main(String[] args) {
		 Emplyoee emp = new Emplyoee();
		 emp.InputData();
		 emp.ShowDetails();
	 }
 }