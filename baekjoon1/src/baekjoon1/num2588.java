package baekjoon1;

import java.util.Scanner;

public class num2588 {

	public static void main(String[] args) {
		// 곱셈
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        
        in.close();
        
        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
	}

}
