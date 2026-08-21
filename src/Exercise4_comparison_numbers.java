import java.util.Scanner;

public class Exercise4_comparison_numbers {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Podaj swoje imie: ");
            Scanner sc = new Scanner(System.in);
            String imie = sc.nextLine();
            System.out.println("Podaj cyfre od 0 do 100: ");
            int cyfre = sc.nextInt();
                if (cyfre <= 49) {
                    System.out.println("Ocena niedostateczna");
                } else if (cyfre >= 50 && cyfre <= 59) {
                    System.out.println("Ocena dostateczna");
                } else if (cyfre >= 60 && cyfre <= 74) {
                    System.out.println("Ocena dobra");
                } else if (cyfre >= 75 && cyfre <= 89) {
                    System.out.println("Ocena bardzo dobra");
                } else if (cyfre >= 90 && cyfre <= 100) {
                    System.out.println("Ocena celująca");

                } else if (cyfre >= 101) {
                    System.out.println("przekroczyłeś numeracje ocen ");
                }
            }
        }
    }

