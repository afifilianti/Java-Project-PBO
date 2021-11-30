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
public class RentalConsoleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Membership m = new Membership();
        m.addMember(new DataMember("M001", "Mr. X", "Silver"));
        m.addMember(new DataMember("M002", "Mr. Y", "Gold"));
        m.addMember(new DataMember("M003", "Mr. Z", "Platinum"));
        
        DataMember member = m.inputMember();
        switch(member.jenisMember()) {
            case "Silver":
                SilverMember sm = new SilverMember();
                sm.inputSilver(member);
                break;
            case "Gold":
                GoldMember gm = new GoldMember();
                gm.inputGold(member);
                break;
            case "Platinum":
                PlatinumMember pm = new PlatinumMember();
                pm.inputPlatinum(member);
                break;
        }
    }
    
}
