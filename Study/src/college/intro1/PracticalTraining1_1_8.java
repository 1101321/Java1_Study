package college.intro1;

import java.util.Random;

public class PracticalTraining1_1_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1-1実習
		
		//◆ while文
		//【問題8-1】
		/*
		0から99の乱数を繰り返し出し、合計が50000を越える回数
		を求めなさい。平均1000回?
		*/
		Random rnd = new Random();
		int count = 0;
		int value = 0;
		int sum = 0;
		do {
			value = rnd.nextInt(100);//0から99の乱数を繰り返し出す
			sum += value;//sumに乱数の合計値を入れる
			count++;//回数を数える
		} while(sum <= 50000);
		System.out.println("乱数の合計値：" + sum);
		System.out.println("合計値が50000を超えるまでの回数：" + count + "回");
		
		
		//【問題8-2】
		System.out.println();//改行
		//ix = 264537を素因数分解しなさい。
		int ix = 264537;
		int i = 2;//素因数を調べる変数
		 while(ix != 1){//ixが1になるまで次の処理を繰り返す
			 if (ix % i == 0){//ixがiで割り切れるとき
				 System.out.println("ix=" + ix + "  素因数=" + i);//iを約数として表示
                 ix /= i;
      	} else	{//ixがiで割り切れないとき
            	 i++;
        }
    }

	}

}
