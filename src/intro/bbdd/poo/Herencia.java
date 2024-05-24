/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro.bbdd.poo;

/**
 *
 * @author hernan
 */
public class Herencia {
    
    public static void main(String[] args) {
    
        Empleado emple = new Empleado();
        
        emple.getNum_trabajo();
        emple.getNombre();
        
        Consultor consul = new Consultor();
        
        consul.getNum_consultor();
        consul.getNombre();
    }
}
    
