import java.util.Scanner;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinders = new Cylinder[5];
		for(int i = 0; i< cylinders.length;i++) {
			System.out.print("Input radius "+(i+1)+": ");
			double radius = scan.nextDouble();
			System.out.print("Input height "+(i+1)+": ");
			double height = scan.nextDouble();
			
			cylinders[i] = new Cylinder(radius, height);
			System.out.println();
				

	}
		int count = 1;
		for (Cylinder it : cylinders) {
			System.out.println("Cylinder " + count + ", volume" + it.getVolume());
			count++;
		}
	}

}
