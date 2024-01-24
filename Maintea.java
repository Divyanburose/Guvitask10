package task10;

public class Maintea extends Herbaltea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object is been created each sub class
Tea[] arrObj = {new Blacktea(), new Greentea(),new Herbaltea()};
for (Tea Obj : arrObj) {
Obj.preparetea();
Obj.addmilk();
Obj.addsugar();
}
	
	}

}
