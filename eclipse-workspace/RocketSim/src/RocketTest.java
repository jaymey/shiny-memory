/*
 * University of Central Florida
 * COP3330 - Fall 2018
 * Author: Jake Meyer
 */

import asteroidgame.Rocket;
import blobz.BlobGUI;
import blobz.SandBox;
import blobz.SandBoxMode;

public class RocketTest implements BlobGUI {
	public static void main(String[] args) {
		new RocketTest();
	}
	
	private static SandBox sb;
	
	public RocketTest() {
		sb = new SandBox();					
		sb.setSandBoxMode(SandBoxMode.FLOW);
		sb.setFrameRate(15);				 
		sb.init(this);
	}

	@Override
	public void generate() {
		int width = sb.getPanelBounds().width;
		int height = sb.getPanelBounds().height;
		Rocket rocket = new Rocket(width/2, height/2);
		sb.addBlob(rocket);
	}
	
	
}
