package rs.srb.cetri;

public class MultiDimArrAyDemo {
    public static void main(String[] args) {


    String [][] namesArrays = {{"Mr","Ms"},{"Smith","Jones"}};

    String fullName = namesArrays[0][0]+" "+namesArrays[1][0];
        System.out.println(fullName);
        for (int i = 0; i < namesArrays.length; i++) {
            for (int j = 0; j < namesArrays.length; j++) {
                System.out.println(namesArrays[i][j]);
            }

        }
}
}
