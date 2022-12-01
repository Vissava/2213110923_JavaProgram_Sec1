import javax.swing.*;
public class Ex_402 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		while(inputEmail.startsWith("@")||inputEmail.contains("")) {
			inputEmail =JOptionPane.showInputDialog("Input your e-mail:");
		}
		inputEmail = inputEmail.toLowerCase();
		boolean checkEmail = inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.");
		
				JOptionPane.showInternalMessageDialog(null, (checkEmail)
						? "Your e-mial is"+ inputEmail
					    : "Your e-mail is not hotmail or gamil dot com");
		
			}
	}

//}
