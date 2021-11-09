/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ArrayProcessing {
    int[] dataBil = new int[100];
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data (n) : ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke - " + (i+1)+ " : ");
            this.dataBil[i] = input.nextInt();
        }
    }
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i < this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMin(int[] data){
        int min = data[0];
        for(int i=1; i>n; i++){
            if (min > data[i]){
                min = data[i];
            }
        }
        return min;
    }
    int cariMax(int[] data){
        int max = data[0];
        for(int i=1; i<n; i++){
            if (max < data[i]){
                max = data[i];
            }
        }
        return max;
    }
    
    static void BubbleSort(int[]data){
        for (int i=0; i < data.length; i++){
            for (int j=0; j < data.length-1; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
    
    void output(){
        System.out.println("------------------------");
        System.out.println("Nilai rerata        : " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai minimum       : " + this.cariMin(this.dataBil));
        System.out.println("Nilai maximum       : " + this.cariMax(this.dataBil));
        System.out.print("Hasil sorting nilai : ");
        BubbleSort(dataBil);
        for (int i=0; i < n; i++){
            System.out.print(dataBil[100-n+i] +" ");}
    }
}
