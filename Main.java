package com.company;

import java.util.Scanner;

class trojmian {
    double a, b, c, delta, x1, x2;
    char liczba_pierwiastkow;

    public void czytaj_dane() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a");
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Błędna wartośc a");
        } else {
            System.out.println("Podaj b");
            double b = scanner.nextDouble();
            System.out.println("Podaj c");
            double c = scanner.nextDouble();
        }
    }

    public void przetworz_dane() {
        delta = b * b - 4 * a * c;
        if (delta < 0) liczba_pierwiastkow = 0;
        if (delta == 0) liczba_pierwiastkow = 1;
        if (delta > 0) liczba_pierwiastkow = 2;
        switch (liczba_pierwiastkow) {
            case 1:
                x1 = -b / (2 * a);
                break;
            case 2: {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
            }
            break;
        }
    }

    public void wyswietl_dane() {
        System.out.println("Dla wprowadzonych liczb");
        System.out.printf("a = " + "%2.2f,", a);
        System.out.printf(" b = " + "%2.2f,", b);
        System.out.printf(" c = " + "%2.2f,", c);
        switch (liczba_pierwiastkow) {
            case 0:
                System.out.print("Brak pierwiastkow.\n");
                break;
            case 1:
                System.out.printf(" trójmian ma jeden pierwiastek " + "%2.2f.\n", x1);
                break;
            case 2: {
                System.out.print(" Trójmian ma dwa pierwiastki ");
                System.out.printf("x1 = " + "%2.2f", x1);
                System.out.printf("x2 = " + "%2.2f.\n", x1);
            }
            break;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        trojmian trojmian1 = new trojmian();
        trojmian1.czytaj_dane();
        trojmian1.przetworz_dane();
        trojmian1.wyswietl_dane();
    }
}
