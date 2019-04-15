/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */

package asteroidgame;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

import blobz.PolyBlob;
import blobz.SandBox;
import blobz.BlobAction;
import blobz.BlobProximity;
import blobz.BlobUtils;

public class Rocket extends PolyBlob implements BlobAction, BlobProximity {

	private double angle = 0.0;
	private final double delta = 0.15;
	private final double speed = 5.0;
	public SandBox sb1;

	private final Point[] p = { 
			new Point(10, 0),
			new Point(-10, -7), 
			new Point(-5, 0), 
			new Point(-10, 7),
	};

	public Rocket(int x, int y, SandBox sb) {
		super(x, y, 0);
		setColor(Color.red);
		sb1 = sb;
		setAngle(angle);
		setPolygon(p);
	}

	public void keyAction(KeyEvent e) {
		if (e.getKeyCode() == 37) {
			angle -= delta;
			if (angle < 0)
				angle += 2 * Math.PI;
			setAngle(angle);
		}
		else if (e.getKeyCode() == 39) {
			angle += delta;
			if (angle > 2 * Math.PI)
				angle -= 2 * Math.PI;
			setAngle(angle);
		}
		else if (e.getKeyCode() == 38) {
			Point loc = getLoc();
			int xloc = loc.x;
			int yloc = loc.y;
			xloc = xloc + (int) Math.round(speed * Math.cos(angle));
			yloc = yloc + (int) Math.round(speed * Math.sin(angle));
			setLoc(xloc, yloc);
		}
		else if (e.getKeyCode() == 32) {
			launch(sb1);
			BlobUtils.playSound();
		}
	}
	
	public void launch(SandBox sb) {
		int xloc = getLoc().x;
		int yloc = getLoc().y;
		xloc = xloc + (int) Math.round(speed * Math.cos(angle));
		yloc = yloc + (int) Math.round(speed * Math.sin(angle));
		Point newloc = BlobUtils.rotatePoint( 5, angle);
		Missile m = new Missile(xloc + newloc.x, yloc + newloc.y, angle);
		sb.addBlob(m);
	}

}
