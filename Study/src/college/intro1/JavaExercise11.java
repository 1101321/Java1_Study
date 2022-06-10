package college.intro1;

public class JavaExercise11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 11. 論理演算(論理和)
		
		//【問題11】
		/*
		お笑い:世界のナベアツ2
		3の倍数と3がつくときだけバカ(末尾に~)になる。
		15回バカになったら終了。
		*/
		
		int count = 0;
		int num = 1;
		while(count <= 15) {
			if(num % 3 == 0 || num % 10 == 3 || num / 10 == 3) {
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
