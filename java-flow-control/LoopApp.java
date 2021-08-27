
public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println("=== while ===");
		int i = 0; // 변수이름은 아무거나 써도 되지만, 일반적으로 i라는 변수는 반복문에서 카운팅 하기 위해 사용하는 변수이다.
		while(i < 3) {
			System.out.println(2);
			System.out.println(3);
//			i = i + 1;
			i++; // 위 코드와 의미가 같음.
		}
		System.out.println("=== for ===");
		for(int j = 0; j < 3; j++) {
			System.out.println(2);
			System.out.println(3);
		}
		
		System.out.println(4); // 위 2,3이 무한반복 되어 실행되지 않는 코드. (Unreachable code)

	}

}