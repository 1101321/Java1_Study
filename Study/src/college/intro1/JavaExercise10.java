package college.intro1;

public class JavaExercise10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 10. break文制御
		
		//【問題10】
		/*
		お笑い:世界のナベアツ
		3の倍数のときだけバカ(末尾に~)になる。
		15回バカになったら終了。
		*/
		
		int count = 0;
		int num = 1;
		while(count <= 15) {
			if(num % 3 == 0) {
				System.out.println(num + "～");
				num++;
				count++;
			} else {
				System.out.println(num);
				num++;
			}
		}

	}

}
