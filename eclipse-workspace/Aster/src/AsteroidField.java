/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */

import blobz.BlobGUI;

public class AsteroidField implements BlobGUI {
	
	public static void main( String[] args) {
		new AsteroidField( Integer.parseInt( args[ 0 ] ) );
	}
	
}