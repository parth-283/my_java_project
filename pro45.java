import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class pro45 extends Applet implements Runnable
{
  	Thread t,t1;
  	public void start()
	{
  		t = new Thread(this);
  		t.start();
	}

  	public void run()
	{
 	 t1 = Thread.currentThread();
  		while(t1 == t)
		{
  			repaint();
  			try
			{
  				t1.sleep(1000);  
  			}
			catch(InterruptedException e)
			{

			}
  		}
  	}

  	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		
  		Calendar cal = new GregorianCalendar();
  		Date d=cal.getTime();
  		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		
  		g.drawString(sdf.format(d), 20, 30);
  	}
}

/*output:-
F:\java>javac pro45.java

F:\java>appletviewer pro45.html
*/