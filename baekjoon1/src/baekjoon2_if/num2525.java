package baekjoon2_if;

import java.util.Scanner;

public class num2525 {

	public static void main(String[] args) {
		// 오븐 시계
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
 
        int c = in.nextInt();
 
        int min = 60 * a + b;   // 시 -> 분
        min += c;
 
        int h = ( min / 60) % 24;
        int m = min % 60;
 
        System.out.println(h + " " + m);

	}

}
