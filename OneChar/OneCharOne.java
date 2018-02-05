import java.util.Scanner;

public class OneCharOne {
	public static void main(String[] args) {
		String message;
		int marker = 0;
		int length;
		char current;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		message = scan.nextLine();
		length = message.length();

		for (int count=0; count < length; count++)
		{
			current = message.charAt(marker);
			System.out.println(current);
			//marker++;
		}

	}
}



// import java.util.Scanner;
//
// public class OneCharOne {
//   public void OneCharAtaTime() {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter your message: ");
//     String User_Input = sc.next();
//     // System.out.print("Enter your message: ");
//
//   }
// }
