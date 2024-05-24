/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author hernan
 */
public class Encapsulamiento {
    
    public static void main(String[] args) {
        Alumno alum = new Alumno ();
        Alumno alum2 = new Alumno (18, "Hernan", "Mendez");
        
        System.out.println("edad: " + alum2.getEdad());
        System.out.println("nombre: " + alum2.getNombre());
        System.out.println("apellido: " + alum2.getApellido());
    }
}   