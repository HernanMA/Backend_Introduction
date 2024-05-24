/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

/**
 *
 * @author hernan
 */
public abstract class Figura {
    protected double x;
    protected double y;

    protected Figura() {
    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double calcularArea();
    
}
