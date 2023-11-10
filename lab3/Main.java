package lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        elementeComune();
        numarPrim();

    }

    public static void elementeComune(){
        Scanner scanner = new Scanner(System.in);
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

}
