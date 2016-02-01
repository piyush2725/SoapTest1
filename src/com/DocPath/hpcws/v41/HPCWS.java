/**
 * HPCWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.DocPath.hpcws.v41;

public interface HPCWS extends java.rmi.Remote {
    public com.DocPath.hpcws.v41.DpJobResult generateDoc(byte[] dat, java.lang.String codepage, int timeout, java.lang.String termID, boolean cancelOnTimeout, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean;
    public com.DocPath.hpcws.v41.DpJobResult sendJobData(byte[] dat, java.lang.String codepage, int timeout, java.lang.String termID, boolean cancelOnTimeout, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean;
    public com.DocPath.hpcws.v41.DpJobResult getJobStatus(long jobID, int timeout, java.lang.String termID, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean;
    public com.DocPath.hpcws.v41.DpJobResult cancelJob(long jobID, java.lang.String termID, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean;
    public com.DocPath.hpcws.v41.DpJobResult getJobDoc(long jobID, int timeout, java.lang.String termID, boolean cancelOnTimeout, java.lang.String reserved1, java.lang.String reserved2) throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean;
    public boolean isAlive() throws java.rmi.RemoteException, com.DocPath.hpcws.v41.ExceptionBean;
}
