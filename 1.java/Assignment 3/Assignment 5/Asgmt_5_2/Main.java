import java.awt.*;
import java.applet.*;
//<applet code="Ass2" height=300 width=500></applet>
public class Ass2 extends Applet
{
	public void paint(Graphics g)
	{
		
		Color green = new Color(0, 168, 168);  
		Color skin=new Color(255,203,179);
		Color red=new Color(183,15,23);
		Color blue=new Color(128,128,192);
		g.setColor(skin);
		g.fillRect(20,20,200,135);
		g.setColor(Color.black);
		g.drawRect(20,20,200,135);
		g.drawOval(40,40,75,42);
		g.drawRect(140,40,50,50);
		g.drawOval(50,100,125,42);
		g.setColor(green);
		g.fillOval(40,40,75,42);
		g.setColor(red);
		g.fillRect(140,40,50,50);
		g.setColor(blue);
		g.fillOval(50,100,125,42);
		g.setColor(Color.black);
		g.drawString("Circle",55,60);
		g.drawString("Square",145,60);
		g.drawString("Oval",68,123);
	}
}