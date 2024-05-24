/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author hernan
 */
public class Jefe extends Persona {
    String departamento_jefe;
    int num_empleados;
    int inversiones;
    
    public Jefe() {
    }

    public Jefe(String departamento_jefe, int num_empleados, int inversiones, String nombre, String apellido, int cedula, String direccion, String telefono) {
        super(nombre, apellido, cedula, direccion, telefono);
        this.departamento_jefe = departamento_jefe;
        this.num_empleados = num_empleados;
        this.inversiones = inversiones;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }

    public int getNum_empleados() {
        return num_empleados;
    }

    public void setNum_empleados(int num_empleados) {
        this.num_empleados = num_empleados;
    }

    public int getInversiones() {
        return inversiones;
    }

    public void setInversiones(int inversiones) {
        this.inversiones = inversiones;
    }
    
    
    
}
