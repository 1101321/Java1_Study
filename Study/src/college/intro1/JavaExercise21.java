package college.intro1;

public class JavaExercise21 {
	static final double DIFF = 1.0e-10;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 21. 定数
		//【問題21】(問題8改)
		/*
		double型変数dxを宣言し、1000.で初期化。
		while文を使用してdxの平方根繰り返しで1.0との差が
		1.0e-10以下になるのは何回目か求めよ。(break文使用禁止)
		*/
		int count = 0;
		double dx = 1000.;
		do {
			dx = Math.sqrt(dx);
			System.out.println(dx);
			count++;
		} while(dx - 1.0 <= DIFF);
		
		System.out.println(count + "回目です");

	}

}
