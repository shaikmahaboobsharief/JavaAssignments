package lab_1;

import java.util.Scanner;

public class Exercise_2 {
	public static void main(String[] args) {
		Scanner traffic_light=new Scanner(System.in);
		System.out.println("Select a Traffic Signel Light(Red-Yellow-Green: ");
		String light=traffic_light.next();
		traffic_light.close();
		switch(light.length()) {
		case 3:
			System.out.println("stop");
			break;
		case 6:
			System.out.println("ready");
			break;
		case 5:
			System.out.println("go");
			break;
		}
		
	}

}
