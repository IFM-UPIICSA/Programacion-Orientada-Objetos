// Fernando Luque
//Appletviewer Hola.html

import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet //implements Runnable
{

	public void paint(Graphics g)	{
		System.out.println("Applet.- metodo paint");
		g.drawString("saludos!!!", 30, 80);
	}

/*	public void init() 	{
		System.out.println("Applet.- metodo init");
	}
	public void start()	{
		t.resume();
	}
	public void stop()	{
		t.suspend();
	}
	public void destroy()	{
		t.stop();
	}	*/

}
