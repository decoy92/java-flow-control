
public class AuthApp2 {

	public static void main(String[] args) {

//		System.out.println(args[0]); // Jin 출력 (Arguments 값으로 Jin 넣었기 때문.
		
		String id = "Jin";
		String inputId = args[0];
		
		String pass = "1234";
		String pass2 = "1111";
		String inputPass = args[1]; // [1] : 두 번째 입력값을 받을 수 있다.
		
		
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
		
		boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));
		if(inputId.equals(id) && isRightPass ) {
				System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
		
		
	}

}