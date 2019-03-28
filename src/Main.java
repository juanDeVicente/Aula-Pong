import images.ImageManager;
import processing.core.PApplet;
import screens.ScreenManager;

public class Main extends PApplet
{
	/**
	 * Punto de entrada de la aplicación
	 * @param args
	 */
	public static void main(String[] args)
	{
		PApplet.main("Main");
	}
	
	@Override
	public void settings()
	{
		this.fullScreen();
		//this.size(1920, 1080);
	}
	
	@Override
	public void setup()
	{
		ImageManager.init(this);
		ScreenManager.init();
	}
	
	@Override
	public void draw()
	{
		this.background(0);
		ScreenManager.currentScreen.update(this);
		ScreenManager.currentScreen.draw(this);
		//DEBUG
	}
	
	@Override
	public void keyPressed()
	{
		ScreenManager.currentScreen.keyPressed(this);
	}
	
	@Override
	public void keyReleased()
	{
		ScreenManager.currentScreen.keyReleased(this);
	}
}
