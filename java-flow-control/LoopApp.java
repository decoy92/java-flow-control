
public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println("=== while ===");
		int i = 0; // �����̸��� �ƹ��ų� �ᵵ ������, �Ϲ������� i��� ������ �ݺ������� ī���� �ϱ� ���� ����ϴ� �����̴�.
		while(i < 3) {
			System.out.println(2);
			System.out.println(3);
//			i = i + 1;
			i++; // �� �ڵ�� �ǹ̰� ����.
		}
		System.out.println("=== for ===");
		for(int j = 0; j < 3; j++) {
			System.out.println(2);
			System.out.println(3);
		}
		
		System.out.println(4); // �� 2,3�� ���ѹݺ� �Ǿ� ������� �ʴ� �ڵ�. (Unreachable code)

	}

}