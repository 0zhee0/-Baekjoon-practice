package baekjoon2_if;

import java.util.Scanner;

public class num2753 {

	public static void main(String[] args) {
		// 윤년
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //a는 윤년
		sc.close();
		
		if(a%4==0) {
            if(a%400==0)System.out.println("1");
            else if(a%100==0)System.out.println("0");
            else System.out.println("1");
		}
        else System.out.println("0");	
	}
}
