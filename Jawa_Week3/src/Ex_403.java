import java.util.*;
import javax.swing.*;
public class Ex_403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input  a sentence,again : ");
			sentence=scan.nextLine();
		
		}
System.out.println();
int countofSpace =0;
for  (int i=0;i<sentence.length();i++) {
	if(sentence.charAt(i)==' ') {
		countofSpace++;
	}
	
}
JOptionPane.showMessageDialog(null,"This sentence has"+countofSpace+"spaces. "
+"\n"+"This sentence has "+(countofSpace+1)+" words." );
//System.out.println("this sentence has"+countofSpace+"spaceber.");
//System.out.println("this sentence has"+(countofSpace+1)+"spaceber.");
	}

}
