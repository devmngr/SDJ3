package tier1;

import java.sql.SQLException;

public class DatabaseAdapter {

	
	private Adaptee adaptee;
	
	public DatabaseAdapter() throws ClassNotFoundException {
		adaptee = new Adaptee();
	}
	
	
	public void createAccount(double amount) throws SQLException {
		
		String sql = "insert into bankaccount values (16,"+amount+")";
		adaptee.query(sql);


	}
	public void insertAmount(double amount) {
	
		
		
	
	}
	public void widrawAmount(double amount) {

		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DatabaseAdapter ad = new DatabaseAdapter();
		ad.createAccount(256);
	}
	

}
