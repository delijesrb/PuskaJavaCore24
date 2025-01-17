package rs.srb;

import java.util.Arrays;

public class Duplikati {
    public static void main(String[] args) {
        int [][] duplikati = {{12, 15,18,23}
                ,{17,15,16,23}

        };
        for (int i = 0; i < duplikati.length; i++) {
            for (int j = 0; j < duplikati[i].length; j++) {
                int broj = duplikati[i][j];

                if (broj == duplikati[i][j]){
                    System.out.println("duplikat");
                    j++;
                }

                    }
                }

            }

}
