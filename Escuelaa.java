/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escuelaa;
import javax.swing.JOptionPane;
/**
 *
 * @author FER
 */
public class Escuelaa {

    public static void main(String[] args) {
      int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 1:"));
      int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero 2:"));
    

       operaciones Op=new operaciones();
       Op.leerNumeros(n1,n2); 
       Op.sumar(n1,n2); 
       Op.resta(n1,n2); 
       Op.multiplicacion(n1,n2); 
       Op.mostrarResultados();
    }
}
