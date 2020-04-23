import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="KeyboardEvent" width=300 height=100>
</applet>
*/
public class KeyboardEvent extends Applet implements KeyListener
{
	String msg = "";
	int X=10, Y=20;	//output coordinates

	public void init()
	{
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent ke)
	{
		showStatus("key Down");
	}

	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Up");
	}

	public void keyTyped(KeyEvent ke)
	{
		msg += ke.getKeyChar();
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg, X, Y);
	}
}