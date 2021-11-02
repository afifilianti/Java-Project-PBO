/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Pythagorasproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,menu;
        Segitiga s = new Segitiga();
        
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM PYTTHAGORAS");
        while(true) {
            System.out.println("Menu :");
            System.out.println("1. Cek triple pythagoras");
            System.out.println("2. Menentukan sisi miring segitiga");
            System.out.println("3. Menentukan sisi siku-siku segitiga");
            System.out.println("4. Exit");
            
            System.out.print("Pilih Menu : ");
            menu = input.nextInt();
            System.out.println();
            
            switch(menu) {
                case 1:
                    System.out.print("Masukkan nilai A : ");
                    a = input.nextInt();
                    System.out.print("Masukkan nilai B : ");
                    b = input.nextInt();
                    System.out.print("Masukkan nilai C : ");
                    c = input.nextInt();                    
                    s.TriplePythagoras(a,b,c);
                    break;
                case 2:
                    System.out.print("Masukkan sisi a : ");
                    a = input.nextInt();
                    System.out.print("Masukkan sisi b : ");
                    b = input.nextInt();
                    double sisiC = s.SisiMiring(a, b);
                    System.out.println("Sisi miring c adalah " + sisiC);
                    break;
                case 3:
                    System.out.print("Masukkan sisi a : ");
                    a = input.nextInt();
                    System.out.print("Masukkan sisi miring c : ");
                    c = input.nextInt();
                    double sikuB = s.SikuSiku(a, c);
                    System.out.println("Sisi siku-siku B adalah " + sikuB);
                    break;
                case 4:
                    System.out.println("Anda sudah keluar dari program, terima kasih.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak tersedia, silakan pilih ulang!");
                    System.out.println("");
            }
        }
    }
    
}
