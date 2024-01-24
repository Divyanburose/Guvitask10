package task10;

import java.util.Scanner;

class Account{
	static int actualamount;
    
     public Account() {
    	 Account.actualamount = 50000;
     }
public static void withdrawbalance(int num1) {
	//Calculating withdraw
	int withdraw = actualamount - num1;
	System.out.println("Withdraw balance is:"+withdraw);
}
public static void depositbalance(int num2) {
	
	//calculating deposit
	int deposit = actualamount + num2;
	System.out.println("Balance after deposit is:"+deposit);
}

}

public class Accountclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();//object creation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw amount:");
		int num1 = sc.nextInt();//getting value from user scanner is used
		Account.withdrawbalance(num1);

		
		System.out.println("Enter deposit amount:");
		int num2 = sc.nextInt();//getting value from user scanner is used
		Account.depositbalance(num2);

	}

}
