package college.intro1;

public class PracticalTraining1_1_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ 1次元配列
		//【問題4-1】
		//要素数10 個のint型配列numを作成しなさい。
		byte[] num = new byte[10];
		
		//【問題4-2】
		//1から5までの値が入った配列num2を作成しなさい。
		byte[] num2 = {1, 2, 3, 4, 5};
		
		//【問題4-3】
		//'A'から'G'の英文字が入った配列alphaを作成しなさい。
		char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		
		//【問題4-4】
		//配列alphaの要素数をlengthを使って表示しなさい。
		System.out.println(alpha.length);
		
		//【問題4-5】
		/*
		下記名前の配列nameListを作成しなさい。
		青木、井上、上田、江藤、大野
		*/
		String[] nameList = {"青木", "井上", "上田", "江藤", "大野"};
		
		//【問題4-6】
		/*
		下記値の配列squareRootを作成しなさい。
		1.0, 1.4142, 1.732, 2.0, 2.236
		*/
		double[] squareRoot = {1.0, 1.4142, 1.732, 2.0, 2.236};
	}

}
