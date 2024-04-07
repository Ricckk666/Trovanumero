import java.util.Scanner;

public class TrovaNumPrimo {
        /*Scrivi un programma Java che chiede all'utente di inserire un numero
        intero e verifica se è un numero primo. Un numero primo è un numero maggiore
        di 1 che non ha divisori oltre 1 e se stesso.
         */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int num  = tastiera.nextInt();
        boolean verofalso = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.println("è divisibile oltre due numeri ");
                break;
            }else{
                System.out.println("Non è divisibile oltre due numeri ");
                break;
            }
        }

    }
}