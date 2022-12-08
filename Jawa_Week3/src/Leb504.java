import java.util.*;
public final class Leb504 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space. \n: ");
		String fullName = scanner.nextLine();
		
		System.out.println(abbreviatName(fullName));
		

	}
	private static String abbreviatName(String fullName) {
		String[] space = fullName.split(" ");
		return space[1].substring(0,1).toUpperCase()+"."+space[2].substring(0,1).toUpperCase()+"."+space[0].substring(0,1).toUpperCase()+space[0].substring(0,1);
	}
}
