package tier1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CustomerClient {

	private IRmi server;
	
	
	
	public CustomerClient() throws RemoteException {
		super();
		try {

			server = (IRmi) Naming.lookup("rmi://localhost:1099/ClientServicingServer");
			System.out.println("server connected");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws RemoteException {
		CustomerClient customer = new CustomerClient();
	}
	
	

}
