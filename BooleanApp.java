
public class BooleanApp {

	public static void main(String[] args) {
		
		System.out.println("One"); // String (문자열) - 유한
		System.out.println(1); // int (정수) - 무한
		
		//Boolean Datatype 에는 true와 false 두 가지가 있다.
		System.out.println(true);
		System.out.println(false);
		
		String foo = "Hello world";
		// String true = "Hello world"; // true 변수 설정 불가.
		// true와 false처럼 쓰임이 있는 키워드들은 변수로 설정할 수 없다. = reserved word (컴퓨터가 먼저 찜해놓은 키워드임)
		
		System.out.println(foo.contains("world")); // 위에 foo 라는 변수 Hello world 중에 world 가 포함되어 있어서 true
		System.out.println(foo.contains("World")); // 소문자/대문자도 구분함
		System.out.println(foo.contains("apple")); // false 
		// Boolean은 조건문, 반복문 등과 같이 결합하면 중요해진다.
			

	}

}
