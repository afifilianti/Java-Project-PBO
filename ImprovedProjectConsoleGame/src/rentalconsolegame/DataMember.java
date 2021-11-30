/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

/**
 *
 * @author Lenovo
 */
public class DataMember {
    String ID;
    private String Nama;
    private String Jenis;
    
    public DataMember(String x, String y, String z) {
        this.ID = x;
        this.Nama = y;
        this.Jenis = z;
    }
    
    public String jenisMember() {
        return this.Jenis;
    }
    
    void output() {
        System.out.println("ID Member                         : " + this.ID);
        System.out.println("Nama Member                       : " + this.Nama);
        System.out.println("Jenis Member                      : " + this.Jenis);
        System.out.println();
    }
}
