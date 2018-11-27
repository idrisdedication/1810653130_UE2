public class Aufgabe4_1810653130 {
    public static void main(String[] args){

        System.out.println("for-Schleife: ");
        for (int i=1; i <= 10; i++){                                //for Schleife (kopfgesteuert) verwenden wir, wenn die Anzahl der Durchläufe bekannt ist
            System.out.println("Der Schleifenzähler ist: " + i);    // =>Zählergesteuerte Schleife - Schleife mit dem Schlüsselwort for einleiten
        }                                                           // in den Klammern gibt es drei Bereiche: 1.Startwert der Zählvariablen setzen
        System.out.println("While-Schleife: ");                     // 2.Durchlauf-Bedingung; 3.Operation auf Zählvariable ausführen

        int i = 1;                                                  // Variable i  =>Zählvariable
                                                                    // Zählvariable: hiermit zählen wir die Schleifendurchgänge
        while(i <= 10){                                             // danach beginnt eine while-Schleife; Durchlauf-Bedingung ist in den Klammern gesetzt
            System.out.println("Der Schleifenzähler ist: " + i++);  // =>"solange i kleiner gleich 10"; Schleifen-Block wird solange wiederholt ausgeführt
          // im Schleifen-Körper: Zählvariable mit i++                 wie der Wert der Variablen i kleiner oder oder gleich 10 ist
            // jeden Durchlauf um eins erhöhen          <=>!    andernfalls Endlos-Schleife; Programm reagiert nicht mehr, weil es sich im Kreise dreht
        }
        System.out.println("Do-While-Schleife: ");                  // kopfgesteuerte Schleife ("while ...")
        int i2 = 1;                                                        // Bedingung wird im SchleifenKOPF geprüft

        do {                                                        // fußgesteuerte Schleife ("do .... while")
            System.out.println("Der Schleifenzähler ist: " + i2++);        // Bedingung wird im SchleifenFUSS geprüft
        }
        while(i2 <= 10);    // Durchlauf-Bedingung ist in den Klammern gesetzt;
                            // do … while wiederholt Anweisungen, bis eine Bedingung nicht mehr zutrifft
                            // –> false wird – auf jeden Fall aber einmal.
    }
}

//  do...while: Anweisungen werden einmal durchgeführt, bevor die Bedingung geprüft wird
//  Wenn die Bedingung true liefert => werden die Anweisungen erneut ausgeführt
//  Am Ende jedes Laufs durch die Schleife wird die Bedingung abgefragt => Wenn die Bedingung false liefert, endet die Ausführung
//  und die Kontrolle wird an die Anweisungen hinter der do ... while-Anweisungen übergeben
