package ex;

import java.util.Scanner;

/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021038 傅琬鈞
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float sum1 = 0;
		float sum2=0;
		if (n <= 120) {
			sum1 = (float) (n * 2.1);
			sum2 = (float) (n * 2.1);
		}
		if (n > 120 && n <= 330) {
			sum1 = (float) ((120*2.1)+(n-120) * 3.02);
			sum2 = (float) ((120*2.1)+(n-120) *2.68);
		}
		if (n > 330 && n <= 500) {
			sum1 = (float) ((120*2.1)+((330-120)*3.02)+(n-330) * 4.39);
			sum2 = (float) ((120*2.1)+((330-120)*2.68)+(n-330) * 3.61);
		}
		if (n > 500 && n <= 700) {
			sum1 = (float) ((120*2.1)+((330-120)*3.02)+((500-330)*4.39)+(n-500) * 4.97);
			sum2 = (float) ((120*2.1)+((330-120)*2.68)+((500-330)*3.61)+(n-500) * 4.01);
		}
		if (n > 700) {
			sum1 = (float) ((120*2.1)+((330-120)*3.02)+((500-330)*4.39)+((700-500)*4.97)+(n-700) * 5.63);
			sum2 = (float) ((120*2.1)+((330-120)*3.68)+((500-330)*3.61)+((700-500)*4.01)+(n-700) * 4.50);
		}
		System.out.println("夏月電費:"+sum1);
		System.out.println("非夏月電費:"+sum2);
	}

}
