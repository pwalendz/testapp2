package com;

import java.util.Scanner;

public class MainMenu {
    private static String filePath;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Main Menu");
            System.out.println("1. Create a file");
            System.out.println("2. Search for a file");
            System.out.println("3. Delete a file");
            System.out.println("4. Set file path");
            System.out.println("5. Display current file path");
            System.out.println("6. Display all files in the directory");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                input.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    CreateFile.create(filePath);
                    break;
                case 2:
                    SearchFile.search(filePath);
                    break;
                case 3:
                    DeleteFile.delete(filePath);
                    break;
                case 4:
                    filePath = SetFilePath.set();
                    break;
                case 5:
                    displayPath();
                    break;
                case 6:
                	DisplayFilesInDirectory.display(filePath);
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
    }

    public static void displayPath() {
        if (filePath == null) {
            System.out.println("File path not set.");
        } else {
            System.out.println("Current file path: " + filePath);
        }
    }
}
