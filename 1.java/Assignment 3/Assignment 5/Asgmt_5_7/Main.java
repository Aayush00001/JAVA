import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="Ass7" height=300 width=450></applet>
public class Ass7 extends Applet implements ItemListener
{
	Label l1;
	Checkbox c1,c2,c3;
	public void init()
	{
		CheckboxGroup grp=new CheckboxGroup();
		l1=new Label("Color:None");
		c1=new Checkbox("Rectangle",false,grp);
		c2=new Checkbox("Oval",false,grp);
		c3=new Checkbox("Line",false,grp);
		add(c1);
		add(c2);
		add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		setLayout(null);
		c1.setBounds(150,0,80,40);
		c2.setBounds(230,0,40,40);
		c3.setBounds(280,0,50,40);
	}
	public void itemStateChanged(ItemEvent e)
	{
		Graphics g=this.getGraphics();
		if(c1.getState()==true)
		{
			g.setColor(Color.white);
			g.drawOval(100,80,125,42);
			g.drawLine(100,100,200,100);
			g.setColor(Color.black);
			g.drawRect(100,80,80,50);
			
		}
		else if(c2.getState()==true)
		{
			g.setColor(Color.white);
			g.drawRect(100,80,80,50);
			g.drawLine(100,100,200,100);
			g.setColor(Color.black);
			g.drawOval(100,80,125,42);
		}
		else
		{
			
			g.setColor(Color.white);
			g.drawRect(100,80,80,50);
			g.drawOval(100,80,125,42);
			g.setColor(Color.black);
			g.drawLine(100,100,200,100);
			
		}
	}
}