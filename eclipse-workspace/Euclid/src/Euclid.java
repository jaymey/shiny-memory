/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */

public class Euclid {

	public static void main(String[] args) {
		
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		
		String s1 = "\n---------------------------------\n";
		String s2 = "Euclid's Algorithm by Jake Meyer:\n";
		String s3 = "Inputs: ";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3 + i + ", " + j + "\n");
		
		gcd(i,j);
	}
	
	public static void gcd(int i, int j){
		int a ,b;
		
		if (i < j) {
			a = j;
			b = i;
		}
		else {
			a = i;
			b = j;
		}
		
		int r = a % b;
		int q = a / b;
		int x = b;

		System.out.println(a + " = " + q + " ( " + b + " ) " + "+ " + r);
		
		while (r != 0){
			a = b;
			b = r;
			x = r;
			r = a % b;
			q = a / b;
			
			System.out.println(a + " = " + q + " ( " + b + " ) " + "+ " + r);
		}
		System.out.println("\n==> gcd( " + i + ", " + j + " ) " + "= " + x + "\n");
	}

}
