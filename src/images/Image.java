package images;

import processing.core.PApplet;
import processing.core.PImage;

public class Image
{
	private PImage processingImage;
	
	/*
	 * Getters & setters
	 */
	public PImage getProcessingImage()
	{
		return processingImage;
	}

	public void setProcessingImage(PImage processingImage)
	{
		this.processingImage = processingImage;
	}
	
	public Image(String path, PApplet applet)
	{
		this.processingImage = applet.loadImage(path);
	}	

}
