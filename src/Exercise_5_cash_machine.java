import java.util.Scanner;

public class Exercise_5_cash_machine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 22660.89;

        // LOGOWANIE PIN
        while (true) {

            System.out.println("Podaj PIN:");
            int enteredPin = scanner.nextInt();

            if (enteredPin != correctPin) {
                System.out.println("Niepoprawny PIN! Spróbuj ponownie.");
                continue;
            }

            System.out.println("PIN poprawny!");

            // MENU BANKOMATU
            while (true) {

                System.out.println();
                System.out.println("=== BANKOMAT ===");
                System.out.println("1. Sprawdź saldo");
                System.out.println("2. Wpłać pieniądze");
                System.out.println("3. Wypłać pieniądze");
                System.out.println("4. Wyjście");
                System.out.println("================");
                System.out.println("Wybierz opcję:");

                int option = scanner.nextInt();

                switch (option) {

                    // SPRAWDZENIE SALDA
                    case 1:
                        System.out.println("Twoje saldo wynosi: " + balance + " zł");
                        break;


                    // WPŁATA PIENIĘDZY
                    case 2:
                        System.out.println("Ile chcesz wpłacić?");

                        double deposit = scanner.nextDouble();

                        if (deposit <= 0) {
                            System.out.println("Kwota musi być większa od 0!");
                        } else {
                            balance = balance + deposit;

                            System.out.println("Wpłaciłeś: " + deposit + " zł");
                            System.out.println("Nowe saldo: " + balance + " zł");
                        }

                        break;


                    // WYPŁATA PIENIĘDZY
                    case 3:
                        System.out.println("Ile chcesz wypłacić?");

                        double withdraw = scanner.nextDouble();

                        if (withdraw <= 0) {
                            System.out.println("Kwota musi być większa od 0!");
                        } else if (withdraw > balance) {
                            System.out.println("Nie masz wystarczających środków!");
                            System.out.println("Twoje saldo: " + balance + " zł");
                        } else {
                            balance = balance - withdraw;

                            System.out.println("Wypłaciłeś: " + withdraw + " zł");
                            System.out.println("Pozostało na koncie: " + balance + " zł");
                        }

                        break;


                    // WYJŚCIE
                    case 4:
                        System.out.println("Wyjmij kartę.");
                        System.out.println("Do widzenia!");

                        scanner.close();
                        return;


                    // ZŁA OPCJA
                    default:
                        System.out.println("Nieprawidłowa opcja!");
                        System.out.println("Wybierz 1, 2, 3 lub 4.");
                        break;
                }
            }
        }
    }
}