public class Aufgabe4_1810653130 {
    public static void main(String[] args){

        System.out.printf("for-Schleife: ");
        for (int i=1; i <= 10; i++){
            System.out.println("Der Schleifenzähler ist: " + i);
        }
        System.out.println("\n\nWhile-Schleife: ");
        int i = 1;

        while(i <= 10){
            System.out.println("Der Schleifenzähler ist: " + i++);
        }
        System.out.println("\n\nDo-While-Schleife: ");
        int i2 = 1;
        do {
            System.out.println("Der Schleifenzähler ist: " + i2++);
        }
        while(i2 <= 10);
    }
}
