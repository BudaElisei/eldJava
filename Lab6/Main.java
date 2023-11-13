package Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Triangle triangle = new Triangle(5);
        Square square = new Square(6);

        triangle.desen();
        square.desen();
        Shape.afiseazaCeva();*/

        List<Book> listeCarti = new ArrayList<>();
        List<String> listaDeString = new ArrayList<>();

        listeCarti.add(new Book("Fimaibun","Nubom" ,"940323" ));
        listeCarti.add(new Book("Domino"  ,"Mancicu" ,"449084"));

        Book book1 = listeCarti.get(1);
        listeCarti.contains(book1);

        listeCarti.forEach(element ->{
            System.out.println(element.getName());
            System.out.println(listeCarti.indexOf(element));
        });

        List<String> list = listeCarti.stream()
                .filter(e -> e.getISBM().length() > 10)
                .map(e -> e.getAuthor())
                .collect(Collectors.toList());

    }

}
