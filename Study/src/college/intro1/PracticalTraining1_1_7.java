package college.intro1;

public class PracticalTraining1_1_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ for文
		//【問題7-1】
		//for文を使い 'w' を3回System.out.printで表示しなさい。
		for(int i = 0; i < 3; i++) {
			System.out.print("w");
		}
		System.out.println();//改行
		
		//【問題7-2】
		/*
		for文で変数iを0から25まで変化させ('A' + i)を
		System.out.print((char)('A' + i));で表示しなさい。
		*/
		System.out.println();//改行
		for(int i = 0; i <= 25; i++) {
			System.out.print((char)('A' + i));
		}
		System.out.println();//改行
		
		//【問題7-3】
		/*
		for文で変数numを1から50まで変化させ3の倍数と
		7の倍数を表示しなさい。21と42を2度表示しないこと。
		*/
		System.out.println();//改行
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		//【問題7-4】
		//ix = 88179は何の倍数か調べなさい。
		int ix = 88179;
		System.out.println();//改行
		for(int num = 2; num < 20; num++) {
			if(ix % num == 0) {
				System.out.println(num + "の倍数です");
			}
		}
		
		//【問題7-5】
		/*
		y = x2の積分
		y = x2のグラフでx=0から5まで0.01刻みで長方形の
		面積を求め積算し面積Sを求めなさい。
		xの2乗はMath.pow(x, 2)で求める。
		*/
		System.out.println();//改行
		double s = 0;
		for(double x = 0; x <= 500; x++) {
			s += Math.pow(x / 100, 2) * 0.01;
			System.out.println(s);
		}
		
		//【問題7-6】
		//問題7-5で面積Sが100を越えるxの値を求めなさい。
		System.out.println();//改行
		double x = 0;
		for(x = 0; x <= 1000; x++) {
			s += Math.pow(x / 100, 2) * 0.01;
			if(s > 100) {//面積sが100を超えたら
				System.out.println(x / 100);
				//System.out.println(s);
				break;
			}
		}
	}

}
