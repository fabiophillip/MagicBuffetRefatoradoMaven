package junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ThreadPressionaEnterApos3Segundos extends Thread
{
	public void run()
	{
		try
		{
			final Robot r = new Robot();
			r.delay(3000);
			r.keyPress(KeyEvent.VK_ENTER);
		}
		catch(AWTException e)
		{
			e.printStackTrace();
		}
	}
	

}
