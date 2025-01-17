package rs.srb.cetri;

import java.util.Scanner;

public class Petlja {
    public static void main(String[] args) {
        System.out.println("unesi broj");
        int number = new Scanner(System.in).nextInt();

//        while (number<11){
//            System.out.println("You entered =  "+ number);
//            number++;
//        }
//        do {
////            System.out.println("Number = "+number);
////            number++;
////        }while (number<12);

        for (int i=0; i < number; i++){
            System.out.println("Korak petlje "+i );

        }
    }
}
