package com;

import java.io.File;
import java.util.Scanner;

public class CreateFile {
	public static void create(String filePath) {
	    Scanner input = new Scanner(System.in);
	    int choice;
	    do {
	        System.out.println("1. Enter file name");
	        System.out.println("2. Return to main menu");
	        System.out.print("Enter your choice: ");
	        choice = input.nextInt();
	        input.nextLine();
	        if(choice == 1){
	            do {
	                System.out.print("Enter file name: ");
	                String fileName = input.nextLine().toLowerCase();
	                File file = new File(filePath + fileName);
	                try {
	                    boolean created = file.createNewFile();
	                    if (created) {
	                        System.out.println("File created.");
	                    } else {
	                        System.out.println("File already exists.");
	                    }
	                } catch (Exception e) {
	                    System.out.println("Error creating file.");
	                }
	                System.out.println("1. Create another file");
	                System.out.println("2. Return to main menu");
	                System.out.print("Enter your choice: ");
	                choice = input.nextInt();
	                input.nextLine();
	            } while (choice != 2);
	        }
	    } while (choice != 2);
	}
}