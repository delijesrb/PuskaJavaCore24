package rs.srb.cetri;

import javax.swing.*;

public class Vezba {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
        int rest = x%y;
        if (rest  == 0) {
            JOptionPane.showMessageDialog(null, "Its no rest ");
        } else if (rest > 1000
        ) {
            JOptionPane.showMessageDialog(null, "Rest its greater then 1000 ");
        } else {
            JOptionPane.showMessageDialog(null, "Rest its lower then 1000");
        }
    }
}
