package com.cvs0.cvsengine2d;

public class GameContainer implements Runnable {
	
	private Thread thread;
	private boolean running = false;
	private static final double UPDATE_CAP = 1.0 / 60.0;
	
	public GameContainer() {
		
	}
	
	public void start() {
		thread = new Thread(this);
		thread.run();
	}
	
	public void stop() {
		
	}
	
	public void run() {
		running = true;
		
		double firstTime = 0;
		double lastTime = 0;
		double passedTime = 0;
		double unprocessedTime = 0;
		
		while(running) {
			
		}
	}
	
	private void dispose() {
		
	}
}
