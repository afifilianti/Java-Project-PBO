/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatakaryawan;

import java.util.Calendar;

/**
 *
 * @author Lenovo
 */
public class Karyawan extends Variabel implements Gaji{
     public Karyawan(String kode, String nama, String almt, String tgll, String goll, String stts, String anak){
        this.kode = kode;
        this.nama = nama;
        this.almt = almt;       
        this.tgllhr = tgll;
        this.gol = goll;
        this.stts = stts;
        this.anak = anak;
        
        Calendar date = Calendar.getInstance();
        int now = date.get(Calendar.YEAR);
        
        String[] arrString = this.tgllhr.split("-");
        int born = Integer.parseInt( arrString[0] );
        
        this.usia = now - born;
    }    

    @Override
    public void hasil() {
        System.out.println("=========================================");
        System.out.println("          DATA PROFILE KARYAWAN          ");
        System.out.println("-----------------------------------------");
        System.out.println("Kode Karyawan           : " + this.kode);
        System.out.println("Nama Karyawan           : " + this.nama);
        System.out.println("Golongan                : " + this.gol);
        System.out.println("Usia                    : " + this.usia);
        
        String status;
        if ("1".equals(this.stts)){
            status = "Menikah";
        } else {
            status = "Belum Menikah";
        }
        System.out.println("Status Menikah          : " + status);
        System.out.println("Jumlah Anak             : " + this.anak);        
        System.out.println("------------------------------------------");

        //GAJI
        Double gp = gajiPokok(this.gol);
        Double tm = tunjMenikah(this.stts,this.gol);
        Double tp = tunjPegawai(this.usia,this.gol);
        Double ta = tunjAnak(this.anak,this.gol);
        Double a = gp+tm+tp+ta;
        Double b = a*0.025;
        Double c = a-b;
        System.out.println("Gaji Pokok              : Rp " + gp);    
        System.out.println("Tunjangan Istri/Suami   : Rp " + tm);
        System.out.println("Tunjangan Pegawai       : Rp " + tp);
        System.out.println("Tunjangan Anak          : Rp " + ta);
        System.out.println("------------------------------------------- +");
        System.out.println("Gaji Kotor              : Rp " + a);
        System.out.println("Potongan                : Rp " + b);
        System.out.println("------------------------------------------- +");
        System.out.println("Gaji Bersih             : Rp " + c);       
    }
    
    @Override
    public Double gajiPokok(String n){
        Double gajipokok = null;
        switch(n){
            case "A" :
                gajipokok = 5000000.0;
                break;
            case "B" :
                gajipokok = 6000000.0;
                break;
            case "C" :
                gajipokok = 7000000.0;                
        }
        
        return gajipokok;
    }
    
    @Override
    public Double tunjMenikah(String x,String y){
        if ("1".equals(x)){
            return 0.1*gajiPokok(y);
        } else {
            return 0.0;
        }
    }
    
    @Override
   public Double tunjPegawai(int x, String y){
        if (x > 30){
            return 0.15*gajiPokok(y);
        } else {
            return 0.0;
        }
    }
    
    @Override
    public Double tunjAnak(String x, String y){
        return Integer.parseInt(x)*0.05*gajiPokok(y); 
    }
}
