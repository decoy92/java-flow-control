
public class LoopArray {

	public static void main(String[] args) {
		String[] users = new String[3]; // 개수는 1,2,3...
		users[0] = "Jin"; // 몇 번째 자리(위치)는 0,1,2...
		users[1] = "kim";
		users[2] = "Hyun";
		
		/*
		 *	<li>Jin</li>
		 * 	<li>Kim</li>
		 * 	<li>Hyun</li>
		 */
		
		for(int i=0; i<users.length; i++) {
			System.out.println("<li>"+users[i]+"</li>"); // users[i] : 색인(index)
		}
		
		
	}

}