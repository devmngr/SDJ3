package tier1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRmi extends Remote{
	
	void createAccount(double amount)throws RemoteException;
	double insertAmount(double amount)throws RemoteException;
	double widrawAmount(double amount)throws RemoteException;
}
