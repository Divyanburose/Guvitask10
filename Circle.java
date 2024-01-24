package task10;

import java.util.Scanner;
class Circumferenceofcircle {
	double radius;
	public Circumferenceofcircle() {
		this.radius = 1.0;//Radius value is been declared
		
		
	}
	public Circumferenceofcircle(double radius) {
		this.radius = radius;
	}
	public void Circumference() {
		double Circumference = 2*3.14*radius;//circumference calculation
		System.out.println("Circumference of a circle is:"+Circumference);
	}
}

public class Circle {
public static void main(String[] args) {
		// TODO Auto-generated method stub
//Two objects were created
Circumferenceofcircle obj = new Circumferenceofcircle();
obj.Circumference();
Circumferenceofcircle obj1 = new Circumferenceofcircle(10);	
	obj1.Circumference();
	}

}
