import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Aufgabe2_1810653130 {
    public static void main(String[] args) {

        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Eingabe Zahl 1"));

        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Eingabe Zahl 2"));

        if(zahl1 == zahl2){
            System.out.println("Sind identisch: " + zahl1 + " == " + zahl2);
        }
        else{
            System.out.println("* Aktueller Wert Zahl 1 = " + zahl1);
            System.out.println("* Aktueller Wert Zahl 2 = " + zahl2);

            for(int i = 1; ;i++){
                if(zahl1 < zahl2){
                    zahl1++;
                    System.out.println("Zahl 1 wurde um 1 erhöht: " + zahl1);
                }
                else{
                    zahl2++;
                    System.out.println("Zahl 2 wurde um 1 erhöht: " + zahl2);
                }
                if(zahl1 == zahl2){
                    System.out.println("Die Zahlen sind jetzt identisch! Es wurden: " + i + "Schleifendurchgänge benötigt!");
                    break;
                }
            }
        }
    }
}