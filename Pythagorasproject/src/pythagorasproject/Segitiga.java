/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author Lenovo
 */
public class Segitiga {
    void TriplePythagoras(int a, int b, int c) {
        double triple = Math.pow(a, 2) + Math.pow(b, 2);
        if(triple == Math.pow(c, 2)) {
            System.out.println("Nilai " + a + ", " + b + ", " + c + " merupakan Triple Pythagoras");
        } else {
            System.out.println("Nilai " + a + ", " + b + ", " + c + " bukan Triple Pythagoras");
        }
    }
    
    void TriplePythagoras(double a, double b, double c) {
        double triple = Math.pow(a, 2) + Math.pow(b, 2);
        if(triple == Math.pow(c, 2)) {
            System.out.println("Nilai " + a + ", " + b + ", " + c + " merupakan Triple Pythagoras");
        } else {
            System.out.println("Nilai " + a + ", " + b + ", " + c + " bukan Triple Pythagoras");
        }
    }
    
    double SisiMiring(int a, int b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
    double SisiMiring(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
    double SikuSiku(int a, int c){
        return Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
    }
    
    double SikuSiku(double a, double c){
        return Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
    }
}
