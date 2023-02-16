import java.io.*;
import java.util.*;	
public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String id,String pass,int monery) throws IOException{
		super(id,pass);
		this.money = monery;
		
	}
	public boolean checkBookBank() throws IOException {
		
		BufferedReader read = new BufferedReader(new FileReader("ATMBookBank.txt"));
		return false;
		
	}
	public void show() {
		
	}


}
