package it.morfoza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int result = 2 * 2;
        System.out.println("Hello! What's your name?");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Your name is: " + name);

    }
}
