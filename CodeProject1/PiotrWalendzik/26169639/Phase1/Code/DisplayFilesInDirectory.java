package com;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayFilesInDirectory {
    public static void display(String filePath) {
        if (filePath == null) {
            System.out.println("File path not set. Please set a file path using Main Menu option 4.");
            return;
        }
        File directory = new File(filePath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory.");
            return;
        }
        
        Scanner input = new Scanner(System.in);
        int choice;
        
        do {
            String[] files = directory.list();
            Arrays.sort(files);
            System.out.println("Files in directory " + filePath + ":");
            for (String file : files) {
                System.out.println(file);
            }
            
            System.out.println("1. Return to main menu");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            
            if (choice == 2) {
                System.out.println("Exiting program.");
            }
        } while (choice != 1 && choice != 2);
    }
}