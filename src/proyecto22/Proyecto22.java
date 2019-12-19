/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto22;

import java.util.Scanner;

/**
 *
 * @author Laboratorio CISCO
 */
public class Proyecto22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
        
        Scanner lector = new Scanner(System.in);
        String tecla;
        
        do {
           
            System.out.print("Digite el nombre: ");
            String nombre = lector.next();
            System.out.print("Digite el apellido: ");
            String apellido = lector.next();
            System.out.print("Digite la edad: ");
            String edad = lector.next();
            System.out.print("Digite el sexo: ");
            String sexo = lector.next();
            




            System.out.print("Desea salir? S/N: ");
            tecla = lector.next().substring(0, 1).toUpperCase();
        } while (!"S".equals(tecla));
    }
    
}
