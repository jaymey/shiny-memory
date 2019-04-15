/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */

package asteroidgame;

import java.util.Random;

import blobz.BlobGUI;
import blobz.SandBox;
import blobz.SandBoxMode;

public class AsteroidGame implements BlobGUI {
	
	private static final Random random = new Random();
	private static SandBox sb;
	static int numAsteroids = 0;
	
	public AsteroidGame(int ast) {
		numAsteroids = ast;
		sb = new SandBox();
		sb.setSandBoxMode(SandBoxMode.FLOW);
		sb.setFrameRate(15); 
		sb.init(this);
	}

	public static void main( String[] args) {
		new AsteroidGame(Integer.parseInt( args[ 0 ] ) );
	}

	@Override
	public void generate() {
		int width = sb.getPanelBounds().width;
		int height = sb.getPanelBounds().height;
		Rocket rocket = new Rocket(width/2, height/2, sb);
		sb.addBlob(rocket);
		
		for (int j = 0; j < numAsteroids; j++) {
			int idx = -3 + random.nextInt(7);
			if (idx == 0)
				idx++;
			
			int jdx = -3 + random.nextInt(7);
			if (jdx == 0)
				jdx++;
			
			double rot = 0;
			int choose = random.nextInt(2);
			if (choose == 1)
				rot = -0.1;
			if (choose == 0)
				rot = 0.1;

			Asteroid a = new Asteroid(idx, jdx, rot);
			
			sb.addBlob(a);
		}
	}
}
