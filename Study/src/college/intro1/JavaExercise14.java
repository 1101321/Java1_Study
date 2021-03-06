package college.intro1;

public class JavaExercise14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 14. ビット演算
		
		//【問題14_1】
		/*
		int型変数ixを宣言し、0b1を代入する。
		1ビットシフト<<1を32回繰り返し値が下記になること確認する。
		31回目でマイナスの値になり、32回目でゼロになる。
		*/
		int ix = 0b1;
		for(int i = 1; i <= 32; i++) {
			ix <<= 1;
			System.out.println(ix);
		}
	
		//【問題14_2】
		/*
		int型変数ixとiyを宣言し、0b11000011と0b11110000を代入。
		論理積、論理和、排他的論理和それぞれの値、ixの否定を確認。
		*/
		System.out.println();//改行
		
		ix = 0b11000011;
		int iy = 0b11110000;
		System.out.println(ix & iy);//論理積
		System.out.println(ix | iy);//論理和
		System.out.println(ix ^ iy);//排他的論理和
		System.out.println(~ix);	//ixの否定
		String strA = Integer.toString(ix, 2);//2進数文字列
		String strB = Integer.toString(iy, 2);//2進数文字列
		System.out.println(strA);
		System.out.println(strB);

	}

}
