
public class ArrayApp {

	public static void main(String[] args) {

		// Jin, Kim, Hyun
//		String users = "Jin, Kim, Hyun";
		String[] users = new String[3]; // ������ 1,2,3...
		users[0] = "Jin"; // �� ��° �ڸ�(��ġ)�� 0,1,2...
		users[1] = "kim";
		users[2] = "Hyun";
		
		System.out.println(users[1]); // �� ��° users (Kim) ���
		System.out.println(users.length); // �迭�� �� ���� ��(3��)�� ����ִ����� Ȯ���� �� �ִ�. (3ĭ¥�� �迭)
		
		int[] scores = {10, 50, 100};
		System.out.println(scores[1]); // 50��
		System.out.println(scores.length); // 3��
		
		
	}

}