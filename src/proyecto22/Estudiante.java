/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto22;

/**
 *
 * @author Laboratorio CISCO
 */
public class Estudiante extends Persona{
    String nota;

    public Estudiante(String nombre, String apellido, String edad, String sexo, String nota) {
        super(nombre, apellido, edad, sexo);
        this.nota = nota;
    }
    
    public Estudiante getTodo(){
        Estudiante n = new Estudiante(super.getNombre(), super.getApellido(), super.getEdad(), super.getSexo(), nota);
        return n;
    }

    public String getNota() {
        return this.nota;
    }
    
    public void setNota(String nota){
        this.nota = nota;
    }
}
