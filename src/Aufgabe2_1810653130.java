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
            System.out.println(" Aktueller Wert Zahl 1 = " + zahl1);
            System.out.println(" Aktueller Wert Zahl 2 = " + zahl2);

            for(int i = 1; ;i++){                                               // for Schleife verwenden wir, wenn die Anzahl der Durchläufe bekannt ist
                if(zahl1 < zahl2){                                              // =>Zählergesteuerte Schleife - Schleife mit dem Schlüsselwort for einleiten
                    zahl1++;                                                    // in den Klammern gibt es drei Bereiche: 1.Startwert der Zählvariablen setzen
                    System.out.println("Zahl 1 wurde um 1 erhöht: " + zahl1);   // 2.Durchlauf-Bedingung , 3.Operation auf Zählvariable ausführen
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