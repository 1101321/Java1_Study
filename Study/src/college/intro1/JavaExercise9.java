package college.intro1;

import java.util.Random;

public class JavaExercise9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 9. switch文制御
		
		//【問題9】
		//じゃんけんゲーム
		/*
		乱数を2個出し勝敗を表示する。(0:グー, 1:チョキ, 2:パー)
		表示: Aさん:グー
		Bさん:パー
		Bさんの勝ち
		*/
		Random rnd = new Random();
		int Asan = rnd.nextInt(3);
		int Bsan = rnd.nextInt(3);
		switch(Asan) {
			case 0:
				System.out.println("Aさん:グー");
				break;
			case 1:
				System.out.println("Aさん:チョキ");
				break;
			default:
				System.out.println("Aさん:パー");
		}
		
		switch(Bsan) {
			case 0:
				System.out.println("Bさん:グー");
				break;
			case 1:
				System.out.println("Bさん:チョキ");
				break;
			default:
				System.out.println("Bさん:パー");
		}
		
		switch(Asan - Bsan) {
			case -1, 2:
				System.out.println("Aさんの勝ち");
				break;
			case 0:
				System.out.println("あいこです");
				break;
			default:
				System.out.println("Bさんの勝ち");
		}
		
		//◆ 演習
		//おみくじ作成
		/*
		0~9の乱数を出して、0は大吉、2と3は吉、5は凶
		それ以外は小吉とする。
		*/
		System.out.println();
		int kuji = rnd.nextInt(10);//0～9
		switch(kuji) {
			case 0:
				System.out.println("大吉");
				break;
			case 2, 3:
				System.out.println("吉");
				break;
			case 5:
				System.out.println("凶");
				break;
			default:
				System.out.println("小吉");
		}

	}

}
