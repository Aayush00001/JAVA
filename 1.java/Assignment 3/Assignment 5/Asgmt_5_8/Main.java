import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Ass8" width=500 height=300></applet>
*/
public class Ass8 extends Applet implements ActionListener
{
	Button b1,b2,b3,b4;
	public void init()
	{
		b1= new Button("Red");
		b2= new Button("Green");
		b3= new Button("Blue");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("Red"))
			this.setBackground(Color.RED);
		else if(s.equals("Green"))
			this.setBackground(Color.GREEN);
		else if(s.equals("Blue"))
			this.setBackground(Color.BLUE);
			
	}
}