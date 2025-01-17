package rs.srb.cetri;

import javax.swing.*;
import java.util.jar.JarEntry;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 13;
        numbers[1] = 17;
        numbers[2] = 23;
        int[] numbers1 = new int[3];

//
//        for (int i=0 ; i < numbers1.length; i++){
//            int broj = Integer.parseInt(JOptionPane.showInputDialog("ubaci broj"));
//            numbers1[i]=broj;
//        }
//        for (int b: numbers1
//             ) {
//            System.out.println(b);
//
//        }
        double[] d = {23.2, 25.6, 28.7, 32.5};
        for (int i = 0; i < d.length; i++) {
            System.out.println("Index na  " + i + " je " + d[i]);
        }
        String[] names = {"Srecko", "Dafina", "Teodora", "Una"};
        for (String s : names) {
            System.out.println(s);
        }
    }
}
