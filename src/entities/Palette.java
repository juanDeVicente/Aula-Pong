package entities;

import images.Animation;
import images.ImageManager;
import processing.core.PApplet;
import util.Entity;

public class Palette extends Entity
{
	private Animation animation;
	
	private boolean left, right;
	
	/*
	 * Getters & setters
	 */
	public boolean isLeft() {return left;}
	public void setLeft(boolean left) {this.left = left;}
	public boolean isRight() {return right;}
	public void setRight(boolean right) {this.right = right;}
	
	public Palette(int x, int y)
	{
		super(x, y);
		this.animation = ImageManager.paletteAnimation;
	}

	@Override
	public void update(PApplet applet)
	{
		if (this.right)
			super.setX(super.getX() + 10);
		if (this.left)
			super.setX(super.getX() - 10);
		
		if (super.getX() <= 0 && this.left)
			super.setX(0);
		if (super.getX() >= 1920 - 142 && this.right)
			super.setX(1920 - 142);
		
		
		animation.setPos(super.getX(), super.getY());
		animation.update(applet);
		
	}

	@Override
	public void draw(PApplet applet)
	{
		animation.draw(applet);
	}

}
