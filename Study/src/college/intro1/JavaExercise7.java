package college.intro1;

public class JavaExercise7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 7.for文制御、for文制御(多重ループ)
		
		//【問題7_1】
		//double型変数dxを宣言し、1000.で初期化。
		//for文を使用して50回平方根を求め、1.0に収束する様を観察しなさい。
		System.out.println();
		double dx = 1000.;
		for(int i = 1; i <= 50; i++){
			dx = Math.sqrt(dx);
			System.out.println(dx);
		}
		
		//【問題7_2】
		/*
		int型の多次元配列ary[ ][ ]を宣言し、
		{ {12,2,2,3}, {23}, {34,2,17}, {45,3,3,5} }で初期化する。
		全要素の値を2倍にしなさい。その後で、全要素の値を確認しなさい。
		*/
		System.out.println();
		int[][] ary = {
			{12,2,2,3},
			{23}, 
			{34,2,17}, 
			{45,3,3,5} 
		};
		for(int i = 0; i < 4; i++) {
			System.out.print(i+"行目は");
			for(int j = 0; j < ary[i].length; j++) {
				ary[i][j] *= 2;
				System.out.print(ary[i][j]+" ");
			}
			System.out.println("です");
		}
		
		
		//◆ 演習
		//年利3%の半年複利に1万円を10年預けると金額はいくらになるか?
		System.out.println();
		int money = 10000;
		for(double i = 0; i < 10; i+=0.5) {
			money *= 1.015;
		}
		System.out.println("10年後の預金は"+money+"円です");

	}

}
