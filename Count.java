// ************************************************************
// Count.java
// Name: Chris MacDonald
// Class: IFT 210
// Lab 2 Part 4
// This program reads in strings (phrases) and counts the
// number of blank characters and certain other letters
// in the phrase.
// ************************************************************

import java.util.Scanner;

public class Count
{
	public static void main (String[] args)
	{
		String phrase; // a string of characters
		String another = "y";
		int countBlank; // the number of blanks (spaces) in the phrase
		int length; // the length of the phrase
		char ch; // an individual character in the string
		Scanner scan = new Scanner(System.in);

		// Print a program header
		System.out.println ();
		System.out.println ("Character Counter");
		System.out.println ();
		
		while (another.equalsIgnoreCase("y"))
		{
			// Read in a string and find its length
			System.out.print ("Enter a sentence or phrase: ");
			phrase = scan.nextLine();
			length = phrase.length();

			// Initialize counts
			countBlank = 0;
			int countA = 0;
			int countE = 0;
			int countS = 0;
			int countT = 0;
		
			// a switch to go through the string character by character
			// and count the blank spaces and (a, e, s, t)
			
			for(int i = 0; i < phrase.length(); i++)
			{
			
				ch = phrase.charAt(i);
				//if(phrase.charAt(i) == ' ')
				//countBlank++;
				switch (ch)
				{
					case 'a':
					case 'A': countA++;
						break;
					case 'e':
					case 'E': countE++;
						break;
					case 's':
					case 'S': countS++;
						break;
					case 't':
					case 'T': countT++;
						break;
					case ' ':
						countBlank++;
						break;
				}
			}
		
			// Print the results
			System.out.println();
			System.out.println("Number of blank spaces: " + countBlank);
			System.out.println("Number of A Letters: " + countA);
			System.out.println("Number of E Letters: " + countE);
			System.out.println("Number of S Letters: " + countS);
			System.out.println("Number of T Letters: " + countT);
			System.out.println("Play again (y/n)");
			another = scan.nextLine();
			System.out.println();
		}
	}
}