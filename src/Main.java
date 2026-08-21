import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String name;
    String surname;
    int age;
        System.out.println("Napisz swoje imie ?");
        Scanner inputDate = new Scanner(System.in);
        name = inputDate.nextLine();
        System.out.println("Napisz swoje nazwisko ?");
        surname = inputDate.nextLine();
        System.out.println("Napisz swój wiek ?");
        age = Integer.parseInt(inputDate.nextLine());
        if (name.isBlank() || surname.isBlank() || age <= 0) {
            System.out.println("Nie znalezione jakie masz imie! i nie wiedomo ile masz lat, nie możesz wpisac mniejsze niż zero?");
        }
        else  {
            System.out.println("Twoje imie to " + name +" twoje nazwisko to  "+surname +" i masz "+ age + " lat");
        }
    }
}