package tier1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class DatabaseServer extends UnicastRemoteObject implements IRmi {

	private DatabaseAdapter adapter;

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
		//adapter.createAccount(amount);

	}

	@Override
	public void insertAmount(double amount) {
		adapter.insertAmount(amount);
	}

	@Override
	public void widrawAmount(double amount) {
		adapter.widrawAmount(amount);

	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
