import java.util.Scanner;

public class TestStudent {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom: ");
		Student[] std = new Student[scan.nextInt()];
		for(int i=0;i<std.length;i++) {
			std[i] = new Student();
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.print("Input student name: ");
			std[i].setName(scan.next());
			System.out.print("Input student score: ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score,again: ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("-----------------------------------");
		for(Student stud : std) {
			if(stud.isPass()) {
				System.out.println(">>" +stud.getName() + " get grade "  + stud.findGrade());
			}
		}
	}

}
