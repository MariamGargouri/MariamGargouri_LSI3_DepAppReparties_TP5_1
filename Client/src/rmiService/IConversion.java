package rmiService;
import java.rmi.Remote;
import java.rmi.RemoteException;
//cataloque des services
public interface IConversion extends Remote {
	public double convertirMontant(double mt) throws RemoteException;
}
