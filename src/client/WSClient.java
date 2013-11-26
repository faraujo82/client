package client;

import java.rmi.RemoteException;

import br.com.fubica.www.fubica.wsdl.FubicaEndpoint;
import br.com.fubica.www.fubica.wsdl.FubicaEndpointProxy;

public class WSClient {
	public static void main(String[] args) {
		FubicaEndpoint fubica = new FubicaEndpointProxy();
		try {
			String teste = fubica.traduzir("teste.teste");
			System.out.println(teste);
		} catch (RemoteException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }		
	}
}
