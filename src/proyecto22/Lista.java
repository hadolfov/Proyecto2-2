/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto22;

import java.util.ArrayList;

/**
 *
 * @author hadol
 */
public class Lista {
    ArrayList<Persona> lista = new ArrayList<>();
    
    public void agregar(Persona p){
        this.lista.add(p);
    }
    
    public Persona buscarNombre(String nomb){

        for (int i=0; i<this.lista.size(); i++) 
        { 
            if (this.lista.get(i).getNombre().equals(nomb)){
                if (this.lista.get(i).getClass().equals(Estudiante.class)){
                    Estudiante p = new Estudiante(this.lista.get(i).getNombre(), this.lista.get(i).getApellido(), this.lista.get(i).getEdad(), this.lista.get(i).getSexo(), this.lista.get(i).);
                } else {
                    
                }
                
                
            } else {
                //Persona p = new Persona("-", "-", "-", "-");
            }
        }
        return p;
    }
}
