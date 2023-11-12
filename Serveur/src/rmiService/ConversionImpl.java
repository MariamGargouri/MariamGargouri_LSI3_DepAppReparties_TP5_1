package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
// c'est le skeleton
public class ConversionImpl extends UnicastRemoteObject implements IConversion{ //doit implémenter l’interface distante Iconversion et étendre une des sous classes  
																				//de java.rmi.server.RemoteServer comme java.rmi.server.UnicastRemoteObject
	//Le skeleton est représenté via UnicastRemoteObject
	//public si la classe ServerRMI existe ailleure de package
	public ConversionImpl() throws RemoteException // construction du skeleton 
	{
		super(); //puisque la classe ConversionImpl extends de la classe UnicastRemoteObject,
				//on appel simplement le constructeur de la classe mere.
	}

	@Override
	public double convertirMontant(double mt) throws RemoteException 
	{
		return (mt*3.3);
	}
}
