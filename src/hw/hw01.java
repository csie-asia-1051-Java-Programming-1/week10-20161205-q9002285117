package hw;

import java.util.Scanner;

/*某間學校舉辦英文檢定測驗，若是學生通過該測驗，則能通過畢業門檻。老師準備的 英文測驗中分為三個項目當作考試，分別是聽力、閱讀、口說。每一個項目測驗滿分 皆為 100 分，總分為 300 分。想要通過測驗有兩種方式。方式一:若是三個項目分 數皆為 60 分以上 ( 包含 60 分 ) 即為通過測驗。方式二:若三個項目中有其中一 個項目分數未滿 60 分，但三個項目分數總合超過 220 分，也可算通過測驗。若三 個項目中有其中一個項目分數未滿 60 分，而三個項目分數總合也沒能超過 220 分，可獲得補考機會。若是三個項目中有兩個項目不及格，但另一個項目成績高於 80 分 ( 包含 80 分 ) ，也可獲得補考的機會。其餘皆判定為無法通過測驗。
說明: 第一行為一個整數 N ，代表共有 N 組測試資料。之後有 N 行，每一行有 3 個非 負整數 ( 範圍皆為 0 到 100), 分別代表該名學生聽力、閱讀、口說的測驗分數。
若是通過測驗，則輸出 ”P” 。若是需要補考，則輸出 ”M” 。若是無法通過測驗， 則輸出 ”F” 
*/
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入幾組:");
		int n = scn.nextInt();
		int listen, read, speak, sum;
		for (int i = 0; i < n; i++) {
			System.out.print("聽力:");
			listen = scn.nextInt();
			System.out.print("閱讀:");
			read = scn.nextInt();
			System.out.print("口說:");
			speak = scn.nextInt();
			sum = listen + read + speak;
			if (listen >= 60 && read >= 60 && speak >= 60 && sum <= 300) {
				System.out.println("P");
			} else if (listen < 60 && sum > 220 || read < 60 && sum > 220 || speak < 60 && sum > 220) {
				System.out.println("P");
			} else if (listen < 60 && read >= 60 && speak >= 60 && sum < 220
					|| listen >= 60 && read < 60 && speak >= 60 && sum < 220
					|| listen >= 60 && read >= 60 && speak < 60 && sum < 220) {
				System.out.println("M");
			} else if (listen < 60 && read < 60 && speak >= 80 || listen < 60 && read >= 80 && speak < 60
					|| listen >= 80 && read < 60 && speak < 60) {
				System.out.println("M");
			} else if (listen < 0 || listen > 100 || read < 0 || read > 100 || speak < 0 || speak > 100) {
				System.out.println("錯誤");
			} else {
				System.out.println("F");
			}
		}
	}

}
