
import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		
		
		System.out.print("Message : ");
		
		String ms = sc.nextLine();
		if(ms.toLowerCase().indexOf("nichi")>=0) {
			count++;
		}
			
			if(count == 0) {
				System.out.print(ms);
			}
			else {
				System.out.print("Nichi is a sentence");

				
			}
	}

}
