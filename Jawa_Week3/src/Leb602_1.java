import javax.swing.JOptionPane;

public class Leb602_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean found = false;
		String foundWhat;
		String dopt =JOptionPane.showInputDialog("Enter a dopartment name");
		for (int i=0; i < deptName.length;i++) {
			if(dopt.equalsIgnoreCase(deptName[i])) {
				found = true;
				foundWhat = deptName[i];
			}
		}
        JOptionPane.showInternalMessageDialog(null,
        		found ? dopt +"was found in the list.": dopt+"was't found in the list","Message",
        				JOptionPane.INFORMATION_MESSAGE);
	}

}
