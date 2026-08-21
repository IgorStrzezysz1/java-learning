import java.util.Scanner;

public class Exercise3_age_even {

    public static void main(String[] args) {

        System.out.println("Jak masz na imię?");

        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();

        System.out.println("Podaj liczbę:");

        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();


        if (number % 2 == 0){
            System.out.println(name + " twoja liczba jest parzysta " + number);

        }
        else {
            System.out.println(name + " twoja liczba jest nie parzysta " + number);
        }
    }
}