/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author George
 */
public class AddServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        Registry reg=LocateRegistry.createRegistry(5069);
        reg.rebind("AddRem", new AddRemImplementation());
        
       
    }
    
}
