package rs.srb.five;

public class ContinueDemo {
    public static void main(String[] args) {
        String recenica = "Petar Pan je pojeo popriku. Pohvalio se kako moze paprika puno pojesti";
        char [] slovaRecnice = recenica.toCharArray();
        char slovo = 'p';
        char [] n = {'p','o'};
        int counter = 0;
       Vanjska: for (int i = 0; i<slovaRecnice.length; i++){
            for (int j = 0; j<n.length;j++){
            if (n[j] != slovaRecnice[i]) {

                continue Vanjska;
            }i++;
            }
            counter++;
        }
        System.out.println(counter);
    }

}
