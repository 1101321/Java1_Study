package college.intro1;

public class JavaExercise2 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 2.1 文字列
		//【問題2_1】
		//String型変数strを宣言し、"Hello!!"を代入する。
		System.out.println();
		String str = "Hello!!";

		//【問題2_2】
		//String型変数str1とstr2を宣言し、"Hello"と"World!!"を代入し、
		//間に半角スペースを1個入れて連結しString型変数strに代入。
		System.out.println();
		String str1 = "Hello";
		String str2 = "World!!";
		str = str1 + " " + str2;
		System.out.println(str);

		//【問題2_3】
		//char型変数chを宣言し、'あ'を代入する。
		System.out.println();
		char ch = 'あ';
		System.out.println(ch+":"+(int)ch);
		

		//■ 2.2 数字⇔文字列 変換
		//【問題2_4】
		//int型変数ixに1234を設定し、文字列に変換(String.valueOf)し
		//文字列strに代入する。
		System.out.println();
		int ix = 1234;
		str = String.valueOf(ix);
		System.out.println(str);

		//【問題2_5】
		//String型変数strに"5432"を設定し、
		//int型に変換(Integer.parseInt)し変数ixに代入する。
		System.out.println();
		str = "5432";
		ix = Integer.parseInt(str);
		System.out.println(ix);

		//◆ 演習
		//変数nameに自分の名前を設定し表示しなさい。
		System.out.println();
		String name = "hosaka";
		
		//変数nameに「-san」を連結し表示しなさい。
		System.out.println(name+"-san");
		
	}

}
