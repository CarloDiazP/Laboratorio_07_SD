/**
 * SOAPI.java
 *
 * This file was auto-generated from WSDL
 */

package org.example.soap;

public interface SOAPI extends java.rmi.Remote {
    public org.example.soap.Item[] getItems() throws java.rmi.RemoteException;
    public java.lang.String buyItem(java.lang.String arg0, int arg1) throws java.rmi.RemoteException;
    public void setItem(java.lang.String arg0, int arg1, double arg2) throws java.rmi.RemoteException;
    public void addItem(org.example.soap.Item arg0) throws java.rmi.RemoteException;
}
