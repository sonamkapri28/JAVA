import java.awt.*;
import java.applet.*;

/*
<applet code ="SimpleBanner" width=300 height=50>
</applet>
*/

public class SimpleBanner extends Applet implements Runnable
{
	String msg = " A Simple Moving Banner " ;
	Thread t = null;
	int state;
	boolean stopFlag;

//set colors and initialize thread
public void init()
{
	setBackground(Color.cyan);
	setForeground(Color.red);
}

//start thread
public void start()
{
	t= new Thread(this);
	stopFlag = false;
	t.start();
}

//Entry point for the thread that runs the banner
public void run()
{
	char ch;
	//display banner
	for( ; ; )
	{
		try
		{
			repaint();
			Thread.sleep(250);
			ch = msg.charAt(0);
			msg = msg.substring(1,msg.length());
			msg += ch;
			if(stopFlag)
				break;
		}
		catch(InterruptedException e)
		{}
	}
}

//pause the banner
public void stop()
{
	stopFlag = true;
	t = null;
} 

//display the banner
public void paint(Graphics g)
{
	g.drawString(msg,50,30);
}
}