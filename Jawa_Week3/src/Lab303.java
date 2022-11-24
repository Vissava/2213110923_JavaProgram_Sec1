import javax.swing.*;
import java.text.*;
import java.util.Random;
public class Lab303 {
	
	public static void main(String[] args) {

		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		DecimalFormat frm = new DecimalFormat("#,###");
		int member = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " +frm.format(balance)
				+"\nInput money to withdraw:"));
		int sum = member;
		int thou=sum/1000;
		int five=(sum%1000)/500;
		int one=(sum%1000)/500/100;
		int hm=member%100;
		if(member>balance) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(member>=20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(member%100!=0) {
			
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+hm+" baht.","ERROR",+JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdraw "+frm.format(member)+"baht."+"\n1000 = "+thou+"\n500 = "
					+five+"\n100 = "+one);
		}
	}

}
