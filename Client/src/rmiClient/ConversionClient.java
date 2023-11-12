package rmiClient;
import java.rmi.Naming;
import rmiService.IConversion;
public class ConversionClient 
{
	public static void main(String[] args)
	{
		try {
			//récupère le stub de l ’objet enregistré au nom de « objectDistant »
			IConversion stub=(IConversion)Naming.lookup("rmi://localhost:1099/objectDistant");
			// invocation de la méthode
			System.out.println(stub.convertirMontant(1500));
			System.out.println(stub.convertirMontant(10000));
		} catch (Exception e) {e.printStackTrace();}
	}
}
