package college.intro1;

public class PracticalTraining1_2_1 {
	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
	// Java言語入門1-2実習
		
	//◆問題1
	//int型配列num(要素数20)を作成。
	int [] num = new int[20];
	
	//【1ー1】numの全要素に0を設定しなさい。
		for ( int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
	
	//【1-2】先頭から順に1から20までの値を設定しなさい。
		for ( int i = 0; i < num.length; i++) {
				num[i] = i + 1;
				//System.out.println(num[i]);
		}
		
	//【1-3】配列numの値を末尾から表示しなさい。
		//インデックスが19から0になるまで減らしていく
		for ( int i = num.length - 1; 0 <= i; i--) {
			System.out.println(num[i]);
		}
		
	//【1-4】15が入った要素と18が入った要素を交換しなさい
		//入れ替え処理
		int temp = num[14];
		num[14] = num[17];
		num[17] = temp;
		for ( int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
	}
		
	}
}
