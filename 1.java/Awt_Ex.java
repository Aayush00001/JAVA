import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Awt_Ex" width=500 height=300></applet>
*/
public class Awt_Ex extends Applet implements ActionListener
{
	Label lbl;
	Button b1,b2,b3,b4;
	public void init()
	{
		lbl= new Label("Message.....");
		b1= new Button("OK");
		b2= new Button("Cancel");
		b3= new Button("Red");
		b4=new Button("Green");
		add(lbl);
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
		//if(s.equals("OK"))
		//lbl.setText("Ok button pressed");
		//else
			//lbl.setText("cancel button pressed");
		if(s.equals("Red"))
			this.setBackground(Color.RED);
		else
			this.setBackground(Color.GREEN);
			
	}
}