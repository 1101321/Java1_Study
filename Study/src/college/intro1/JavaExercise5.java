package college.intro1;

public class JavaExercise5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 5. 多次元配列
		
		//【問題5】
		//int型の2次元配列aryを宣言し下記で初期化する。
		/*
		{
			{12, 2, 4, 3, 8, 6},
			{23},
			{34, 28, 17},
			{45, 3, 3, 5, 7}
		}
		*/
		//1次元目の要素数(行数)を調べよ。
		//各2次元目の要素数(列数)を調べよ。
		int[][] ary = { 
			{12,  2,  4,  3,  8,  6},
			{23},
			{34, 28, 17},
			{45,  3,  3,  5,  7}
		};
		System.out.println(ary[0].length);//1次元目の要素数(行数)
		System.out.println(ary.length);	  //各2次元目の要素数(列数)
		
		//◆ 演習
		//配列aryの要素中、28の入った要素を2倍し値を確認しなさい。
		System.out.println();
		ary[2][1] *= 2;
		System.out.println(ary[2][1]);

	}

}
