import java.text.*;
import javax.swing.JOptionPane;

public class jawa04 {

	public static void main(String[] args) {
		String cdId;
		String cdTitle;
		int cdQuantity;
		double cdPrice;
		String cdTotal;
		final double TAX_RATE = .0625;
		
		cdId = JOptionPane.showInputDialog("This progeam calculates the total cost of a CD order"+
				"\nPlease enter the ID of the CD");

		cdTotal = JOptionPane.showInputDialog("Please enter the title of the CD");
		 cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S.dollars"));

		 cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		 cdSubtotal = cdPrice*cdQuantity;
    

	}

}
