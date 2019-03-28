package images;
import processing.core.PApplet;
import util.Entity;

public class Animation extends Entity
{
	private Image[] images;
	private int currentImage;
	
	private float deltaTime;
	private float timeSkipAnimation;
	
	public Animation(Image[] images, float timeSkipAnimation)
	{
		super(0, 0);
		this.images = images;
		this.deltaTime = 0;
		
		this.currentImage = 0;
		this.timeSkipAnimation = timeSkipAnimation;
	}
	
	@Override
	public void update(PApplet applet)
	{
		deltaTime += applet.frameRate;
		
		if (deltaTime >= timeSkipAnimation)
		{
			deltaTime = 0;
			currentImage++;
			currentImage %= images.length;
		}
	}

	@Override
	public void draw(PApplet applet)
	{
		applet.image(images[currentImage].getProcessingImage(), super.getX(), super.getY());
	}
}
