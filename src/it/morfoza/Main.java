package it.morfoza;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello! What's your name?");

        Scanner input = new Scanner(System.in);
        //String name = input.nextLine();

        //System.out.println("Your name is: " + name);

        System.out.println("Podaj symbol działania:");
        String symbol = input.nextLine();
        System.out.println("Podaj zmienną a=");
        int a = input.nextInt();
        System.out.println("Podaj zmienną b=");
        int b = input.nextInt();
        int wynik = 0;

        switch (symbol) {
            case "+":
                 wynik = a + b;
                break;

            case "-":
                wynik = a - b;
                break;

            case "*":
                wynik = a * b;
                break;

            case "/":
                wynik = a / b;
                break;

            default:
                System.out.println("Ściemniasz");
        }

        System.out.println(a + symbol + b + "=" + wynik);

        /*if (symbol.equals("+")) {
            int c = a + b;
            System.out.println(a + symbol + b + "=" + c);
        }

        if (symbol.equals("-")){
            int c = a - b;
            System.out.println(a + symbol + b + "=" + c);
        }
        if (symbol.equals("*")) {
            int c = a * b;
            System.out.println(a + symbol + b + "=" + c);
        }

        if (symbol.equals("/")) {
            int c = a / b;
            System.out.println(a + symbol + b + "=" + c);
        }*/
    }
}
