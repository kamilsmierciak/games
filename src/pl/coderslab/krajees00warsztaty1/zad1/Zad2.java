package pl.coderslab.krajees00warsztaty1.zad1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] typpedArr = new int[6];

        int arrArg = 0;
        for (; ; ) {
            if (arrArg >= typpedArr.length) {
                break;
            }
            try {
                System.out.println("wprowadź liczbe " + (arrArg + 1) + " z 6");
                typpedArr[arrArg] = s.nextInt();
                if (sameElement(arrArg, typpedArr) == true) {
                    System.out.println("Ta liczba została już wprowadzona lub nie należy do zakresu");
                } else {
                    arrArg++;
                }
            } catch (InputMismatchException e) {
                System.out.println("to nie jest liczba");
                s.nextLine();
            }
        }
        System.out.println(win(score(ranomTab(),typpedArr)));

    }

    static boolean sameElement(int arrArg, int[] typpedArr) {
        if (arrArg==0){
            if(typpedArr[0]>49 || typpedArr[0]<1){
                return true;
            }else{
                return false;
            }
        }
        for (int i = 0; i < (arrArg); i++) {
            if (typpedArr[i] == typpedArr[arrArg]) {
               return true;
            }else  if (typpedArr[i]>49 || typpedArr[i]<1){
                return true;
            }
        }
        return false;
    }
    static int[] ranomTab (){
        Random r = new Random();
        int[] tab = new int[6];
        for(int i=0; i<6; i++){
            tab[i] = r.nextInt(49)+1;
        }
        return  tab;
    }
    static int score (int[] random, int[] input){
        int repeted= 0;
        for(int i = 0; i<random.length; i++){
            for(int j = 0; j<input.length; j++){
                if (random[i]==input[j]){
                    repeted++;
                    break;
                }
            }
        }
        return repeted;
    }
    static String win(int score){
        if(score>2){
            return "Trafiłeś " + score;
        }
        else{
            return "Przegrałeś";
        }
    }
}
