package college.intro1;

import java.util.Random;

public class JavaExercise16 {
	static Random rnd = new Random();
	static int Asan = rnd.nextInt(3);
	static int Bsan = rnd.nextInt(3);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 16. メソッド(関数)2
		
		//【問題16】
		//②問題9のじゃんけんゲームを関数toHandStringを使用して作成。
		toHandString(Asan, Bsan);
	}
	
	//①Asan、Bsanの「グー」「チョキ」「パー」表示をする関数
	static String toHandString( int Asan, int Bsan) {
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
	return null;
	}

}
