package baekjoon1;

import java.util.Scanner;

public class num1008 {

	public static void main(String[] args) {
		//A/B 
		
        Scanner ab = new Scanner(System.in);
        
        double A = ab.nextInt();
        double B = ab.nextInt();
        
        ab.close();
        System.out.println(A/B);		
	}

}
