/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author George
 */
public interface AddRem extends Remote{
    
    int add(int a, int b) throws RemoteException;
    int dif(int a, int b)throws RemoteException;
    int div(int a, int b) throws RemoteException;
    int mul(int a,int b) throws RemoteException;
}
