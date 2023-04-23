/**
 * FormationWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface FormationWS extends java.rmi.Remote {
    public double frais_Dinscription(java.lang.Long code) throws java.rmi.RemoteException;
    public service.Cours[] getAllCours() throws java.rmi.RemoteException;
    public service.Cours getCours(java.lang.Long code) throws java.rmi.RemoteException;
}
