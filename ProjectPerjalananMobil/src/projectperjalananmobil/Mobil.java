/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectperjalananmobil;

/**
 *
 * @author Lenovo
 */
public abstract class Mobil {
    public double jarak;
    public double kecepatan;
    public abstract double hitungBensin();
    
    public double hitungWaktu() {
        double waktu =  this.jarak / this.kecepatan;
        return waktu;
    }
    
    public void tampilHasil(){
        System.out.println("Minimal bahan bakar yang diperlukan adalah " + this.hitungBensin() +" liter");
        System.out.println("Waktu yang ditempuh adalah " + this.hitungWaktu() + " jam");
    }
}
