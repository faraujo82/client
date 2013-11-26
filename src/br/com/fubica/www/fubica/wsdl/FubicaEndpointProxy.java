package br.com.fubica.www.fubica.wsdl;

public class FubicaEndpointProxy implements br.com.fubica.www.fubica.wsdl.FubicaEndpoint {
  private String _endpoint = null;
  private br.com.fubica.www.fubica.wsdl.FubicaEndpoint fubicaEndpoint = null;
  
  public FubicaEndpointProxy() {
    _initFubicaEndpointProxy();
  }
  
  public FubicaEndpointProxy(String endpoint) {
    _endpoint = endpoint;
    _initFubicaEndpointProxy();
  }
  
  private void _initFubicaEndpointProxy() {
    try {
      fubicaEndpoint = (new br.com.fubica.www.fubica.wsdl.DefaultFubicaEndpointServiceLocator()).getDefaultFubicaEndpointPort();
      if (fubicaEndpoint != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fubicaEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fubicaEndpoint)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fubicaEndpoint != null)
      ((javax.xml.rpc.Stub)fubicaEndpoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.fubica.www.fubica.wsdl.FubicaEndpoint getFubicaEndpoint() {
    if (fubicaEndpoint == null)
      _initFubicaEndpointProxy();
    return fubicaEndpoint;
  }
  
  public java.lang.String traduzir(java.lang.String chave) throws java.rmi.RemoteException{
    if (fubicaEndpoint == null)
      _initFubicaEndpointProxy();
    return fubicaEndpoint.traduzir(chave);
  }
  
  
}