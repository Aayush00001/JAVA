import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="Ass6" height=300 width=450></applet>
public class Ass6 extends Applet implements ItemListener
{
	Label l1;
	Checkbox c1,c2,c3;
	public void init()
	{
		CheckboxGroup grp=new CheckboxGroup();
		l1=new Label("Color:None");
		c1=new Checkbox("Red",false,grp);
		c2=new Checkbox("Green",false,grp);
		c3=new Checkbox("Blue",false,grp);
		add(c1);
		add(c2);
		add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		setLayout(null);
		c1.setBounds(150,0,40,40);
		c2.setBounds(200,0,50,40);
		c3.setBounds(260,0,50,40);
		l1.setBounds(175,40,150,50);
		add(l1);
		
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(c1.getState()==true)
		{
			l1.setText("Color:Red");
		}
		else if(c2.getState()==true)
		{
			l1.setText("Color:Green");
		}
		else
		{
			l1.setText("Color:Blue");
		}
	}
}