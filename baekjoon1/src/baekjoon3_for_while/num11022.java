package baekjoon3_for_while;

import java.util.Scanner;

public class num11022 {

	public static void main(String[] args) {
		// A+B - 8
		Scanner in = new Scanner(System.in);	
		int a = in.nextInt();
			
		for(int i = 1; i<=a;i++) {
			int b = in.nextInt();
			int c = in.nextInt();
			int sum = b + c;
			
			System.out.println("Case #" + i + ": " + b + " + " + c + " = " + sum);
		}
		in.close();

	}

}
