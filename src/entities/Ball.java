package entities;

import images.Animation;
import images.ImageManager;
import processing.core.PApplet;
import util.Entity;

public class Ball extends Entity
{
	private Animation animation;
	
	private boolean isLeft, isUp;
	
	private int speed = 10;
	
	public Ball(int x, int y)
	{
		super(x, y);
		this.animation = ImageManager.ballAnimation;
	}

	@Override
	public void draw(PApplet applet)
	{
		animation.draw(applet);
	}

	@Override
	public void update(PApplet applet)
	{
		if(isLeft)
			super.setX(super.getX() - speed);
		else
			super.setX(super.getX() + speed);
		
		if (isUp)
			super.setY(super.getY() + speed);
		else
			super.setY(super.getY() - speed);
		
		if (super.getX() <= 0)
			isLeft = false;
		else if (super.getX() >= 1920 - 85)
			isLeft = true;
		
		if(super.getY() <= 0)
			isUp = true;
		else if (super.getY() >= 1080 - 85)
			isUp = false;
		
		animation.setPos(super.getX(), super.getY());
		animation.draw(applet);
		
	}
}
