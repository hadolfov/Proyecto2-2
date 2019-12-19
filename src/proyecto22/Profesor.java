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


public class Profesor extends Persona{
    private String horario;

    public Profesor(String nombre, String apellido, String edad, String sexo, String horario) {
        super(nombre, apellido, edad, sexo);
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
