import javax.swing.*;
public final class Leb503 {
	static int inputYear;

	public static void main(String[] args) {
		inputYear = Integer.parseInt(JOptionPane.showInputDialog("Input year"));
		boolean chkYear = checkYear(inputYear);
		while(!(checkYear(inputYear))) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog("Plese input year between 1000-3000"
		+"\nInput Year,again"));
		}
		if(isLeaoYear(inputYear)) {
		JOptionPane.showMessageDialog(null, inputYear + " is Leap Year");

	}else {
		JOptionPane.showMessageDialog(null, inputYear + " is not Leap Year");
	}
	}
	public static boolean checkYear(int year) {
		   if(year>=1000 && year<=3000) {
			   return true;
		   }
		   else {
			   return false;
		   }
	   }
	   public static boolean isLeaoYear(int year) {
		   if((year %4==0)&&((year % 100 !=0)||(year %400==0))) {
			   return true;
		   }else {
			   return false;
		   }
	   }
}
