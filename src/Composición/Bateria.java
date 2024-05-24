/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composición;

/**
 *
 * @author hernan
 */
public class Bateria {
    
    private int mAH;
    private String marca;

    public Bateria(int mAH, String marca) {
        this.mAH = mAH;
        this.marca = marca;
    }

    public int getmAH() {
        return mAH;
    }

    public void setmAH(int mAH) {
        this.mAH = mAH;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void show() {
        System.out.println("Cantidad mAH: " + mAH);
        System.out.println("Marca: " + marca);
    }   
}
