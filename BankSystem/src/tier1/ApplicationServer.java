package tier1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ApplicationServer extends UnicastRemoteObject implements IRmi{

	public ApplicationServer() throws RemoteException, ClassNotFoundException {
		super();
		Registry reg = LocateRegistry.createRegistry(1099);
	}

	public static void main(String[] args) {
		try {

			IRmi applicationServer = new ApplicationServer();
			Naming.rebind("ApplicationServer", applicationServer);
			System.out.println("ApplicationServer started");

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
