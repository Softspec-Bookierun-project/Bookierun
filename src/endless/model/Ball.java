package endless.model;


import java.security.Timestamp;
import java.sql.Time;



public class Ball {

	public static final int WIDTH = 60;
	public static final int NORMAL_HEIGHT = 60;

	private int x;
	private int y;
	private int vY = 5;
	private int width;
	private int height;
	
	// TODO: Add variables you need.

	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = WIDTH;
		this.height = NORMAL_HEIGHT;
		// TODO: Initialize variables you need
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getvY() {
		return vY;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setvY(int vY) {
		this.vY = vY;
	}

	public void update() {
		// TODO: Complete this
		this.x -= this.vY;
		if(this.x <= -100)
			this.x = 1000;
	}

}