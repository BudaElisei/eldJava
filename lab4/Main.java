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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrieti un cuvant:");
        String cuvant = scanner.nextLine();
        System.out.println(cuvantParImpar(cuvant));

        System.out.println("Scrieti un numar:");
        sumaCifre(scanner.nextInt());
        dog(scanner);
        rectangle(scanner);
        person(scanner);

    }

    public static String cuvantParImpar(String cuvant){
        if(cuvant.length() % 2 == 0){
            return String.valueOf(cuvant.charAt(cuvant.length() / 2 - 1) + String.valueOf(cuvant.charAt(cuvant.length() / 2) ));
        } else {
            return String.valueOf(cuvant.charAt(cuvant.length() / 2));
        }
    }
    public static void dog(Scanner scanner){
        Dog catel1 = new Dog("Sony", "Amstaf");
        Dog catel2 = new Dog("Pufulete", "Techel");
        System.out.println("nume initial catel1: "+catel1.getName());
        System.out.println("Rasa initiala catel1: "+catel1.getBreed());
        System.out.println("Schimbati nume catel1: ");
        String a = scanner.nextLine();
        catel1.setName(a);
        System.out.println("Schimbati rasa catel1: ");
        String b = scanner.nextLine();
        catel1.setBreed(b);
        System.out.println("nume initial catel2: "+catel2.getName());
        System.out.println("Rasa initiala catel2: "+catel2.getBreed());
        System.out.println("Schimbati nume catel2: ");
        String c = scanner.nextLine();
        catel2.setName(c);
        System.out.println("Schimbati rasa catel2: ");
        String d = scanner.nextLine();
        catel2.setBreed(d);
        System.out.println("Numele catel1: "+catel1.getName());
        System.out.println("Rasa catel1: "+catel1.getBreed());
        System.out.println("Numele catel2: "+catel2.getName());
        System.out.println("Rasa catel2: "+catel2.getBreed());

    }

    public static void rectangle(Scanner scanner) {
        Rectangle patrat = new Rectangle();
        System.out.println("Introduceti latimea patratului: ");
        int latimea = scanner.nextInt();
        patrat.setWidth(latimea);

        System.out.println("Introduceti lungimea patratului: ");
        int lungimea = scanner.nextInt();
        patrat.setLength(lungimea);

        System.out.println("Aria patratului este: " + patrat.getArie());
        System.out.println("Perimetrul patratului este: " + patrat.getPerimetru());
    }
    public static void person(Scanner scanner) {

        Person person = new Person();
        System.out.println("Introdu numele persoanei: ");
        person.setName(scanner.nextLine());
        System.out.println("Introdu emailul persoanei: ");
        person.setEmail(scanner.nextLine());


        Student student = new Student();
        System.out.println("Introdu numele studentului: ");
        student.setName(scanner.nextLine());
        System.out.println("Introdu emailul studentului: ");
        student.setEmail(scanner.nextLine());
        System.out.println("Introduceti notele studentului: ");
        student.setGrades();

        Profesor profesor = new Profesor();
        System.out.println("Introduceti numele profesorului: ");
        profesor.setName(scanner.nextLine());
        System.out.println("Introduceti emailul profesorului: ");
        profesor.setEmail(scanner.nextLine());
        System.out.println("Introduceti cursurile profesorului: ");
        profesor.setCourses();


        System.out.println("     Clasa Persoana\n");
        System.out.println("Nume persoana: " + person.getName());
        System.out.println("Email persoana: " + person.getEmail());

        System.out.println("\n\n     Clasa Student\n");
        System.out.println("Nume student: " + student.getName());
        System.out.println("Email student: " + student.getEmail());
        int[] note = student.getGrades();
        System.out.print("Notele studentului: ");
        for (int i = 0; i < note.length; i++) {
            System.out.print(note[i] + " ");
        }


        System.out.println("\n\n     Clasa Profesor\n");
        System.out.println("Nume profesor: " + profesor.getName());
        System.out.println("Email profesor: " + profesor.getEmail());
        String[] cursuri = profesor.getCourses();
        System.out.print("Cursurile profesorului: ");
        for (int i = 0; i < cursuri.length; i++) {
            System.out.print(cursuri[i] + " ");
        }

        System.out.println("\n\nClasele Student si Profesor sunt subclase ale clasei Person." +
                "\nCele doua mostenesc proprietatile clasei Person dar au fiecare cate ceva separat." +
                "\nClasa Student are un camp specific 'grades', iar Clasa Profesor are un camp specific 'courses'." +
                "\nAsadar toate clasele au in comun campurile 'name' si 'email' , iar ca diferente clasele Student si Profesor," +
                "\nau cate un camp specific lor.");
    }
}
