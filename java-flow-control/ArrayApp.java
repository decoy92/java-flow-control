
public class ArrayApp {

	public static void main(String[] args) {

		// Jin, Kim, Hyun
//		String users = "Jin, Kim, Hyun";
		String[] users = new String[3]; // 개수는 1,2,3...
		users[0] = "Jin"; // 몇 번째 자리(위치)는 0,1,2...
		users[1] = "kim";
		users[2] = "Hyun";
		
		System.out.println(users[1]); // 두 번째 users (Kim) 출력
		System.out.println(users.length); // 배열에 몇 개의 값(3개)이 담겨있는지도 확인할 수 있다. (3칸짜리 배열)
		
		int[] scores = {10, 50, 100};
		System.out.println(scores[1]); // 50점
		System.out.println(scores.length); // 3개
		
		
	}

}