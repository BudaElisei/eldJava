package lab3;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        elementeComune();
        numarPrim();
        fibonnaci();
        cuvPalindrom();

    }

    public static void elementeComune(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exercitul 1:");
        int d=0;
        String[] a = new String[3];
        for (int i = 0 ; i < a.length; i++){
            System.out.println("Introduceti elementul "+(i+1)+" al primului sir: ");
            a[i] = scanner.nextLine();
        }

        String[] b = new String[3];
        for (int i = 0 ; i < b.length; i++){
            System.out.println("Introduceti elementul "+(i+1)+" al celui de al doilea sir: ");
            b[i] = scanner.nextLine();
        }

        for(int i = 0 ; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i].equals(b[j])){
                    System.out.println(a[i]+" este elementul comun al sirurilor!");
                }
                else
                    d++;


            }
        }
        if(d == (a.length * b.length)){
            System.out.println("Nu s-a gasit nici-un element comun!");
        }
    }

    public static void numarPrim(){
        Scanner aurica = new Scanner(System.in);
        System.out.println("Exercitul 2:");
        int cop;

         int[] arr = new int[10];

         for(int i = 0; i < arr.length; i++){
             System.out.println("Introduceti numarul " +(i+1)+":");
             arr[i] = aurica.nextInt();
         }

         for(int i = 0; i < arr.length; i++){
             cop = 0;
             for(int j = 2; j <= arr[i] / 2; j++ ){
                 if(arr[i]  % j == 0){
                     cop = 1;
                 }
             }
             if( cop == 0 ){
                 System.out.println("Numarul "+arr[i]+" este prim!");
             }

         }

    }
    public static void fibonnaci(){

        int suma;
        int var1 = 0;
        int var2 = 1;
        Scanner citeste = new Scanner(System.in);
        System.out.println("Exercitul 3:");
        System.out.println("Introduceti un numar :");
        Integer n = citeste.nextInt();
        System.out.print(var1+" "+var2+" ");
        do{
            suma = var1 + var2;
            var1 = var2;
            var2 = suma;
            System.out.print(suma+" ");


        }while (suma < n);



    }

    public static void cuvPalindrom(){
        Scanner input = new Scanner(System.in);
        String cuv1 = "";
        String cuv2 = "";
        System.out.println("Exercitiul 4:");
        System.out.println("Introduceti cuvantul:");
        cuv1 =input.nextLine();

        for(int i = cuv1.length() -1; i >= 0; i--){
            cuv2 = cuv2 + cuv1.charAt(i);
        }
        if(cuv1.equals(cuv2)) {
            System.out.println("Cuvantul " + (cuv1) + " este palindrom!");
        }else{
            System.out.println("Cuvantul "+(cuv1)+" nu este palindrom!");

        }
    }
}
