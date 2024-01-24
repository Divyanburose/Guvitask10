package task10;

import java.util.Scanner;

public class EmployeeQuestion2 {
 private int id;
 private String Firstname;
 private String Lastname;	
 private int Salary;
 // Constructor
 public EmployeeQuestion2(int id, String Firstname, String Lastname,int Salary) {
 this.id = id;
 this.Firstname = Firstname;
 this.Lastname = Lastname;
 this.Salary = Salary;
 }
// Getter methods for Employee Id
  
 public int getid() {
return id;
 }
	
//Getter methods for Firstname
 
public String getFirstname() {
return Firstname;
}	
	
//Getter methods for Lastname


public String getLastname() {
return Lastname;
}		


//Getter methods for name

public String getName() {
return Firstname + Lastname;
}		

//Getter methods for Salary
public void setSalary(int Salary) {
	this.Salary=Salary;
}
public int getSalary() {
return Salary;
}	
	
//Getter methods for Annual Salary
public int getAnnualSalary() {
return Salary*12;
}		
	
//Setter and Getter methods for Raise Salary
public int raiseSalary(int percentage) {
	double raiseSalary = Salary * (percentage/100.0);
	System.out.println("raiseSalary");
	return Salary+=raiseSalary;
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Id:");
int Id = sc.nextInt();
System.out.println("Enter the First name:");
String Firstname = sc.next();
System.out.println("Enter the Last name:");
String Lastname = sc.next();
System.out.println("Printing the Name:"+Firstname +Lastname);
System.out.println("Enter the Salary:");
int Salary = sc.nextInt();




EmployeeQuestion2 obj = new EmployeeQuestion2(Id,Firstname,Lastname,Salary);
obj.getid();
obj.getFirstname();
obj.getLastname();
obj.getName();
obj.getSalary();
System.out.println("Annual Salary:"+obj.getAnnualSalary());
System.out.println(obj.raiseSalary(20) );

	
	}
	
}

