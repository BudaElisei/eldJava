package Lab7;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        problema1_var1();
        problema1_var2();
        problema2_var1();
        problema2_var2();



    }
    //Ex1 Calcul suma arimetica a numerelor intregi dint-o lista
    public static void problema1_var1(){
        List<Integer> numereIntregi = Arrays.asList(3, 6, 8, 43, 65, 22, 76);

        AtomicReference<Integer> sum = new AtomicReference<>(0);
        numereIntregi.forEach(n -> {
                    //sum = sum +n
                    sum.set(sum.get() + n);
        });
        System.out.println(sum.get() / numereIntregi.size());

    }
    //EX2  Convertiti o lista de string in UPPERCASE
     public static void problema1_var2() {
        List<Integer> numereIntregi = Arrays.asList(3, 6, 8, 43, 65, 22, 76);

        Double rez = numereIntregi.stream().mapToDouble(i -> i.doubleValue())
                .average()
                .orElse(0.0);
        System.out.println(rez);
    }

    public static void problema2_var1(){
        List<String> nume = Arrays.asList("munte", "brazi", "zapada");
        nume.forEach(s ->
        {
            nume.set(nume.indexOf(s), s.toUpperCase());
            //Alternativa lui a[i] = a[i].toUpperCase();
        });
        System.out.println("Lista" + nume);
    }

    public static void problema2_var2(){
        List<String> nume = Arrays.asList("munte", "brazi", "zapada");

        List<String> list = nume.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Lista" + list);

    }
}
