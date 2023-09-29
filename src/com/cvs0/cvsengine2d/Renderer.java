package com.cvs0.cvsengine2d;

import java.awt.image.DataBufferInt;

public class Renderer {
	private int pW, pH;
	private int[] p;
	
	public Renderer(GameContainer gc) {
		pW = gc.getWidth();
		pH = gc.getHeight();
		
		p = ((DataBufferInt)gc.getWindow().getImage().getRaster().getDataBuffer()).getData();
	}
	
	public void clear() {
		for(int i = 0; i < p.length; i++) {
			p[i] += i;
		}
	}
}
