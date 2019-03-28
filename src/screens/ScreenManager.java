package screens;

public class ScreenManager
{
	public static Screen currentScreen;
	
	public static ScreenGame screenGame;
	
	public static void init()
	{
		screenGame = new ScreenGame();
		currentScreen = screenGame;
	}
}
