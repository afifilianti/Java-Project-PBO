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
public class PersegiPanjang extends BangunDatar{
    //atribut persegi panjang
    public double panjang;
    public double lebar;
    
    @Override
    public double hitungLuas() {
        double luas = this.panjang * this.lebar;
        return luas;
    }
    
    @Override
    public double hitungKeliling() {
        double keliling = (this.panjang + this.lebar) * 2;
        return keliling;
    }
}
