/**
 * DefaultFubicaEndpointServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fubica.www.fubica.wsdl;

public class DefaultFubicaEndpointServiceLocator extends org.apache.axis.client.Service implements br.com.fubica.www.fubica.wsdl.DefaultFubicaEndpointService {

    public DefaultFubicaEndpointServiceLocator() {
    }


    public DefaultFubicaEndpointServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DefaultFubicaEndpointServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DefaultFubicaEndpointPort
    private java.lang.String DefaultFubicaEndpointPort_address = "http://localhost:9090/fubica/services/fubica";

    public java.lang.String getDefaultFubicaEndpointPortAddress() {
        return DefaultFubicaEndpointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DefaultFubicaEndpointPortWSDDServiceName = "DefaultFubicaEndpointPort";

    public java.lang.String getDefaultFubicaEndpointPortWSDDServiceName() {
        return DefaultFubicaEndpointPortWSDDServiceName;
    }

    public void setDefaultFubicaEndpointPortWSDDServiceName(java.lang.String name) {
        DefaultFubicaEndpointPortWSDDServiceName = name;
    }

    public br.com.fubica.www.fubica.wsdl.FubicaEndpoint getDefaultFubicaEndpointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DefaultFubicaEndpointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDefaultFubicaEndpointPort(endpoint);
    }

    public br.com.fubica.www.fubica.wsdl.FubicaEndpoint getDefaultFubicaEndpointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.fubica.www.fubica.wsdl.DefaultFubicaEndpointServiceSoapBindingStub _stub = new br.com.fubica.www.fubica.wsdl.DefaultFubicaEndpointServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDefaultFubicaEndpointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDefaultFubicaEndpointPortEndpointAddress(java.lang.String address) {
        DefaultFubicaEndpointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.fubica.www.fubica.wsdl.FubicaEndpoint.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.fubica.www.fubica.wsdl.DefaultFubicaEndpointServiceSoapBindingStub _stub = new br.com.fubica.www.fubica.wsdl.DefaultFubicaEndpointServiceSoapBindingStub(new java.net.URL(DefaultFubicaEndpointPort_address), this);
                _stub.setPortName(getDefaultFubicaEndpointPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DefaultFubicaEndpointPort".equals(inputPortName)) {
            return getDefaultFubicaEndpointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.fubica.com.br/fubica/wsdl", "DefaultFubicaEndpointService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.fubica.com.br/fubica/wsdl", "DefaultFubicaEndpointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DefaultFubicaEndpointPort".equals(portName)) {
            setDefaultFubicaEndpointPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
