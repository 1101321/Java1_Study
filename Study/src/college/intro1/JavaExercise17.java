package college.intro1;

public class JavaExercise17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 17. 引数の値渡し
		
		//【問題17】
		/*
		下記メソッドを使用して値の1/2を求めなさい。
		static int div2( int x ) {
			x = x / 2;
			return x;
		}
		このとき、引数に指定した値はdiv2実行前後で変わらないことを
		確認しなさい。
		*/
		int x = 15;
		System.out.println(x);
		div2(x);
		System.out.println(x);

	}
	
	static int div2( int x ) {
		x = x / 2;
		return x;
	}

}
