/**
 * HPCWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DocPath.hpcws.v41;

public class HPCWSServiceLocator extends org.apache.axis.client.Service implements com.DocPath.hpcws.v41.HPCWSService {

    public HPCWSServiceLocator() {
    }


    public HPCWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HPCWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HPCWSPort
    private java.lang.String HPCWSPort_address = "http://www.webservicex.com/globalweather.asmx?wsdl";

    public java.lang.String getHPCWSPortAddress() {
        return HPCWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HPCWSPortWSDDServiceName = "HPCWSPort";

    public java.lang.String getHPCWSPortWSDDServiceName() {
        return HPCWSPortWSDDServiceName;
    }

    public void setHPCWSPortWSDDServiceName(java.lang.String name) {
        HPCWSPortWSDDServiceName = name;
    }

    public com.DocPath.hpcws.v41.HPCWS getHPCWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HPCWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHPCWSPort(endpoint);
    }

    public com.DocPath.hpcws.v41.HPCWS getHPCWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.DocPath.hpcws.v41.HPCWSPortBindingStub _stub = new com.DocPath.hpcws.v41.HPCWSPortBindingStub(portAddress, this);
            _stub.setPortName(getHPCWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHPCWSPortEndpointAddress(java.lang.String address) {
        HPCWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.DocPath.hpcws.v41.HPCWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.DocPath.hpcws.v41.HPCWSPortBindingStub _stub = new com.DocPath.hpcws.v41.HPCWSPortBindingStub(new java.net.URL(HPCWSPort_address), this);
                _stub.setPortName(getHPCWSPortWSDDServiceName());
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
        if ("HPCWSPort".equals(inputPortName)) {
            return getHPCWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://v41.hpcws.DocPath.com/", "HPCWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://v41.hpcws.DocPath.com/", "HPCWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HPCWSPort".equals(portName)) {
            setHPCWSPortEndpointAddress(address);
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
