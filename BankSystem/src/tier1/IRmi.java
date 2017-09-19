package tier1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRmi extends Remote{
	
	public void createAccount(double amount)throws RemoteException;
	public void insertAmount(double amount)throws RemoteException;
	public void widrawAmount(double amount)throws RemoteException;
	public double checkBalance();
}
