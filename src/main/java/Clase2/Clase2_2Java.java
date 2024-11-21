/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase2;

/**
 *
 * @author JOSEPH
 */
public class Clase2_2Java {
    public static void main(String[] args){
        System.out.println("Mi mensaje");
        String msj="adios";
        
        switch(msj){
            case "Hola":
                System.out.println("Hola, ");
                break;
            case "adios":
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Tu mensaje es: "+msj);
        }
    }
}
