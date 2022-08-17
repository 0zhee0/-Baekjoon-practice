package baekjoon3_for_while;

import java.util.Scanner;

public class num8393 {

	public static void main(String[] args) {
		//  합
		Scanner in = new Scanner(System.in);	
		int a = in.nextInt();	
		in.close();	
		
		int sum = 0;
		
		for(int i = 1; i<=a ;i++) {
			sum += i;			
		}	System.out.println(sum);	

	}

}
