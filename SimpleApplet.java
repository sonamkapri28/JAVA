import java.awt.*;
import java.applet.*;

/*
<applet code="SimpleApplet" width=600 height=160>
</applet>
*/

public class SimpleApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello World",20,20);
	}
}