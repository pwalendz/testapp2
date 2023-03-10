package com;

import java.io.*;
import java.util.Scanner;

public class DeleteFile {
	public static void delete(String filePath) {
	    Scanner input = new Scanner(System.in);
	    int choice;
	    do {
	        System.out.print("Enter file name to delete: ");
	        String fileName = input.nextLine().toLowerCase();
	        File file = new File(filePath + fileName);
	        if (file.delete()) {
	            System.out.println("File deleted successfully.");
	        } else {
	            System.out.println("File not found or could not be deleted.");
	        }
	        System.out.println("1. Delete another file");
	        System.out.println("2. Return to main menu");
	        System.out.print("Enter your choice: ");
	        choice = input.nextInt();
	        input.nextLine();
	    } while (choice != 2);
	}
}