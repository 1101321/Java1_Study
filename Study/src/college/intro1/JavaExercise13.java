package college.intro1;

import java.util.Random;

public class JavaExercise13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 13. 三項演算子
		
		//【問題13】
		/*
		丁半ゲーム
		1から6までの乱数を2個出し丁半を表示。
		2個のサイコロの合計が偶数なら「丁」奇数なら「半」と表示。
		三項演算子を使用して丁半を表示すること。
		*/
		
		Random rnd = new Random();
		int diceA = rnd.nextInt(6)+1;
		int diceB = rnd.nextInt(6)+1;
		String result = (diceA + diceB) % 2 == 0  ? "丁" : "半"; 
		System.out.println(diceA + "、" + diceB + "の" + result);
	}

}
