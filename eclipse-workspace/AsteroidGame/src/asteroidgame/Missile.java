/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */

package asteroidgame;

import blobz.Blob;
import blobz.BlobProximity;
import java.awt.Color;

public class Missile extends Blob implements BlobProximity {
	
	public Missile (int x, int y, double theta) {
		super(x, y, Color.yellow);
		
		double speed = 5;
		int dx = (int) Math.round( speed * Math.cos( theta ) );
		int dy = (int) Math.round( speed * Math.sin( theta ) );
		setDelta(dx,dy);
	}
}
