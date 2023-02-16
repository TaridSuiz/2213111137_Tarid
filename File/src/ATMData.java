
public class ATMData {
	private String accountNumber;
	private String password;
	public ATMData (String acc,String pass) {
		accountNumber=acc;
		password=pass;
	}
	public String getID() {
		return accountNumber;
	}
	public String getPass() {
		return password;
	}
	

}
