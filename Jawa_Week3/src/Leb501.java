
public class Leb501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(formatNumbr(500));
       System.out.println(formatNumbr('a'));
       System.out.println(formatNumbr(89.9934));
       System.out.println(formatNumbr("550"));
	}
private static String formatNumbr(int value) {
	return String.format("%d",value);
}
private static String formatNumbr(double value) {
	return String.format("%.3f",value);
}
private static String formatNumbr(String value) {
	return String.format("%.2f",Double.parseDouble(value));
}
}
