package kolokvijum2_zadaci;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Vnesi prvi broj: ");
        double a = t.nextDouble();

        System.out.print("Operacija (+ - * /): ");
        String op = t.next();

        System.out.print("Vnesi vtor broj: ");
        double b = t.nextDouble();

        double c;

        switch (op) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
            default:
                System.out.println("Gresna operacija!");
                return;
        }

        System.out.println(a + " " + op + " " + b + " = " + c);
    }
}

