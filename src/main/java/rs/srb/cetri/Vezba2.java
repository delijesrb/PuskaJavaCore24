package rs.srb.cetri;

import javax.swing.*;
import java.util.Random;

//
public class Vezba2 {
    public static void main(String[] args) {
        Random random = new Random();
        int []brojevi = new int[10];
        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] = random.nextInt(0,100);


        }
        boolean provera = false;
       while (provera==false){
        int unos = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));


        for (int i = 0; i < brojevi.length; i++) {

            if (unos == brojevi[i]){
                System.out.println("Uspesno ste ubacili broj");
                System.out.println(brojevi[i]);

                provera = true;
                break;
            } else if (i == brojevi.length-1) {
                System.out.println("nemate srece");
                continue;
            }

        }}
    }
}
