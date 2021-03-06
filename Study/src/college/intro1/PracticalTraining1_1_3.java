package college.intro1;

public class PracticalTraining1_1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ 算術基礎
		//【問題3-1】
		/*
		1500円の商品の消費税(8%)込みの値段は?
		(小数点以下切捨て)
		変数名:price、値:1500
		*/
		short price = 1500;
		price *= 1.08;
		System.out.println("税込み" + price + "円");
		
		
		//【問題3-2】
		/*
		半径10cmの円の面積 s2は?
		変数:r、値:10.0
		面積を求める方程式:面積 s2 = pai * r * r
		pai変数の定義:double pai = 3.14;
		*/
		System.out.println();//改行
		double r = 10.0;
		double pai = 3.14;
		double s2 = pai * r * r;
		System.out.println("半径10cmの円の面積：" + s2 + "㎠");
		
		
		//【問題3-3】
		//底辺3cm、高さ5cmの三角形の面積s3を求めなさい。
		System.out.println();//改行
		int b = 3;
		int h = 5;
		int s3 = b * h / 2;
		System.out.println("底辺3cm、高さ5cmの三角形の面積：" + s3 + "㎠");
		
		
		//【問題3-4】
		/*
		(x, y)座標がそれぞれ(0, 0), (8, 1), (5, 9)の3点からなる
		三角形の面積s4を求めなさい。
		(0, 0),(x1, y1),(x2, y2)の3点からなる三角形の面積は
		公式: 1/2(x1*y2 – x2*y1) の絶対値
		*/
		System.out.println();//改行
		int x1 = 8;
		int y1 = 1;
		int x2 = 5;
		int y2 = 9;
		int s4 = (1 / 2)|(x1 * y2) - (x2 * y1);
		System.out.println("(x, y)座標がそれぞれ(0, 0),(8, 1),(5, 9)"
							+ "\nの3点からなる三角形の面積：" + Math.abs(s4) + "㎠");

	}

}
