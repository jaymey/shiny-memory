/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */

import java.util.Random;

import asteroidgame.Asteroid;
import blobz.BlobGUI;
import blobz.SandBox;
import blobz.SandBoxMode;

public class AsteroidField implements BlobGUI {

	public static void main(String[] args) {
		new AsteroidField(Integer.parseInt(args[0]));
	}

	private static final Random random = new Random();
	private static SandBox sb;
	static int numAsteroids = 0;

	public AsteroidField(int argument) {
		// Save input to static integer
		numAsteroids = argument;
		
		sb = new SandBox();					// Create new SandBox
		sb.setSandBoxMode(SandBoxMode.FLOW);// set to Flow mode
		sb.setFrameRate(15);				// set FrameRate 
		sb.init(this);						// Initialize
	}

	@Override
	public void generate() {
		for (int j = 0; j < numAsteroids; j++) {
			// Set X velocity
			int idx = -3 + random.nextInt(7);
			if (idx == 0)
				idx++;
			
			// Set Y velocity
			int jdx = -3 + random.nextInt(7);
			if (jdx == 0)
				jdx++;
			
			// Set Rotation
			double rot = 0;
			int choose = random.nextInt(2);
			if (choose == 1)
				rot = -0.1;
			if (choose == 0)
				rot = 0.1;
			
			// Create Asteroid
			Asteroid a = new Asteroid(idx, jdx, rot);
			
			// Add Asteroid to Sandbox
			sb.addBlob(a);
		}

	}

}