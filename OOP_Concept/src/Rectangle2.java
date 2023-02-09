
public class Rectangle2 implements Shape2 {
	private double width;
	private double length;
	
	public Rectangle2(double width,double length,String color) {
		
		this.width = width;
		this.length = length;
		
	}
	public Rectangle2(double width2, double length2) {
		
	}
	public double getArea() {
		return this.width * this.length;
		
	}
	@Override
	public String toString() {
		return "Rectangle width = "+getWidth() +", length ="+getLength()+
				super.toString();
	}
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	

	}
}
