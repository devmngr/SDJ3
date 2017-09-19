package tier1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class DatabaseServer extends UnicastRemoteObject implements IRmi  {

	
	public DatabaseServer() throws RemoteException, ClassNotFoundException {
		super();
		Registry reg = LocateRegistry.createRegistry(1099);
	}

	public static void main(String[] args) {
		try {

			IRmi databaseServer = new DatabaseServer();
			Naming.rebind("DatabaseServer", databaseServer);
			System.out.println("DatabaseServer started");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void createAccount(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double inserAmount(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double widrawAmount(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
