package lab_1;

import java.util.Scanner;

public class Exercise_8 {
	public static void main(String[] args) {
			calculateNumber();
	}
	public static boolean calculateNumber() {
		Scanner number=new Scanner(System.in);
		System.out.println("enter number to check the power its 2:");
		int n=number.nextInt();
		number.close();
		if(n==0) {
			System.out.println("enter a valid number");
		}
		while(n!=1) {
			if(n%2!=0) {
				System.out.println("false");
				break;
			}
			else {
				n=n/2;
				if(n==1) {
					System.out.println("true");	
				}
			}	
		}
		return false;
		
	}

}
