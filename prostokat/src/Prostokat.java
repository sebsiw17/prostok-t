import java.util.Scanner;

public class Prostokat {
    // Pola składowe
    private double dlugosc;
    private double szerokosc;

    // Konstruktor bezparametrowy (wartości domyślne)
    public Prostokat() {
        this.dlugosc = 1.0;
        this.szerokosc = 1.0;
    }

    // Konstruktor z dwoma argumentami
    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    // Metoda obliczająca pole prostokąta
    public double obliczPole() {
        return dlugosc * szerokosc;
    }

    // Metoda obliczająca obwód prostokąta
    public double obliczObwod() {
        return 2 * (dlugosc + szerokosc);
    }

    // Metoda zwiększająca wymiary o podany procent
    public void zwiekszWymiary(double procent) {
        dlugosc += dlugosc * procent / 100;
        szerokosc += szerokosc * procent / 100;
    }

    // Metoda zmniejszająca wymiary o podany procent
    public void zmniejszWymiary(double procent) {
        dlugosc -= dlugosc * procent / 100;
        szerokosc -= szerokosc * procent / 100;
    }

    // Gettery
    public double getDlugosc() {
        return dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    // Settery
    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    // Metoda main do testowania klasy
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tworzenie pierwszego obiektu prostokąta z danymi wprowadzonymi przez użytkownika
        System.out.println("Podaj dane dla pierwszego prostokąta:");
        System.out.print("Podaj długość: ");
        double dlugosc1 = scanner.nextDouble();
        System.out.print("Podaj szerokość: ");
        double szerokosc1 = scanner.nextDouble();
        Prostokat prostokat1 = new Prostokat(dlugosc1, szerokosc1);

        // Wyświetlanie wyników dla pierwszego prostokąta
        System.out.println("\nPierwszy prostokąt:");
        System.out.println("Pole: " + prostokat1.obliczPole());
        System.out.println("Obwód: " + prostokat1.obliczObwod());

        // Tworzenie drugiego obiektu prostokąta z danymi domyślnymi
        Prostokat prostokat2 = new Prostokat();
        System.out.println("\nDrugi prostokąt (domyślne wymiary 1.0 x 1.0):");
        System.out.println("Pole: " + prostokat2.obliczPole());
        System.out.println("Obwód: " + prostokat2.obliczObwod());

        // Zwiększenie wymiarów prostokąta
        System.out.print("\nPodaj procent, o jaki zwiększyć wymiary pierwszego prostokąta: ");
        double procentZwieksz = scanner.nextDouble();
        prostokat1.zwiekszWymiary(procentZwieksz);
        System.out.println("Nowe wymiary po zwiększeniu: " + prostokat1.getDlugosc() + " x " + prostokat1.getSzerokosc());
        System.out.println("Pole po zwiększeniu: " + prostokat1.obliczPole());
        System.out.println("Obwód po zwiększeniu: " + prostokat1.obliczObwod());

        // Zmniejszenie wymiarów prostokąta
        System.out.print("\nPodaj procent, o jaki zmniejszyć wymiary pierwszego prostokąta: ");
        double procentZmniejsz = scanner.nextDouble();
        prostokat1.zmniejszWymiary(procentZmniejsz);
        System.out.println("Nowe wymiary po zmniejszeniu: " + prostokat1.getDlugosc() + " x " + prostokat1.getSzerokosc());
        System.out.println("Pole po zmniejszeniu: " + prostokat1.obliczPole());
        System.out.println("Obwód po zmniejszeniu: " + prostokat1.obliczObwod());

        // Zamknięcie skanera
        scanner.close();
    }
}
