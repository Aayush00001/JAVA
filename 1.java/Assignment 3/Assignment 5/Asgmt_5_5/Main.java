import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="Ass5" height=300 width=450></applet>
public class Ass5 extends Applet implements ItemListener
{
	Label l1;
	Checkbox c1,c2;
	Button b1;
	public void init()
	{
		l1=new Label("None Checkbox:checked");
		c1=new Checkbox("C++");
		c2=new Checkbox("Java");
		setLayout(null);
		l1.setBounds(150,0,200,50);
		c1.setBounds(150,80,150,20);
		c2.setBounds(150,120,166,20);
		add(l1);
		add(c1);
		add(c2);
		c1.addItemListener(this);
		c2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(c1.getState()==false && c2.getState()==false)
		{
			l1.setText("None Checkbox:checked");
		}
		else if(c1.getState()==true && c2.getState()==true)
		{
			l1.setText("C++ and Java Checkbox:checked");
		}
		else if(c1.getState()==true)
		{
			l1.setText("C++ Checkbox:checked");
		}
		else if(c2.getState()==true)
		{
			l1.setText("Java Checkbox:checked");
		}
	}
}