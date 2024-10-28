package application;
import java.util.Scanner;
public class ATM {
	static double amount=1000.0;
	public static void deposit(Scanner sc) {
		System.out.println("ENTER AMMOUNT TO DEPOSITE");
		double dep=sc.nextDouble();
		if(dep>0) {
			amount=amount+dep;
			System.out.println("SUCCESSFULLY ADDES ");
			System.out.println("your balance is :"+amount);
		}
		else {
			System.out.println("INVALID DATA");
		}	
	}
    public static void withdraw(Scanner scr) {
		System.out.println("ENTER WITHDRA AMOUNT");
		double wit=scr.nextFloat();	
		if(wit<amount) {
			amount=amount-wit;
			System.out.println("SUCCESSFUL TRANSACTION");
			System.out.println("your Current balance is :"+amount);
		}
		else {
			System.out.println("INSUFICIENT BALANCE");
		}
		
	}

   public static void balance() {
	System.out.println("YOUR CURRENT BALANCE is  "+amount);
    }   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	boolean selection=true;
     while(selection) {
		System.out.println("PLEASE CHOOSE YOUR OPERATIOM AMONG THE FOLLOWING ");
		System.out.println("press......1 for DEPOSIT");
		System.out.println("press......2 for WITHDRAW");
		System.out.println("press......3 for CHECK BALANCE");
		System.out.println("press......4 EXIT");
		int opa=sc.nextInt();

		switch(opa) {
		case 1:deposit(sc);
			break;
		case 2:withdraw(sc);
			break;
		case 3:balance();
			break;
		case 4: System.out.println("Exit");
				selection=false;
				break;
		default:System.out.println("Invalid option");
		}
		
		}
	}
}
