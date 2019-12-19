/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto22;

import java.util.ArrayList;

/**
 *
 * @author Laboratorio CISCO
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String edad;
    private String sexo;

    public Persona(String nombre, String apellido, String edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    

    public ArrayList<String> getTodo() {
        ArrayList<String> a = new ArrayList();
        a.add(nombre);
        a.add(apellido);
        a.add(edad);
        a.add(sexo);
        return a;
    }

    public void setTodo(String nombre, String apellido, String edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}