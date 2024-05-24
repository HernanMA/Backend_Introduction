/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author hernan
 */
public class Consultor extends Persona {
    String nombre_consultor;
    int num_consultor;
    
public Consultor() {
    
}

    public Consultor(String nombre_consultor, int num_consultor, String nombre, String apellido, int cedula, String direccion, String telefono) {
        super(nombre, apellido, cedula, direccion, telefono);
        this.nombre_consultor = nombre_consultor;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultor() {
        return nombre_consultor;
    }

    public void setNombre_consultor(String nombre_consultor) {
        this.nombre_consultor = nombre_consultor;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
}
