/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */

import java.util.Random;

import blobz.BlobUtils;
import blobz.PolyBlob;

public class Asteroid extends PolyBlob {
	
	private static final Random random = new Random();
	
	public Asteroid( int idx, int jdx, double rot) {
		
		super( -100, -100, rot);
		super.setDelta(idx, jdx);
		
		int numSides = 5 + random.nextInt(5);
		int[] vd = new int[numSides];
		for (int i = 0; i < numSides; i++) {
			vd[i] = 5 + random.nextInt(11);
		}
		double regSize = 2 * Math.PI / numSides;
		double[] angle = new double[numSides];
		for (int i = 0; i < numSides; i++) {
			angle[i] = (i * regSize) + (Math.random() * regSize);
		}
		for(int i = 0; i < numSides; i++) {
			BlobUtils.rotatePoint(vd[i], angle[i]);
		}
		
		
		
	}
	

}
