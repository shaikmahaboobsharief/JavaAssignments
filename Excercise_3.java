package lab_1;

import java.util.Scanner;

public class Excercise_3 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range of the Fibonacci sequence needed: ");
		int n=s.nextInt();
		s.close();
		System.out.println("the fibonacci sequence is:");
		for(int i=1;i<=n;++i) {
			c=a+b;
			System.out.println(c+"\t");
			a=b;
			b=c;	
		}
	}

}
