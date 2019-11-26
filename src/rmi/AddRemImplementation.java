/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author George
 */
public class AddRemImplementation extends UnicastRemoteObject implements AddRem {
    public AddRemImplementation() throws RemoteException{
        super();
    }
    
    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int dif(int a, int b) throws RemoteException {
      return a-b;
    }

    @Override
    public int div(int a, int b) throws RemoteException {
        if(b!=0){
        return a/b;
        }
        return 0;
    }
    @Override
    public int mul(int a,int b)throws RemoteException{
    
        return a*b;
    }
}
