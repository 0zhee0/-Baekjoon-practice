package baekjoon2_if;

import java.util.Scanner;

public class num1330 {

	public static void main(String[] args) {
		// 두 수 비교하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        if ( a<b ) {
            System.out.println("<");
        }else if ( a==b ) {
            System.out.println("==");
        }else {
            System.out.println(">");}

	}

}
