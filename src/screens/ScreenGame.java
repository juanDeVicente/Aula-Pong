package screens;

import entities.Ball;
import entities.Palette;
import images.Image;
import images.ImageManager;
import processing.core.PApplet;

public class ScreenGame extends Screen
{
	private Palette palette;
	private Ball ball;
	
	public ScreenGame()
	{
		this.palette = new Palette(0, 980);
		super.entities.add(this.palette);	
		
		this.ball = new Ball(0, 1080);
		super.entities.add(ball);
		
	}
	
	@Override
	public void draw(PApplet applet)
	{
		applet.image(ImageManager.utadLogo.getProcessingImage(), 700, 500);
		super.draw(applet);
	}
	
	@Override
	public void keyPressed(PApplet applet)
	{
		if (applet.key == 'd')
			this.palette.setRight(true);
		if (applet.key == 'a')
			this.palette.setLeft(true);
	}

	@Override
	public void keyReleased(PApplet applet)
	{
		if (applet.key == 'd')
			this.palette.setRight(false);
		if (applet.key == 'a')
			this.palette.setLeft(false);
		
	}
}
