import java.util.*;
public class Leb402 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String word = kb.nextLine();
		while (!word.endsWith("."))
		{
			System.out.println("The sentence must end with full stop point : ");
			word = kb.nextLine();
		}
		
		System.out.println();
		int itNum =0;
		String formatSentance = word.replace("."," ");
		
		for (int i = 0; i < formatSentance.length(); i++) {
			
			if(formatSentance.charAt(i)==' ') {
				System.out.println(formatSentance.substring(itNum,i));
				itNum = i+1;
			}
		}
		
	}

}
