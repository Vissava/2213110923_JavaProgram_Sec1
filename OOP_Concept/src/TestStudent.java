
public class TestStudent {

	public static void main(String[] args) {
		Student apichai = new Student("Apichai Jaising","1 HAPPY Ave");
		System.out.println(apichai);
		
		apichai.setAddress("25 Pattanakern");
		System.out.println(apichai);
		System.out.println(apichai.getName());
		System.out.println(apichai.getAddress());
		
		apichai.addCourseGrade("INT107", 80);
		apichai.addCourseGrade("INT108", 80);
		apichai.addCourseGrade("MSC-202", 80);
		apichai.printGrade();
		
		System.out.printf("\nThe average grade is %.2f%n",apichai.getAverageGrade());
		
		
	
	}

}
