package college.intro1;

public class JavaExercise8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 8. while文制御
		
		//【問題8】
		//double型変数dxを宣言し、1000.で初期化。
		//while文を使用してdxの平方根繰り返しで1.0との差が
		//1.0e-10以下になるのは何回目か求めよ。(break文使用禁止)
		int count = 0;
		double dx = 1000.;
		double diff = 1.0e-10;//0.0000000001
		do {
			dx = Math.sqrt(dx);
			System.out.println(dx);
			count++;
		} while(dx - 1.0 <= diff);
		
		System.out.println(count + "回目です");
		
		//◆ 演習
		//演習7の問題で、金額が1万5千円を超えるのは何年後か?
		System.out.println();//改行
		
		int money = 10000;
		count = 0;
		while(money <= 15000) {
			money *= 1.015;
			count++;
		}
		System.out.println((double)count/2+"年");
	}

}