import java.applet.*;  
import java.awt.*;  
import java.io.*;
  
public class pro42 extends Applet
{  
	int  age=0;
	String str;
	public void start()
	{
		String s1;
		
		s1=getParameter("age");
		age=Integer.parseInt(s1);
	}

	public void paint(Graphics g)
	{  
		if(age==0)
		{
			g.drawString("my age is 45",10,50);
		}
		else
		{
			g.drawString("my age is "+age,10,100);
		}
	}  
}  

/*
output:-
<html>  
<body>  
	<applet code="pro42" width=500 height=500>
		<param name="age" value="42">
	</applet>
</body>  
</html>  
*/

