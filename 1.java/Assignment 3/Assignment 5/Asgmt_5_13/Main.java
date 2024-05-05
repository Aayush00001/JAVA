import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Ass13" width=500 height=100></applet>
*/
public class Ass13 extends Applet implements ActionListener
{
	List l1,l2;
	Button b1,b2,b3,b4;
	public void init()
	{
		l1=new List(4);
		l2=new List(4);
		b1=new Button(">");
		b2=new Button("<");
		b3=new Button(">>");
		b4=new Button("<<");
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Orange");
		setLayout(null);
		l1.setBounds(10,10,100,70);
		l2.setBounds(225,10,100,70);
		b1.setBounds(115,30,20,20);
		b2.setBounds(140,30,20,20);
		b3.setBounds(165,30,25,20);
		b4.setBounds(194,30,25,20);
		add(l1);
		add(l2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals(">"))
		{
			if(l1.getSelectedItem()=="Apple")
			{
				l1.remove("Apple"); 
				l2.add("Apple");
			}
			else if(l1.getSelectedItem()=="Banana")
			{
				l1.remove("Banana"); 
				l2.add("Banana");
			}
			else if(l1.getSelectedItem()=="Orange")
			{
				l1.remove("Orange"); 
				l2.add("Orange");
			}
		}
		if(s.equals("<"))
		{
			if(l2.getSelectedItem()=="Apple")
			{
				l2.remove("Apple"); 
				l1.add("Apple");
			}
			else if(l2.getSelectedItem()=="Banana")
			{
				l2.remove("Banana"); 
				l1.add("Banana");
			}
			else if(l2.getSelectedItem()=="Orange")
			{
				l2.remove("Orange"); 
				l1.add("Orange");
			}
		}
		if(s.equals(">>"))
		{
			l2.removeAll();
			l2.add("Apple");
			l2.add("Banana");
			l2.add("Orange");
			l1.removeAll(); 
			
		}
		if(s.equals("<<"))
		{
			l1.removeAll();
			l1.add("Apple");
			l1.add("Banana");
			l1.add("Orange");
			l2.removeAll(); 
		}
	}
		
}