
public class AuthApp {

	public static void main(String[] args) {

//		System.out.println(args[0]); // Jin ��� (Arguments ������ Jin �־��� ����.
		
		String id = "Jin";
		String inputId = args[0];
		
		String pass = "1234";
		String inputPass = args[1]; // [1] : �� ��° �Է°��� ���� �� �ִ�.
		
		System.out.println("Hi.");
		
		//if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)) {
//				System.out.println("Master!");
//			} else {
//				System.out.println("Wrong password!");
//			}
//		} else {
//			System.out.println("Who are you?");
//		}
		
		if(inputId.equals(id) && inputPass.equals(pass)) {
				System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
		
		
	}

}