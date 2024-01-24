package task10;

public class PersonQuestion1 {
	
private String n1;
private int n2;

public PersonQuestion1 (String name) {
n1 = name;//declaring local variable n1 as name
}	
	
public String getn1() {
	return n1;
}

public PersonQuestion1 (int age) {
n2 = age;//declaring local variable n2 as age
}
public int getn2() {
	return n2;
}			
public static void main(String[] args) {
		// TODO Auto-generated method stub
//object creation 
	PersonQuestion1 obj = new PersonQuestion1("Divya");
System.out.println(obj.getn1());
PersonQuestion1 obj1 = new PersonQuestion1(28);
System.out.println(obj1.getn2());	
		
	}
}

