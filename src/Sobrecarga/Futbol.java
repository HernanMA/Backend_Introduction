/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author hernan
 */
public class Futbol {
    private String pais;
    private int copas;
    
    //constructores
    
    //métodos getters y setters
    
    //otros métodos
    
    public void mejorEquipo() {
        System.out.println("El mejor equipo de fultbol es el de: ");
    }
    
    public void mejorEquipo(String equipo) {
        System.out.println("El equipo" + equipo + "Es el mejor");
    }
    
    public void mejorEquipo (String equipo, String copa) {
        System.out.println("El equipo"+ equipo + "tiene mas "+ copa);
    }
}
