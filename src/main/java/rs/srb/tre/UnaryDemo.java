package rs.srb.tre;

import javax.swing.*;

public class UnaryDemo {
    public static void main(String[] args) {
int prviBroj  = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Ubaci drugi broj"));
if (prviBroj==drugiBroj){
    JOptionPane.showMessageDialog(null,"Brojevi su isti");
}
if (prviBroj<=drugiBroj){
    JOptionPane.showMessageDialog(null,"Prvi manji od drugog");
        }
if (prviBroj>drugiBroj){
    JOptionPane.showMessageDialog(null,"Prvi veci od drugog" );
}
String  name = prviBroj==drugiBroj? "isti su": "razliciti su";




    }
}
