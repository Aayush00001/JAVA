import java.awt.*;
import java.applet.*;
//<applet code="Ass11" height=300 width=500></applet>
public class Ass11 extends Applet
{
	Button b1,b2;
	public void init()
	{
		b1=new Button("Button 1");
		b2=new Button("Button 2");
		setLayout(null);
		b1.setBounds(80,53,75,22);
		b2.setBounds(160,53,75,22);
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.green);
		add(b1);
		add(b2);
	}
	public void paint(Graphics g)
	{
		Color grey=new Color(137,137,137);
		g.setColor(grey);
		g.fillRect(50,50,222,222);
	}
}