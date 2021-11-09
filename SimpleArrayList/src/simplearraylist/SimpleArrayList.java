/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Array r = new Array();
        while(true){
            int inp;
            System.out.println("Menu Data ArrayList :");
            System.out.println("1.Tambah data");
            System.out.println("2.Cari Data");
            System.out.println("3.Hapus Data");
            System.out.println("4.Tampil Data");
            System.out.println("5.Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("Pilih nomor berapa : ");
            inp = input.nextInt();

            switch (inp) {
                case 1:
                    r.tambahdata();
                    break;
                case 2:
                    r.caridata();
                    break;
                case 3:
                    r.hapusdata();
                    break;
                case 4:
                    r.tampildata();
                    break;
                case 5:
                    System.out.println("Program telah selesai");
                    System.exit(0);
                    default:
                    print("Menu tidak ada,Pilih Angka Yang Tersedia");
            }
        }
    }
    static void print(String text) {
    System.out.println(text);
    }
}