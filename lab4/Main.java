package lab4;

import java.util.Scanner;


public class Main {
    public static void sumaCifre(Integer numar){
        Integer suma = 0;
        while (numar > 0) {
            suma = suma + numar % 10;
            numar = numar / 10;
        }
        System.out.println(suma);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrieti un cuvant:");
        System.out.println(cuvantParImpar(sc.nextLine()));
        sumaCifre(sc.nextInt());
    }


    public static String cuvantParImpar(String cuvant){

        if(cuvant.length() % 2 == 0){
            return String.valueOf(cuvant.charAt(cuvant.length() / 2 - 1) + String.valueOf(cuvant.charAt(cuvant.length() / 2) ));
        }
            else return String.valueOf(cuvant.charAt(cuvant.length() / 2));


    }



}