import java.util.Scanner;

public class BookDemo1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name :");
		String name = scan.nextLine();
		System.out.print("Input author e-mail :");
		String email = scan.next();
		
		Author apichai = new Author(name,email);
		System.out.println(apichai);
		
		System.out.print("Input book title: ");
		scan.next();
		String title = scan.nextLine();
		System.out.print("Input book page : ");
		int page = scan.nextInt();
		
		System.out.println();
		
		
		

	}

}
