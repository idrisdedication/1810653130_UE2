import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Aufgabe3_1810653130 {
    public static void main(String[] args){

        double alter;                                                               // Primitive Datentypen: verschiedene Wertebereiche
        String eingabe = JOptionPane.showInputDialog("Geben Sie bitte etwas ein!"); // Input Dialog: ein Dialog, der vom Nutzer eine Eingabe anfordert
                                                                                    // und diese an die Anwendung zurückgeben kann

        alter = Double.parseDouble(eingabe);
        JOptionPane.showMessageDialog(null, alter);                 // Message Dialog: ein Dialog, der dem Nutzer eine Information ausgibt
                                                                                    // In der Regel Fehler- bzw. Ausnahmemeldungen

        int ganzzahl = Integer.parseInt(eingabe);
        JOptionPane.showMessageDialog(null, ganzzahl);

        boolean bool = Boolean.parseBoolean(eingabe);                               // Boolean kann zwei Werte annehmen: true und false
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