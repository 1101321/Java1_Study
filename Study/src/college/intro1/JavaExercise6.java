package college.intro1;

public class JavaExercise6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 6. if文制御

		//【問題6】
		//うるう年計算
		/*
		1年が4で割り切れるときは「うるう年」
		2しかし、100で割り切れるときは「うるう年」ではない
		3しかし、400で割り切れるときは「うるう年」
		int型の変数yearを任意の値で初期化。
		上記ルールで「うるう年」を判定せよ。
		*/
		int year = 2017;
		if(year % 4 == 0) {
			System.out.println("うるう年");
		} else if(year % 100 == 0) {
			System.out.println("うるう年ではありません");
		} else if(year % 400 == 0) {
			System.out.println("うるう年");
		} else {
			System.out.println("うるう年ではありません");
		}
		
		//◆ 演習
		//下記数値が偶数か奇数か判定し表示しなさい。
		System.out.println();
		int ix = 12345 / 543;
		if(ix % 2 == 0) {
			System.out.println(ix+"は偶数");
		} else {
			System.out.println(ix+"は奇数");
		}
	}

}
