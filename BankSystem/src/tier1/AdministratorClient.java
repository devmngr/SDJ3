package tier1;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class AdministratorClient {

	private IRmi server;
	
	
	
	
	public AdministratorClient() throws RemoteException {
		super();
		try {

			server = (IRmi) Naming.lookup("rmi://localhost:1099/ClientServicingServer");
			System.out.println("server connected");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	
}
