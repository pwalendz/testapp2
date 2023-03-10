package com;

import java.io.*;
import java.util.Scanner;

public class SearchFile {
	public static void search(String filePath) {
	    Scanner input = new Scanner(System.in);
	    int choice;
	    do {
	        System.out.print("Enter the file name to search: ");
	        String fileName = input.nextLine().toLowerCase();
	        File file = new File(filePath + fileName);
	        if (file.exists()) {
	            System.out.println("File found.");
	        } else {
	            System.out.println("File not found.");
	        }
	        System.out.println("1. Search again");
	        System.out.println("2. Return to main menu");
	        System.out.print("Enter your choice: ");
	        choice = input.nextInt();
	        input.nextLine();
	    } while (choice != 2);
	}
}