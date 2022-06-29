import java.awt.*;
import java.applet.*;
public class pro41 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(300, 40, 200, 40);

		g.setColor(Color.blue);
		g.drawString("welcome",350,70);


		g.setColor(Color.blue);
		g.fillRoundRect(300, 100, 200, 40, 10, 10);

		g.setColor(Color.pink);
		g.drawString("welcome",350,120); 
		
	}
}


/*
pro41.html
<html>
<body>
<applet code="pro41.class" height="500" width="700" border="1"></applet>
</body>
</html>
*/