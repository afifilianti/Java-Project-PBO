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
public class Sedan extends Mobil{

    @Override
    public double hitungBensin() {
        double bensin = this.jarak / 10 ;
        return bensin;
    }
    
    
}
