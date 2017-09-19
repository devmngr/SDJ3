package tier1;

import java.rmi.Remote;

public interface IRmi extends Remote{
	
	void createAccount(double amount);
	double inserAmount(double amount);
	double widrawAmount(double amount);
}
