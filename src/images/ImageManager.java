package images;


import processing.core.PApplet;

public class ImageManager
{
	//UTAD
	public static Image utadLogo;
	
	//PALETTE
	public static Image palette1;
	public static Image palette2;
	public static Image palette3;	
	public static Animation paletteAnimation;
	
	//BALL
	public static Image ball1;
	public static Animation ballAnimation;
	
	public static void init(PApplet applet)
	{
		utadLogo = new Image("res/utad.png", applet);
		
		palette1 = new Image("res/palette1.png", applet);
		palette2 = new Image("res/palette2.png", applet);
		palette3 = new Image("res/palette3.png", applet);
		
		paletteAnimation = new Animation(new Image[] {palette1, palette2, palette3}, 300);
		
		ball1 = new Image("res/ball1.png", applet);
		
		ballAnimation = new Animation(new Image[] {ball1}, 300);
	}
}
