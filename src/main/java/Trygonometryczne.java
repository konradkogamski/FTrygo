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

        if (funkcja == 1 && a == 0 && b == 0 && c == 0) {
            System.out.println(a / c);
        } else if (funkcja == 2 && a == 0 && b == 0 && c == 0) {
            System.out.println(b / c);
        } else if (funkcja == 3 && a == 0 && b == 0 && c == 0) {
            System.out.println(a / b);
        } else if (funkcja == 4 && a == 0 && b == 0 && c == 0) {
            System.out.println(b / a);
        } else {
            System.out.println("Error");
        }
    }
}