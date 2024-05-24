/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author hernan
 */
public class Animal extends Futbol {
    private String nombreGato;
    private double peso;
    private double edad;
    private double raza;
    private double tamaño;
    
    //constructores
    
    //getters y setters
    
    @Override
    public void mejorEquipo() {
        System.out.println("Mi equipo es el mejor, soy Colombiano");
    }
}