/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.argumentos;

/**
 *
 * @author PC
 */
public class Argumentos {

    public static void main(String[] args) {
        String argumentos1;
        //String argumentos2;
        argumentos1=args[0];
        //argumentos2=args[1];
        System.out.println("Argumento 1: "+ argumentos1);
        //System.out.println("Argumento 2: "+ argumentos2);
        switch(argumentos1){
            case "1":{
                System.out.println("Idioma español");
                break;
            }
            case "2":{
                System.out.println("Hi! I'm Muzzy");
                break;
            }
            default:{
                System.out.println("elemento equivocado");
            }
        }
    }
}
