package college.intro1;

import java.util.Random;

public class PracticalTraining1_1_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ 三項演算子
		//【問題10】
		/*
		0から99の乱数を出し
		50以下のときはtrue、それ以外はfalseを表示しなさい。
		*/
		Random rnd = new Random();
		int value = rnd.nextInt(100);
		boolean isUnder = value <= 50 ? true : false; 
		System.out.println(value + "は" + isUnder);

	}

}
