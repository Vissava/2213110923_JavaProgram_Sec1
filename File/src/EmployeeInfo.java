import java.io.*;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		Scanner console = new Scanner(System.in);
		String choice;
		System.out.print("Insert or Read data(from File)? : ");
		choice = console.next().toUpperCase();
		while(!choice.equals("insert")&& !choice.equals("read")) {
			System.out.println("Please text insert or read data : ");
			choice = console.next().toLowerCase();
			
		}
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) {
			file.insert();
		

	}
	else {
		System.out.print("\nEnter department: ");
		choice = console.next();
		file.setDept(choice);
		file.read();
	}
	}

}
