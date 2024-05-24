/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composición;

/**
 *
 * @author hernan
 */
public class Chip {
    private String empresa;
    private int numero;
    private int modelo;
    
    public Chip(String empresa, int numero) {
        this.empresa = empresa;
        this.numero = numero;
        this.modelo = modelo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
    
    public void show() {
        System.out.println("\tEmpresa: " + empresa);
        System.out.println("\tNro: " + numero); 
        System.out.println("\tModel: " + modelo);
    }
}

    