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
public class Bola extends BangunRuang{
    //atribut bola
    public double jarijari;
    
    @Override
    public double hitungVolume() {
        double volume = 4 / 3 * Math.PI * Math.pow(this.jarijari,3) ;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luas = 4 * Math.PI * Math.pow(this.jarijari,2);
        return luas;
    }
}
