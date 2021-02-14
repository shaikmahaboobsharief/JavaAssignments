package lab_1;

public class Exercise_1 {
	public static void main(String[] args) {
		int n=10;
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum-sum;
			sum=sum+(i*i*i);
			System.out.println(sum);
		}
	}

}
