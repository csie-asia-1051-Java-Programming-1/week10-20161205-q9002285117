package hw;

import java.util.Scanner;

/*有一種坊間常見的遊戲稱為 "18 啦 "~ 玩法介紹 : 由四個骰子來擲，只要其中任兩 個是相同點，才開始計算點數，點數即為另兩個點數相加，若另兩個也一樣，則取較 大的一組相加，另外有下列幾種特殊情況:
*擲出 4 顆骰子點數均相同，稱為通殺 !
*任三顆點數相同或四顆點數均不相同，即為無意義 ! 請寫一程式，各別輸入四顆骰子點數，判斷結果 !
*/
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入四顆點數");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		if (a == b && c != d && a != c && a != d) {
			System.out.println(c + d);
		} else if (a == c && b != d && a != b && a != d) {
			System.out.println(b + d);
		} else if (a == d && b != c && a != b && a != c) {
			System.out.println(b + c);
		} else if (b == c && a != d && a != b && a != c) {
			System.out.println(a + d);
		} else if (b == d && a != c && a != b && b != c) {
			System.out.println(a + c);
		} else if (c == d && a != b && a != c && b != c) {
			System.out.println(a + b);
		} else if (a == b && c == d && a != c) {
			if (a > b) {
				System.out.println(a + b);
			} else {
				System.out.println(c + d);
			}
		} else if (a == c && b == d && a != b) {
			if (a > b) {
				System.out.println(a + c);
			} else {
				System.out.println(b + d);
			}
		} else if (a == d && b == c && a != b) {
			if (a > b) {
				System.out.println(a + d);
			} else {
				System.out.println(b + c);
			}

		} else if (a == b && b == c && c == d) {
			System.out.println("通殺");
		} else {
			System.out.println("無意義");
		}
	}

}
