/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */


public class SentenceUtils {
	private String sentence;
	private String[] tokens;
	private String[] shingles;
	
	public SentenceUtils( String s ) {
		sentence = s;
		generateTokens();
		generateShingles();
	}
	
	private void generateTokens() {
		tokens = sentence.split(" ");
	}
	
	private void generateShingles() {
		shingles = new String[sentence.length() - 1];
		for (int i = 0; i < sentence.length() - 1; i ++) {
			shingles[i] = sentence.substring(i, i + 2);
		}
	}
	
	
	public void report() {
		int i = 0;
		System.out.println(sentence + "\n");
		System.out.println("Tokens:");
		for ( String token : tokens) {
			System.out.println(i + ":" + token);
			i++;
		}
		i = 0;
		System.out.print("\nShingles:");
		for ( String shingle : shingles) {
			if ( i % 10 == 0)
				System.out.print("\n");
			
			System.out.print("'" + shingle + "' ");
			i++;
		}
			System.out.print("\n");
	}
}