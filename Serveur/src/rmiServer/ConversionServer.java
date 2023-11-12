package rmiServer;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmiService.ConversionImpl;
public class ConversionServer {

	public static void main(String[] args) 
	{
		try {
			LocateRegistry.createRegistry(1099);//prend en parametre le num de port
												// creation d'un annuaire
			//instancie l ’objet
			ConversionImpl od = new ConversionImpl();//skelotton + implementation de l'interface
			System.out.println(od.toString());
			
			Naming.rebind("rmi://localhost:1099/objectDistant",od);// Enregistre l ’objet sous le nom "objectDistant" auprès de rmiregistry
							//rmi/adresse ip/reference
		}catch (Exception e) {e.printStackTrace();}
	}
}

