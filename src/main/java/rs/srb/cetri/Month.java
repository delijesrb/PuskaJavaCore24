package rs.srb.cetri;

import javax.swing.*;

public class Month {
    public static void main(String[] args) {
        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("enter year"));
        int numerOfDays = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numerOfDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numerOfDays = 30;
            case 2:
                if ((year%4 ==0 || year%400==0)&&(year%100!=0) ){
                    numerOfDays = 29;

                }else {
                    numerOfDays = 28;
                }

        }
        JOptionPane.showMessageDialog(null,numerOfDays);
    }
}
