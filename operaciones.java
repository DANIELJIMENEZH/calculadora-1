/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaa;

/**
 *
 * @author FER
 */
public class operaciones {
     //Atributos
   
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos
    

    //Metodo de suma
    public void sumar(int numero1, int numero2){
    suma=numero1+numero2;
    }
    public void resta(int numero1, int numero2){
    resta=numero1-numero2;
    }
     public void multiplicacion(int numero1, int numero2){
      multiplicacion=numero1*numero2;
    }
     public void division(int numero1, int numero2){
      division=numero1/numero2;
    }
     public void mostrarResultados(){
         System.out.println("la suma es:"+suma);
         System.out.println("la resta es:"+resta);
         System.out.println("la multiplicaciion es:"+multiplicacion);
         System.out.println("la division es:"+division);
     }
    }
            


