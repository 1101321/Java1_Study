package college.intro1;

public class JavaExercise4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 4. 1 次元配列
		
		//【問題4_1】
		//int型5個の配列aryを宣言し、{3, 11, 7, 5, 13}で初期化する。
		//ary[5]を指定し「ArrayIndexOutOfBoundsException」を確認。
		int[] ary = {3, 11, 7, 5, 13};
		//System.out.println(ary[5]);
		
		//【問題4_2】
		//前問題で作成したaryの要素数を確認せよ。(lengthで確認)
		System.out.println(ary.length);
		
		//【問題4_3】
		//String型3個の配列strを宣言し、
		//{"Shinjyuku-ku", "Tokyo-to", "Japan"}で初期化する。
		//それぞれの要素の長さを確認せよ。(length()で確認)
		System.out.println();
		String[] str = {"Shinjuku-ku", "Tokyo-to", "Japan"};
		System.out.println(str[0].length());
		System.out.println(str[1].length());
		System.out.println(str[2].length());
		
		
		//◆ 演習
		//配列ary要素の合計を求め表示しなさい。
		System.out.println();
		int sum = 0;
		sum += ary[0];
		sum += ary[1];
		sum += ary[2];
		sum += ary[3];
		sum += ary[4];
		System.out.println("合計は" + sum + "です");

	}

}
