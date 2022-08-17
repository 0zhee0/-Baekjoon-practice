package baekjoon3_for_while;

import java.util.Scanner;

public class num2739 {

	public static void main(String[] args) {
		// 구구단
		Scanner in = new Scanner(System.in);	
		int a = in.nextInt();
		
		in.close();		
		
		for(int i = 1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}

}
