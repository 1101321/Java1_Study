package college.intro1;

public class JavaExercise19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Java言語入門1演習
		
		//■ 19. スコープ
		//【問題19】(問題11改)
		
		int count = 1;
		int num = 1;
		while(count <= 17) {
			if(num % 3 == 0 || num % 10 == 3 || num / 10 == 3) {
				System.out.println(num + "～　" + count + "回目");
				num++;
				count++;
			} else {
				System.out.println(num);
				num++;
			}
			
		}

	}

}
