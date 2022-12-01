import java.util.*;
public class Led403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scanner = new Scanner(System.in);
		System.out.print("Message : ");
		String message =scanner.nextLine();
		String lower = message.toLowerCase();
		String finalMessage = lower.indexOf("nichi") >= 0 ? "Nichi is a message" : message;
		System.out.println(finalMessage);

	}

}
