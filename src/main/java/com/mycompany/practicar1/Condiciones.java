package com.mycompany.practicar1;

/**
 *
 * @author JOSEPH
 */
public class Condiciones {
    // int, double,String,chart,boolean
    
    public static void main(String[] args) {
        int edad=17;
        
    /*  boolean esMayor=false;
        
        esMayor = edad>17;
        
        //Nos permite mostrar por un mensaje por la terminal
        System.out.println("Hello World!");
        System.out.println("Mi edad es "+edad);
        
        
        if(edad>17){ // si es Mayor es verdadero
            System.out.println("Eres mayor de edad con: "+edad);
        }else{ // si esMayor es falso
            System.out.println("Eres menor de edad con: "+edad);
        }
    */
        switch(edad){
            case 18:  
                System.out.println("Tienes 18 años.");
                break;
            
            case 20:
                System.out.println("Tienes 20 años");
                break;
            
            default: /* el default tiene el objetivo de ejecutar
                esa acción en caso de que no se cumpla ninguno de
                los casos */
                System.out.println("Mi edad es : "+edad);
                break;
                
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        if(esMayor){ // si es Mayor es verdadero
            System.out.println("Eres mayor de edad con: "+edad);
        }else{ // si esMayor es falso
            System.out.println("Eres menor de edad con: "+edad);
        }
        
        */
    }
    
}
