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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--------Perjalanan Antarkota--------");
        
        System.out.println("\nA  |  Sedan  |  Solo – Kudus       |  60 km/jam 110km");
        Sedan a = new Sedan();
        a.jarak     = 110;
        a.kecepatan = 60;
        a.tampilHasil();
    
        System.out.println("\nB  |  Sedan  |  Solo – Jakarta     |  65 km/jam 538km");
        Sedan b = new Sedan();
        b.jarak     = 538;
        b.kecepatan = 65;
        b.tampilHasil();  

        System.out.println("\nC  |  SUV    |  Solo – Banten      |  57 km/jam 662km");
        SUV c = new SUV();
        c.jarak     = 662;
        c.kecepatan = 57;
        c.tampilHasil();
        
        System.out.println("\nD  |  SUV    |  Solo – Bandung     |  62 km/jam 532km");
        SUV d = new SUV();
        d.jarak     = 532;
        d.kecepatan = 62;
        d.tampilHasil();
        
        System.out.println("\nE  |  MPV    |  Solo – Banyuwangi  |  64 km/jam 541km");
        MPV e = new MPV();
        e.jarak     = 541;
        e.kecepatan = 64;
        e.tampilHasil();
        
        System.out.println("\nF  |  MPV    |  Solo – Jember      |  53 km/jam 433km");
        MPV f = new MPV();
        f.jarak     = 433;
        f.kecepatan = 53;
        f.tampilHasil();
    }
    
}
