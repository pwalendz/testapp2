package com;

import java.util.Scanner;

public class SetFilePath {
    public static String set() {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Enter file path");
            System.out.println("2. Return to main menu");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.print("Enter file path (include trailing \\): ");
                String filePath = input.nextLine();

                if (!filePath.endsWith("\\")) {
                    filePath += "\\";
                }
                System.out.println("File path set to: " + filePath);
                return filePath;
            }
        } while (choice != 2);
        return null;
    }
}