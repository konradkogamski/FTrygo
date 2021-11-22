package main.java;

import java.util.Scanner;

public class Trygonometryczne {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Podaj a:");
        double a = s.nextDouble();

        System.out.println("Podaj b:");
        double b = s.nextDouble();

        System.out.println("Podaj c:");
        double c = s.nextDouble();


        System.out.println("Jaka funkcje chcesz obliczyc? (sin = 1, cos = 2, tg = 3 ctg = 4): ");
        int funkcja = s.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 ) {
            System.out.println("Error");
            return;
        }
        switch (funkcja) {
            case 1:
                System.out.println(a / c);
                break;

            case 2:
                System.out.println(b / c);
                break;

            case 3:
                System.out.println(a / b);
                break;

            case 4:
                System.out.println(b / a);
                break;
            default:
                System.out.println("Wybierz numer od 1 do 4");
        }
    }
}
