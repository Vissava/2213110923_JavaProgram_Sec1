import javax.swing.JOptionPane;

public class BookDemo2 {

	public static void main(String[] args) {
		
		String authorName = JOptionPane.showInputDialog("Input author name: ");
		String email = JOptionPane.showInputDialog("Input author e-mail: ");
		Author author = new Author(authorName,email);
		
		String bookTitle = JOptionPane.showInputDialog("Input book title: ");
		int bookPage = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		int confirm = JOptionPane.showConfirmDialog(null,"Is the page correct?" , "Confirm" , 0);
		
		while (confirm ==1) {
			 bookPage = Integer.parseInt(JOptionPane.showInputDialog("Input book page,againg: "));
			 confirm = JOptionPane.showConfirmDialog(null,"Is the page correct?" , "Confirm" , 0);
			
			
		} 
		Book1 book = new Book1(bookTitle,author,bookPage);
		JOptionPane.showConfirmDialog(null,"Book Title: " + book.getTitle() +
				"\nAuthor name: " + book.getAuthor().getName()+ " (" + book.getPage()+ ")" +
				"\nAuthor e-mail: " + book.getAuthor().getEmail());
		
		
		
		
		

	}

}
