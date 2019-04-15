/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SentenceUtilsTest {
	
	private static List<SentenceUtils> slist = new ArrayList<SentenceUtils>();
	
	public static void main(String[] args) {
		
		System.out.println("\n----------------------------------------------\n");
		System.out.println("COP3330 Sentence Utility Program by Jake Meyer");
		System.out.println("\nInput file name: " + args[ 0 ] );
		
		try {
			File file = new File( args[ 0 ] );
			Scanner scanner = new Scanner ( file );
			
			while( scanner.hasNext() ) {
				String s = scanner.nextLine();
				if(s.length() == 0)
					continue;
				SentenceUtils sentence = new SentenceUtils(s);
				slist.add(sentence);
			}
			scanner.close();
			System.out.println("Number of Sentences: " + slist.size());
			for (int i = 0; i < slist.size(); i ++) {
				System.out.println("\nSentence " +  i + " >");
				slist.get(i).report();
			}
			System.out.print("\n");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}