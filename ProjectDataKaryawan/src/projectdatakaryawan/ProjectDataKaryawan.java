/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatakaryawan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ProjectDataKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataKaryawan dk = new DataKaryawan();
        // DATA KARYAWAN
        dk.tambahData(new Karyawan("K2001","Antarees ","Jakarta   ","1993-10-10","A","1","1"));
        dk.tambahData(new Karyawan("K2002","Galaxy   ","Bandung   ","1991-09-29","B","1","2"));
        dk.tambahData(new Karyawan("K2003","Gerald   ","Yogyakarta","1994-01-19","B","0","0"));
        dk.tambahData(new Karyawan("K2004","Keenan   ","Surakarta ","1992-02-09","A","1","1"));
        dk.tambahData(new Karyawan("K2005","Witnes   ","Bandung   ","1995-07-19","C","0","0"));
        while(true){
            System.out.println("            MENU UTAMA            ");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Karyawan");
            System.out.println("2. Hapus Data Karyawan");
            System.out.println("3. Cari Data Karyawan");
            System.out.println("4. Lihat Data Karyawan");
            System.out.println("5. Exit");
            
            Scanner input = new Scanner( System.in );
            System.out.print("Menu Pilihan  : ");
            int mainmenu = input.nextInt();
            
            //TAMBAH DATA
            switch(mainmenu){
                case 1 : 
                    while(true ){
                        System.out.println("");
                        System.out.println("           TAMBAH DATA            ");
                        System.out.println("==================================");
                        input.nextLine();
                        
                        System.out.print("Masukan Kode Karyawan  : ");
                        String kode = input.nextLine();
                        System.out.print("Masukan Nama Karyawan  : ");
                        String nama = input.nextLine();
                        System.out.print("Masukan Alamat         : ");
                        String alamat = input.nextLine();
                        System.out.print("Masukan Tanggal Lahir  : ");
                        String tanggal = input.nextLine();
                        System.out.print("Masukan Golongan       : ");
                        String golongan = input.nextLine();
                        System.out.print("Masukan Status Menikah : ");
                        String status = input.nextLine();
                        String anak;
                        if( "1".equals(status) ){
                            System.out.print("Jumlah Anak            : ");
                            anak = input.nextLine();
                        } else {
                            anak = "0";
                        }
                        Karyawan karyawan = new Karyawan(kode,nama+"        ",alamat,tanggal,golongan,status,anak);
                        dk.tambahData(karyawan);
                        
                        System.out.println("");
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Tambah data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu_tambah = input.nextInt();
                        if(submenu_tambah != 2 ){
                            break;
                        }   
                    }                
                    break;
                
                //HAPUS DATA
                case 2 : 
                    while( true) {
                        System.out.println("");
                        System.out.println("           HAPUS DATA             ");
                        System.out.println("==================================");
                        input.nextLine();
                        System.out.print("Masukan kode karyawan yg ingin dihapus : ");
                        String kode_karyawan = input.nextLine();
                        dk.hapusData(kode_karyawan);
                        
                        System.out.println(""); 
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Hapus data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu_hapus = input.nextInt();
                        if( submenu_hapus != 2 ){
                            break;
                        }             
                    }
                    break;
                
                //CARI DATA
                case 3 :                     
                    while(true){
                        // input 
                        System.out.println("");
                        System.out.println("            CARI DATA            ");
                        System.out.println("==================================");                        
                        input.nextLine();                        
                        System.out.print("Masukan Kode Karyawan untuk dicari : "+"");                        
                        String kode= input.nextLine();
                        dk.cariData(kode);
                        
                        System.out.println("");
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Cari data lagi");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu_cari = input.nextInt();
                        if( submenu_cari != 2 ){
                            break;
                        } 
                    }
                    break;
                
                //LIHAT DATA
                case 4 : 
                    dk.lihatData();   
                    System.out.println("");
                    input.nextLine();
                    
                    System.out.println("Pilih Submenu : ");
                    System.out.println("1. Kembali ke menu utama");
                    System.out.println("");
                    System.out.print("Menu Pilihan : ");
                    input.nextInt();
                    break;
                    
                //EXIT
                case 5 : 
                    System.exit(0);                
                default: 
                    System.out.println("INPUT SALAH!");                
            }               
        }
    }    
}
