package baekjoon3_for_while;

import java.util.Scanner;

public class num10950 {

	public static void main(String[] args) {
		// A+B - 3
		Scanner in = new Scanner(System.in);
		 
		int c = in.nextInt();
		int arr[] = new int[c];
 
		for (int i = 0; i < c; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr[i] = a + b;
		}
		in.close();
 
		for (int k : arr) {
			System.out.println(k);
		}

	}

}
