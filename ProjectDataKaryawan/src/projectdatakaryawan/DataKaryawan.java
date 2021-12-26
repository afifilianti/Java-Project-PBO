/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatakaryawan;

/**
 *
 * @author Lenovo
 */
public class DataKaryawan extends Menu{
    @Override
    void tambahData(Karyawan data) {
        this.karyawan.add(data);
    }

    @Override
    void hapusData(String kode) {
        int x = 0;
        for(int i = 0; i < this.karyawan.size(); i++){
            if( this.karyawan.get(i).kode.equals(kode)){
                //hapus
                this.karyawan.remove(i);
                x = 1;
            }
        }        
        if (x == 1){
            System.out.println("Data dihapus");
        } else {
            System.out.println("Data tidak ditemukan");
        } 
    }

    @Override
    void cariData(String x) {
        int index = 0;
        int ditemukan = 0;
        for(int i = 0; i < this.karyawan.size(); i++){            
            if( this.karyawan.get(i).kode.equals(x) ){
                // catat index
                index = i;
                ditemukan = 1;
            }
        }
        
        if( ditemukan == 1 ){
            this.karyawan.get(index).hasil();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    @Override
    void lihatData() {
        System.out.println("========================================================================================");
        System.out.println("                                  DATA KARYAWAN                                         ");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("KODE       NAMA KARYAWAN           GOL     USIA      STATUS NIKAH    JUMLAH ANAK");
        System.out.println("----------------------------------------------------------------------------------------");
        for( int i = 0; i < this.karyawan.size(); i++){
        String a = this.karyawan.get(i).kode;
            String b = this.karyawan.get(i).nama;
            String c = this.karyawan.get(i).gol;
            int d = this.karyawan.get(i).usia;
            String e;
            String f;
            if ("1".equals(this.karyawan.get(i).stts) ){
                e = "   Menikah     ";
                f = this.karyawan.get(i).anak;
            } else {
                e = "Belum Menikah  ";
                f = "0";
            }
            System.out.println(a+"      "+b+"                "+c+"       "+d+"       "+e+"       "+f);
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Jumlah Data : " + this.karyawan.size());
        System.out.println("");
    }
}
