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
public abstract class Menu extends Variabel {
    abstract void tambahData(Karyawan n);
    abstract void hapusData(String n);
    abstract void cariData(String n);
    abstract void lihatData();
}
