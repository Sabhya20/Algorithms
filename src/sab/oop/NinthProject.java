package sab.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NinthProject {

	public static void main(String[] args) {
		//Initilaize Variables
		Scanner scan = new Scanner(System.in);
		String a,b,c;
		
		//Get input from user 
		System.out.println("Enter first Letter");
		a=scan.nextLine();
		System.out.println("Enter second Letter");
		b=scan.nextLine();
		System.out.println("Enter third Letter");
		c=scan.nextLine();
		
		 // Creating an array list
        ArrayList<String> Sentence = new ArrayList<>();

        // Add the elements from the recorded input
        Sentence.add(a);
        Sentence.add(b);
        Sentence.add(c);
        System.out.println("Unsorted ArrayList: " + Sentence);

        // Using the sort() method we can sort our sentence
        Collections.sort(Sentence);
        System.out.println("Sorted ArrayList: " + Sentence);


	}

}
