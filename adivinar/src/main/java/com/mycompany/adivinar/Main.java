/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adivinar;

import java.util.Scanner;

/**
 *
 * @author Luciano
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = (int) ((Math.random() * 100)+1); 
        int index;
        int vidas = 5;
        
        

        System.out.println("El juego consiste en averiguar un número secreto de 100 posibles.\nTienes 5 intentos.");
        
        
        do {
            System.out.println("Ingrese un numero: ");
            index = sc.nextInt();
            if (index <= 100) {
                if (vidas == 1){
                    System.out.println("\nHas Perdido");
                    System.out.println("El numero era: "+ num);
                    break;}
                else{
                    if (num == index) {
                        System.out.println("Felicidades has acertado");}    
                    else{ vidas -= 1;
                        System.out.println("Te quedan "+vidas + " intentos.");}
                }           
                if (num > index)         
                    System.out.println("El número es MAYOR que "+ index);
                else if (num < index)        
                    System.out.println("El número es MENOR que "+index); 
            }else{
                System.out.println("Numero incorrecto vuelve a intentarlo.");}  
        } while (num != index);       
    }
}