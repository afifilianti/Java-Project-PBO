/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;


/**
 *
 * @author Lenovo
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Persegi");
        Persegi p = new Persegi();
        p.sisi = 8;
        p.tampilHasil();
        System.out.println();
        
        System.out.println("Lingakaran");
        Lingkaran l =  new Lingkaran();
        l.jarijari = 7;
        l.tampilHasil();
        System.out.println();
        
        System.out.println("Persegi Panjang");
        PersegiPanjang pp = new PersegiPanjang();
        pp.lebar    = 5;
        pp.panjang  = 10;
        pp.tampilHasil();
        System.out.println();
        
        System.out.println("Tabung");
        Tabung tab = new Tabung();
        tab.jarijari = 7;
        tab.tinggi   = 10;
        tab.tampilHasil();
        System.out.println();
        
        System.out.println("Balok");
        Balok ba = new Balok();
        ba.panjang = 12;
        ba.lebar   = 5;
        ba.tinggi  = 7;
        ba.tampilHasil();
        System.out.println();
        
        System.out.println("Bola");
        Bola bo = new Bola();
        bo.jarijari = 10;
        bo.tampilHasil();  
    }
}
