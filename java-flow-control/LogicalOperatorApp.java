
public class LogicalOperatorApp {

	public static void main(String[] args) {
		
		System.out.println(1 == 1); // �񱳿����� : true or false ����
		
		// AND ( && ) �� �� ���̸� true, �����̶� false�� false
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		// OR ������ ( || ) �� �� �ϳ��� ���̸� true
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// not ������ ( ! ) �ݴ��-
		System.out.println(!true); // false
		System.out.println(!false); // true
		

	}

}
