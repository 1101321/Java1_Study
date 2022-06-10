package college.intro1;

public class JavaExercise12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 12. 論理演算(論理積)
		
		//【問題12】
		/*
		お笑い:世界のナベアツ3
		3の倍数と3がつくときだけバカ(末尾に~)になり
		5の倍数のときアホ(末尾に!!)になる。
		50で終了。
		*/
		
		for(int num = 1; num <= 50; num++) {
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println(num + "～!!");
			} else if(num % 5 == 0) {
				System.out.println(num + "!!");
			} else if(num % 3 == 0 || num % 10 == 3 || num / 10 == 3) {
				System.out.println(num + "～");
			} else {
				System.out.println(num);
			}
		}
		
		//◆ 比較演算子
		//◆ 演習
		//1から100までの数の中に13または17の倍数は何個あるか調べなさい。
		System.out.println();//改行
		
		int count = 0;
		for(int num = 1; num <= 100; num++) {
			if(num % 13 == 0 || num % 17 == 0) {
				count++;
				System.out.println(count + ":" + num);
			}
		}
	}

}
