import java.util.Scanner;

public class Exercise_5_cash_machine {

    public static void main(String[] args) {
        while (true) {
            int correctPin = 1234;
            System.out.println("Podaj PIN: ");
            Scanner PIN_Number = new Scanner(System.in);
            int enteredPin = PIN_Number.nextInt();
            System.out.println("=== BANKOMAT ===");

            if (enteredPin == correctPin) {
                System.out.println("=== BANKOMAT ===");
                System.out.println("1. Sprawdź saldo");
                System.out.println("2. Wpłać pieniądze");
                System.out.println("3. Wypłać pieniądze");
                System.out.println("4. Wyjście");
                System.out.println(" Wybierz opcję:");
            }
                else {

                    System.out.println("Nie poprawny PIN, popraw prosze ");
                    System.out.println("Podaj PIN: ");
                    Scanner PIN_Number_another = new Scanner(System.in);
                    int another_PIN_Numer = PIN_Number_another.nextInt();
                    if (another_PIN_Numer == correctPin) {
                    //    System.out.println("=== BANKOMAT ===");
                    }
                    else {
                    while (another_PIN_Numer == correctPin) {}
                    }
            }

                switch (enteredPin){
                    case 1:
                        System.out.println("Masz na koncie 22 660,89zł");
                        break;

                        case 2:
                            System.out.println("Ile chcesz wypłącić?");
                            Scanner money_deploy_number = new Scanner(System.in);
                            System.out.println("Chcesz wypłącić " + money_deploy_number + " ? ");
                            System.out.println("1. tak");
                            System.out.println("2. Nie");
                            switch (money_deploy_number.nextInt()) {
                                case 1:
                                    System.out.println("Prosze oto twoja kwota " + money_deploy_number + "do zobaczania " );

                                case 2:
                                    System.out.println("Czy chcesz wykonać inną operację?");
                                    System.out.println("1. Tak");
                                    System.out.println("2. Nie");

                                    Scanner scanner = new Scanner(System.in);
                                    int decision = scanner.nextInt();

                                    switch (decision) {
                                        case 1:
                                            System.out.println("Tak");
                                            break;

                                        case 2:
                                            System.out.println("Nie");
                                            break;

                                        default:
                                            System.out.println("Nieprawidłowy wybór!");
                                            break;
                                    }

                            }
                }

            } else {
                System.out.println("Nieprawidłowy PIN!");
                System.out.println("Chcesz zmienić PIN?");
                System.out.println("Tak ?");
                System.out.println("=============");
                System.out.println("Nie i anuluj operacje, wyjmij karte z bankomatu");
                Scanner new_PIN_number = new Scanner(System.in);
                String answer = PIN_Number.next();
                if (answer.equals("Tak")) {
                    System.out.println("Podaj nowy PIN: ");
                    Scanner PIN_Number2 = new Scanner(System.in);
                    int enteredPin2 = PIN_Number2.nextInt();
                    System.out.println("=== BANKOMAT ===");
                    if (enteredPin2 == correctPin) {
                        System.out.println("=== BANKOMAT ===");

                    }
                }


            }

        }
    }
}
