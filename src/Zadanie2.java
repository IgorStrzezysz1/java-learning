import java.util.Scanner;
public class Zadanie2 {
    public static void main(String[] args) {
        String name;
        int score;
        System.out.println("Napisz swoje imie ?");
        Scanner inputDateName = new Scanner(System.in);
        name = inputDateName.nextLine();
        if (name.isEmpty()) {
            System.out.println("Nie podałeś imienia!");
        } else {
            System.out.println("Twoje imie to: " + name);
            System.out.println("Podaj liczbę punktów ? ");
            Scanner inputDateScore = new Scanner(System.in);
            score = Integer.parseInt(inputDateScore.nextLine());

            if (score > 100 || score < 0) {
                System.out.println("Wynik oceny nie może byc wiekszy od 100 i mniejszy niż 0");
            }
            if (score > 100 || score < 0) {
                System.out.println("Nieprawidłowy wynik");
            } else if (score <= 49) {
                System.out.println("Nie zdałeś");
            } else if (score >= 50 && score <= 69) {
                System.out.println("Ocena: 3");
            } else if (score >= 70 && score <= 84) {
                System.out.println("Ocena: 4");
            } else if (score >= 85 && score <= 100) {
                System.out.println("Ocena: 5");
            }
        }
    }

}

