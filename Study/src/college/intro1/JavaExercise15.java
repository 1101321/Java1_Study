package college.intro1;

public class JavaExercise15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 15. メソッド(関数)1
	
		//【問題15】
		//問題6のうるう年計算を関数isUruを使用して作成。
		
		//②入力されたyearをisUruを使用して判定する
		int year = 2022;
		isUru(year);
		/*
		if (isUru(year)) {
			System.out.println("うるう年");
		} else {
			System.out.println("うるう年ではない");
		}
		*/
	}
	
	//①問題6のうるう年計算を関数isUruを使用して作成。
	static boolean isUru(int year) {
		if(year % 4 == 0) {
			System.out.println("うるう年");
		} else if(year % 100 == 0) {
			System.out.println("うるう年ではありません");
		} else if(year % 400 == 0) {
			System.out.println("うるう年");
		} else {
			System.out.println("うるう年ではありません");
		}
		return true;
		
	}
}
