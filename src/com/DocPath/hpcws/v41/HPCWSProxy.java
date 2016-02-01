package com.DocPath.hpcws.v41;

public class HPCWSProxy implements com.DocPath.hpcws.v41.HPCWS {
  private String _endpoint = null;
  private com.DocPath.hpcws.v41.HPCWS hPCWS = null;
  
  public HPCWSProxy() {
    _initHPCWSProxy();
  }
  
  public HPCWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initHPCWSProxy();
  }
  
  private void _initHPCWSProxy() {
    try {
      hPCWS = (new com.DocPath.hpcws.v41.HPCWSServiceLocator()).getHPCWSPort();
      if (hPCWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hPCWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hPCWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hPCWS != null)
      ((javax.xml.rpc.Stub)hPCWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.DocPath.hpcws.v41.HPCWS getHPCWS() {
    if (hPCWS == null)
      _initHPCWSProxy();
    return hPCWS;
  }
  
  public com.DocPath.hpcws.v41.DpJobResult generateDoc(byte[] dat, java.lang.String codepage, int timeout, java.lang.String termID, boolean cancelOnTimeout, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean{
    if (hPCWS == null)
      _initHPCWSProxy();
    return hPCWS.generateDoc(dat, codepage, timeout, termID, cancelOnTimeout, reserved1, reserved2);
  }
  
  public com.DocPath.hpcws.v41.DpJobResult sendJobData(byte[] dat, java.lang.String codepage, int timeout, java.lang.String termID, boolean cancelOnTimeout, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean{
    if (hPCWS == null)
      _initHPCWSProxy();
    return hPCWS.sendJobData(dat, codepage, timeout, termID, cancelOnTimeout, reserved1, reserved2);
  }
  
  public com.DocPath.hpcws.v41.DpJobResult getJobStatus(long jobID, int timeout, java.lang.String termID, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean{
    if (hPCWS == null)
      _initHPCWSProxy();
    return hPCWS.getJobStatus(jobID, timeout, termID, reserved1, reserved2);
  }
  
  public com.DocPath.hpcws.v41.DpJobResult cancelJob(long jobID, java.lang.String termID, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean{
    if (hPCWS == null)
      _initHPCWSProxy();
    return hPCWS.cancelJob(jobID, termID, reserved1, reserved2);
  }
  
  public com.DocPath.hpcws.v41.DpJobResult getJobDoc(long jobID, int timeout, java.lang.String termID, boolean cancelOnTimeout, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean{
    if (hPCWS == null)
      _initHPCWSProxy();
    return hPCWS.getJobDoc(jobID, timeout, termID, cancelOnTimeout, reserved1, reserved2);
  }
  
  public boolean isAlive() throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean{
    if (hPCWS == null)
      _initHPCWSProxy();
    return hPCWS.isAlive();
  }
  
  
}