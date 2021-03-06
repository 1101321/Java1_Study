package college.intro1;

public class PracticalTraining1_1_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ if文
		int ix = 88179;
		
		//【問題6-1】
		//ixが3の倍数のとき「3の倍数です」と表示しなさい。
		if(ix % 3 == 0) {
			System.out.println("3の倍数です");
		}
		
		//【問題6-2】
		/*
		ixが7の倍数のとき「7の倍数です」と、7の倍数で
		はないとき「7の倍数ではありません」と表示しなさい。
		*/
		System.out.println();//改行
		if(ix % 7 == 0) {
			System.out.println("7の倍数です");
		} else {
			System.out.println("7の倍数ではありません");
		}
		
		//【問題6-3】
		//ixが3や7以外の倍数か調べなさい。何か1個見つける
		System.out.println();//改行
		for(int i = 1; i <= 100; i++) {
			if(ix % i == 0) {
				System.out.println(i + "の倍数です");
			} 
		}
		
		//【問題6-4】
		/*
		2019年9月の指定された日付の曜日をif文を使って調べなさい。
		2019年9月1日は日曜日である。
		*/
		System.out.println();//改行
		int day = 18; //任意の日付
		System.out.print("2019年9月"+day+"日は");
		int week = day % 7;
		if (week == 0) {
			System.out.println("土曜日である。");
		} else if(week == 1) {
			System.out.println("日曜日である。");
		} else if(week == 2) {
			System.out.println("月曜日である。");
		} else if(week == 3) {
			System.out.println("火曜日である。");
		} else if(week == 4) {
			System.out.println("水曜日である。");
		} else if(week == 5) {
			System.out.println("木曜日である。");
		} else if(week == 6) {
			System.out.println("金曜日である。");
		}
		 
		//【問題6-5】
		/*下記プログラム実行し
		挙動を確認しなさい。
		*/
		System.out.println();//改行
		String str1 = "Japanias";
		String str2 = "Japanias";
		if (str1 == str2) {
		System.out.println("同じ");
		} else {
		System.out.println("違う");
		}
		String str3 = new String("Japanias");
		if (str1 == str3) {
		System.out.println("同じ");
		} else {
		System.out.println("違う");
		}
		
		//【問題6-6】
		//下記プログラム追加実行し挙動を確認しなさい。
		System.out.println();//改行
		if (str1.equals(str3)) {
			System.out.println("同じ");
			} else {
			System.out.println("違う");
		}
		
		//【問題6-7】
		int num = 43981;
		//numを16進数文字列に変換し"abcd"かif文で判定しなさい。
		System.out.println();//改行
		if(Integer.toString(num, 16).equals("abcd")) {
			System.out.println("numを16進数文字列に変換するとabcdです");
		} else {
			System.out.println(Integer.toString(num, 16));
		}
		
	}
}
