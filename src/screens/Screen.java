package screens;
import java.util.ArrayList;

import processing.core.PApplet;
import util.Drawable;
import util.Entity;
import util.Updateable;

public abstract class Screen implements Updateable, Drawable
{	
	public ArrayList<Entity> entities;
	
	public Screen()
	{
		entities = new ArrayList<Entity>();
	}
	public void update(PApplet applet)
	{
		for (Entity entity: entities)
			entity.update(applet);
	}
	public void draw(PApplet applet)
	{
		for (Entity entity: entities)
			entity.draw(applet);
	}
	
	public abstract void keyPressed(PApplet applet);
	public abstract void keyReleased(PApplet applet);
}
