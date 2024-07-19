package ru.cft.myProject.lessonOne;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int toNumber;
        int maxLength;

        System.out.println("Enter max number...");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                toNumber = scanner.nextInt();
                maxLength = Integer.toString(toNumber).length() + 2;

                for (int i = 1; i <= toNumber; i++) {
                    System.out.println(("-".repeat(maxLength) + "+").repeat(toNumber));
                    for (int j = 1; j <= toNumber; j++) {
                        System.out.print(String.format("%1$" + maxLength + "s", i * j) + "|");
                    }
                    System.out.println();
                }
                System.out.println(("-".repeat(maxLength) + "+").repeat(toNumber));
            } else {
                System.out.println("Wrong number...");
            }
        }
    }
}
