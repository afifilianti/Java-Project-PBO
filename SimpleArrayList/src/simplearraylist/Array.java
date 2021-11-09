/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import static java.util.Collections.binarySearch;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Array {
    ArrayList<String> DATA = new ArrayList<>();
    
    void tambahdata() {
        Scanner tambah = new Scanner(System.in);
        print("Masukkan data string : ");
        DATA.add(tambah.nextLine());
        print("Daftar string dalam array list :" + DATA);
        tambah.nextLine();
    }
    void caridata() {
        Scanner cari = new Scanner(System.in);
        print("Silahkan String yang mau dicari  ");
        String mencari = cari.nextLine();
        if(binarySearch(DATA,mencari) > -1){
            print("String " + mencari + " ada di index ke " + binarySearch(DATA,mencari) +" di dalam data.");
        } else {
            print("String " + mencari + " tidak ada dalam data.");
        }
    }
    void hapusdata() {
        Scanner hapus = new Scanner(System.in);
        print("Silahkan String yang mau dihapus : ");
        String menghapus = hapus.nextLine();
        if(binarySearch(DATA,menghapus) > -1){
            DATA.remove(binarySearch(DATA,menghapus));
            print("String " + menghapus + " sudah dihapus di dalam data.");
        } else {
            print("String " + menghapus + " tidak ada dalam data.");
        }   
    }
    
    void tampildata() {
        System.out.println("Daftar string dalam array list :" + DATA);
    }
    static void print(String text) {
        System.out.println(text);
    }
}
