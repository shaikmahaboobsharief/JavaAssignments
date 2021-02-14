package lab_1;

import java.util.Scanner;

public class Exercise_5 {
	public static void calculateSum() {
		Scanner number=new Scanner(System.in);
		System.out.println("enter the range of natural number needed that are divisible 3 or 5: ");
		int n=number.nextInt();
		number.close();
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		calculateSum();
	}

}
