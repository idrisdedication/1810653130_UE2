import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Aufgabe3_1810653130 {
    public static void main(String[] args){

        double alter;
        String eingabe = JOptionPane.showInputDialog("Geben Sie bitte etwas ein!");

        alter = Double.parseDouble(eingabe);
        JOptionPane.showMessageDialog(null, alter);

        int ganzzahl = Integer.parseInt(eingabe);
        JOptionPane.showMessageDialog(null, ganzzahl);

        boolean bool = Boolean.parseBoolean(eingabe);
        JOptionPane.showMessageDialog(null, bool);

        long verylong = Long.parseLong(eingabe);
        JOptionPane.showMessageDialog(null, verylong);

        char c = eingabe.charAt(0);
        JOptionPane.showMessageDialog(null, c);

        byte bit = Byte.parseByte(eingabe);
        JOptionPane.showMessageDialog(null, bit);

        short shorty = Short.parseShort(eingabe);
        JOptionPane.showMessageDialog(null, shorty);

        float floaty = Float.parseFloat(eingabe);
        JOptionPane.showMessageDialog(null, floaty);

        String Idris = String.valueOf(alter);
        JOptionPane.showMessageDialog(null,"Wert von neu:" + Idris);
    }
}