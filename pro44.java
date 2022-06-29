import java.awt.*;
import java.applet.Applet;

public class pro44 extends Applet 
{
    public void paint(Graphics g)
    {
	g.setColor(Color.RED);
	g.fillRect(100,100,160,160);

	g.setColor(Color.yellow);

	Font f1=new Font("Times New Roman",Font.BOLD+Font.ITALIC,12);
        g.setFont(f1);

	
	g.drawString("parth kathiriya",130,150);
        
    }
}


/*
pro44.html

html>
<body>
<applet code="pro44.class" height="500" width="700" border="1"></applet>
</body>
</html>
*/