package college.intro1;

import java.io.IOException;

public class PracticalTraining1_1_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ ストップウォッチゲーム
		//【問題12】
		/*
		Enter押しでスタート、再度Enter押しでストップ
		9秒から11秒の間で停止できれば合格。
		早いか遅いか表示、不合格の場合は再度チャレンジ。
		*/
		try {
			while(true) {//合格するまで繰り返す
				System.out.print("Enterで開始");
				System.in.read();
				System.in.read();
				long start = System.currentTimeMillis();
				System.out.print("スタート！");
				System.in.read();
				System.in.read();
				long end = System.currentTimeMillis();
				System.out.println("ストップ！");
				long msDiff = end - start;
				if (msDiff < 9000) {//9秒より速いか
                    System.out.println("早い！！");
                } else if (11000 < msDiff) {//11秒より遅いか
                    System.out.println("遅い！！");
                } else {
                    System.out.println("合格！！");
                    break;//終了
                }
			}
		} catch (IOException e) {
		// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}
