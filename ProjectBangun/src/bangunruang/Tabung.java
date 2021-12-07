/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Lenovo
 */
public class Tabung extends BangunRuang{
    //atribut tabung
    public double jarijari;
    public double tinggi;
    
    @Override
    public double hitungVolume() {
        double volume = Math.PI * this.jarijari * this.jarijari * this.tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luas = 2 * Math.PI * this.jarijari * (this.jarijari + this.tinggi);
        return luas;
    }
}
