package college.intro1;

public class JavaExercise20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 20. ラベル付きbreak文
		//【問題20】
		/*
		下記、numlist中にある最初の13の倍数を調べなさい。
		見つからなかった場合は、「見つかりません」と表示しなさい。
		*/
		int num = 0;
		int count = 0;
		int [][] numlist = {
			{ 36, 11, 54, 40 },
			{ 87, 67, 48, 39, 82 },
			{ 71, 83, 59, 16 }
		};
		
		Loop1 : for(int i = 0; i < 3; i++) {
			for(int j = 0; j < numlist[i].length; j++) {
				if(numlist[i][j] % 13 == 0) {
					num = numlist[i][j];
					count++;
					break Loop1;
				}

			}
		}
		
		if(count > 0) {
			System.out.println(num);
		} else {
			System.out.println("見つかりません");
		}
	}

}
