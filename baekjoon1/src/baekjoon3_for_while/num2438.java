package baekjoon3_for_while;

import java.util.Scanner;

public class num2438 {

	public static void main(String[] args) {
		// 별 찍기 - 1
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
