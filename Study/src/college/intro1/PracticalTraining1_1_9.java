package college.intro1;

import java.util.Random;

public class PracticalTraining1_1_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ switch文
		Random rnd = new Random();
		//【問題9-1】
		/*
		0から2の乱数を出して
		0:グー、 1:チョキ、 2:パーを表示しなさい。
		*/
		int hand = rnd.nextInt(3);
		switch(hand) {
		 case 0:
			 System.out.println("グー");
			 break;
		 case 1:
			 System.out.println("チョキ");
			 break;
		 case 2:
			 System.out.println("パー");
		}
		
		//【問題9-2】
		//100回試行し、それぞれの出た回数を調べなさい。
		System.out.println();//改行
		int guh = 0;
		int cyoki = 0;
		int pah = 0;
		for(int i = 0; i <= 100; i++) {
			hand = rnd.nextInt(3);
			switch(hand) {
			 case 0:
				 System.out.println("グー");
				 guh++;
				 break;
			 case 1:
				 System.out.println("チョキ");
				 cyoki++;
				 break;
			 case 2:
				 System.out.println("パー");
				 pah++;
			}
		}
		System.out.println("グーが出た回数：" + guh + "回");
		System.out.println("チョキが出た回数：" + cyoki + "回");
		System.out.println("パーが出た回数：" + pah + "回");
		
		//【問題9-3】
		//2019年9月の指定された日付の曜日をswitch文を使って調べなさい。
		System.out.println();//改行
		int day = 20; //任意の日付
		System.out.print("2019年9月"+day+"日は");
		int week = day % 7;
		switch(week) {
			case 0:
				System.out.println("土曜日です。");
				break;
			case 1:
				System.out.println("日曜日です。");
				break;
			case 2:
				System.out.println("月曜日です。");
				break;
			case 3:
				System.out.println("火曜日です。");
				break;
			case 4:
				System.out.println("水曜日です。");
				break;
			case 5:
				System.out.println("木曜日です。");
				break;
			case 6:
				System.out.println("金曜日です。");
		}
		
		//◆ おまけ(if / switchを使わず)
		//【問題9-4】
		/*
		2019年9月の指定された日付の曜日を調べなさい。
		String[ ] weekStr = {"日曜日","月曜日","火曜日"・・・};
		を使用して作成しなさい。
		*/
		System.out.println();//改行
		String[] weekStr = {"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};
		day = 29; //任意の日付
		int index = day % 7 - 1;
		System.out.print("2019年9月"+day+"日は");
		System.out.println(weekStr[index] + "です");

	}

}
