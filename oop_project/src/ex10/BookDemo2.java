package ex10;
import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name , email,title;
		int page;
		name = JOptionPane.showInputDialog("Input author name : ");
		email = JOptionPane.showInputDialog("Input author e-mail :");
		Author1 au = new Author1(name,email);
		title = JOptionPane.showInputDialog("Input book title : ");
		page = Integer.parseInt(JOptionPane.showInputDialog("Input book page : "));
		Book1 book = new Book1(title,au,page);
		
		int chk;
		do{
			
			
		 chk = JOptionPane.showConfirmDialog(null,"Is the page correct?","Confirm",JOptionPane.YES_OPTION);
			if(chk == JOptionPane.NO_OPTION) {
		page = Integer.parseInt(JOptionPane.showInputDialog("Input book page : "));
				
			}
		}while(chk == JOptionPane.NO_OPTION);
		book.setPage(page);
		
		JOptionPane.showMessageDialog(null,"Book Title:"+book.getTitle()
		+"\nAuthor name : "+au.getName()+"("+book.getPage()+")\n"+"Author e-mail : "
				+au.getEmail());
	}
	
	  

}
