/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author hernan
 */
public class Herencia {
    
    public static void main(String[] args) {
    
        Empleado emple = new Empleado();
        
        emple.setNum_trabajo(123);
        emple.setNombre("Hernan");
        emple.setCargo("actor");
        emple.getNum_trabajo();
        emple.getNombre();
        
        Consultor consul = new Consultor();
        
        consul.getNum_consultor();
        consul.getNombre();
    }
}
    
