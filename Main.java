import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadź pierwszą liczbę: ");
        double pierwszaLiczba = scanner.nextDouble();

        System.out.print("Wprowadź symbol operacji arytmetycznej (+, -, *, /) : ");
        char operacja = scanner.next().charAt(0);

        System.out.print("Wprowadź drugą liczbę: ");
        double drugaLiczba = scanner.nextDouble();

        double wynik = 0;
        boolean operacjaPoprawna = true;

        switch (operacja) {
            case '+':
                wynik = pierwszaLiczba + drugaLiczba;
                break;
            case '-':
                wynik = pierwszaLiczba - drugaLiczba;
                break;
            case '*':
                wynik = pierwszaLiczba * drugaLiczba;
                break;
            case '/':
                if (drugaLiczba != 0) {
                    wynik = pierwszaLiczba / drugaLiczba;
                } else {
                    System.out.println("Dzielenie przez zero nie jest możliwe.");
                    operacjaPoprawna = false;
                }
                break;
            default:
                System.out.println("Niepoprawny symbol operacji.");
                operacjaPoprawna = false;
                break;
        }

        if (operacjaPoprawna) {
            System.out.println("Wynik: " + wynik);
        }




        scanner.close();
    }
}