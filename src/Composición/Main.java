/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composición;

/**
 *
 * @author hernan
 */
public class Main {
    public static void main (String[] args) {
        Celular cel = new Celular ("IPHONE18PRO", 4000, "APPLE");
        
        Chip claro = new Chip("Claro: ", 328393);
        Chip tigo = new Chip("Tigo: ", 738287);
        
        cel.agregarChip(claro);
        cel.agregarChip(tigo);
        
        
        cel.show();
    }
}
