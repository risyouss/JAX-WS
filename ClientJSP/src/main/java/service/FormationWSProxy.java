package service;

public class FormationWSProxy implements service.FormationWS {
  private String _endpoint = null;
  private service.FormationWS formationWS = null;
  
  public FormationWSProxy() {
    _initFormationWSProxy();
  }
  
  public FormationWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initFormationWSProxy();
  }
  
  private void _initFormationWSProxy() {
    try {
      formationWS = (new service.FormationServiceServiceLocator()).getFormationWSPort();
      if (formationWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)formationWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)formationWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (formationWS != null)
      ((javax.xml.rpc.Stub)formationWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.FormationWS getFormationWS() {
    if (formationWS == null)
      _initFormationWSProxy();
    return formationWS;
  }
  
  public double frais_Dinscription(java.lang.Long code) throws java.rmi.RemoteException{
    if (formationWS == null)
      _initFormationWSProxy();
    return formationWS.frais_Dinscription(code);
  }
  
  public service.Cours[] getAllCours() throws java.rmi.RemoteException{
    if (formationWS == null)
      _initFormationWSProxy();
    return formationWS.getAllCours();
  }
  
  public service.Cours getCours(java.lang.Long code) throws java.rmi.RemoteException{
    if (formationWS == null)
      _initFormationWSProxy();
    return formationWS.getCours(code);
  }
  
  
}