/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Lenovo
 */
public class Lingkaran extends BangunDatar {
    // atribut jari-jari
    public double jarijari;
    
    @Override
    public double hitungLuas(){
        double luas = Math.PI * this.jarijari * this.jarijari;
        return luas;
    }
    
    @Override
    public double hitungKeliling(){
 	double keliling = 2 * Math.PI * this.jarijari;
        return keliling;
    }

}
