package lab_1;

import java.util.Scanner;

public class Exercise_6 {
	public static void main(String[] args) {
		calculateDifference();
	}
	public static void calculateDifference() {
		Scanner number=new Scanner(System.in);
		System.out.println("entet the range of numbers: ");
		int n=number.nextInt();
		number.close();
		int sumofsquares=0;
		int squareofsum=0;
		for(int i=1;i<=n;i++) {
			squareofsum=squareofsum+i;
			sumofsquares=sumofsquares+(i*i);
		}
		int sum=sumofsquares-(squareofsum*squareofsum);
		System.out.println(sum);
	}

}
