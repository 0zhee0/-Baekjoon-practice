package baekjoon3_for_while;

import java.util.Scanner;

public class num10952 {

	public static void main(String[] args) {
		// A+B - 5
		Scanner in = new Scanner(System.in);
		
		while(true){
		
			int A=in.nextInt();
			int B=in.nextInt();
		
			if(A==0 && B==0){
				in.close();
				break;
			}
			else{System.out.println(A+B);}
		}

	}

}
