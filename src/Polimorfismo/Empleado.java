/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author hernan
 */
public class Empleado extends Persona {
    int num_trabajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int num_trabajo, String cargo, Double sueldo, String nombre, String apellido, int cedula, String direccion, String telefono) {
        super(nombre, apellido, cedula, direccion, telefono);
        this.num_trabajo = num_trabajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNum_trabajo() {
        return num_trabajo;
    }

    public void setNum_trabajo(int num_trabajo) {
        this.num_trabajo = num_trabajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
