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
    ArrayList<Persona> lista = new ArrayList<>(2);
    
    
    public Lista(){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Profesor> Profesores    = new ArrayList<>();
        lista[0] = estudiantes();
        lista[1] = Profesores;
    }
    
    public void agregar(Estudiante e){
        this.lista.get(0)..add(e);
        
    }
    
    public void agregar(Profesor p){
        this.lista.add(p);
    }
    
    public Persona buscarNombre(String nomb){

        for (int i=0; i<this.lista.size(); i++) 
        { 
            if (this.lista.get(i).getNombre().equals(nomb)){
                if (this.lista.get(i).getClass().equals(Estudiante.class)){
                    this.lista.get(i).
                    Estudiante p = new Estudiante(super.lista.get(i).getNombre(), super.lista.get(i).getApellido(), super.lista.get(i).getEdad(), super.lista.get(i).getSexo(), this.lista.get(i).);
                } else {
                    
                }
                
                
            } else {

            }
        }
        return p;
    }
}
