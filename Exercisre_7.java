package lab_1;

import java.util.Scanner;

public class Exercisre_7 {
	public static void checkNumber() {
		Scanner number=new Scanner(System.in);
		System.out.println("Check the number is increasing: ");
		int n=number.nextInt();
		number.close();
		while(n!=0) {
			int a=n%10;
			n=n/10;
			int b=n%10;
			if(a<b) {
				System.out.println("false");
				break;
			}
			else {
				if(n==0) {
					System.out.println("true");
				}
			}
		}
		
	}
	public static void main(String[] args) {
		checkNumber();
		
	}
}
