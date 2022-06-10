package college.intro1;

public class JavaExercise1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		System.out.println("Hello!!");

		//■ 1. 変数宣言
		
		//【問題1_1】
		//int型変数ixとiyを宣言し、10と20を代入する。
		System.out.println();
		int ix = 10;
		int iy = 20;
		System.out.println("ix = " + ix + " iy = " + iy);

		//【問題1_2】
		//double型変数dxとdyを宣言し、10.5と20.25を代入する。
		System.out.println();
		double dx = 10.5;
		double dy = 20.25;
		System.out.println("dx = " + dx + " dy = " + dy);

		//【問題1_3】
		//short型変数sxとsyを宣言し、0x10と0x20を代入する。
		//16進数表記 ( hexadecimal )
		System.out.println();
		short sx = 0x10;
		short sy = 0x20;
		System.out.println("sx = " + sx + " sy = " + sy);

		//◆ 演習
		//円周率(pai)に3.141592を設定し表示しなさい。
		System.out.println();
		double pai = 3.141592;
		System.out.println("pai = " + pai);

		//木星との距離(JupiterDistance)に750,000,000を設定し表示しなさい。
		long JupiterDistance = 750000000L;
		System.out.println(JupiterDistance);

		//float型変数(root)に2.2360679Fを設定し表示しなさい。
		float root = 2.2360679F;
		System.out.println(root);
		
	}

}
