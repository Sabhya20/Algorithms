package sab.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NinthProject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a,b,c;
		
		System.out.println("Enter first Letter");
		a=scan.next();
		System.out.println("Enter second Letter");
		b=scan.next();
		System.out.println("Enter third Letter");
		c=scan.next();
		
		 // Creating an array list
        ArrayList<String> Sentence = new ArrayList<>();

        // Add elements
        Sentence.add(a);
        Sentence.add(b);
        Sentence.add(c);
        System.out.println("Unsorted ArrayList: " + Sentence);

        // Using the sort() method
        Collections.sort(Sentence);
        System.out.println("Sorted ArrayList: " + Sentence);


	}

}
