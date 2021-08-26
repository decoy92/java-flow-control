
public class LogicalOperatorApp {

	public static void main(String[] args) {
		
		System.out.println(1 == 1); // 비교연산자 : true or false 리턴
		
		// AND ( && ) 둘 다 참이면 true, 한쪽이라도 false면 false
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		// OR 연산자 ( || ) 둘 중 하나라도 참이면 true
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// not 연산자 ( ! ) 반대로-
		System.out.println(!true); // false
		System.out.println(!false); // true
		

	}

}
