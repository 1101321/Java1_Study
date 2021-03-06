package college.intro1;

public class JavaExercise18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 18.1 引数の参照渡し
		//【問題18_1】
		/*
		下記メソッドを使用して複数の値の1/2を求めなさい。
		このとき、引数に指定した配列の値はdiv2実行後で変わっている
		ことを確認しなさい。
		*/
		System.out.println();//改行
		int[] x = {2, 6, 8, 9, 18};
		System.out.println(x[4]);
		div2(x);
		System.out.println(x[4]);
		
		
		//■ 18.2 引数の参照渡し(Stirng型編)
		//【問題18_2】
		/*
		下記メソッドを使用して文字列に“AiP College”を追加しなさい。
		このとき、引数に指定した文字列の値はchange実行前後で
		変わらないことを確認しなさい。
		*/
		System.out.println();//改行
		String name = "Java";
		System.out.println(name);
		change(name);
		System.out.println(name);
		
		
		//■ 18.3 引数の参照渡し(StirngBuilder型編)
		//【問題18_3】
		/*
		下記メソッドを使用して文字列に"AiP College"を追加しなさい。
		このとき、引数に指定した文字列の値はchange2実行前後で
		変わっていることを確認しなさい。
		*/
		System.out.println();//改行
		StringBuilder name2 = new StringBuilder("Tokyo");
		System.out.println(name2);
		change2(name2);
		System.out.println(name2);
		
		
		//◆ 演習
		//シーザー暗号を行う下記メソッドを作成しなさい。
		System.out.println();//改行
		char[] mes = { 'H', 'A', 'L' };
		for(int i = 0; i < mes.length; i++) {
			System.out.print(mes[i]);
		}
		System.out.println();//改行
		caesarCipher(mes, 1);
		for(int i = 0; i < mes.length; i++) {
			System.out.print(mes[i]);
		}

	}
	
	//【問題18_1】
	static void div2( int[] x ) {
		for( int i = 0; i < x.length; i++ ) {
			x[i] = x[i] / 2;
		}
	}
	
	//【問題18_2】
	static String change(String name) {
		name += "AiP College";
		return name;
	}
	
	//【問題18_3】
	static void change2(StringBuilder name) {
		name.append("AiP College");
	}
	
	//◆ 演習
	static void caesarCipher(char[] mes, int shift) {
		//shift = -1;
        for (int i = 0; i < mes.length; i++) {
        	mes[i] += 1;
        }
       
	}

}
