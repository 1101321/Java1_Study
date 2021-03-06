package college.intro1;

public class JavaExercise3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 3. 算術基礎
		
		//【問題3_1】
		//int型変数ixとiyを宣言し、10と20を代入する。
		//次の算術結果、ixとiyの値は?
		System.out.println();
		int ix = 10;
		int iy = 20;
		iy = iy + ix;
		iy = iy * ix;
		System.out.println(ix);
		System.out.println(iy);
		
		//【問題3_2】
		//int型変数ixとiyとizを宣言し、ixに10を代入する。
		//次の算術結果、ixとiyとizの値は?
		System.out.println();
		ix = 10;
		int iz;
		iy = ix++;
		iz = ++ix;
		System.out.println(ix);
		System.out.println(iy);
		System.out.println(iz);
		
		//【問題3_3】
		//int型変数ixとiyを宣言し、0x7FFFFFFF(int型最大値)と
		//0x80000000(int型最小値)を代入し、ix, iy, ix+iyを確認せよ。
		System.out.println();
		ix = 0x7FFFFFFF;
		iy = 0x80000000;
		System.out.println(ix);
		System.out.println(iy);
		System.out.println(ix + iy);
		//何故0x7FFFFFFFが最大値なのか?
		System.out.println("Javaのint型は32ビットのみで符号付整数のため"
							+ "\n0x7FFFFFFFが最大値になる");
		//【問題3_4】
		//double型変数dxとdyを宣言し、(10. / 3.)と3.333333を代入し、
		//dx, dy, dx-dyを確認せよ。
		System.out.println();
		double dx = (10./3.);
		double dy = 3.333333;
		System.out.println(dx);
		System.out.println(dy);
		System.out.println(dx - dy);
		
		//◆ 演習
		//1980円の商品の消費税(8%)込みの値段を表示しなさい。
		System.out.println();
		int price = 1980;
		price *= 1.08;
		System.out.println("消費税込みの値段は" + price + "です");

	}

}
