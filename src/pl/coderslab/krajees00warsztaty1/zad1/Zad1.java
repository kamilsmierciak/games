package pl.coderslab.krajees00warsztaty1.zad1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        int number = 0;
        int tryScore = 0;
        Random r = new Random();
        tryScore = r.nextInt(100) + 1;

        for(;;){
        for (; ; ) {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Zgadnij liczbe:");
                number = s.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("to nie jest liczba");
            }
        }
            if (number > tryScore) {
                System.out.println("Za dużo");
            } else if (number == tryScore) {
                System.out.println("Trafiłeś");
                break;
            } else {
                System.out.println("Za mało");
            }
        }
    }
}

