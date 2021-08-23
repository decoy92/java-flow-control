
public class AuthApp {

	public static void main(String[] args) {

		System.out.println(args[0]); // Jin 출력 (Arguments 값으로 Jin 넣었기 때
		
		String id = "Jin";
		String inputId = args[0];
		
		System.out.println("Hi.");
		
		//if(inputId == id) {
		if(inputId.equals(id)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
	}

}