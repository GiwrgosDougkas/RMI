/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author George
 */
public class Client {
    private static String host="localhost";
    private static int r;
    public static void main(String[] args){
        try {
            while(r==JOptionPane.YES_OPTION){
            String number=JOptionPane.showInputDialog("Enter Number");
            String number2=JOptionPane.showInputDialog("Enter Second Number"); 
            int a=Integer.parseInt(number);
            int b=Integer.parseInt(number2);
            String sumbol=JOptionPane.showInputDialog("Enter +, - ,*, /"); 
            AddRem rem=(AddRem)Naming.lookup("rmi://"+host+":5069/AddRem");
            if(sumbol.equals("+")){
            r=JOptionPane.showConfirmDialog(null, rem.add(a, b));
            
            }
            else if(sumbol.equals("-")){
               r=JOptionPane.showConfirmDialog(null, rem.dif(a, b));
             
               
            }
            else if(sumbol.equals("*")){
               r=JOptionPane.showConfirmDialog(null, rem.mul(a,b));     
               
              
           }             
           else if(sumbol.equals("/")){
                   r=JOptionPane.showConfirmDialog(null, rem.div(a, b));
                   
            }
           
         }
           
        } catch (NotBoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
}
