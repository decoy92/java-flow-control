
public class BooleanApp {

	public static void main(String[] args) {
		
		System.out.println("One"); // String (���ڿ�) - ����
		System.out.println(1); // int (����) - ����
		
		//Boolean Datatype ���� true�� false �� ������ �ִ�.
		System.out.println(true);
		System.out.println(false);
		
		String foo = "Hello world";
		// String true = "Hello world"; // true ���� ���� �Ұ�.
		// true�� falseó�� ������ �ִ� Ű������� ������ ������ �� ����. = reserved word (��ǻ�Ͱ� ���� ���س��� Ű������)
		
		System.out.println(foo.contains("world")); // ���� foo ��� ���� Hello world �߿� world �� ���ԵǾ� �־ true
		System.out.println(foo.contains("World")); // �ҹ���/�빮�ڵ� ������
		System.out.println(foo.contains("apple")); // false 
		// Boolean�� ���ǹ�, �ݺ��� ��� ���� �����ϸ� �߿�������.
			

	}

}
