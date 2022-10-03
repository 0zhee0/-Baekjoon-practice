package baekjoon1;

import java.util.Scanner;

public class num3003 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int King = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		King = King - in.nextInt();
		queen = queen - in.nextInt();
		rook = rook - in.nextInt();
		bishop = bishop - in.nextInt();
		knight = knight - in.nextInt();
		pawn = pawn - in.nextInt();
		
		System.out.println(King + "");
		System.out.println(queen + "");
		System.out.println(rook + "");
		System.out.println(bishop + "");
		System.out.println(knight + "");
		System.out.println(pawn + "");
	}

}
