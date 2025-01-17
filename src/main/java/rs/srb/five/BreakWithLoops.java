package rs.srb.five;

import java.util.Scanner;

public class BreakWithLoops {
    public static void main(String[] args) {

        int[][] numbers = {{23, 12, 34, 99},
                {12, 1076, 578, 8}, {
                65, 45, 6, 8
        }};
        System.out.println("unesi broj");
        int unos = new Scanner(System.in).nextInt();

      LUTRIJA:  for (int i = 0; i < numbers.length; i++) {
            int [] niz = numbers[i];

            for (int j = 0; j < niz.length; j++) {
                int broj = niz[j];
                System.out.println(broj);


            }

        }

    }
}
