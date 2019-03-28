package util;

import processing.core.PApplet;

public abstract class Entity implements Updateable, Drawable
{
	
	private int x;
	private int y;
	 
	/*
	 * Getters & setters
	 */
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	
	public Entity(int x, int y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public void setPos(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	@Override
	public abstract void draw(PApplet applet);
	@Override
	public abstract void update(PApplet applet);

}
