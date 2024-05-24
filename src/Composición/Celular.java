/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composición;

/**
 *
 * @author hernan
 */
public class Celular {
    private String modelo;
    private Bateria bateria;
    private int nroChips;
    private Chip[] chips;

    public Celular(String modelo, int cantMAh, String marcaBateria) {
        this.modelo = modelo;
        this.bateria = new Bateria(cantMAh, marcaBateria);
        this.nroChips = 0;
        this.chips = new Chip[2];
    }    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public int getNroChips() {
        return nroChips;
    }

    public void setNroChips(int nroChips) {
        this.nroChips = nroChips;
    }

    public Chip[] getChips() {
        return chips;
    }

    public void setChips(Chip[] chips) {
        this.chips = chips;
    }
    
    
    
    public void show() {
        System.out.println("Modelo: " + modelo);
        bateria.show();
        System.out.println("Nro Chips: " + nroChips);
        for (int i = 0; i < nroChips; i++) {
        chips[i].show();
    }
    }
    public void agregarChip(Chip nuevoChip) {
        if (nroChips < 2) {
            chips[nroChips] = nuevoChip;
            nroChips++;
        }  
    }
}
