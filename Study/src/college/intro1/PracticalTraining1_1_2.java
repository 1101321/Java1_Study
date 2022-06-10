package college.intro1;

public class PracticalTraining1_1_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ 文字列
		//【問題2-1】
		/*
		3つの文字列変数に下記文字列を設定し、strへ
		半角スペース1個空けて連結して表示しなさい。
		year  : "Millennium"
		month : "Halloween"
		day   : "Day"
		連結用変数:str
		*/
		String year = "Millennium";
		String month = "Halloween";
		String day = "Day";
		String str = year + " " + month + " " + day;
		System.out.println(str);
		
		//【問題2-2】
		/*
		変数addressへ新宿住友ビルディングの住所を設定し
		表示しなさい。改行コード(cr)は下記で取得。
		*/
		System.out.println();//改行
		String cr = System.getProperty("line.separator");
		String address = "〒163-02191" + cr
				+ "東京都新宿区西新宿2丁目6-1" + cr
				+ "新宿住友ビルディング19F";
		System.out.println(address);

	}

}
