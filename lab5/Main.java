package lab5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Employee employee1 = new Employee("Iont", "ionut25@gmail.com",18, 12, 2);
        employee1.calculateMonthlyIncome();

        System.out.println("Introduceti numele angajatului: ");
        String nume = scanner.nextLine();
        System.out.println("Introduceti adresa de email: ");
        String email = scanner.nextLine();
        System.out.println("Introduceti cati $ castiga pe ora: ");
        Integer hourRate = scanner.nextInt();
        System.out.println("Introduceti cate ore lucreaza pe zi: ");
        Integer capacitate = scanner.nextInt();
        System.out.println("introduceti cate zile libere va avea: ");
        Integer freeDays = scanner.nextInt();

        Employee employee2 = new Employee( nume, email, hourRate,capacitate, freeDays );
        employee2.calculateMonthlyIncome();


        System.out.println("Introduceti detaliile vehiculului:");
        System.out.println("Marca: ");
        String brand = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Anul fabricatiei: ");
        int year = scanner.nextInt();

        Vehicle vehicle = new Vehicle(brand, model, year);
        System.out.println("Detalii despre vehicul:\n" +
                "Marca: " + vehicle.getBrand() + "\n" +
                "Model: " + vehicle.getModel() + "\n" +
                "Anul fabricatiei: " + vehicle.getYear());

        System.out.println("\nIntroduceti detaliile masinii:");
        System.out.println("Numarul de usi: ");
        int numberOfDoors = scanner.nextInt();

        Car car = new Car(brand, model, year, numberOfDoors);
        System.out.println("Detalii despre masina:\n" +
                "Marca: " + car.getBrand() + "\n" +
                "Model: " + car.getModel() + "\n" +
                "Anul fabricatiei: " + car.getYear() + "\n" +
                "Numarul de usi: " + car.getNumberOfDoors());

        System.out.println("\nIntroduceti detaliile motocicletei:");
        System.out.println("Are carenaj? (true/false): ");
        boolean hasFairing = scanner.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(brand, model, year, hasFairing);
        System.out.println("Detalii despre motocicleta:\n" +
                "Marca: " + motorcycle.getBrand() + "\n" +
                "Model: " + motorcycle.getModel() + "\n" +
                "Anul fabricatiei: " + motorcycle.getYear() + "\n" +
                "Are carenaj? " + motorcycle.isHasFairing());
    }

}
