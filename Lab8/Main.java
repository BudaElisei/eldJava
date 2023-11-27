package Lab8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //problema1();
       // probema2();
        problema3();
    }
    public static void problema1(){
        List<Integer> nr = Arrays.asList(32, 5, 2353, 346, 43, 7, 7, 7);
        List<Integer> duplicate = nr.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Lista introdusa fara duplicari: " + duplicate);
    }
    public static void probema2(){
        List<String> siruri =Arrays.asList("Iepure", "Caine", "Caprioara", "Urs");
        Scanner scanner = new Scanner(System.in);
        System.out.println("In program exista " + siruri.size() + "soiruri.\nIntroduceti o litera si programul va numara cate siruri incep cu litera introdusa.");
        String caracterus = scanner.nextLine();
        int counter = (int) siruri.stream().filter(s -> s.startsWith(String.valueOf(caracterus))).count();
        System.out.println(counter + " incep cu litera " + caracterus);
    }
    public static void problema3(){
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente: ");
        int size = scanner.nextInt();
        for(int i = 0; i < size; i++){
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers);
        System.out.println("Ordonat asc: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Lista ordonata descrescator: " + numbers);

    }
}
