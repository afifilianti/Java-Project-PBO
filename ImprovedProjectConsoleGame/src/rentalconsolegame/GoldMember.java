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
public class GoldMember extends SilverMember {
    void inputGold(DataMember x){
        this.Gold(x);
    }
    
    private void Gold(DataMember x) {
        super.member = x;
        this.sewa = 30000;
        this.diskon = 2;
        this.poin = 5;
        this.cashback = 5000;
        super.input();
        this.hitungTotal();
        this.output();
        this.output2();
    }
    
    public void output2(){
        System.out.println("Jumlah Cashback                   : Rp "+this.cashback);
    }
}
