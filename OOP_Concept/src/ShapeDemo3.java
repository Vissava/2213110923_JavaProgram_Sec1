import java.util.Scanner;

import javax.swing.JOptionPane;

public class ShapeDemo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinders = new Cylinder[5];
		for(int i = 0; i < cylinders.length;i++) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius " + (i+1) + ":"));
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input height " + (i+1) + ":"));
			
			cylinders[i] = new Cylinder(radius, height);
		
		}
		int count = 1;
		String um = "";
		
		for(Cylinder it : cylinders) {
			um = um +"Cylinder " + count + ", volume=" + it.getVolume() + "\n";
			count++;
		}
		JOptionPane.showMessageDialog(null, um);

	}

}
