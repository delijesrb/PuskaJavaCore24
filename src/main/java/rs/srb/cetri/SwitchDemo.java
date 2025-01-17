package rs.srb.cetri;

import javax.swing.*;

public class SwitchDemo {
    public static void main(String[] args) {
        int day = Integer.parseInt(JOptionPane.showInputDialog("Take a number of week day"));

        String days;
        switch (day) {
            case 1:
                days = "Monday";
                break;
            case 2:
                days = "Tuesday";
                break;
            case 3:
                days = "Wednesday";
                break;
            case 4:
                days = "Thursday";
                break;
            case 5:
                days = "Friday";
                break;
            case 6:
                days = "Saturday";
                break;
            case 7:
                days = "Sunday";
                break;
            default:
                days = "you have entered wrong number";
                break;
        }

        JOptionPane.showMessageDialog(null, days);


    }
}
