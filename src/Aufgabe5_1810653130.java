import javax.swing.*;

public class Aufgabe5_1810653130 {
public static void man(String[] args){

    forSchleife(10);
    forSchleife(25);
    whileSchleife(30);
    whileSchleife(77);
    nutzerSchleife();
}
static void  forSchleife(int a){
    for (int i =0; i <= a; i++){

        System.out.println("Ausgabe = " + i);
    }
}
static void whileSchleife(int a){
    int i = 0;

    while(i <= a){
        System.out.println(i);
        i += 2;
    }
}
static void nutzerSchleife(){
    int a = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte eine Zahl ein!"));

            int b= Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte eine Zahl ein!"));

            int k= 0;

            for (int i = 0; i < a; i++){
                for (int j = 0; j < b; j++){
                    k++;
                    System.out.println("Das ist der" + k + "Durchlauf der inneren Schleife.");
                }
            }
    }
}
