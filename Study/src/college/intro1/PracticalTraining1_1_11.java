package college.intro1;

import java.util.Random;
import java.util.Scanner;

public class PracticalTraining1_1_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ 数当てゲーム
		//【問題11】
		/*
		0から99の乱数を出し、答えが上か下かを表示し数を
		当てる。while(true)を使って当たるまでループ。
		*/
		try (Scanner input = new Scanner(System.in)) {
			Random rnd = new Random();
			int value = rnd.nextInt(100);
			System.out.println("数当てゲーム開始!");
			while(true) {
				int num = input.nextInt(); // 数字入力
				if(num >= 100) {
					System.out.println("２桁の数字を入力してください。");
                    continue;
				} 
				int diff = Math.abs(value - num);
                if (diff >= 20) {
                    System.out.print("もっと");
                }
                
				if (num > value) {
					 System.out.println("小さな値です");
				} else if(value > num) {
					System.out.println("大きな値です");
				} else {
					System.out.println("正解です！！");
                    break;
				}
			}
		} 
	}

}
