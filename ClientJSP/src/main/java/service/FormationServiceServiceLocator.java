/**
 * FormationServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class FormationServiceServiceLocator extends org.apache.axis.client.Service implements service.FormationServiceService {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2645078074172277685L;

	public FormationServiceServiceLocator() {
    }


    public FormationServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FormationServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FormationWSPort
    private java.lang.String FormationWSPort_address = "http://localhost:7000/";

    public java.lang.String getFormationWSPortAddress() {
        return FormationWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FormationWSPortWSDDServiceName = "FormationWSPort";

    public java.lang.String getFormationWSPortWSDDServiceName() {
        return FormationWSPortWSDDServiceName;
    }

    public void setFormationWSPortWSDDServiceName(java.lang.String name) {
        FormationWSPortWSDDServiceName = name;
    }

    public service.FormationWS getFormationWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FormationWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFormationWSPort(endpoint);
    }

    public service.FormationWS getFormationWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.FormationWSPortBindingStub _stub = new service.FormationWSPortBindingStub(portAddress, this);
            _stub.setPortName(getFormationWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFormationWSPortEndpointAddress(java.lang.String address) {
        FormationWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.FormationWS.class.isAssignableFrom(serviceEndpointInterface)) {
                service.FormationWSPortBindingStub _stub = new service.FormationWSPortBindingStub(new java.net.URL(FormationWSPort_address), this);
                _stub.setPortName(getFormationWSPortWSDDServiceName());
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
        if ("FormationWSPort".equals(inputPortName)) {
            return getFormationWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "FormationServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "FormationWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FormationWSPort".equals(portName)) {
            setFormationWSPortEndpointAddress(address);
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
