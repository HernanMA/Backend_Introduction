/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author hernan
 */
public class Alumno {
    private int edad;
    private String nombre;
    private String apellido;
    
    public Alumno() {
    }

    public Alumno(int edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
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
}

