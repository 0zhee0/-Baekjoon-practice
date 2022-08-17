package baekjoon3_for_while;

import java.util.Scanner;

public class num2439 {

	public static void main(String[] args) {
		// 별 찍기 - 2
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
